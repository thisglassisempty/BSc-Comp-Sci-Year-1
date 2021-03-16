# Relational Algebra 1
#### 4CCS1DBS - Database Systems
#### Author: Aaron Patrick Monte - 20059926

## Overview
Relational Algebra is the basic set of operations for the relational model.
- Why? - the mathematical underpinning of relational databases.
- These operations enable a user to specify basic retrieval requests (or queries)
- The result of an operation is a new relation which may have been formed from one or more input relations.
  - This property makes the algebra 'closed' (all objects in relational algebra are relations.
- The algebra operations thus produce new relations. These can be further manipulated using operations of the same algebra.
- A sequence of relational algebra operations forms a relational algebra expression.

### Operations
Relational algebra consists of several groups of operations:

#### Unary Relational Operations
- SELECT (symbol: sigma)
- PROJECT (symbol: pi)
- RENAME (symbol: rho)

#### Relational Algebra Operations
- UNION
- INTERSECTION
- DIFFERENCE (Or MINUS)

#### Binary Relational Operations
- JOIN (several versions of JOIN exists)
- DIVISION

#### Additional Relational Operations
- OUTER JOINS, OUTER UNION
- AGGREGATE FUNCTIONS (these compute summary of information: e.g. SUM, COUNT, AVG, MIN, MAX)
## Unary Relational Operations
### SELECT
The SELECT operation is used to select a subset of the tuples from a relation based on a selection condition.
- The selection condition acts as a *filter*.
- It keeps only those tuples that satisfy the qualifying condition.
- Tuples satisfying the condition are selected whereas the other tuples are discarded (filtered out)

In general, the select operation is denoted by SIGMA<sub>[selection condition]</sub>(R), where:
- Sigma is used to denote the select operator
- The selection condition is a Boolean (conditional) expression specified on the attributes of relation R
- Tuples that make the condition true are selected
- Tuples that make the condition false are filtered out.

SELECT is commutative, conjunctive, and always <= R.

### PROJECT
PROJECT keeps certain columns (attributes) from a relation and discards the other columns.

i.e. PROJECT creates a vertical partitioning.
- The list of specified columns is kept in each tuple.
- The other attributes in each tuple are discarded.
- Duplicate rows are removed (recall that relations are sets and therefore can't have duplicate rows).

In general, the PROJECT operation is PI<sub>attribute list</sub>(R)
- Pi is the symbol used to represent the PROJECT operation
- <attribute list> is the desired list of attributes from relation R.

The project operation removes any duplicate tuples, as mathematical sets do not allow duplicate elements.


PROJECT is always <= R.

### Relational Algebra Expressions
We may want to apply several relational algebra operations one after the other.
- Either we can write the operations as a single relational algebra by nesting the operations, or...
- We can apply one operation at a time and create intermediate result relations.

In the latter case, we must give names to the relations that hold the intermediate results.

e.g.: PI<sub>FNAME, LNAME, SALARY</sub>(SIGMA<sub>DNO=5</sub>(EMPLOYEE)) will retrieve the first name, last name and salary of all employees who work in department number 5.

We can also use variables.

### RENAME
The RENAME operator is denoted by rho.
- In some cases, we may want to rename the attributes of a relation, the name of the relation, or both.

This is useful when a query requires multiple operations, and necessary in some cases.

The general RENAME operation can be expressed as:
- Rho<sub>s</sub>(R) changes the relation name to s.
- Rho<sub>(B1, B2, ..., Bn)</sub>(R) changes the column names to B1, B2, ..., Bn.
- Rho<sub>s(B1, B2, ..., Bn)</sub>(R) changes relation name to s and the column names to B1, B2, ..., Bn.

You can also use temporary attributes.

### Relational Algebra Operations from Set Theory

Relations are sets, so we can apply set operators.
- However, we want the results to be relations (that have homogeneous sets of tuples).
- The two operand relations R and S must be "type compatible" (or UNION compatible):
  - R and S must have the same number of attributes
  - Each pair of corresponding attributes must be type compatible (have same or compatible domains).

#### UNION
The result of R UNION S is a relation that includes all tuples that are either in R or in S or in both R and S.

Think OR.

#### INTERSECT
The result of R UNION S is a relation that includes all tuples that are in R and in S or in both R and S.

Think AND.

#### DIFFERENCE
The result of R - S is a relation that includes all tuples that are in R but not in S.

### Properties of UNION, INTERSECT and SET DIFFERENCE

- UNION and INTERSECT operations are commutative.
- UNION and INTERSECT operations are associative.
- In general, the minus operation is not commutative.

#### CARTESIAN PRODUCT
It's what it says on the tin. The result of R x S is a relation Q with degree n + m attributes.

Generally, this is not a meaningful operation, but they can be meaningful when followed by other operations.


#### JOIN
The sequence of CARTESIAN PRODUCT followed by SELECT is quite commonly used to identify the select related tuples from two relations.

A special operation called JOIN combines this sequence into one operation.












