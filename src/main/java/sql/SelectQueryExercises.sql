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




