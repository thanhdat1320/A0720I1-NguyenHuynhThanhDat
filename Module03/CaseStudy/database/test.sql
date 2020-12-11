
-- select *, substring_index(name_employee, ' ', -1) AS name
-- from ep_employee
-- having (name LIKE 'h%' 
-- 	or name LIKE 'k%'
--     or name LIKE 't%')
--     and name_employee <= 15;
    
 --    select *, year(curdate()) - year(brthday_customer) AS Age 
--     from cs_customer
--     where address_customer = 'da nang' 
-- 		or address_customer = 'quang tri' 
-- 	having Age between 18 and 50;


-- select cs_customer.id_customer, cs_customer.name_customer, cs_type_customer.name_type_customer,
-- 		count(ct_contract.id_customer) AS amount
-- from cs_customer
-- 	inner join ct_contract on cs_customer.id_customer = ct_contract.id_customer
--     inner join cs_type_customer on cs_type_customer.id_type_customer = cs_customer.id_type_customer
-- where cs_type_customer.name_type_customer = 'Diamond'

-- SELECT 
--     cs_customer.id_customer,
--     cs_customer.name_customer,
--     cs_type_customer.name_type_customer,
--     ct_contract.id_contract,
--     ct_contract.start_date_contract,
--     ct_contract.end_date_contract,
--     sv_services.name_services,
--     (sv_services.price_services + ct_contract_detail.amount_contract * ct_services_include.price_services_include) AS Total
-- FROM cs_customer
-- 	left JOIN  
--     cs_type_customer ON cs_customer.id_customer = cs_type_customer.id_type_customer
--    left join
--    ct_contract on ct_contract.id_customer = cs_customer.id_customer
--    left join
--    ct_contract_detail on ct_contract.id_contract = ct_contract_detail.id_contract
--    left join
--    ct_services_include on ct_services_include.id_services_include = ct_contract_detail.id_services_include
--    left join 
--    sv_services on sv_services.id_services = ct_contract.id_services
--    group by cs_customer.name_customer;
   
      
--     select sv_services.id_services, sv_services.name_services, sv_services.area_services, sv_services.price_services, sv_type_services.name_type_services, temp.start_date_contract
--     from sv_services 
-- 		 left join (select * from ct_contract
-- 				where ct_contract.start_date_contract between '2019-01-01' and '2019-03-31') AS Temp
--                 on sv_services.id_services = temp.id_services
-- 		 inner join sv_type_services on sv_services.id_type_services = sv_type_services.id_type_services
-- 	group by sv_services.name_services
--     having temp.start_date_contract is null
	
    -- task 7
	select sv_services.id_services, sv_services.name_services,sv_services.area_services, sv_services.amounts_services,sv_services.price_services,
		sv_type_services.name_type_services
	from sv_services
 		inner join sv_type_services on sv_services.id_type_services = sv_type_services.id_type_services
		inner join ct_contract on ct_contract.id_services = sv_services.id_services
 	where (ct_contract.start_date_contract between '2018-01-01' and '2018-12-31') 
		and ct_contract.start_date_contract not between '2019-01-01' and '2019-12-31'
        group by sv_services.name_services;
    
    select sv_services.id_services, sv_services.name_services,sv_services.area_services, sv_services.amounts_services,sv_services.price_services,
		sv_type_services.name_type_services
	from sv_services
 		inner join sv_type_services on sv_services.id_type_services = sv_type_services.id_type_services
		inner join ct_contract on ct_contract.id_services = sv_services.id_services
 	where (year(ct_contract.start_date_contract) = 2018) 
		and sv_services.id_services not in 
			(select sv_services.id_services from sv_services where year(start_date_contract) = 2019)
	group by sv_services.name_services;
    
    select sv_services.id_services, sv_services.name_services,sv_services.area_services, sv_services.amounts_services,sv_services.price_services,
			sv_type_services.name_type_services
	from sv_services
		inner join sv_type_services on sv_services.id_type_services = sv_type_services.id_type_services
		inner join (select * from ct_contract where year(start_date_contract) = 2018) AS contract2018 
			on sv_services.id_services = contract2018.id_services
		left join (select * from ct_contract where year(start_date_contract) = 2019) AS contract2019
			on sv_services.id_services = contract2019.id_services
	where contract2019.id_services is null
		
		
    

