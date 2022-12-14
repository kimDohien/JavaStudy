 -- 2022년 1학기 컴퓨터 개론을 수강하는 학생이릉과 학점 조회
 SELECT ST_NAME AS 수강생 , CO_GRADE AS 학점 FROM LECTURE 
 JOIN COURSE ON CO_LE_NUM = LE_NUM
 JOIN STUDENT ON CO_ST_NUM = ST_NUM
 WHERE LE_YEAR LIKE '2022' AND LE_TERM LIKE '1' AND LE_NAME LIKE '컴퓨터 개론';

-- 컴퓨터 공학부 학생명단 과 교수명단을 함께 조회
SELECT PR_NAME AS 교수명단 FROM DEPARTMENT 
JOIN PROFESSOR ON PR_DE_NUM = DE_NUM 
WHERE DE_NAME LIKE '컴퓨터 공학부' 
UNION 
SELECT ST_NAME AS 학생명단 FROM DEPARTMENT
JOIN MAJOR ON MA_DE_NUM = DE_NUM
JOIN STUDENT ON MA_ST_NUM = ST_NUM
WHERE DE_NAME LIKE '컴퓨터 공학부' ;

SELECT PR_NAME AS 교수명단 FROM PROFESSOR WHERE PR_DE_NUM ='160'
UNION
SELECT ST_NAME AS 학생명단 FROM MAJOR JOIN STUDENT ON MA_ST_NUM = ST_NUM WHERE MA_DE_NUM LIKE '160' ;

-- 2022160001학생의 성적을 조회하는 
SELECT CO_GRADE FROM STUDENT 
JOIN COURSE ON ST_NUM = CO_ST_NUM
JOIN LECTURE ON CO_LE_NUM = LE_NUM 
WHERE ST_NAME LIKE '고길동';
SELECT * FROM COURSE WHERE CO_ST_NUM = '2022160001';

/* 2022160001 학생의 2022년 1학기 평균 학점을 조회
A : 4.5 / B: 3.5 / C: 2.5 / D : 1.5 / F:0
*/
SELECT SUM(
CASE
 WHEN co_grade = 'A' THEN 4.5 
 WHEN co_grade ='B' THEN 3.5
 WHEN co_grade = 'C' THEN 2.5
 WHEN co_grade ='D' THEN 1.5
 WHEN co_grade = 'F' THEN 0 
END * LE_POINT
) / SUM(LE_POINT) AS 평점  FROM COURSE JOIN LECTURE ON CO_LE_NUM = LE_NUM
WHERE CO_ST_NUM = '2022160001' AND LE_YEAR LIKE '2022' AND LE_TERM LIKE '1'
;
