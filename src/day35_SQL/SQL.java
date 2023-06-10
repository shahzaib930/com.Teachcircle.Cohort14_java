package day35_SQL;

public class SQL {

	public static void main(String[] args) {
		//         ** SQA **
		// Data base --> collection of data
		// Every Table has primaryKey and a foreignKey..

		/*
		 SQL Tips;
		 1)
		select name colume, name colume,
		 From (Table name)
		 
		 2)
		 Select*from (Specific table name);
		  (*)--> Represent all the colume of that table
		 
		  3) to change the name(as)
		   select name columename as first, name columename as last,
		 From (Table name)
		  
		  4) to rename --> if u dont wanna use (as ) use--> ""
		  select first_name " fNmame",last_name "LName",salary *12"YEAR SALARY"
          from hr.employees;
          
          5) distinct --> to remove the duplicate 
          select distinct department_id
          from hr.employees;
          
                      // where Statement //
          6) Where = name--> to display specific data of a thing name person etc
          select*from hr.employees where employee_id = 123;
         
          caseDoes matter 
          in this case--> select*from hr.employees where last_name = 'Austin';
          in this case--> select*from hr.employees where last_name = 'austin';//no data
          
          7)where Condition (or,and,not)
          select*from hr.employees where first_name = 'David';--show you all david name person
            select*from hr.employees where first_name = 'David'; and job_id ='SA_REP';
            select*from hr.employees where first_name = 'David' not like 'SA_REP';
            
            8) like 
          *  -- Display all the first name start with's'
          select *from hr .employees where first_name like 'S%';-->start with (first %sign matter in this case)
         select *from hr .employees where first_name like '%r';--> End with ( last %sign matter in this case)
         
        * --all name that contain 'an'
         select *
          from hr.employees
          where first_name like '%an%';
          
         * --all the employee who got hired in august
              select *
          from hr.employees
         where hire_date like '%-MAR-06%'
         
         *--     Not in 
              select first_name,last_name,job_id
          from hr.employees
         where job_id not in ('FI_ACCOUNT','ST_CLERK','SA_REP');--show you except these jobs data

       9)  order by
         --  select *
          from hr.employees
         order by salary asc;-- display from low to high salary
         
         -- elect *
          from hr.employees
         where job_id ='FI_ACCOUNT'  order by hire_date desc;
 


		 */
		
		
		/*
		 
		 DESCRIBE DEPARTMENTS;
--How to display all the contants of a table? SELECT * FROM countries;
--How to display employee_id, first_name, last_name and salary from employee table and sort by employee_id?
--What is the query to find out all the information of a specific employee whose employee_id is 107?
--What is the query to find out employee_id, first_name, last_name and salary of those employees who have employee_id as 100,101,102,103?
--How to display employeeid, first name, last name and salaray of a specific employee whose first name is "PETER"?
--How to display employeeid, first name, last name and salaray of a specific employee 
--whose first name is "PETER" and last_name is "TUCKER"?
--How to find out those employees whose first name start with character 'P'? 
--How to find out those employees whose first name ends with character 'N'?
--How to find out those employees whose first name start with character 'P' and first name ends with character 'N'
--How to find out those employees whose first name start with character 'N', 'A','P','k'?
--How to find out employee_id, first , last name and salary? 
--rename salary as <Monthly salary>.
--How to find out employee id, first name , 
--last name and salary and commition pct of all the employees?
-------------------NULL, NOT NULL
--How to find those employees who have commision?
--How to find whose employees who do not have commision.
--How to find out all the and employees who has commision and calculate 
--the tototal salaries after adding their commision percentage?
--How to find out employees monthly and yearly salary with commission?
—How to retrieve first 10 employee’s information? 
— how to retrieve 10th to 19th employee_id first name, last name and salary? 
— how to find how many employees were hired in last 15 years?
— how to find out employee id , first name, last name, salary of top ten salary drawing employees?
—how to find out those employees who earn maximum salary?
— how to find out those employees who earn minimum salary?
— how to find out those employees who earn more than average salary?
— how to find out those employees who earn same salary as ’Neena’? \
-- Join
--How to find out emoloyee first, last name, salary department id and department name?(Two table)
--How to find out emoloyee first, last name, salary department id, department name and country name?(three table)
-- How to find out emoloyee first, last name, salary department id, department name, country name and country name ?(Four table)
-- How to find out emoloyee first, last name, salary department id, department name, country name, country name and region name?(Five table)
-- how to find out only those employees who are associated with any department?
-- Left Join
-- How to find out all employees who are associated with any departments or not? 
—- Right outer join
—- How to find all departments which have employees including the department that do not have employees?, (Matching & Non-Matching)
— How to find out the departments that do not have any employees?  
— How to find out employees that do not belong to any departments?
		 
		 */
		
	}

}
