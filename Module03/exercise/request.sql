
/*Viết câu lệnh UPDATE để cập nhật Price với điều kiện: Các mặt hàng có Price <= 1000 thì tăng thêm 10*/
update products
set	price = price + 10
where products.id = 4 and price <= 1000;

/* Viết câu lệnh UPDATE để cập nhật DISCOUNT với điều kiện: Các mặt hàng có Discount <= 10 thì tăng thêm 5 */
update products
set discount = discount + 5
where products.discount < 10;

/*Viết câu lệnh XOÁ tất cả các mặt hàng có Stock là 0*/
delete from products
where stock = 0;

/*Hiển thị tất cả các mặt hàng có giảm giá <= 10*/
select *
from products
where discount <= 10;

/*Hiển thị tất cả các mặt hàng có tồn kho <= 5 */
select *
from products
where stock <= 5;

/*Hiển thị tất cả các mặt hàng có Giá bán sau khi đã giảm giá <= 1000*/
select name, discount ,(price * ((100 - discount) / 100)) as price
from products
where price < 100000;

/*Hiển thị tất cả các khách hàng có địa chỉ ở Đà Nẵng*/
select *
from customers
where address = 'da nang';

/*Hiển thị tất cả các khách hàng có năm sinh 1990*/
select last_name, year(birthday) AS years
from customers
where year(birthday) = 1990;

/*Hiển thị tất cả các khách hàng có sinh nhật là hôm nay*/
select frist_name, last_name, birthday
from customers
where day(curdate()) = day(birthday) and month(curdate()) = month(birthday);

/*Hiển thị tất cả các đơn hàng có trạng thái là waiting*/
select *
from orders
where status = 'waiting';

/*Hiển thị tất cả các đơn hàng có trạng thái là COMPLETED trong ngày hôm nay*/
select *
from orders
where status = 'COMPLETED' and date(shippedDate) = curdate();

/*Hiển thị tất cả các đơn hàng có trạng thái là CANCELED*/
select *
from orders
where status = 'CANCELED';

/*Hiển thị tất cả các đơn hàng có trạng thái là CANCELED trong ngày hôm nay*/
select *
from orders
where status = 'CANCELED' and date(shippedDate) = curdate();

/* Hiển thị tất cả các đơn hàng có hình thức thanh toán là CASH */
select *
from orders
where paymentType = 'cash';

/*Hiển thị tất cả các đơn hàng có hình thức thanh toán là CREDIT CARD*/
select *
from orders
where paymentType = 'credit card';

/*Hiển thị tất cả các đơn hàng có địa chỉ giao hàng là Da Lat*/
select *
from orders
where shippingAddress = 'da lat';

/*Hiển thị tất cả các nhân viên có sinh nhật là hôm nay*/
select *
from employees
where day(birthday) = day(curdate()) and month(birthday) = month(curdate());

/*Hiển thị tất cả các nhà cung cấp có tên là: (tiki, SAMSUNG, Nestle, APPLE)*/
select *
from suppliers
where name In('tiki', 'SAMSUNG', 'thegioididong', 'APPLE');

/*Hiển thị tất cả các mặt hàng cùng với CategoryName*/
create view view_productss as
select categories.name, products.name as name_products
from categories
	inner join products on products.categoriesID = categories.id;

select * from view_productss;

/*Hiển thị tất cả các đơn hàng cùng với thông tin chi tiết khách hàng (Customer)*/

create view view_info_order_customer as
select frist_name,last_name,phone_number,address,email,birthday, orders.id as id_orders, orders.status
from customers
	inner join orders on customers.id = orders.customerId;

select * from view_info_order_customer;

/*Hiển thị tất cả các mặt hàng cùng với thông tin chi tiết của Category và Supplier*/
create view view_info_product_Category_Supplier as
select  products.id, products.name, products.price,
		categories.id as id_categories, categories.name as name_categories, categories.description,
        suppliers.id as id_suppliers, suppliers.name as name_suppliers, suppliers.email, suppliers.phone_number, suppliers.address
from products
	inner join categories on categories.id = products.categoriesID
    inner join suppliers on suppliers.id = products.suppliersID;
    
select * from view_info_product_category_supplier;

