REM   Script: Activity1-5
REM   Activity1-5 done

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

CREATE TABLE salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

DELETE TABLE(salesman);

DROP TABLE salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int NOT NULL, salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int);

DESCRIBE salesman


DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13); 


	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11); 


	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14); 


	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13); 


	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12); 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13); 


	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11); 


	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14); 


	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13); 


	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12); 


SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13); 


	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11); 


	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14); 


	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13); 


	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12); 


SELECT 1 FROM DUAL;

SELECT * FROM salesman;

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman set grade = 100;

SELECT * FROM salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

SELECT * FROM salesman;

UPDATE salesman set grade = 100;

SELECT * FROM salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman set grade = 100;

SELECT * FROM salesman;

UPDATE salesman set grade = 200 WHERE salesman_city = 'Rome';

UPDATE salesman set grade = 200 WHERE salesman_name = 'James Hoog';

UPDATE salesman set salesname_name = 'Pierre' WHERE salesman_name = 'McLyon';

SELECT * FROM salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20) NOT NULL, salesman_city varchar2(20), commission int);

DESCRIBE salesman


INSERT ALL 
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15) 
	INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
	INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
	INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
	INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
	INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city = 'Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman set grade = 100;

SELECT * FROM salesman;

UPDATE salesman set grade = 200 WHERE salesman_city = 'Rome';

UPDATE salesman set grade = 200 WHERE salesman_name = 'James Hoog';

UPDATE salesman set salesman_name = 'Pierre' WHERE salesman_name = 'McLyon';

SELECT * FROM salesman;

