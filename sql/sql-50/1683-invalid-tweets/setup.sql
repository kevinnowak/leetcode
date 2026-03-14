-- 1. Create the table with constraints to mimic ENUM behavior
create table Tweets
(
    tweet_id int primary key,
    content  varchar
);

-- 2. Insert the example data from the problem description
insert into Tweets (tweet_id, content)
values (1, 'Let us code'),
       (2, 'More than fifteen chars are here!');

-- 3. Verify the data was inserted correctly
select *
from Tweets;