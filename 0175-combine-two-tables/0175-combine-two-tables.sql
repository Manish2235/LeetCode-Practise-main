# Write your MySQL query statement below
#SELECT firstName,lastName,city,state
#FROM Person
#LEFT JOIN Address ON Person.personId = Address.addressId;
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;