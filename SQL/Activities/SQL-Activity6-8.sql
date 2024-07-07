REM   Script: Session 02
REM   Activity6To8

DROP table orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500;

SELECT * FROM orders WHERE purchase_amount between 1000 and 2000;

SELECT order_no, order_date FROM orders ORDER BY order_date;

SELECT SUM(purchase_amount) FROM orders;

SELECT SUM(purchase_amount) AS "Total" FROM orders;

SELECT AVERAGE(purchase_amount) AS "Average purchase" FROM orders;

SELECT AVG(purchase_amount) AS "Average purchase" FROM orders;

SELECT MAX(purchase_amount) AS "Max purchase" FROM orders;

SELECT MIN(purchase_amount) AS "Min purchase" FROM orders;

SELECT TOTAL(salesman_id) AS "Number of salesman" FROM orders;

SELECT COUNT(distinct salesman_id) AS "Number of salesman" FROM orders;

SELECT salesman_id, purchase_amount FROM orders GROUP BY purchase_amount;

SELECT salesman_id, purchase_amount FROM orders ORDER BY purchase_amount;

SELECT salesman_id, purchase_amount FROM orders GROUP BY salesman_id ORDER BY purchase_amount;

SELECT salesman_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY salesman_id;

SELECT salesman_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY date = "2012-08-17";

SELECT salesman_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY order_date = "2012-08-17";

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amt" FROM orders WHERE purchase_amount = [2030, 3450, 5760, 6000];

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amt" FROM orders WHERE purchase_amount = [2030, 3450, 5760, 6000] GROUP BY salesman_id, order_date;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amt" FROM orders GROUP BY salesman_id, order_date WHERE MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amt" FROM orders GROUP BY salesman_id, order_date WHERE MAX(purchase_amount) HAVING IN(2030, 3450, 5760, 6000);

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amt" FROM orders GROUP BY salesman_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

DROP table orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no, order_date FROM orders ORDER BY order_date;

SELECT order_no FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount < 500;

SELECT * FROM orders WHERE purchase_amount between 1000 and 2000;

SELECT SUM(purchase_amount) AS "Total" FROM orders;

SELECT AVG(purchase_amount) AS "Average purchase" FROM orders;

SELECT MAX(purchase_amount) AS "Max purchase" FROM orders;

SELECT MIN(purchase_amount) AS "Min purchase" FROM orders;

SELECT COUNT(distinct salesman_id) AS "Number of salesman" FROM orders;

SELECT salesman_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY salesman_id;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amt" FROM orders GROUP BY salesman_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

