 alter table case_record 
 add CONSTRAINT khoa FOREIGN KEY(id_patient) REFERENCES patient(id) ON UPDATE CASCADE ON DELETE CASCADE;

 alter table house 
 add CONSTRAINT khoa FOREIGN KEY(id_cost) REFERENCES cost(id) ON UPDATE CASCADE ON DELETE CASCADE;

select max(id) as max from customer;