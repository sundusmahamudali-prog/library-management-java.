# 📖 Library Management System (Java)

A console-based library application that manages book inventory using **Java Collections** and persistent **File Storage**.

## 🛠️ Key Features
* **Inventory Management**: Add, issue, and return books dynamically using `ArrayList`.
* **Persistent Storage**: Automatically saves the book list to `books.txt` upon exit and reloads it when the program starts.
* **Input Validation**: Designed with simple switch-case logic to handle user menu choices efficiently.

## 🏗️ Technical Details
* **ArrayLists**: Used to manage the live inventory of books in memory.
* **File I/O**: Implements `FileWriter` and `Scanner` to ensure data isn't lost when the program closes.
* **Error Handling**: Includes `try-catch` blocks to manage potential file errors gracefully.

## 🚀 How to Run
1. Ensure you have the Java Runtime Environment (JRE) installed.
2. Compile the file:
   ```bash
   javac LBS_SA.java
