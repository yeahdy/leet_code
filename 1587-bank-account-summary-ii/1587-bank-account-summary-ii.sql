-- SELECT: Users 테이블 name, Transactions 테이블 amount AS balance 
-- GROUP BY 해서 가장 MAX(SUM(amount)) AS balance 구하기
SELECT u.name AS name, t.balance AS balance
FROM (SELECT account, SUM(amount) AS balance FROM Transactions GROUP BY account) t
INNER JOIN Users u ON t.account = u.account
WHERE 10000 < t.balance;

