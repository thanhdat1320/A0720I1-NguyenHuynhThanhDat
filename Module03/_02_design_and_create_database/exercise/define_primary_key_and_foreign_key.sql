create database bank;

create table Customers (
	customer_numberaccounts varchar(50),
	fullname  varchar(50),
	address  varchar(50),
	email varchar(50),
	phone  int(10)
);

create table Accounts (
	account_number varchar(50),
	account_type  varchar(50),
	date_open_acc date,
    balance float
);

create table Transactions (
	tran_number varchar(50),
	account_number  varchar(50),
    date_tran date,
    amounts float,
    descriptions varchar(100)
);

alter table Accounts
add Constraint account_pk primary key (account_number);

alter table Transactions
add Constraint tran_pk primary key (tran_number);

alter table accounts
add customer_number varchar(50) not null,
add foreign key (customer_number) references Customers(customer_number);

alter table Transactions
add foreign key (account_number) references Accounts(account_number);






