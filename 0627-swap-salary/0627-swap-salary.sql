# Write your MySQL query statement below
UPDATE Salary 
set sex=CASE sex
        WHEN 'm' Then 'f'
        else 'm'
    END;