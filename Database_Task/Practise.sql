create database Practise;

use Practise;
create table teachers (
    id int(10),
    first_name varchar(25),
    last_name varchar(50),
    school varchar(50),
    hire_date date,
    salary int(10)
);



insert into teachers (first_name, last_name, school, hire_date, salary)values('Pranita', 'Chopade', 'PES MCOE', '2011-10-30', 45200),
       ('Sapna', 'Gawade', 'PES MCOE', '1993-05-22', 65000),
       ('Shivani', 'Kedari', 'MIT', '2005-08-01', 43500),
       ('Priyanka', 'Gowda', 'PCCOE', '2011-10-30', 36200),
       ('Pooja', 'Kature', 'Jai Hind', '2005-08-30', 43500),
       ('Nikita', 'Angre', 'MM COE', '2010-10-22', 38500);
       
select * from teachers;

select last_name, first_name, salary from teachers;

select distinct school from teachers;

select distinct school, salary from teachers;

select first_name, last_name, salary from teachers order by salary DESC;

select last_name, school, hire_date from teachers order by school ASC, hire_date DESC;


select last_name, school, hire_date from teachers where school = 'PES MCOE';

select first_name, last_name, school from teachers where first_name = 'Sapna';


select school from teachers where school != 'PES MCOE';

select first_name, last_name, hire_date from teachers where hire_date < '2000-01-01';

select first_name, last_name, salary from teachers where salary >= 43500;

select first_name, last_name, school, salary from teachers where salary between 40000 and 65000;

select first_name from teachers where first_name like 'Pra%';

select first_name from teachers where first_name like '%na';

select * from teachers where school = 'PES MCOE'AND salary < 70000;

select *from teachers where last_name = 'Chopade'OR last_name = 'Gawade';

select *from teachers where school = 'PES MCOE'AND (salary > 38000 OR salary < 70000);

select first_name, last_name, school, hire_date, salary from teachers where school like '%co%'order by hire_date DESC;