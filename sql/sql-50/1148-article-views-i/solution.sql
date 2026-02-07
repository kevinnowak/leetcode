select *
from Views;

select distinct author_id as id
from Views
where author_id = viewer_id
order by id asc;

select author_id as id
from Views
group by id
having sum(author_id = viewer_id) > 0
order by id asc;

select article_id, count(article_id) as view_count
from Views
group by article_id;

select article_id, count(distinct viewer_id) as view_count
from Views
group by article_id;

select article_id, count(distinct viewer_id) as view_count
from Views
where author_id != viewer_id
group by article_id;
