package day36_SQL.Tasks;

public class Task {
/*
 --EMPLOYEE WHO DOES NOT HAVE A MANAGER
select * from employees where employee_id is null;
--EMPLOYEES UNDER A MANAGER
select * from employees where employee_id is not null;
--FIND ALL THE PHONE NUMBER THAT CONTAINS 123
select * from employees where phone_number like  '%123%';
--FIND ALL THE EMPLOYEES WHO DOES NOT HAVE COMMISSION
select * from employees where commission_PCT is null;
-- How do we find out how many tables we have in our database? 
select table_name from user_tables;
DESCRIBE DEPARTMENTS;
DESCRIBE employees;
select count(*) from user_tables;
--How do we display all the table name of the DataBase?
--What is the query to find out all the information of a specific 

--employee whose employee_id is 107?
select *FROM employees where employee_id = 107;
--last_name and salary of those employees who have employee_id as 100,101,102,103?
select last_name , salary 
from employees where employee_id in (100,101,102,103);
--How to display employeeid, first name, last name and salaray of a specific employee

--whose first name is "PETER"?
-- How do we find out how many tables we have in our database? SELECT COUNT(*) FROM USER_TABLES;
--How do we display all the table name of the DataBase? SELECT TABLE_NAME FROM USER_TABLES;
--How to display all the attrivutes of fields of a table? DESC EMPLOYEES;

--OR
--How to display all the contants of a table? SELECT * FROM countries;
select *from countries;
--How to display employee_id, first_name, last_name and salary from employee table and sort by employee_id?
select employee_id ,first_name ,last_name,salary from employees order by employee_id asc;

--How to display employeeid, first name, last name and salaray of a specific employee whose first name is "PETER"?
select employee_id,first_name ,last_name ,salary from employees where first_name='PETER';
select UPPER(first_name), upper(last_name), salary
from employees where first_name = 'PETER';
--How to display employeeid, first name, last name and salaray of a specific employee 

--whose first name is "PETER" and last_name is "TUCKER"?
select employee_id,first_name ,last_name ,salary from employees where UPPER(first_name)='PETER' AND UPPER(LAST_NAME) = 'TUCKER';
--How to find out those employees whose first name start with character 'P'?
select * from employees where first_name like 'P%';
--How to find out those employees whose first name ends with character 'N'?
select * from employees where upper(first_name) like '%N';
--How to find out those employees whose first name start with character 'P' and first name ends with character 'N'
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME , SALARY
FROM EMPLOYEES
WHERE UPPER(FIRST_NAME) LIKE 'P%M' ;
--How to find out those employees whose first name start with character 'N', 'A','P','k'?
select * from employees where first_name like 'N%'
OR first_name like 'A%'
OR first_name like 'P%'
OR first_name like 'K%';
--How to find out employee_id, first , last name and salary? 

--rename salary as <Monthly salary>.
select  first_name ,last_name, salary as "monthly_salary" from employees;
--How to find out employee id, first name , 
--last name and salary and commition pct of all the employees?
select last_name , commission_pct from employees ;
-------------------NULL, NOT NULL
--How to find those employees who have commision?
select first_name,last_name , commission_pct from employees where commission_pct is not null;
--How to find whose employees who do not have commision.
select first_name,last_name , commission_pct from employees where commission_pct is not null;

--// How to find out all the and employees who has commision and calculate 
--the tototal salaries after adding their commision percentage? //
select employee_id, first_name, salary , last_name, salary  + salary* commission_pct as "Salary after Commission" 
from employees 
where commission_pct is not null;
--How to find out employees monthly and yearly salary with commission?

select employee_id, first_name, salary , last_name, salary  + salary* commission_pct as "Monthly salary" ,
((salary+salary*commission_pct)*12)as "Year Salary"
from employees 
where commission_pct is not null;

--How to retrieve first 10 employee’s information? 
select * from employees where rownum between 1 AND 10;
--2nd way
select* from employees
where rownum <=10;

--how to retrieve 10th to 19th employee_id first name, last name and salary?
select employee_id, first_name,last_name ,salary from employees where rownum <=19
minus 
select employee_id, first_name,last_name ,salary from employees where rownum <=9;

-- how to find how many employees were hired in last 15 years?
select * from employees order by hire_date desc;
--
select * from employees where hire_date like '%-08';
select count(*) from employees where hire_date like '%-08';
-- how to find out employee id , first name, last name, salary of top ten salary drawing employees?
select *from(select employee_id , first_name, last_name, salary
from employees order by salary desc)
where rownum <11;

--how to find out those employees who earn maximum salary?
select *
from employees
where salary = (SELECT MAX(salary) 
from employees)
-- how to find out those employees who earn minimum salary?
select *
from employees
where salary = (SELECT MIN(salary) 
from employees)
--how to find out those employees who earn more than average salary?
select *
from employees
where salary > (SELECT AVG(salary) 
from employees) order by salary desc;
-- how to find out those employees who earn same salary as ’Neena’? \
select employee_id, first_name, last_name,  salary
from employees
where first_name = 'Neena';
select employee_id, first_name, last_name,  salary
from employees where salary = 17000;
--

-- Join
--How to find out emoloyee first, last name, salary department id and department name?(Two table)
select e.first_name,e.last_name,e.salary ,e.department_id ,d.department_name
from employees e join departments d ON e.department_id = d.department_id ;

--How to find out emoloyee first, last name, salary department id, department name and country name?(three table)
Select e.first_name, e.last_name, e.salary, e.department_id, d.department_name
from employees e join departments d on e.department_id= d.department_id;


  /////////       note        ////////////
-- Online SQL Editor to Run SQL Online.
-- Use the editor to create new tables, insert data and all other SQL operations.
  
SELECT * FROM Customers;

-- Write query to display all orders of 'John'
Select c.customer_id , c.first_name , c.last_name , item
From Customers c join Orders o on c.customer_id  = o.customer_id
where c.first_name = 'John';

-- Write query to display all orders of 'John' and shipping status
Select c.customer_id , c.first_name , c.last_name , o.item , s.status
From Customers c 
join Orders o on c.customer_id  = o.customer_id
join Shippings s on c.customer_id  = s.customer
where c.first_name = 'John';

select c.first_name, c.last_name , s.status
from Customers c 
join Shippings s on  c.customer_id  = s.customer
where s.status = 'Delivered';

select c.first_name, c.last_name , s.status , o.item , c.country
from Customers c 
join Shippings s on  c.customer_id  = s.customer
join Orders o on  c.customer_id  = o.customer_id
where s.status = 'Delivered';



 */
}
