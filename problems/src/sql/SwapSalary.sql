/*
    Created by danicanacionales on 02/04/2019

    627. Swap Salary

    Given a table salary, such as the one below, that has m=male and f=female values.

    Swap all f and m values with a single update statement and no intermediate temp table.
*/

update salary set sex = case when sex = 'm' then 'f' else 'm' end;