# UseCase12PalindromeCheckerApp

## 🧠 Objective

The objective of this project is to demonstrate the **Strategy Pattern** in Java by dynamically selecting different palindrome validation algorithms at runtime.

This use case focuses on advanced Object-Oriented Design concepts.

---

## 📌 Problem Statement

Design a console-based Java application where:

- A common `PalindromeStrategy` interface defines a contract.
- Multiple algorithms implement this interface.
- The algorithm is selected dynamically at runtime.

---

## 🔄 Flow of the Program

1. Define `PalindromeStrategy` interface  
2. Implement:
   - `StackStrategy`
   - `DequeStrategy`
3. Inject selected strategy at runtime  
4. Execute the chosen algorithm  

---

## 🏗 Architecture Overview

```
            PalindromeStrategy (Interface)
                    ▲
        ┌───────────┴───────────┐
     StackStrategy         DequeStrategy
```

The main class selects which strategy to use without modifying validation logic.

---

## 🧩 Key Concepts Covered

- Interface
- Polymorphism
- Strategy Pattern
- Runtime behavior selection
- Separation of concerns

---

## 🗂 Data Structures Used

- `Stack` (LIFO)
- `Deque` (Double Ended Queue)

Each strategy uses a different data structure internally.

---

## ⚙️ Running Procedure

### Compile:
```
javac UseCase12PalindromeCheckerApp.java
```

### Run:
```
java UseCase12PalindromeCheckerApp
```

---

## 💡 Example

Input:
```
Level
```

Output:
```
Is Palindrome : true
```

---

## 🚀 Why This Use Case is Important

This implementation demonstrates:

- Clean architecture design
- Algorithm interchangeability
- Extensible system structure
- Professional design pattern usage

New palindrome algorithms can be added without modifying existing code.

---

## 📂 Project Structure

```
UseCase12PalindromeCheckerApp/
│── UseCase12PalindromeCheckerApp.java
│── README.md
```

---

## 👨‍💻 Author

DITO DILEEP
