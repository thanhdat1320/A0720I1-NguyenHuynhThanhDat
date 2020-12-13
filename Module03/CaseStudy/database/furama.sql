create database furama;

alter table cs_customer auto_increment = 1;

-- SERVICES
CREATE TABLE sv_services (
    id_services INT AUTO_INCREMENT,
    PRIMARY KEY (id_services),
    name_services VARCHAR(50) NOT NULL,
    area_services INT NOT NULL,
    floor_services INT DEFAULT 0,
    amounts_services VARCHAR(50) NOT NULL,
    price_services VARCHAR(50) NOT NULL,
     status_services VARCHAR(50) NOT NULL,
     
    id_type_rents_services INT,
    CONSTRAINT id_type_rents_sercives_fk FOREIGN KEY (id_type_rents_services)
        REFERENCES sv_type_rents (id_type_rents_services) ON DELETE CASCADE ON UPDATE CASCADE,
        
    id_type_services INT,
    CONSTRAINT id_type_services_fk FOREIGN KEY (id_type_services)
        REFERENCES sv_type_services (id_type_services) ON DELETE CASCADE ON UPDATE CASCADE
);
      
CREATE TABLE sv_type_rents (
    id_type_rents_services INT AUTO_INCREMENT,
    PRIMARY KEY (id_type_rents_services),
    name_type_rents VARCHAR(50) NOT NULL,
    price_type_rents INT NOT NULL
);

CREATE TABLE sv_type_services (
    id_type_services INT AUTO_INCREMENT,
    PRIMARY KEY (id_type_services),
    name_type_services VARCHAR(50) NOT NULL
);

