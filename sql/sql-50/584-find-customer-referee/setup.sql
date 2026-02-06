create table customer
(
    id         int primary key,
    name       varchar,
    referee_id int
);

select *
from customer;

insert into customer (id, name, referee_id)
values (1, 'Will', null),
       (2, 'Jane', null),
       (3, 'Alex', 2),
       (4, 'Bill', null),
       (5, 'Zack', 1),
       (6, 'Mark', 2);

