select productCode, productName, buyprice, quantityInStock from products
where buyPrice > 56.76 and quantityInStock > 10;

select productCode, productname, buyprice, textDescription 
from products
inner join productlines
on products.productLine = productlines.productLine
where buyPrice > 56.76 and buyPrice < 95.59;

select productCode, productName, buyprice, quantityInStock, productVendor, productLine 
from products 
where productLine = 'Classic Cars' or productVendor = 'Min Lin Diecast';