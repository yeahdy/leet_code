-- 만약에 sex가 m > f, f > m UPDATE 하기
UPDATE Salary
SET sex = if(sex='m','f','m')

