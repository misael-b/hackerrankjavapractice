SELECT * FROM CITY WHERE ID = 1661;

SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN';

SELECT NAME FROM CITY WHERE COUNTRYCODE = 'JPN';

SELECT CITY, STATE FROM STATION;

SELECT DISTINCT CITY FROM STATION WHERE (mod(ID, 2) =0);
SELECT DISTINCT CITY FROM STATION WHERE (ID%2 = 0); --mySQL
-- DISTINCT : select unique values
-- mod(number, divideByNumber)

SELECT
(SELECT COUNT(CITY) FROM STATION) -
(SELECT COUNT(DISTINCT CITY) FROM STATION);
--use SELECT () - () to subtract two counts
-- use COUNT() to count number  of columns


SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY length(CITY), CITY ASC LIMIT 1;

SELECT CITY, LENGTH(CITY) FROM STATION
ORDER BY length(CITY) DESC, CITY ASC LIMIT 1;

--use length() function to find length of string
--use LIMIT to select number of entries


SELECT DISTINCT CITY FROM STATION
WHERE SUBSTRING(CITY, 1,1) = "A" OR
SUBSTRING(CITY, 1,1) = "E" OR
SUBSTRING(CITY, 1,1) = "I" OR
SUBSTRING(CITY, 1,1) = "O" OR
SUBSTRING(CITY, 1,1) = "U";

--substring to select subsections of string, starts at 1;
-- substring(string, start, numberOfCharacters)

SELECT DISTINCT CITY FROM STATION
WHERE SUBSTRING(CITY, -1, 1) = "A" OR
SUBSTRING(CITY, -1, 1) = "E" OR
SUBSTRING(CITY, -1, 1) = "I" OR
SUBSTRING(CITY, -1, 1) = "O" OR
SUBSTRING(CITY, -1, 1) = "U";
--substring : last letter (-1)

SELECT CITY FROM STATION WHERE
(
    SUBSTRING(CITY, 1, 1) = "A" OR
    SUBSTRING(CITY, 1,1) = "E" OR
    SUBSTRING(CITY, 1,1) = "I" OR
    SUBSTRING(CITY, 1,1) = "O" OR
    SUBSTRING(CITY, 1,1) = "U"
)
AND
(
    SUBSTRING(CITY, -1, 1) = "A" OR
    SUBSTRING(CITY, -1, 1) = "E" OR
    SUBSTRING(CITY, -1, 1) = "I" OR
    SUBSTRING(CITY, -1, 1) = "O" OR
    SUBSTRING(CITY, -1, 1) = "U"
) ;




SELECT DISTINCT CITY FROM STATION
WHERE SUBSTRING(CITY, 1,1) != "A" AND
SUBSTRING(CITY, 1,1) != "E" AND
SUBSTRING(CITY, 1,1) != "I" AND
SUBSTRING(CITY, 1,1) != "O" AND
SUBSTRING(CITY, 1,1) != "U";
-- does not start with a vowel



SELECT DISTINCT CITY FROM STATION WHERE SUBSTRING(CITY, -1, 1) != 'A' AND
SUBSTRING(CITY, -1, 1) != 'E' AND
SUBSTRING(CITY, -1, 1) != 'I' AND
SUBSTRING(CITY, -1, 1) != 'O' AND
SUBSTRING(CITY, -1, 1) != 'U';
--does not end with vowel



SELECT DISTINCT CITY FROM STATION WHERE
(
    SUBSTRING(CITY, 1, 1) != 'A' AND
    SUBSTRING(CITY, 1, 1) != 'E' AND
    SUBSTRING(CITY, 1, 1) != 'I' AND
    SUBSTRING(CITY, 1, 1) != 'O' AND
    SUBSTRING(CITY, 1, 1) != 'U'
)
OR
(
    SUBSTRING(CITY, -1, 1) != 'A' AND
    SUBSTRING(CITY, -1, 1) != 'E' AND
    SUBSTRING(CITY, -1, 1) != 'I' AND
    SUBSTRING(CITY, -1, 1) != 'O' AND
    SUBSTRING(CITY, -1, 1) != 'U'
);
-- do not start with vowel or do not end with vowel


SELECT DISTINCT CITY FROM STATION WHERE
(
    SUBSTRING(CITY, 1, 1) != 'A' AND
    SUBSTRING(CITY, 1, 1) != 'E' AND
    SUBSTRING(CITY, 1, 1) != 'I' AND
    SUBSTRING(CITY, 1, 1) != 'O' AND
    SUBSTRING(CITY, 1, 1) != 'U'
)
AND
(
    SUBSTRING(CITY, -1, 1) != 'A' AND
    SUBSTRING(CITY, -1, 1) != 'E' AND
    SUBSTRING(CITY, -1, 1) != 'I' AND
    SUBSTRING(CITY, -1, 1) != 'O' AND
    SUBSTRING(CITY, -1, 1) != 'U'
);
-- do not start with vowel and do not end with vowel



SELECT NAME FROM STUDENTS WHERE MARKS > 75 ORDER BY SUBSTRING(NAME, -3, 3) ASC, ID ASC;
-- Query the Name of any student in STUDENTS who scored higher than Marks.
-- Order your output by the last three characters of each name.
-- Secondary sort them by ascending ID


