# 🧩 Design Patterns Lab — Dependency Injection (DI)

![Java](https://img.shields.io/badge/Language-Java-blue)
![Pattern](https://img.shields.io/badge/Pattern-Dependency%20Injection-green)
![Level](https://img.shields.io/badge/Level-Beginner--Intermediate-orange)
![Focus](https://img.shields.io/badge/Focus-Coupling%20%26%20Flexibility-purple)

---

## 🎥 Lecture Video

This repository accompanies a deep lecture on **Dependency Injection (DI)** as a core design principle used to solve real-world software design problems related to coupling, object creation, and system flexibility.

▶️ Watch on YouTube:  

[Lecture Video](https://youtu.be/TJU2rCkHaMM)

---

## 📌 About This Repository

This repository explains **Dependency Injection as a design principle**, not as a framework feature.

The focus is on understanding:

- Why object creation inside classes is a design problem
- How hidden dependencies affect system structure
- Why tightly coupled systems are hard to maintain
- How DI improves flexibility, testing, and scalability
- How responsibility shifts in a well-designed system

This is not about syntax. It is about **design thinking and responsibility separation**.

---

## 🧠 What is Dependency Injection (Real Meaning)

Most beginners think Dependency Injection means:

> “Passing objects into constructors”

This is not the real idea.

### ✅ The Real Meaning

Dependency Injection is a principle that states:

> A class should not create its dependencies. It should receive them from outside.

The key idea is:

> **Separation between “what a class does” and “what it needs to do it”**

---

## ⚠️ The Real Problem (Hidden Object Creation)

In many beginner designs, each class creates its own dependencies internally.

At first, this seems simple and natural. However, it introduces a structural issue:

### ❌ Hidden Responsibility

A class ends up doing two jobs:

- Business logic (what it is supposed to do)
- Object creation (how dependencies are created)

This creates a design where dependencies are **hidden inside the class itself**.

---

## ⚠️ Why This Becomes a Serious Problem

### 1) Tight Coupling
Classes become directly tied to specific implementations.

### 2) Hidden Dependencies
From the outside, it is unclear what a class depends on.

### 3) Hard to Modify
Changing a dependency requires modifying multiple classes.

### 4) Hard to Test
Replacing real dependencies with fake ones becomes difficult.

---

## 💡 Key Insight

> The real issue is not object creation itself  
> The real issue is **where object creation happens**

---

## ❌ Initial Design Problem (Conceptual View)

In a typical system, multiple services (such as checkout, refund, subscription) need the same type of dependency (for example, payment processing).

In the initial design:

- Each service creates its own dependency
- Each service is locked to a specific implementation
- Business logic and object creation are mixed together

This leads to duplication and rigid architecture.

---

## ⚠️ Why This Design Fails

### 1) Strong Coupling
Services are bound to concrete implementations.

### 2) Poor Maintainability
A single change affects multiple classes.

### 3) Hidden Structure
Dependencies are not visible from class interfaces.

### 4) No Flexibility
Replacing implementations requires code modification everywhere.

---

## 💡 Core Principle of Dependency Injection

Dependency Injection introduces a fundamental rule:

> A class should receive its dependencies instead of creating them.

This changes the mindset completely:

- Before DI → “I create what I need”
- After DI → “I receive what I need”

---

## 🔍 Step 1 — Introduce an Abstraction

A shared contract is defined to represent behavior, not implementation.

This abstraction allows the system to depend on a **general concept instead of a concrete class**.

---

## 🔍 Step 2 — Provide Multiple Implementations

Different implementations are created for the same abstraction.

Each implementation represents a different way of fulfilling the same behavior.

This allows the system to:

- Support multiple behaviors
- Avoid modifying existing services
- Extend functionality easily

---

## 🔍 Step 3 — Inject Dependencies

Instead of creating dependencies internally:

- Dependencies are provided externally
- Services receive them through constructors
- Classes only store and use them

This makes dependencies explicit and visible.

---

## 🔍 Step 4 — Move Creation Outside the Class

Object creation is handled outside business classes.

Typically, this responsibility belongs to:

- Application layer
- Configuration layer
- Composition root

This ensures a clear separation between:

- Creation logic
- Business logic

---

## 🔄 How the System Works After DI

After applying DI:

- Services no longer create dependencies
- Services depend on abstractions
- External code decides which implementation to use
- Dependencies are passed into services at runtime

This creates a system where components are **loosely connected instead of tightly bound**.

---

## ➕ Adding New Functionality

To introduce a new implementation:

- Create a new class that follows the same abstraction
- No changes are required in existing services
- Only the configuration layer changes

This makes the system **open for extension without modification**.

---

## ➖ Removing Functionality

To remove an implementation:

- Delete the implementation class
- Update only the configuration logic
- No changes required in business services

This prevents cascading changes across the system.

---

## 🧪 Testing Advantages

Dependency Injection makes testing significantly easier:

- Real dependencies can be replaced with fake ones
- Services can be tested in isolation
- External systems are not required during testing

This enables controlled and predictable test environments.

---

## ⚖️ What Dependency Injection Solves

Dependency Injection directly addresses:

### 1) Tight Coupling
Classes depend on abstractions, not concrete implementations.

### 2) Hidden Dependencies
Dependencies become explicit through constructors.

### 3) Poor Flexibility
Implementations can be swapped without modifying services.

### 4) Testing Difficulty
Fake implementations can replace real ones easily.

---

## 🚫 What Dependency Injection Does NOT Do

Dependency Injection does not:

- Decide which implementation to use
- Automatically create objects
- Manage object lifecycle by itself

It only enforces a rule:

> Object creation must happen outside the class

---

## 🔗 Design Insight (Important Concept Shift)

Dependency Injection introduces a fundamental shift in thinking:

### Before DI
A class is responsible for both:
- Its behavior
- Its dependencies

### After DI
A class is responsible only for:
- Its behavior

Everything else is externalized.

---

## 🧠 Design Evolution Perspective

Software design often evolves in this order:

1. Classes create their own dependencies
2. Tight coupling becomes a problem
3. Abstraction is introduced
4. Dependency Injection is applied
5. System becomes flexible and testable

---

## ⚖️ When to Use Dependency Injection

Use DI when:

- A class depends on external services or components
- Multiple implementations are possible
- Testing is required
- Flexibility and maintainability are important

---

## 🚫 When NOT to Overuse DI

Avoid unnecessary DI when:

- Objects are simple and independent
- No variation in implementation exists
- Introducing DI adds unnecessary complexity

---

## 🧠 Best Practices

- Depend on abstractions, not concrete classes  
- Keep object creation outside business logic  
- Prefer constructor-based injection  
- Avoid hidden dependencies  
- Keep responsibilities clearly separated  
- Combine with other design principles carefully  

---

## 🎯 Learning Outcomes

After studying this repository, you should be able to:

- Identify tight coupling problems in code
- Recognize hidden dependencies
- Refactor systems using Dependency Injection
- Design systems using abstractions
- Improve testability and flexibility
- Separate object creation from business logic

## 📌 Final Insight

Dependency Injection is not about frameworks or syntax.

It is about a fundamental design principle:

> Classes should focus on what they do, not on how their dependencies are created.

This separation is what makes systems scalable, testable, and maintainable.
