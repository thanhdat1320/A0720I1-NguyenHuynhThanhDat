select status, count(*) as 'so luong status' from orders
group by status
order by status;

select status, sum(quantityOrdered * priceEach) as amount
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
group by status;

select * from orderdetails;

select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderLineNumber;

select * from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber;

select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;