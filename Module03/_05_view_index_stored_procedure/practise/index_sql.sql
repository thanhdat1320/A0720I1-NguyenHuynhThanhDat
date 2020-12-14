SELECT * FROM customers WHERE customerNumber = 175; 
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

alter table customers 
add index idx_customerNumber(customerNumber);
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

alter table customers
add index idx_full_name (contactFirstName, contactLastName);

EXPLAIN SELECT contactFirstName, contactLastName FROM customers 
WHERE contactFirstName = 'jean' or contactFirstName = 'King';

/*  drop index
	alter table customers 
    drop indexidx_full_name
*/