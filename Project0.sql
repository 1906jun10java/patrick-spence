ALTER TABLE CUSTOMERS
ADD FIRST_NAME VARCHAR2(100);

ALTER TABLE CUSTOMERS 
ADD LAST_NAME VARCHAR2(100);

ALTER TABLE CUSTOMERS
DROP COLUMN CUSTOMER_NAME;

ALTER TABLE CUSTOMERS
DROP COLUMN CUSTOMER_LOGIN;

ALTER TABLE CUSTOMERS
ADD USERNAME VARCHAR2(100);

ALTER TABLE CUSTOMERS
ADD PASSWORD VARCHAR2(100);

ALTER TABLE CUSTOMERS
ADD MY_CARS VARCHAR2(100);

ALTER TABLE CUSTOMERS
ADD OFFER_ID INT;

ALTER TABLE CUSTOMERS
ADD AMOUNT_LEFT FLOAT;

ALTER TABLE CUSTOMERS
DROP COLUMN PAYMENTS;

ALTER TABLE CUSTOMERS
ADD OFFER_AMOUNT FLOAT;

DELETE FROM CUSTOMERS
WHERE LICENSE='1234567';

DELETE FROM CUSTOMERS
WHERE LICENSE='59847851';

ALTER TABLE CARLOT
DROP COLUMN PRICE;

DELETE FROM CARLOT
WHERE CAR_ID='1001';

ALTER TABLE EMPLOYEES
ADD FIRST_NAME VARCHAR2(100);

ALTER TABLE EMPLOYEES
ADD LAST_NAME VARCHAR2(100);

ALTER TABLE EMPLOYEES
ADD USERNAME VARCHAR2(100);

ALTER TABLE EMPLOYEES
ADD PASSWORD VARCHAR2(100);

ALTER TABLE EMPLOYEES
ADD OFFER_ID INT;

ALTER TABLE EMPLOYEES
ADD PAYMENTS FLOAT;

ALTER TABLE EMPLOYEES
DROP COLUMN EMPLOYEE_NAME;

ALTER TABLE EMPLOYEES
DROP COLUMN EMPLOYEE_LOGIN;

DELETE FROM EMPLOYEES
WHERE EMPLOYEE_ID='1001';

ALTER TABLE OFFERS
DROP COLUMN CUSTOMER_LOGIN;

ALTER TABLE OFFERS
ADD CUSTOMER_USERNAME VARCHAR2(100);

DELETE FROM OFFERS
WHERE OFFERS_ID='1000';

INSERT INTO CARLOT (CAR_ID, MAKE, MODEL, COLOR, YEAR, MILEAGE, TRANSMISSION) 
VALUES (1021, 'Subaru', 'Impreza WRX','Black',2012,101850,'MANUAL');
INSERT INTO CARLOT (car_id, MAKE, MODEL, COLOR, YEAR, MILEAGE, TRANSMISSION)
VALUES (1022, 'FORD','MUSTANG GT', 'RED', 2006, 54764, 'MANUAL');
INSERT INTO CARLOT (car_id, MAKE, MODEL, COLOR, YEAR, MILEAGE, TRANSMISSION)
VALUES (1023,'CADILLAC','CTS-V','BLACK',2013,51760,'AUTOMATIC');
INSERT INTO CARLOT (CAR_ID, MAKE, MODEL, COLOR, YEAR, MILEAGE, TRANSMISSION)
VALUES (1024,'BMW','M4','BLUE',2016,52860,'AUTOMATIC');
INSERT INTO CARLOT (CAR_ID, MAKE, MODEL, COLOR, YEAR, MILEAGE, TRANSMISSION)
VALUES (1025, 'JEEP','GRAND CHEROKEE-STR8','WHITE',2017,37200,'AUTOMATIC');
INSERT INTO CARLOT(CAR_ID, MAKE, MODEL, COLOR, YEAR, MILEAGE, TRANSMISSION)
VALUES (1026, 'CHEVROLET','SS','BLACK',2017,10200,'AUTOMATIC');

CREATE PROCEDURE ADDPRICETOCALLLOT
AS
BEGIN
ALTER TABLE CARLOT
ADD PRICE FLOAT;
END
GO;

ALTER TABLE CARLOT
ADD PRICE FLOAT;

UPDATE CARLOT
SET PRICE = '28095'
WHERE CAR_ID= '1021';

UPDATE CARLOT
SET PRICE = '26320'
WHERE CAR_ID='1022';

UPDATE CARLOT
SET PRICE='63215'
WHERE CAR_ID='1023';

UPDATE CARLOT
SET PRICE='80000'
WHERE CAR_ID='1024';

UPDATE CARLOT
SET PRICE='50174'
WHERE CAR_ID='1025';

UPDATE CARLOT
SET PRICE='50000'
WHERE CAR_ID='1026';

UPDATE CARLOT
SET PRICE='73545'
WHERE CAR_ID='1020';