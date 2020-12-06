create database furama;

CREATE TABLE services (
    id_services INT AUTO_INCREMENT,
    PRIMARY KEY (id_services),
    name_services VARCHAR(50),
    area_services INT,
    floor_services INT,
    amounts_services VARCHAR(50),
    price_services VARCHAR(50),
     status_services VARCHAR(50),
     
    id_type_rents_services INT,
    CONSTRAINT id_type_rents_sercives_pk FOREIGN KEY (id_type_rents_services)
        REFERENCES type_rents (id_type_rents_services) ON DELETE CASCADE ON UPDATE CASCADE,
        
    id_type_services INT,
    CONSTRAINT id_type_services_pk FOREIGN KEY (id_type_services)
        REFERENCES type_services (id_type_services) ON DELETE CASCADE ON UPDATE CASCADE
);
      
CREATE TABLE type_rents (
    id_type_rents_services INT AUTO_INCREMENT,
    PRIMARY KEY (id_type_rents_services),
    name_type_rents VARCHAR(50),
    price_type_rents INT
);

CREATE TABLE type_services (
    id_type_services INT AUTO_INCREMENT,
    PRIMARY KEY (id_type_services),
    name_type_services VARCHAR(50)
);

CREATE TABLE customer (
    id_customer INT AUTO_INCREMENT,
    CONSTRAINT id_customer_pk PRIMARY KEY (id_customer),
    name_customer VARCHAR(50),
    brthday_customer DATE,
    gender_customer VARCHAR(50),
    identity_customer VARCHAR(50),
    phone_number_customer VARCHAR(50),
    email_customer VARCHAR(50),
    address_customer VARCHAR(50),
    id_type_customer INT,
    CONSTRAINT id_type_customer_fk FOREIGN KEY (id_type_customer)
        REFERENCES type_customer (id_type_customer) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE type_customer (
	id_type_customer INT AUTO_INCREMENT,
    CONSTRAINT id_type_customer_pk PRIMARY KEY (id_type_customer),
    name_type_customer VARCHAR(50)
);

CREATE TABLE employee (
    id_employee INT AUTO_INCREMENT,
    CONSTRAINT id_employee_pk PRIMARY KEY (id_employee),
    name_customer VARCHAR(50),
    brthday_customer DATE,
    identity_customer VARCHAR(50),
    phone_number_customer VARCHAR(50),
    email_customer VARCHAR(50),
    salary_employee VARCHAR(50),
    
    id_level_employee INT,
    CONSTRAINT id_level_employee_fk FOREIGN KEY (id_level_employee)
        REFERENCES level_employee (id_level_employee) ON DELETE CASCADE ON UPDATE CASCADE,
    id_position_employee INT,
    CONSTRAINT id_position_employee_fk FOREIGN KEY (id_position_employee)
        REFERENCES position_employee (id_position_employee) ON DELETE CASCADE ON UPDATE CASCADE,
    id_department_employee INT,
    CONSTRAINT id_department_employee_fk FOREIGN KEY (id_department_employee) 
        REFERENCES department_employee (id_department_employee) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE level_employee (
    id_level_employee INT AUTO_INCREMENT,
    CONSTRAINT id_level_employee_pk PRIMARY KEY (id_level_employee),
    name_level_employee VARCHAR(50)
);

CREATE TABLE position_employee (
    id_position_employee INT AUTO_INCREMENT,
    CONSTRAINT id_position_employee_pk PRIMARY KEY (id_position_employee),
    name_position_employee VARCHAR(50)
);

CREATE TABLE department_employee (
    id_department_employee INT AUTO_INCREMENT,
    CONSTRAINT id_department_employee_pk PRIMARY KEY (id_department_employee),
    name_department_employee VARCHAR(50)
);

CREATE TABLE contract_detail (
    id_contract_detail INT AUTO_INCREMENT,
    CONSTRAINT id_contract_detail_pk PRIMARY KEY (id_contract_detail),
    amount_contract INT,
    
    id_contract INT,
    CONSTRAINT id_contract_fk FOREIGN KEY (id_contract)
        REFERENCES contract (id_contract),
        
    id_services_include INT,
    CONSTRAINT id_services_include_fk FOREIGN KEY (id_services_include)
        REFERENCES services_include (id_services_include)
);

CREATE TABLE contract (
    id_contract INT AUTO_INCREMENT,
    CONSTRAINT id_contract_pk PRIMARY KEY (id_contract),
    start_date_contract DATE,
    end_date_contract DATE,
    deposit_money_contract INT,
    total_money_contract INT,
    
    id_services INT,
    CONSTRAINT id_services_fk FOREIGN KEY (id_services)
        REFERENCES services (id_services) ON DELETE CASCADE ON UPDATE CASCADE,
    id_customer INT,
    CONSTRAINT id_customer_fk FOREIGN KEY (id_customer)
        REFERENCES customer (id_customer) ON DELETE CASCADE ON UPDATE CASCADE,
    id_employee INT,
    CONSTRAINT id_employee_fk FOREIGN KEY (id_employee)
        REFERENCES employee (id_employee) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE services_include (
	id_services_include INT AUTO_INCREMENT,
    CONSTRAINT id_services_include_pk PRIMARY KEY (id_services_include),
    name_id_services_include VARCHAR(50),
    unit_services_include INT,
    price_services_include INT,
    status_services_include VARCHAR(50)
);





