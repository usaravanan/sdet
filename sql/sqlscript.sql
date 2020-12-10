REM   Script: actitities1
REM   create, select and update statments practices 

create table employee(eid int, customer_name varchar(100), designation varchar(100), email varchar(100), mobile varchar(100));

insert into employee(101, 'Saravanan uthirapathy', 'Automation Testetr', 'mailme@gmail.com', '5636363');

insert into employee(101, 'Saravanan uthirapathy', 'Automation Testetr', 'mailme@gmail.com', '5636363');

insert into employee values(101, 'Saravanan uthirapathy', 'Automation Testetr', 'mailme@gmail.com', '5636363');

insert into employee values(101, 'Saravanan uthirapathy', 'Automation Testetr', 'mailme@gmail.com', null);

select * from employee;

update employee set customer_name = 'Sundhar Pichai' where mobile = null;

update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363';

select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363';

update employee set designation = 'CEO' and email = 'sundhar@gmail.com' where mobile = '5636363';

update employee set designation = 'CEO' where mobile = '5636363';

select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363' 
--update employee set designation = 'CEO' where mobile = '5636363';

update employee set email = 'sundhar@gmail.com' where mobile = '5636363';

select * from employee where customer_name = 'Sundhar';

select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363' 
--update employee set designation = 'CEO' where mobile = '5636363' 
--update employee set email = 'sundhar@gmail.com' where mobile = '5636363' 
--select * from employee where customer_name = 'Sundhar';

select * from employee where customer_name = 'Sundhar Pichai';

insert into employee values(103, 'Hani Saro', 'DB Testetr', 'hani@gmail.com', '233322') 
--select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363' 
--update employee set designation = 'CEO' where mobile = '5636363' 
--update employee set email = 'sundhar@gmail.com' where mobile = '5636363' 
--select * from employee where customer_name = 'Sundhar Pichai';

select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363' 
--update employee set designation = 'CEO' where mobile = '5636363' 
--update employee set email = 'sundhar@gmail.com' where mobile = '5636363' 
--select * from employee where customer_name = 'Sundhar Pichai';

insert into employee values(104, 'Vani Saro', 'Manual Testetr', 'vani@gmail.com', '233322') 
--select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363' 
--update employee set designation = 'CEO' where mobile = '5636363' 
--update employee set email = 'sundhar@gmail.com' where mobile = '5636363' 
--select * from employee where customer_name = 'Sundhar Pichai';

update employee set eid = 102 where mobile = '5636363' 
--select * from employee where customer_name = 'Sundhar Pichai';

select * from employee 
--update employee set customer_name = 'Sundhar Pichai' where mobile = '5636363' 
--update employee set designation = 'CEO' where mobile = '5636363' 
--update employee set email = 'sundhar@gmail.com' where mobile = '5636363' 
--update employee set eid = 102 where mobile = '5636363' 
--select * from employee where customer_name = 'Sundhar Pichai';

select * from employee where customer_name like '%Saro';

select * from employee where customer_name in('Vani Saro', 'Hani Saro')


select * from employee where customer_name in('Vani Saro', 'Hani Saro');

select * from employee where customer_name = 'Sundhar Pichai' and eid=101 ;

select * from employee where customer_name = 'Sundhar Pichai';

select * from employee where customer_name = 'Sundhar Pichai'  and eid = 102;

select eid from employee where customer_name = 'Sundhar Pichai';

select eid, mobile from employee where customer_name = 'Sundhar Pichai';

