/* 2022년 1학기 컴퓨터 개론을 수강하는 고길동 학생의 성적을 등록하려고 한다
* 중간은 100, 기말 80, 출석 100 , 과제 90점 이고, 비율은 중간 4, 기말 4, 출석 1, 과제1로 계산 
* 성적이 계산되어 총점에 저장되어야함
* 학점은 100 이상 90이상 A, 90미만 80이상 B, 80미만 70이상 C,70미만 60이상 D, 나머지F
*/
DROP PROCEDURE IF EXISTS INSERT_SCORE;
DELIMITER //
CREATE PROCEDURE INSERT_SCORE(
IN _ST_NUM CHAR(10),
IN _LE_NUM INT, 
IN _MID INT,
IN _FINAL INT,
IN _ATT INT,
IN _HOME INT
)
BEGIN
DECLARE _TOTAL INT DEFAULT 0;
DECLARE _CO_NUM INT;
DECLARE _GRADE VARCHAR(5);
DECLARE _TYPE VARCHAR(5); -- ABC를 학점일때만 계산해야하기 때문에 선언
SET _TOTAL = _MID *0.4 + _FINAL*0.4 + _ATT*0.1 + _HOME*0.1;
SET _CO_NUM = (SELECT CO_NUM FROM COURSE WHERE CO_ST_NUM = _ST_NUM AND CO_LE_NUM = _LE_NUM);
INSERT INTO SCORE VALUES(NULL, _MID, _FINAL, _HOME, _ATT, _TOTAL,_CO_NUM);

-- 학점등록
SET _TYPE = (SELECT CO_TYPE FROM COURSE WHERE CO_NUM = _CO_NUM);
IF _TYPE = '학점' THEN 
	IF _TOTAL >=90 AND _TOTAL <=100 THEN
     SET _GRADE = 'A';
     END IF;
	IF _TOTAL >=80 AND _TOTAL <90 THEN
     SET _GRADE = 'B';
     END IF;
	IF _TOTAL >=70 AND _TOTAL <80 THEN
     SET _GRADE = 'C';
     END IF;
	IF _TOTAL >=60 AND _TOTAL <70 THEN
     SET _GRADE = 'D';
     END IF;
	IF _TOTAL >=0 AND _TOTAL <60 THEN
     SET _GRADE = 'F';
     END IF;
     UPDATE COURSE SET CO_GRADE = _GRADE WHERE CO_NUM = _CO_NUM;
END IF;

END // 
DELIMITER ; 
CALL INSERT_SCORE('2022160001',1,100,80,100,90);


/* 2022년 1학기 컴퓨터 개론을 수강하는 고길동 학생의 성적을 등록하려고 한다
* 중간은 100, 기말 80, 출석 100 , 과제 90점 이고, 비율은 중간 4, 기말 4, 출석 1, 과제1로 계산 
* 성적이 계산되어 총점에 저장되어야함
* 학점은 100 이상 90이상 A, 90미만 80이상 B, 80미만 70이상 C,70미만 60이상 D, 나머지F
* 수강번호가 2번이고, 중간 100, 기말 80, 출석 100, 과제 90
<트리거 이용>
INSERT전에 TOTAL과 학점을 계산하기 위한 트리거 
*/


DROP TRIGGER IF EXISTS INSERT_SCORE;
DELIMITER //
CREATE TRIGGER INSERT_SCORE BEFORE INSERT
ON SCORE
FOR EACH ROW
BEGIN
DECLARE _GRADE VARCHAR(5);
DECLARE _TYPE VARCHAR(5);
DECLARE _TOTAL INT;

SET NEW.SC_TOTAL = NEW.SC_MID *0.4 + NEW.SC_FINAL*0.4 + NEW.SC_ATTENDANCE*0.1 + NEW.SC_HOMEWORK*0.1;

SET _TOTAL = NEW.SC_TOTAL;
SET _TYPE = (SELECT CO_TYPE FROM COURSE WHERE CO_NUM = NEW.SC_CO_NUM);

IF _TYPE = '학점' THEN 
	IF _TOTAL >=90 AND _TOTAL <=100 THEN
     SET _GRADE = 'A';
     END IF;
	IF _TOTAL >=80 AND _TOTAL <90 THEN
     SET _GRADE = 'B';
     END IF;
	IF _TOTAL >=70 AND _TOTAL <80 THEN
     SET _GRADE = 'C';
     END IF;
	IF _TOTAL >=60 AND _TOTAL <70 THEN
     SET _GRADE = 'D';
     END IF;
	IF _TOTAL >=0 AND _TOTAL <60 THEN
     SET _GRADE = 'F';
     END IF;
     UPDATE COURSE SET CO_GRADE = _GRADE WHERE CO_NUM = NEW.SC_CO_NUM;
END IF;
END //
DELIMITER ;
INSERT INTO SCORE VALUES(NULL, 90,100,30,100,0,2);