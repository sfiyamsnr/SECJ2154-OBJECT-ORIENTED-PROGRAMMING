# SECJ2154-OBJECT-ORIENTED-PROGRAMMING

# 🚀 Object Oriented Programming (SECJ2154) - Learning Portfolio & Project Reflection

Welcome to my portfolio for the **Object Oriented Programming (SECJ2154)** course.

---

## 📑 Overall Course Reflection

Object Oriented Programming has been a turning point in how I think about building software. Coming from a more procedural mindset in earlier programming courses, this course pushed me to reorganize logic around **objects, responsibilities, and relationships** instead of just sequences of instructions. Working through Java's class structures, encapsulation rules, and the four pillars of OOP changed not just how I write code, but how I *plan* before writing a single line.

Key personal and technical takeaways include:
* **The OOP Paradigm Shift:** Learning to model real-world entities as classes with private fields and public accessors/mutators taught me the value of controlling how data is accessed and modified. Encapsulation stopped being an abstract rule and became a practical habit.
* **Class Relationships as a Design Language:** Understanding the differences between **association, aggregation, composition, and inheritance** gave me a vocabulary to describe how objects interact — and helped me catch design flaws (like a `Course` object that couldn't exist without a `Teacher`) before they became bugs.
* **Polymorphism and Extensibility:** Seeing how a single method call like `displayInfo()` or `displayRole()` could behave differently depending on the actual object type showed me how OOP systems can grow new features (new subclasses) without rewriting existing code.
* **Incremental, Lab-by-Lab Learning:** Each lab built directly on the last — arrays before collections, classes before inheritance, inheritance before polymorphism — which made the final mini project feel like an assembly of skills I had already practiced, rather than something built from scratch.
* **Team Collaboration on a Real System:** Building the mini project with teammates required us to agree on a UML structure first, divide responsibilities by class, and integrate our code through clearly defined public interfaces — a small taste of how real software teams operate.

---

## 🛠️ Exercise-by-Exercise Reflection

### 🔹 [Lab Exercise 2: Classes, Objects, Constructors & Encapsulation]
* **Concepts Focused:** Class and object creation, instance variables, constructors, getter/setter methods, method overloading, and static vs. non-static members.
* **Implementation Details:** Built several small independent classes (`Employee`, `Car`, `Book`, `Student`, `Message`, `User`) to practice core OOP fundamentals — from basic field encapsulation to a static counter that tracked the number of `User` objects created.
* **Reflection:** This exercise grounded me in the basics that everything else in the course relies on. Practicing encapsulation across multiple small classes (rather than one big one) helped me see the *pattern* of private fields + public accessors as a repeatable habit. The static counter exercise was a small but clear demonstration of how class-level state differs from instance-level state.

### 🔹 [Lab Exercise 3: Arrays, ArrayLists & Object Arrays]
* **Concepts Focused:** 1D and 2D arrays, varargs methods, `ArrayList<E>`, arrays of objects, and passing/returning arrays from methods.
* **Implementation Details:** Processed student scores using 1D arrays, calculated total marks across a 2D `marks` array, stored `Student` objects in an array, and used an `ArrayList<String>` to manage a dynamic list of subjects.
* **Reflection:** This lab made the difference between fixed-size arrays and dynamic `ArrayList` collections click for me. Writing helper methods like `findHighestScore()` and `sumSubjectMarks()` reinforced how arrays of primitives and arrays of objects need to be traversed differently, and gave me practice writing reusable static utility methods.

### 🔹 [Lab Exercise 4: Association Between Classes]
* **Concepts Focused:** Modeling real-world relationships between objects (association), composition of object lists, and multi-class collaboration.
* **Implementation Details:** Designed a `Member`–`Item`–`SpaceLot`–`Store` system where each `SpaceLot` is assigned to a `Member` and holds multiple `Item` objects, and each `Store` manages a list of `SpaceLot` objects.
* **Reflection:** This was the first exercise where I had to think about *how classes talk to each other* rather than just what each class contains. Deciding that a `SpaceLot` should hold a reference to a `Member` (rather than the other way around) taught me to think carefully about ownership and direction when modeling associations — a skill that became essential later in the mini project.

### 🔹 [Lab Exercise 5: Inheritance, Polymorphism & Class Relationships]
* **Concepts Focused:** Inheritance (`extends`), constructor chaining with `super()`, method overriding, polymorphism, and the distinction between aggregation and composition.
* **Implementation Details:** Modeled a school system where `Student` and `Teacher` both extend `Person` and override `displayRole()`. Also implemented `Course` (aggregating a `Teacher`) and `Classroom` (composing a `Course`), then debugged intentional errors involving missing constructor parameters and broken method calls.
* **Reflection:** Fixing the deliberately broken code in this lab was more valuable than writing correct code from scratch — tracing why `Classroom`'s constructor call didn't match `Course`'s constructor signature forced me to actually understand object construction order rather than just memorize syntax. This lab is where aggregation vs. composition stopped being a textbook definition and became something I could recognize in real code.

---

## 🎮 Final Group Project Reflection: "Pharmacy Inventory System"

### 📄 [Design & Problem Analysis Deliverable]
* **Concepts Covered:** Inheritance hierarchies, polymorphism, association, aggregation, `ArrayList` usage, and exception handling — unified through a UML class diagram.
* **Core Design:** Mapped out a pharmacy stock management system, separating staff roles (`User` → `Admin`, `Pharmacist`), inventory items (`Medicine`), the central business logic (`InventoryManager`), and the application entry point (`PharmacyApp`).
* **Reflection:** Drawing the UML diagram before coding made the inheritance and aggregation relationships explicit and easy to defend as a team. Recognizing that `Admin` and `Pharmacist` should inherit from a common `User` superclass — rather than duplicating `name`/`role` fields in each — was a direct application of what Lab Exercise 5 taught us. It also made it obvious where polymorphism would matter: `PharmacyApp` never needs to know whether it's dealing with an `Admin` or `Pharmacist` to call `displayInfo()`.

### 📺 [Project Execution & System Demo]
* **Implementation Victory:** Translated the UML design into a working console-based Java application with a persistent menu loop, `ArrayList<Medicine>` storage, and full CRUD-style operations (add, view, update, remove, low-stock check).
* **Mechanics Validation:** Successfully implemented method overriding for `displayInfo()` across `Admin` and `Pharmacist`, used aggregation so `InventoryManager` manages independently-existing `Medicine` objects, and wrapped the entire input loop in try-catch blocks to gracefully handle invalid numeric input via `NumberFormatException`.
* **Reflection:** Watching the system correctly reject invalid input (like typing letters where a quantity was expected) without crashing was a satisfying proof that the exception handling chapter wasn't just theoretical. Building this project end-to-end — from UML diagram to a running, menu-driven application — tied together every concept from the semester: encapsulation in `Medicine`, dynamic storage in `InventoryManager`, inheritance and polymorphism in the user roles, and defensive programming in the main loop. It was the clearest evidence yet that good object-oriented design up front genuinely makes implementation smoother.
