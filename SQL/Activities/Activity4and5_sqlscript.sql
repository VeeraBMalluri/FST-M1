REM   Script: Activity4and5
REM   SQL Activity 4 and 5

create table salesman  
    (salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

describe salesman


insert all  
    into salesman values (5001, 'James Hoog', 'New York', 15) 
    into salesman values (5002, 'Nail Knite', 'Paris', 13) 
    into salesman values (5005, 'Pit Alex' , 'London', 11) 
    into salesman values (5006, 'McLyon', 'Paris', 14) 
    into salesman values (5007, 'Paul Adam','Rome', 13) 
    into salesman values (5003, 'Lauson Hen', 'San Jose', 12) 
select 1 from dual;

select * from salesman;

select * from salesman;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city = 'Paris';

select salesman_id, commission from salesman where salesman_name = 'Paul Adam';

alter table salesman add grade int;

update salesman set grade = 100;

Select * from salesman;

update salesman set grade =200 where salesman_city = 'Rome';

update salesman set grade =300 where salesman_name = 'James Hoog';

update salesman set salesman_name = 'Pierre' where salesman_name = 'McLyon';

select * from salesman;

