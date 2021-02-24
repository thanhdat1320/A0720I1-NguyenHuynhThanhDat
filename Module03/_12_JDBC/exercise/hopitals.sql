 alter table case_record 
 add CONSTRAINT khoa FOREIGN KEY(id_patient) REFERENCES patient(id) ON UPDATE CASCADE ON DELETE CASCADE;

 alter table test 
 add CONSTRAINT khoa2 FOREIGN KEY(id_table) REFERENCES test2(id) ON UPDATE CASCADE ON DELETE CASCADE;

select max(id) as max from customer