# Phone Book Management System

A console-based Phone Book Management System developed in Java using the HashMap Collection Framework. This application allows users to store, search, view, and delete contacts while validating names and phone numbers using regular expressions.

## Overview

The Phone Book Management System provides a simple command-line interface for managing contacts efficiently. Each contact consists of a name and phone number stored using a HashMap for fast lookup and retrieval.

The project focuses on practical implementation of Java Collections, input validation, and basic CRUD operations.

---

## Features

### Add Contact

* Add new contacts to the phone book
* Prevent duplicate phone numbers
* Detect existing contact names
* Option to replace existing contact information

### View Contacts

* Display all saved contacts
* Retrieve contact information from the phone book

### Search Contact

* Search contacts using the contact name
* Quickly retrieve stored phone numbers

### Delete Contact

* Remove contacts from the phone book
* Display confirmation after successful deletion

### Input Validation

The application validates:

* Contact names using Regular Expressions
* Phone numbers using Regular Expressions
* Invalid entries are rejected and users are prompted to re-enter data

---

## Technologies Used

* Java
* HashMap Collection Framework
* Regular Expressions (Regex)
* Exception Handling
* Console-Based User Interface

---

## Project Structure

```text
src/
│
└── PhoneBookHashMap.java
    ├── Name Validation
    ├── Phone Number Validation
    ├── Add Contact
    ├── View Contacts
    ├── Search Contact
    ├── Delete Contact
    └── Menu System
```

---

## Concepts Demonstrated

### HashMap

Stores contact information in key-value format.

```java
HashMap<String, String> phoneBook = new HashMap<>();
```

Where:

* Key → Contact Name
* Value → Phone Number

### Regular Expressions

Used to validate:

* Names
* Phone Numbers

Example:

```java
name.matches("^[a-zA-Z' -]+$")
```

### Exception Handling

```java
try {
    // Application Logic
}
catch(Exception e) {
    System.out.println("Error");
}
```

### CRUD Operations

| Operation | Description                     |
| --------- | ------------------------------- |
| Create    | Add new contact                 |
| Read      | View contacts                   |
| Update    | Replace existing contact number |
| Delete    | Remove contact                  |

---

## Sample Menu

```text
-Menu-

1. Add Contact
2. View Contacts
3. Search Contact
4. Delete Contact
5. Exit

Enter your choice:
```

---

## Sample Output

### Adding a Contact

```text
Enter the name:
John Doe

Enter phone number:
9876543210

The name and phone number have been saved successfully!
```

### Searching a Contact

```text
Enter the name:
John Doe

John Doe : 9876543210
```

### Viewing Contacts

```text
Contact List

John Doe : 9876543210
Alice : 9123456789
```

---

## Learning Outcomes

Through this project, I practiced:

* Java Collections Framework
* HashMap Operations
* Regular Expressions
* Input Validation
* Search Algorithms
* Menu-Driven Program Design
* Exception Handling
* User Interaction in Console Applications

---

## Future Enhancements

Possible improvements include:

* Contact update option
* Search by phone number
* Contact sorting
* File handling for data persistence
* Database integration using MySQL
* Export contacts to CSV
* Java Swing GUI version
* Spring Boot REST API version

---

## How to Run

### Compile

```bash
javac PhoneBookHashMap.java
```

### Execute

```bash
java PhoneBookHashMap
```

---

This project is part of my Java learning journey and demonstrates practical use of HashMap, Regex Validation, and CRUD Operations in Java.
