/*
    Created by danicanacionales on 23/03/2019

    595. Big Countries

    A country is big if it has an area of bigger than 3 million square km or a population of more than 25 million.

    Write a SQL solution to output big countries' name, population and area.
*/

select name, population, area from World where area > 3000000 OR population > 25000000;