-- CUSTOMER
CREATE TABLE cs_customer (
    id_customer INT AUTO_INCREMENT,
    CONSTRAINT id_customer_pk PRIMARY KEY (id_customer),
    name_customer VARCHAR(50) NOT NULL,
    brthday_customer DATE NOT NULL,
    gender_customer VARCHAR(50) NOT NULL,
    identity_customer VARCHAR(50) NOT NULL UNIQUE,
    phone_number_customer VARCHAR(50) NOT NULL,
    email_customer VARCHAR(50) NOT NULL,
    address_customer VARCHAR(50) NOT NULL,
    id_type_customer INT,
    CONSTRAINT id_type_customer_fk FOREIGN KEY (id_type_customer)
        REFERENCES cs_type_customer (id_type_customer) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE cs_type_customer (
	id_type_customer INT AUTO_INCREMENT,
    CONSTRAINT id_type_customer_pk PRIMARY KEY (id_type_customer),
    name_type_customer VARCHAR(50) NOT NULL
);

-- EMPLOYEE
CREATE TABLE ep_employee (
    id_employee INT AUTO_INCREMENT,
    CONSTRAINT id_employee_pk PRIMARY KEY (id_employee),
    name_employee VARCHAR(50) NOT NULL,
    brthday_employee DATE NOT NULL,
    identity_employee VARCHAR(50) NOT NULL,
    phone_number_employee VARCHAR(50) NOT NULL,
    email_employee VARCHAR(50) NOT NULL,
    salary_employee VARCHAR(50) NOT NULL,
    
    id_level_employee INT,
    CONSTRAINT id_level_employee_fk FOREIGN KEY (id_level_employee)
        REFERENCES ep_level_employee (id_level_employee) ON DELETE CASCADE ON UPDATE CASCADE,
    id_position_employee INT,
    CONSTRAINT id_position_employee_fk FOREIGN KEY (id_position_employee)
        REFERENCES ep_position_employee (id_position_employee) ON DELETE CASCADE ON UPDATE CASCADE,
    id_department_employee INT,
    CONSTRAINT id_department_employee_fk FOREIGN KEY (id_department_employee) 
        REFERENCES ep_department_employee (id_department_employee) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE ep_level_employee (
    id_level_employee INT AUTO_INCREMENT,
    CONSTRAINT id_level_employee_pk PRIMARY KEY (id_level_employee),
    name_level_employee VARCHAR(50) NOT NULL
);

CREATE TABLE ep_position_employee (
    id_position_employee INT AUTO_INCREMENT,
    CONSTRAINT id_position_employee_pk PRIMARY KEY (id_position_employee),
    name_position_employee VARCHAR(50) NOT NULL
);

CREATE TABLE ep_department_employee (
    id_department_employee INT AUTO_INCREMENT,
    CONSTRAINT id_department_employee_pk PRIMARY KEY (id_department_employee),
    name_department_employee VARCHAR(50) NOT NULL
);

-- CONTRACT
CREATE TABLE ct_contract_detail (
    id_contract_detail INT AUTO_INCREMENT,
    CONSTRAINT id_contract_detail_pk PRIMARY KEY (id_contract_detail),
    amount_contract INT NOT NULL,
    
    id_contract INT,
    CONSTRAINT id_contract_fk FOREIGN KEY (id_contract)
        REFERENCES ct_contract (id_contract),
        
    id_services_include INT,
    CONSTRAINT id_services_include_fk FOREIGN KEY (id_services_include)
        REFERENCES ct_services_include (id_services_include)
);

CREATE TABLE ct_contract (
    id_contract INT AUTO_INCREMENT,
    CONSTRAINT id_contract_pk PRIMARY KEY (id_contract),
    start_date_contract DATE NOT NULL,
    end_date_contract DATE NOT NULL,
    deposit_money_contract INT NOT NULL,
    total_money_contract INT NOT NULL,
    
    id_services INT,
    CONSTRAINT id_services_fk FOREIGN KEY (id_services)
        REFERENCES sv_services (id_services) ON DELETE CASCADE ON UPDATE CASCADE,
    id_customer INT,
    CONSTRAINT id_customer_fk FOREIGN KEY (id_customer)
        REFERENCES cs_customer (id_customer) ON DELETE CASCADE ON UPDATE CASCADE,
    id_employee INT,
    CONSTRAINT id_employee_fk FOREIGN KEY (id_employee)
        REFERENCES ep_employee (id_employee) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE ct_services_include (
	id_services_include INT AUTO_INCREMENT,
    CONSTRAINT id_services_include_pk PRIMARY KEY (id_services_include),
    name_id_services_include VARCHAR(50) NOT NULL,
    unit_services_include INT NOT NULL,
    price_services_include INT NOT NULL,
    status_services_include VARCHAR(50) NOT NULL
);

-- 2: Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *,  SUBSTRING_INDEX(name_employee, ' ', -1) AS Name
 FROM ep_employee
 HAVING (Name LIKE 'h%'
 	OR Name LIKE 't%'
    OR Name LIKE 'k%')
    AND LENGTH(name_employee) <= 15;

-- select *
-- from ep_employee
-- where (SUBSTRING_INDEX(name_employee, ' ', -1) LIKE 'd%' OR SUBSTRING_INDEX(name_employee, ' ', -1) LIKE 'k%'OR SUBSTRING_INDEX(name_employee, ' ', -1) LIKE 't%')
-- AND LENGTH(name_employee) <= 15;
    
--   select *
--     from ep_employee
--     where name_employee regexp '^[HKT]{1}(.)*$';
    
/* 3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.  */
   select *, year(curdate()) - year(brthday_customer) AS Age 
    from cs_customer
    where address_customer = 'da nang' 
		or address_customer = 'quang tri' 
	having Age between 18 and 50;
    
/* 4: Đếm tương ứng mỗi khách hàng từng đặt phòng bao nhiêu lần. 
		KQ hiểu thị tăng dần theo số lần đặt. 
        Chỉ đếm customer có loại khách là "Dinamond"
*/
SELECT  count(ct_contract.id_customer) AS Amount, cs_customer.id_customer, cs_customer.name_customer, cs_type_customer.name_type_customer
from cs_customer left join ct_contract on cs_customer.id_customer = ct_contract.id_customer
				join cs_type_customer on cs_customer.id_customer =  cs_type_customer.id_type_customer
where cs_type_customer.name_type_customer = 'Diamond'
group by cs_customer.id_customer
order by Amount;

/* 5: Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
		TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, SoLuong và Giá là từ bảng DichVuDiKem
        cho tất cả các Khách hàng đã từng đặt phòng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
*/
SELECT 
    cs_customer.id_customer,
    cs_customer.name_customer,
    cs_type_customer.name_type_customer,
    ct_contract.id_contract,
    ct_contract.start_date_contract,
    ct_contract.end_date_contract,
    sv_services.name_services,
    (sv_services.price_services + ct_contract_detail.amount_contract * ct_services_include.price_services_include) AS Total
FROM cs_customer
	left JOIN  
    cs_type_customer ON cs_customer.id_customer = cs_type_customer.id_type_customer
   left join
   ct_contract on ct_contract.id_customer = cs_customer.id_customer
   left join
   ct_contract_detail on ct_contract.id_contract = ct_contract_detail.id_contract
   left join
   ct_services_include on ct_services_include.id_services_include = ct_contract_detail.id_services_include
   left join 
   sv_services on sv_services.id_services = ct_contract.id_services
   group by cs_customer.name_customer;
    
    /* 6: Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
    của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt 
    từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
    */
     select sv_services.id_services, sv_services.name_services, sv_services.area_services, sv_services.price_services, sv_type_services.name_type_services, temp.start_date_contract
    from sv_services 
		 left join (select * from ct_contract
				where ct_contract.start_date_contract between '2019-01-01' and '2019-03-31') AS Temp
                on sv_services.id_services = temp.id_services
		 inner join sv_type_services on sv_services.id_type_services = sv_type_services.id_type_services
	group by sv_services.name_services
    having temp.start_date_contract is null;

/* 7: Hiển thị IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
 tất cả loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
*/
    select sv_services.id_services, sv_services.name_services,sv_services.area_services, sv_services.amounts_services,sv_services.price_services,
			sv_type_services.name_type_services
	from sv_services
		inner join sv_type_services on sv_services.id_type_services = sv_type_services.id_type_services
		inner join (select * from ct_contract where year(start_date_contract) = 2018) AS contract2018 
			on sv_services.id_services = contract2018.id_services
		left join (select * from ct_contract where year(start_date_contract) = 2019) AS contract2019
			on sv_services.id_services = contract2019.id_services
	where contract2019.id_services is null;

/* 8: Hiển thị HoTenKhachHang không trùng nhau (làm 3 cách)*/
-- cách 1
select distinct cs_customer.name_customer
from cs_customer;

-- cách 2
select cs_customer.name_customer
from cs_customer
group by cs_customer.name_customer;
	
-- cách 3

