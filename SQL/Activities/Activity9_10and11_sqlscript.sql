REM   Script: Activity9_10_11
REM   SQL Activity 9 10 and 11

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no from orders order by order_date asc;

select order_no from orders order by purchase_amount desc;

select * from orders where purchase_amount<500;

select * from orders where purchase_amount between 1000 and 2000;

SELECT * FROM ORDERS;

SELECT SUM(PURCHASE_AMOUNT) TOTAL_AMOUNT FROM ORDERS;

SELECT * FROM ORDERS;

SELECT SUM(PURCHASE_AMOUNT) TOTAL_AMOUNT FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) AVERAGE_AMOUNT FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) MAXIMUM_AMOUNT FROM ORDERS;

SELECT MIN(PURCHASE_AMOUNT) MINIMUM_AMOUNT FROM ORDERS;

SELECT COUNT( DISTINCT SALESMAN_ID) TOTAL_SALESMANS FROM ORDERS;

SELECT * FROM ORDERS;

SELECT CUSTOMER_ID, MAX(PURCHASE_AMOUNT) MAX_PERCHASE_AMT FROM ORDERS GROUP BY (CUSTOMER_ID) ORDER BY CUSTOMER_ID ASC;

SELECT SALESMAN_ID, ORDER_DATE, MAX(PURCHASE_AMOUNT) MAX_PERCHASE_AMT FROM ORDERS WHERE ORDER_DATE = To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY (SALESMAN_ID, ORDER_DATE);

SELECT CUSTOMER_ID, ORDER_DATE, MAX(PURCHASE_AMOUNT) MAX_PERCHASE_AMT FROM ORDERS GROUP BY (CUSTOMER_ID,ORDER_DATE) HAVING MAX(PURCHASE_AMOUNT) IN (2030, 3450, 5760, 6000) ORDER BY ORDER_DATE ASC;

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

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert All  
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001) 
into customers values (3007, 'Brad Davis', 'New York', 200, 5001) 
into customers values (3005, 'Graham Zusi', 'California', 200, 5002) 
into customers values (3008, 'Julian Green', 'London', 300, 5002) 
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006)  
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
select 1 from dual;

select * from salesman;

select * from orders;

select * from customers;

select c.customer_name, c.customer_id s.salesman_name, s.salesman_id from customers c inner join salesman s where c.salesman_id = s.salesman_id;

select c.customer_name, c.customer_id, s.salesman_name, s.salesman_id from customers c inner join salesman s where c.salesman_id = s.salesman_id;

select c.customer_name, c.customer_id, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id;

select * from salesman;

select * from orders;

select * from customers;

select c.customer_name, c.customer_id, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id where grade <300 order by customer_id;

select c.customer_name, c.customer_id, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id where c.grade <300 order by c.customer_id;

select c.customer_name, c.customer_id, c.grade, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id where c.grade <300 order by c.customer_id;

select * from salesman;

select * from orders;

select * from customers;

select c.customer_name, c.customer_id, c.grade, s.commission, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id where s.commission > 12;

select c.cusotmer_name, s.salesman_name, s.commission, o.order_no, o.order_date, o.purchase_amount from orders o  
inner join customer c on o.customer_id=c.customer_id  
inner join salesman s on o.salesman_id=s.salesman_id;

select c.cusotmer_name, s.salesman_name, s.commission, o.order_no, o.order_date, o.purchase_amount from orders o  
inner join customers c on o.customer_id=c.customer_id  
inner join salesman s on o.salesman_id=s.salesman_id;

select c.customer_name, s.salesman_name, s.commission, o.order_no, o.order_date, o.purchase_amount from orders o  
inner join customers c on o.customer_id=c.customer_id  
inner join salesman s on o.salesman_id=s.salesman_id;

select * from orders where salesman_id=(select distinct salesman_id from orders where customer_id=3007);

SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT grade, COUNT(*) FROM customers GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders WHERE salesman_id IN( SELECT salesman_id FROM salesman WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT grade, COUNT(*) FROM customers GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE salesman_city='New York');

select * from salesman;

select * from customers;

SELECT grade, COUNT(*) FROM customers GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, salesman_name, order_no, 'highest on', order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, salesman_name, order_no, 'lowest on', order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

SELECT a.salesman_id, salesman_name, order_no, 'highest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, salesman_name, order_no, 'lowest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

(SELECT MAX(purchase_amount) FROM orders c group by order_date;

SELECT MAX(purchase_amount) FROM orders c group by order_date;

SELECT a.salesman_id, salesman_name, order_no, 'highest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount in (SELECT MAX(purchase_amount) FROM orders c group by order_date order by order_date);

SELECT a.salesman_id, salesman_name, order_no, 'highest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount in (SELECT MAX(purchase_amount) FROM orders c group by order_date order by order_date);

SELECT a.salesman_id, a.salesman_name, b.rder_no, 'highest on' as rate, b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount in (SELECT MAX(purchase_amount) FROM orders c group by order_date order by c.order_date);

SELECT MAX(purchase_amount) FROM orders c group by order_date order by c.order_date;

SELECT a.salesman_id, a.salesman_name, b.rder_no, 'highest on' as rate, b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount in (SELECT MAX(purchase_amount) FROM orders c where c.order_date = b.order_date);

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on' as rate, b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount in (SELECT MAX(purchase_amount) FROM orders c where c.order_date = b.order_date);

select * from customers;

select * from orders;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert All  
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001) 
into customers values (3007, 'Brad Davis', 'New York', 200, 5001) 
into customers values (3005, 'Graham Zusi', 'California', 200, 5002) 
into customers values (3008, 'Julian Green', 'London', 300, 5002) 
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006)  
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
select 1 from dual;

select * from salesman;

select * from orders;

select * from customers;

select c.customer_name, c.customer_id, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id;

select c.customer_name, c.customer_id, c.grade, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id where c.grade <300 order by c.customer_id;

select c.customer_name, c.customer_id, c.grade, s.commission, s.salesman_name, s.salesman_id from customers c inner join salesman s on c.salesman_id = s.salesman_id where s.commission > 12;

select c.customer_name, s.salesman_name, s.commission, o.order_no, o.order_date, o.purchase_amount from orders o  
inner join customers c on o.customer_id=c.customer_id  
inner join salesman s on o.salesman_id=s.salesman_id;

select * from orders where salesman_id=(select distinct salesman_id from orders where customer_id=3007);

SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders WHERE salesman_id IN( SELECT salesman_id FROM salesman WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, salesman_name, order_no, 'highest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, salesman_name, order_no, 'lowest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on' as rate, b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount in (SELECT MAX(purchase_amount) FROM orders c where c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, salesman_name, order_no, 'lowest on' as rate, order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

