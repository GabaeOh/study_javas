-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition
-- ORDER BY column_name(s);

-- 총 설문자 4명 
SELECT  COUNT(*) AS CNT 
FROM (
		SELECT RESPONDENTS_ID, count(*) CNT
		FROM statistics
		GROUP BY RESPONDENTS_ID
        ) AS T_STATIC
;

