create table Employees
(
    id   int primary key,
    name varchar
);

insert into Employees
values (1, 'Alice'),
       (7, 'Bob'),
       (11, 'Meir'),
       (90, 'Winston'),
       (3, 'Jonathan');

select *
from Employees;

create table EmployeeUNI
(
    id        int,
    unique_id int,
    primary key (id, unique_id)
);

insert into EmployeeUNI
values (3, 1),
       (11, 2),
       (90, 3);

select *
from EmployeeUNI;

