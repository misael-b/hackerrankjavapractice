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