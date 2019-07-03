--SQL ASSIGNMENT BY RUCHA JOSHI 

--PROBLEM 1
--Write a query to display the name, product line, and buy price of all products. 
--The output columns should display as “Name”, “Product Line”, and “Buy Price”. 
--The output should display the most expensive items first.
SELECT PRODUCTNAME AS "NAME",
  PRODUCTLINE AS "PRODUCT LINE",
  BUYPRICE "BUY PRICE"
FROM PRODUCTS
ORDER BY BUYPRICE DESC;

--PROBLEM 2
--Write a query to display the first name, last name, and city for all customers
--from Germany. Columns should display as “First Name”, “Last Name”, and “City”. 
--The output should be sorted by the customer’s last name (ascending).
SELECT CONTACTFIRSTNAME "FIRST NAME", 
  CONTACTLASTNAME "LAST NAME",CITY
FROM CUSTOMERS
WHERE COUNTRY = 'Germany'
ORDER BY CONTACTLASTNAME;

--problem 3
--Write a query to display each of the unique values of the status field in the 
--orders table. The output should be sorted alphabetically increasing.  
--Hint: the output should show exactly 6 rows.
SELECT DISTINCT STATUS
FROM ORDERS
ORDER BY STATUS;

--PROBLEM 4
--Select all fields from the payments table for payments made on or after 
--January 1, 2005. The output should be sorted by increasing payment date.
SELECT *
FROM PAYMENTS
WHERE PAYMENTDATE >= '01-JAN-05'
ORDER BY PAYMENTDATE;

--PROBLEM 5
--Write a query to display all Last Name, First Name, Email and Job Title of all 
--employees working out of the San Francisco office. The output should be sorted
--by the last name.
SELECT LASTNAME,FIRSTNAME,EMAIL,JOBTITLE
FROM EMPLOYEES 
WHERE OFFICECODE = 1
ORDER BY LASTNAME;

-- ANOTHER WAY FOR PROBLEM 5 USING JOIN
--SELECT *
--FROM OFFICES;

SELECT E.LASTNAME,E.FIRSTNAME,E.EMAIL,E.JOBTITLE
FROM EMPLOYEES E, OFFICES O
WHERE E.OFFICECODE = O.OFFICECODE
AND O.CITY = 'San Francisco'
ORDER BY LASTNAME;

-- PROBLEM 6
--Write a query to display the Name, Product Line, Scale, and Vendor of all of 
--the car products – both classic and vintage. The output should display all 
--vintage cars first (sorted alphabetically by name), and all classic cars last
--(also sorted alphabetically by name).

SELECT PRODUCTNAME AS "NAME",
  PRODUCTLINE AS "PRODUCT LINE",
  PRODUCTSCALE AS "SCALE", 
  PRODUCTVENDOR AS "VENDOR"
FROM PRODUCTS
WHERE PRODUCTLINE IN ('Classic Cars','Vintage Cars')
ORDER BY PRODUCTLINE DESC, PRODUCTNAME ASC;