/*Hiển thị tất cả danh mục (Categories) với số lượng hàng hóa trong mỗi danh mục*/
select categories.id, categories.name, categories.description, count(products.categoriesID) as amount
from categories
	left join products on categories.id = products.categoriesID
group by categories.id;

/*Hiển thị tất cả nhà cung cấp (Suppliers) với số lượng hàng hóa mỗi nhà cung cấp*/
select suppliers.id, suppliers.name, count(products.suppliersID) as amount
from suppliers
	inner join products on products.suppliersID = suppliers.id
group by suppliers.id;
    
/*Hiển thị tất cả các mặt hàng được bán trong khoảng từ ngày, đến ngày*/
select products.id, products.name, orders.shippedDate, orders.status
from products
	inner join order_details on order_details.productId = products.id
    inner join orders on orders.id = order_details.orderId
where orders.shippedDate between '2020-01-01' and '2020-04-01' 
	and orders.status = 'COMPLETED'
group by products.id;

/*Hiển thị tất cả các khách hàng mua hàng (với tổng số tiền) trong khoảng từ ngày, đến ngày*/
select customers.id, customers.frist_name, customers.last_name, 
		sum((products.price * ((100 - products.discount) / 100))) AS total
from customers 
	inner join orders on customers.id = orders.customerId
    inner join order_details on orders.id = order_details.orderId
    inner join products on products.id = order_details.productId
where orders.shippedDate between '2020-03-01' and '2020-12-31' and  orders.status = 'COMPLETED'
group by customers.id;

/*Hiển thị tất cả đơn hàng với tổng số tiền*/      
select orders.id, orders.shippedDate, 
		sum((products.price * ((100 - products.discount) / 100))) AS total
from orders
	inner join order_details on order_details.orderId = orders.id
    inner join products on order_details.productId = products.id
group by orders.id;

/*Hiển thị tất cả các nhân viên bán hàng với tổng số tiền bán được*/
select employees.id, employees.frist_name, employees.last_name,
		sum((products.price * ((100 - products.discount) / 100)) * order_details.quantity) AS total
from employees
	inner join orders on orders.employeeId = employees.id
    inner join order_details on order_details.orderId = orders.id
    inner join products on products.id = order_details.productId
group by orders.id;

/*Hiển thị tất cả các mặt hàng không bán được*/
select products.id, products.name, count(order_details.productId) as amount
from products
	left join order_details on products.id = order_details.productId
    left join orders on orders.id = order_details.orderId
group by products.id
having amount = 0;

/*Hiển thị tất cả các nhà cung cấp không bán được trong khoảng từ ngày, đến ngày*/
create view product_sales as
select products.suppliersID, order_details.id as dt_id, orders.id 
from  products 
		left join order_details on order_details.productId = products.id
		left join orders on orders.id = order_details.orderId
where orders.createdDate between '2017-05-05' and '2019-03-03'; 

select suppliers.id, suppliers.name, count(product_sales.suppliersID) as amount
from suppliers	
	left join product_sales on suppliers.id = product_sales.suppliersID
group by suppliers.id
having amount  = 0;

/*Hiển thị top 3 các nhân viên bán hàng với tổng số tiền bán được từ cao đến thấp trong khoảng từ ngày, đến ngày*/
select employees.id, employees.frist_name, employees.last_name, sum(products.price * ((100 - products.discount) / 100) * order_details.quantity) as total
from employees 
	inner join orders on orders.employeeId = employees.id
    inner join order_details on order_details.orderId = orders.id
    inner join products on products.id = order_details.productId
where orders.createdDate between '2017-05-05' and '2019-03-03'
group by employees.id
order by total desc
limit 3;

/*Hiển thị top 5 các khách hàng mua hàng với tổng số tiền mua được từ cao đến thấp trong khoảng từ ngày, đến ngày*/
select customers.id, customers.frist_name, customers.last_name, sum(products.price * ((100 - products.discount) / 100) * order_details.quantity) as total
from customers
	inner join orders on orders.customerId = customers.id
    inner join order_details on order_details.orderId = orders.id
    inner join products on products.id = order_details.productId
group by customers.id
order by total desc
limit 5;

/*Hiển thị danh sách các mức giảm giá của cửa hàng*/
create view discount as
select products.discount 
from products;

select * from discount
group by discount;

/*Hiển thị tất cả danh mục (Categories) với tổng số tiền bán được trong mỗi danh mục*/


    



