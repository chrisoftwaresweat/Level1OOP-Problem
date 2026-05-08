# 🎓 Student Grade System (Java OOP)

![Java](https://img.shields.io/badge/Language-Java-orange)
![Status](https://img.shields.io/badge/Status-Completed-success)
![Level](https://img.shields.io/badge/Level-OOP%20Foundation-blue)
![Type](https://img.shields.io/badge/Type-Console%20Application-lightgrey)
![Concept](https://img.shields.io/badge/Concept-OOP%20%7C%20ArrayList%20%7C%20Encapsulation-yellow)

---

# 📌 Overview

This project is part of my **Level 1 OOP Foundation Problems in Java**.  
It is a console-based **Student Grade System** designed to apply core Object-Oriented Programming concepts in a real working program.

The system allows users to:

- Add student records
- View all students
- Search students by name
- Compute average grades automatically
- Display remarks (Pass/Fail)
- Handle invalid inputs safely

This project focuses on:

- Classes and Objects  
- Encapsulation  
- Constructors  
- Methods  
- ArrayList  
- Input Validation  

---

# 🎯 My Goal

- 🧠 Strengthen my understanding of OOP fundamentals  
- 🛠️ Build a structured Java console application  
- 📚 Improve validation and error handling skills  
- 🚀 Prepare for advanced topics like DSA and system design  

---

# ✨ Features

- 👨‍🎓 Add student records dynamically
- 📋 View all stored students
- 🔍 Search student by name (case-insensitive)
- 🧮 Automatic average computation
- ✅ Pass/Fail remark system
- 🔒 Encapsulation using private variables
- 🚫 Strong input validation:
  - Empty name prevention
  - Non-numeric input handling
  - Score range validation (0–100)
  - Menu input validation

---

# 🧠 OOP Concepts Used

## 🔹 Encapsulation

```java
private String name;
private double quiz;
private double exam;

```

#🔹 Constructor
public Student(String name, double quiz, double exam)

Used to initialize student objects properly.

#🔹 Methods
computeAverage() → calculates student average
displayInfo() → prints student details
getName(), getQuiz(), getExam() → controlled access
# 🔹 ArrayList
ArrayList<Student> students = new ArrayList<Student>();

Used to store multiple student objects dynamically.

#🔹 Objects
Student student = new Student(name, quiz, exam);

Each student is treated as an object.

---

## ⚙️ How It Works
User selects an option from the menu
Input is validated
Student data is entered
Object is created and stored in ArrayList
Average is computed:
(quiz + exam) / 2
Remark is assigned:
75 and above → Pass
below 75 → Fail
User can view or search students
Program loops until exit

---

## 🖥️ Sample Run (Normal Flow)
```java
1. Add Student
2. View Student
3. Search Student
4. Exit
Your choice: 1

Enter the name of the student: Chris
Enter their quiz score: 95
Enter their exam score: 91

1. Add Student
2. View Student
3. Search Student
4. Exit
Your choice: 2

Agent Chris: Here's the student list.

Name: Chris
Quiz: 95.0
Exam: 91.0
Average: 93.0
Remark: Pass

```

---

## ⚠️ Error Handling / Input Validation

# 🚫 Invalid Menu Input
```java
Your choice: a

Agent Chris: Please enter a number.
```

# 🚫 Empty Name Input
```java
Enter the name of the student:

Agent Chris: Please enter a name.

Enter the name of the student: Chris
```

# 🚫 Invalid Quiz Input
```java
Enter their quiz score: abc

Agent Chris: Please enter a valid number

Enter their quiz score: 150

Agent Chris: Quiz score ranges from 0-100

Enter their quiz score: 92
```

# 🚫 Invalid Exam Input
```java
Enter their exam score: -10

Agent Chris: Exam score ranges from 0-100
Enter their exam score: 88
```

# 🔍 Student Not Found
```java
Enter student name to search: Alex

Agent Chris: Student not found.
```

--- 

## 🧾 Code Structure
Main.java

Handles:

Menu system
Input validation
Searching
Program flow
Student.java

Handles:

Student data
Average computation
Remarks
Encapsulation
Display logic

---

## 🚀 How to Run
javac Main.java
javac Student.java
java Main

---

## 👨‍💻 Author

Christian A. Gulfan
Aspiring Software Developer 🚀

---

## 💡 Insight

This project demonstrates how OOP turns a simple grading task into a structured system. Encapsulation, validation, and modular design make the program more reliable and scalable.

---

## 💬 Quote

“Strong fundamentals build strong programmers.” 💡
