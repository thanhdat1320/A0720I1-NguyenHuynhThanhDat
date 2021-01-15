CREATE USER 'thanhdat'@'%' IDENTIFIED BY '123456789';
GRANT ALL PRIVILEGES ON manager_users.* TO 'thanhdat'@'%';

delimiter //
create procedure get_user_by_id(IN user_id int)
begin
	select users.name, users.email, users.country
    from users
    where users.id = user_id;
end//
DELIMITER ;

delimiter //
create procedure insertUserStore(in name varchar(50), in email varchar(50), in country varchar(50))
begin
	insert into users(name, email, country) values(name, email, country);
end//
delimiter ;