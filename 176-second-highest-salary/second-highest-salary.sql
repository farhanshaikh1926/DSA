# Write your MySQL query statement below
SELECT max(salary) as SecondHighestSalary 
FROM Employee
Where salary < (select max(salary) from employee);