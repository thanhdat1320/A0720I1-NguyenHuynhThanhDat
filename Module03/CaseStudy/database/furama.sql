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

-- Task1: Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *, substring_index(name_employee, ' ', -1) AS Name
FROM ep_employee
HAVING (name_employee LIKE 'h%'
    OR name_employee LIKE 't%'
    OR name_employee LIKE 'k%')
    AND LENGTH(name_employee) <= 15;
    
-- Task2: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.  






