# Write your MySQL query statement below

select Employee.name as "Employee" from Employee
inner join Employee as mgr
on Employee.managerId = mgr.id
where Employee.salary > mgr.salary;