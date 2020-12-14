/*1: Hiển thị tất cả nhân viên 
tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và 
có tối đa 15 ký tự.*/

select ep_employee.id, ep_employee.name, substring_index(ep_employee.name, ' ', -1) as name
from ep_employee
group by ep_employee.id
having (name like 'h%' or name like 'k%' or name like 't%') and ep_employee.name <= 10;

/*3: Hiển thị khách hàng từ 18 đến 50 tuổi
	địa chỉ “Đà Nẵng” hoặc “Quảng Trị”. */
select cs_customer.id, cs_customer.name, (year(curdate()) - year(cs_customer.brthday)) as age
from cs_customer
where (cs_customer.address = 'da nang' or cs_customer.address = 'quang tri') 
having age between 18 and 50;

/*4: Đếm tương ứng với mỗi khách hàng từng đặt phòng bao nhiêu lần. 
	Kết quả hiển thị tăng dần theo số lần đặt 
    Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.*/
select cs_customer.id, cs_customer.name, cs_type_customer.name,count(ct_contract.id_customer) as amount
from cs_customer
	join cs_type_customer on cs_customer.id_type_customer = cs_type_customer.id
    join ct_contract on ct_contract.id_customer = cs_customer.id
group by cs_customer.id
having cs_type_customer.name = 'Diamond';

/*5: Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
	TongTien = ChiPhiThue + SoLuong*Gia (SoLuong và Giá là từ bảng DichVuDiKem)ất cả các Khách hàng đã từng đặt phỏng.
		Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra)*/
select cs_customer.id, cs_customer.name, cs_type_customer.name as name_type_customer, ct_contract.id as id_contract, sv_services.name, 
		ct_contract.start_date, ct_contract.end_date, ifnull((sv_services.price + ct_services_include.price * ct_contract_detail.amount), 0) as total
from cs_customer
	join cs_type_customer on cs_customer.id_type_customer = cs_type_customer.id
    left join ct_contract on ct_contract.id_customer = cs_customer.id
    left join ct_contract_detail on ct_contract.id = ct_contract_detail.id_contract
    left join ct_services_include on ct_contract_detail.id_services_include = ct_services_include.id
    left join sv_services on ct_contract.id_services = sv_services.id
group by cs_customer.id;

/*6: Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
	chưa từng được Khách hàng đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3)*/
select sv_services.id, sv_services.name, sv_services.area, sv_services.price, sv_type_services.name, count(temp1_2019_contract.id) as count 
from sv_services
	left join (select sv_services.id, sv_services.name, sv_services.area, sv_services.price, ct_contract.start_date 
			from sv_services
				left join ct_contract on sv_services.id = ct_contract.id_services
			where ct_contract.start_date between '2019-01-01' and '2019-03-31') as temp1_2019_contract
	on temp1_2019_contract.id = sv_services.id
    join sv_type_services on sv_type_services.id = sv_services.id_type_services
group by sv_services.id
having count = 0;
	
/*7: Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ 
	 từng được Khách  đặt trong năm 2018 nhưng chưa từng được Khách đặt trong năm 2019.*/   
     select sv_services.id, sv_services.name, sv_services.area, sv_services.amounts, sv_services.price, sv_type_services.name, count(contract2019.id) as count
     from sv_services
		join sv_type_services on sv_type_services.id = sv_services.id_type_services
		join (select sv_services.id, sv_services.name, year(ct_contract.start_date) as years
				from sv_services 
					join ct_contract on sv_services.id = ct_contract.id_services
			having years = 2018) as contract2018
		on sv_services.id = contract2018.id
        left join (select sv_services.id, sv_services.name, year(ct_contract.start_date) as years
				from sv_services 
					join ct_contract on sv_services.id = ct_contract.id_services
				having years = 2019) as contract2019
		on contract2019.id = sv_services.id
	group by sv_services.id
    having count = 0 ;
        
/*8: hiển thị HoVaTenKhachHang không trùng nhau*/
select distinct cs_customer.name
from cs_customer;

select cs_customer.name
from cs_customer
group by cs_customer.name;

/*9: Thực hiện thống kê doanh thu theo tháng trong năm 2019, có bao nhiêu khách đặt phòng */            
select month(contract2019.start_date) as months,  (sv_services.price + (ct_contract_detail.amount * ct_services_include.price)) as total,
		count(contract2019.id_customer) as count
from (select * from ct_contract
		where year(ct_contract.start_date) = 2019) as contract2019
join sv_services on sv_services.id = contract2019.id_services
join ct_contract_detail on ct_contract_detail.id_contract = contract2019.id
join ct_services_include on ct_services_include.id = ct_contract_detail.id_services_include
group by months;

/*10: Hiển thị thông tin tương ứng Hợp đồng sử dụng bao nhiêu Dịch vụ đi kèm. 
	IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
	(được tính dựa trên việc count các IDHopDongChiTiet */
select ct_contract.id, ct_contract.start_date, ct_contract.end_date, ct_contract.deposit, count(ct_contract_detail.id_services_include) as count
from ct_contract
	join ct_contract_detail on ct_contract.id = ct_contract_detail.id_contract
    join ct_services_include on ct_services_include.id = ct_contract_detail.id_services_include
group by ct_contract.id
order by ct_contract.id;

/*11: Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và 
		có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.*/
select ct_services_include.id, ct_services_include.name, ct_services_include.price, cs_customer.id as id_customer, cs_customer.name, cs_type_customer.name
from ct_services_include
	join ct_contract_detail on ct_contract_detail.id_services_include = ct_services_include.id
	join ct_contract on ct_contract.id = ct_contract_detail.id_contract
	join cs_customer on ct_contract.id_customer = cs_customer.id
	join cs_type_customer on cs_type_customer.id = cs_customer.id_type_customer
where cs_type_customer.name = 'Diamond' and (cs_customer.address = 'da nang' or cs_customer.address = 'da lat')
group by ct_services_include.id, cs_customer.id;
            
/*Hiển thị 
IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
  tính trên tổng Hợp đồng chi tiết, tienDatCoc 
	đặt 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
*/

            
    