SELECT NAME FROM EMPLOYEE ORDER BY NAME ASC;
-- query that prints a list of employee names in alphabetical order

SELECT NAME FROM EMPLOYEE WHERE (SALARY > 2000) AND MONTHS < 10 ORDER BY EMPLOYEE_ID;
-- query that prints a list of employee names for employees having:
-- a salary greater than 2000 per month
-- have been employees for less than 10 months
-- Sort your result by ascending employee_id

SELECT
CASE
    WHEN (A+B<=C) THEN "Not A Triangle"
    WHEN (A = B AND B = C)THEN "Equilateral"
    WHEN (A = B OR B = C OR A=C) THEN "Isosceles"
    ELSE "Scalene"
END
FROM TRIANGLES;

-- CASE if else statement -->
--  CASE
--      WHEN (CONDITION) THEN (OUTPUT)
--      WHEN (CONDITION) THEN (OUTPUT)
--  END


--LIKE:
-- SELECT column1, column2, ...
-- FROM table_name
-- WHERE columnN LIKE pattern;

--Finds any values that start with "a" :
SELECT * FROM TABLE1 WHERE NAME LIKE 'a%';




-- % represents zero or more characters
-- _ represents a single character




SELECT * FROM Customers WHERE CITY LIKE '%a';
-- Select all records where the value of the City column ends with the letter "a".



SELECT * FROM Customers WHERE City NOT LIKE 'a%'
-- Select all records where the value of the City column does NOT start with the letter "a".



SELECT * FROM Customers WHERE COUNTRY IN ('Norway', 'France');
-- Use the IN operator to select all the records where Country is either "Norway" or "France".



SELECT * FROM Products WHERE Price BETWEEN 10 AND 20;
--Use the BETWEEN operator to select all the records where the value of the Price column is between 10 and 20.


SELECT CustomerName,Address,PostalCode AS Pno
FROM Customers;
-- When displaying the Customers table, make an ALIAS of the PostalCode column, the column should be called Pno instead.



Joins :

SELECT *
FROM Orders
LEFT JOIN Customers
ON Orders.CustomerID = Customers.CustomerID;
-- JOIN clause to join the two tables Orders and Customers,
-- using the CustomerID field in both tables as the relationship between the two tables


SELECT CONCAT(NAME, '(',SUBSTRING(OCCUPATION, 1,1), ')') FROM OCCUPATIONS ORDER BY NAME;
-- Query an alphabetically ordered list of all names in OCCUPATIONS,
-- immediately followed by the first letter of each profession as a parenthetical
-- Ex: AnActorName(A), ADoctorName(D), etc.

SELECT CONCAT('There are a total of ', COUNT(OCCUPATION), ' ',  LOWER(OCCUPATION), 's.') FROM OCCUPATIONS GROUP BY OCCUPATION ORDER BY COUNT(OCCUPATION), OCCUPATION;
-- Query the number of ocurrences of each occupation in OCCUPATIONS.
-- Sort the occurrences in ascending order, and output them in the following format:
        -- There are a total of [occupation_count] [occupation]s.


SELECT COUNT(ID) FROM CITY WHERE POPULATION > 100000;
-- Query a count of the number of cities in CITY having a Population larger than 100,000.


SELECT SUM(POPULATION) FROM CITY WHERE DISTRICT= 'California';
-- Query the total population of all cities in CITY where District is California.

SELECT AVG(POPULATION) FROM CITY WHERE DISTRICT = 'California';
--Query the average population of all cities in CITY where District is California.

SELECT ROUND(AVG(POPULATION)) FROM CITY;
-- Query the average population for all cities in CITY, rounded down to the nearest integer.
-- Use ROUND to round to to number of decimals
-- Ex. ROUND(number, decimals);

SELECT SUM(POPULATION) FROM CITY WHERE COUNTRYCODE = 'JPN';
-- Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.

SELECT MAX(POPULATION) - MIN(POPULATION) FROM CITY;
-- Query the difference between the maximum and minimum populations in CITY.


SELECT CEIL((AVG(Salary)) - AVG(REPLACE(Salary,0,""))) FROM EMPLOYEES;
-- Samantha was tasked with calculating the average monthly salaries for all employees,
-- but did not realize her keyboard's key was broken until after completing the calculation
-- find the difference between her miscalculation (using salaries with any zeros removed), and the actual average salary
-- REPLACE(string, substring, new_string)
-- string 	    Required. The original string
-- substring 	Required. The substring to be replaced
-- new_string 	Required. The new replacement substring

SELECT MAX(salary*months), COUNT(employee_id) FROM Employee WHERE salary*months = (SELECT MAX(salary*months) FROM EMPLOYEE);
-- find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings

SELECT ROUND(SUM(LAT_N),2), ROUND(SUM(LONG_W),2) FROM STATION;
-- Query the following two values from the STATION table:
--    1. The sum of all values in LAT_N rounded to a scale of 2 decimal places.
--    2. The sum of all values in LONG_W rounded to a scale of 2 decimal places.

SELECT TRUNCATE(SUM(LAT_N),4) FROM STATION WHERE LAT_N>38.7880 AND LAT_N<137.2345;
-- Query the sum of Northern Latitudes (LAT_N) from STATION having values:
-- greater than 38.7880 and less than 137.2345
-- Truncate your answer to decimal places.