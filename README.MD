# University Management System, Book Library System, Bank Account Management, Employee Records

## Branch Structure

This repository contains four branches, each focusing on different Java concepts. Below is the branch-wise organization of files:

| Branch Name            | Description                                              | Files Included       |
|------------------------|----------------------------------------------------------|----------------------|
| `main`                | Merges all features and acts as the main branch.         | All files            |
| `level-1`             | Implements core Java classes and inheritance examples.   | `Student.java`       |
| `instance-vs-class`   | Demonstrates instance vs class variables usage.         | `Book.java`          |
| `access-modifiers`    | Showcases different access modifiers in Java.            | `BankAccount.java`, `Employee.java` |

## Description of Code Files

### 1. `Student.java`
- Implements a `Student` class with `rollNumber`, `name`, and `CGPA`.
- Demonstrates public, protected, and private access modifiers.
- Includes `PostgraduateStudent` subclass to show inheritance.

### 2. `Book.java`
- Implements a `Book` class with `ISBN`, `title`, and `author`.
- Demonstrates setting and getting private variables.
- Includes `EBook` subclass to demonstrate access levels.

### 3. `BankAccount.java`
- Defines a `BankAccount` class with `accountNumber`, `accountHolder`, and `balance`.
- Implements methods to access and modify balance.
- Includes `SavingsAccount` subclass to extend functionality.

### 4. `Employee.java`
- Defines an `Employee` class with `employeeID`, `department`, and `salary`.
- Demonstrates modifying private salary attributes using public methods.
- Includes `Manager` subclass to showcase inheritance and access control.

## How to Switch Branches
To checkout a specific branch, use the following command:
```sh
 git checkout <branch-name>