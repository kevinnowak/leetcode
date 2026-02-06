select *
from Products;

select product_id
from Products
where low_fats = 'Y'
  and recyclable = 'Y';