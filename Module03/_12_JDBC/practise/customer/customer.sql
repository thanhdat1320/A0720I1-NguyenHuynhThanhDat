SELECT * FROM test.customer;

CREATE USER 'dat'@'%' IDENTIFIED BY '123123';
GRANT ALL PRIVILEGES ON test.* TO 'dat'@'%';