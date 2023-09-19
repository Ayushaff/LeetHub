# Write your MySQL query statement below

select v.customer_id,count(1) as count_no_trans
from Visits v left join Transactions t
on v.visit_id=t.visit_id
where t.visit_id is NULL
group by v.customer_id;