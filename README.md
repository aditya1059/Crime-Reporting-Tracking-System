# 🕵️ Crime Reporting and Tracking System

A **Java + MySQL** based desktop application that enables citizens to report crimes and track their status, while police and administrators manage case data efficiently. The system includes **user registration, role-based access**, and structured data operations using the **DAO pattern**.

> ✅ Built with clean architecture, secure authentication, and scalable design.

---

## 📚 Table of Contents

- [📌 About the Project](#-about-the-project)
- [✨ Features](#-features)
- [🧰 Tech Stack](#-tech-stack)
- [📊 Database Schema](#-database-schema)

---

## 📌 About the Project

The **Crime Reporting and Tracking System** is a desktop-based Java application to digitalize the crime complaint process. Citizens can **report crimes**, **track complaint status**, while **police and admin users** can **update, manage, and analyze data** to speed up investigations and ensure transparency.

This system streamlines the entire crime-handling process using a secure, multi-role interface.

---

## ✨ Features

| Citizen (Public) | Police | Admin |
|------------------|--------|-------|
| Register/Login   | Login  | Login |
| Report crime     | View complaints | View all users |
| Track status     | Update complaint status | Manage all complaints |
| View own complaints | Manage criminal records | View reports/statistics |

- 🔐 **Secure login** with role-based access (PUBLIC / POLICE / ADMIN)
- 📝 **Crime Reporting Form** with type, date, location, and description
- 📦 **Complaint Tracking** using unique complaint ID
- 🧾 **Criminal Records Management**
- 🔄 **Complaint Status Update** by police (Reported → In Progress → Resolved)
- 📈 **Admin dashboard** 

---

## 🧰 Tech Stack

| Layer       | Technology              |
|-------------|--------------------------|
| GUI         | Java Swing               |
| Backend     | Java + JDBC              |
| Database    | MySQL                    |
| Architecture| DAO Pattern              |
| Tools       | IntelliJ, MySQL Workbench, Git |

---

## 📊 Database Schema

### `users`
```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    role ENUM('PUBLIC', 'POLICE', 'ADMIN') NOT NULL
);

CREATE TABLE complaints (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    type VARCHAR(50),
    description TEXT,
    location VARCHAR(100),
    status ENUM('REPORTED', 'IN_PROGRESS', 'RESOLVED') DEFAULT 'REPORTED',
    date_reported DATE,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
```

