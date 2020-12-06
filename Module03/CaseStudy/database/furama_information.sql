CREATE DATABASE furama_information;

--  add information services

-- ALTER TABLE services AUTO_INCREMENT = 1;
-- ALTER TABLE type_rents AUTO_INCREMENT = 1;
-- ALTER TABLE type_services AUTO_INCREMENT = 1;

INSERT INTO type_services(name_type_services) VALUE 
('Villa'), 
('House'), 
('Room'),
('Villa'),
('House'),
('Viila'),
('Room');

INSERT INTO type_rents(name_type_rents, price_type_rents ) VALUE 
('Year', 105000), 
('Month', 35000), 
('Day', 25000),
('Year', 15000),
('Day', 900),
('Hour', 1150),
('Hour', 7984);

INSERT INTO services (name_services,area_services,floor_services,amounts_services,price_services,id_type_rents_services,id_type_services,status_services) VALUE 
('Villa', 30, 99, 30, 900, 1, 1,'booked'),
('House', 20, 15, 45, 800, 2, 2,'booked'),
('House', 20, 15, 45, 800, 3, 3,'booked'),
('Rooom', 10, 66, 15, 500, 4, 4, 'booked'),
('Room', 5, 75, 15, 400, 5, 5, 'booked'),
('Villa', 50, 12, 6, 900, 6, 6, 'booked'),
('Villa', 60, 78, 69, 899, 7, 7,'booked');

-- add information employee
INSERT INTO department_employee (name_department_employee) VALUE
('Sale – Marketing'),
('Aministration'),
('Serve'); 

INSERT INTO level_employee (name_level_employee) VALUE
('University'),
('Higher'),
('After University');

INSERT INTO position_employee (name_position_employee) VALUE
('Protocol'),
('Serve'),
('Manager');

INSERT INTO employee (name_customer, brthday_customer, identity_customer, phone_number_customer, email_customer, salary_employee, id_level_employee, id_position_employee, id_department_employee) VALUE
('To Thanh Nam', '2000-07-21', 123456789, 0919383852, 'tothanham@gmail.com', '1000000', 1, 1, 1),
('Pham Doc Don', '1991-08-10', 965151665, 0919075192, 'pahmquocdon@gmail.com', '5000000', 2, 2, 2),
('Nguyen Huynh Thanh Dat', '2000-03-01', 212893887, 0964646852, 'thanhdat.01.03.2000@gmail.com', '300000000', 3, 3, 3);

-- add information customer
INSERT INTO type_customer (name_type_customer) VALUE
('Platinium'),
('Gold'),
('Silver');

INSERT INTO customer (name_customer, brthday_customer, gender_customer, identity_customer, phone_number_customer, email_customer, address_customer, id_type_customer) VALUE
('Dang Quoc Trung', '1998-06-05', 'Male', '123456789', '0919698287', 'quoctrung@gmail.com', 'DN', 1),
('Mai Van DOan', '2000-07-05', 'Male', '9865156191', '01633813053', 'vanDoan@gmail.com', 'Quang Tri', 2),
('Dinh Xuan Hai', '2000-05-08', 'Male', '95165161615', '0919383852', 'haixuan@gmail.com', 'Quang Binh', 3);

-- add information contract
INSERT INTO services_include (name_id_services_include, unit_services_include, price_services_include, status_services_include) VALUE
('massage', 50000, 350000, 'nope'),
('karaoke', 6000, 9000000, 'blocked'),
('car', 99510, 999000, 'nope');

INSERT INTO contract (start_date_contract, end_date_contract, deposit_money_contract, total_money_contract, id_services, id_customer, id_employee) VALUE
('2018-12-06', '2019-02-24', 5000000, 99999999, 1, 1, 1),
('2017-01-06', '2018-02-18', 6000000, 1560000000, 2, 2, 2),
('2019-03-06', '2020-01-03', 66666666, 65165116, 3, 3, 3);

INSERT INTO contract_detail (amount_contract, id_contract, id_services_include) VALUE
(1, 1, 1),
(3, 2, 2),
(4, 3, 3);

ALTER TABLE contract_detail AUTO_INCREMENT = 1;






