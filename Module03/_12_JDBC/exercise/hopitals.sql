alter table case_record 
add  CONSTRAINT khoa FOREIGN KEY(id_patient) REFERENCES patient(id) ON UPDATE CASCADE ON DELETE CASCADE;

CREATE USER 'dat'@'%' IDENTIFIED BY '123123';
GRANT ALL PRIVILEGES ON hoptital.* TO 'dat'@'%';

select case_record.id, id_patient, name, start, end, reason from case_record
join patient on patient.id = case_record.id_patient;

ALTER TABLE case_record DROP FOREIGN KEY khoa;

select max(id) as max from case_record;

update patient set patient.name = 'don' where patient.name = 'dat'; 
SELECT * FROM patient ORDER BY name;

select case_record.id, name, start, end, reason from case_record
join patient on patient.id = case_record.id_patient;