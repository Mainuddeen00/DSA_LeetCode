# Write your MySQL query statement below
select Employee.name, Bonus.bonus from Employee
##where Bonus.bonus < 1000 || Bonus.bonus = 0
left join Bonus on
Employee.empId = Bonus.empId
where Bonus.bonus < 1000 or Bonus.bonus is null;