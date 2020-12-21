create database manager;

create table  categories (
	id int auto_increment,
    constraint id_categories_pk primary key(id),
    name nvarchar(50) not null unique,
    description nvarchar(50)
);

create table suppliers (
	id int auto_increment,
		constraint id_suppliers_pk primary key(id),
	name nvarchar(100) not null,
    email varchar(50) unique not null,
    phone_number varchar(50),
    address nvarchar(500) not null
);

create table customers (
	id varchar(50),
		constraint id_customers_pk primary key(id),
    frist_name nvarchar(50) not null,
    last_name nvarchar(50) not null,
    phone_number varchar(50),
	address nvarchar(500) not null,
    email varchar(50) unique not null,
    birthday date
);

create table employees(
	id varchar(50),
		constraint id_employees_pk primary key(id),
    frist_name nvarchar(50) not null,
    last_name nvarchar(50) not null,
    phone_number varchar(50),
	address nvarchar(500) not null,
    email varchar(50) unique not null,
    birthday date
);

create table products(
	id int auto_increment,
		constraint id_products_pk primary key(id),
    name nvarchar(50) not null,
	UmageUrl nvarchar(100) not null,
    price int default 0 not null, 
		check(price >= 0),
	discount int not null default 0,
		check(discount between 0 and 100),
    stock int not null default 0,
    description nvarchar(1000) not null,
    
    categoriesID int not null,
    constraint categoriesID_fk foreign key (categoriesID)
		references categories(id),
        
	suppliersID int not null,
      constraint suppliersID_fk foreign key (suppliersID)
		references suppliers(id)
);

create table orders(
	id int auto_increment,
		constraint id_orders_pk primary key(id),
	createdDate datetime not null,
		check(shippedDate >= createdDate),
	shippedDate datetime,
		check(shippedDate >= createdDate),
	status varchar(50) not null default 'Waiting',
		check(status = 'WAITING' or status = 'COMPLETED' or status = 'CANCELED' ),
    description nvarchar(1000),
    shippingAddress nvarchar(500) not null,
    shippingCity nvarchar(50) not null,
    paymentType varchar(20) not null default 'cash',
		check(paymentType = 'CASH' or paymentType = 'CREDIT CARD'),
    
    customerId varchar(50),
		constraint customerId_fk foreign key (customerId)
			references customers(id),
	employeeId varchar(50),
		constraint employeeId_fk foreign key (employeeId)
			references employees(id)
);

create table order_details(
	id int auto_increment,
		constraint id_orders_pk primary key(id),
	orderId int not null,
		constraint orderId_fk foreign key (orderId)
			references orders(id),
	
    productId int not null,
		constraint productId_fk foreign key (productId)
			references products(id),
            
	quantity int not null
);

