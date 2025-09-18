# 🚀 Spring Boot CRUD API (User Management)

A simple **Spring Boot CRUD API** project for managing users.  
This project demonstrates how to implement **Create, Read, Update, and Delete (CRUD)** operations using **Spring Boot, Spring Data JPA, and MySQL**.  

---

## 📌 Features
- ➕ Add a new user  
- 📋 Get all users  
- 🔍 Get user by ID  
- ✏️ Update user by ID  
- ❌ Delete user by ID  

---

## 🛠️ Tech Stack
- ☕ **Java**  
- 🌱 **Spring Boot**  
- 🗄️ **Spring Data JPA (Hibernate)**  
- 🛢️ **MySQL Database**  
- 📬 **Postman** for API testing  

---

## 📂 Project Structure
```plaintext
src/main/java/com/bikash
│── controller # REST Controllers
│── model # Entity classes
│── repository # JPA Repositories
│── service # Service Layer
│── serviceImpl # Service Implementation


---

## ⚡ API Endpoints

| Method | Endpoint      | Description          |
|--------|--------------|----------------------|
| POST   | `/user`      | ➕ Add a new user     |
| GET    | `/user`      | 📋 Get all users      |
| GET    | `/user/{id}` | 🔍 Get user by ID     |
| PUT    | `/user/{id}` | ✏️ Update user by ID  |
| DELETE | `/user/{id}` | ❌ Delete user by ID  |

---

