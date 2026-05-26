# 🧪 Activity: Flexible Notification System - Solution

## 🎯 Objective

This solution demonstrates how to design a **flexible notification system** using **Dependency Injection (Constructor Injection) in Java**.

The main goal is to ensure that:

* Services do not depend on concrete implementations
* Notification behavior can be changed without modifying business logic
* Dependencies are **injected from outside the service**
* The system is **extensible, testable, and loosely coupled**

This avoids tight coupling, repeated object creation, and rigid system design.

---

## 🧠 Solution Explanation

### Step 1: Identified Main Components

* `Notification` (Abstraction)
* `EmailNotification` (Implementation)
* `SMSNotification` (Implementation)
* `PushNotification` (Extension)
* `FakeNotification` (Testing)
* `OrderService`
* `AccountService`
* `MarketingService`
* `Main`

---

### Step 2: Identified the Core Problem

Originally, each service would directly create notification objects using `new`, which leads to:

* Tight coupling between services and implementations
* Hard-coded notification types inside business logic
* Difficult maintenance when adding new notification types
* Poor testability
* Code duplication across services

### 💡 Key Insight

Notification is a **shared behavior**, not a responsibility of business services.
Therefore, services should not decide *how* notifications are sent.

---

### Step 3: Introduced Abstraction

The `Notification` interface defines a common contract:

* `send(String message)`

This allows all notification types to follow the same behavior while hiding implementation details.

Implementations:

* `EmailNotification` → Email-based delivery
* `SMSNotification` → SMS-based delivery
* `PushNotification` → Mobile push notifications
* `FakeNotification` → Testing simulation

---

### Step 4: Applied Dependency Injection

Each service receives its dependency through **constructor injection**:

* `OrderService(Notification notification)`
* `AccountService(Notification notification)`
* `MarketingService(Notification notification)`

#### Key Principle

> Services do NOT create dependencies
> 
> Services only USE dependencies

---

### Step 5: Service Responsibilities

Each service focuses only on business logic:

* `OrderService` → order-related notifications
* `AccountService` → account creation notifications
* `MarketingService` → campaign and promotion notifications

All notification logic is delegated to the injected dependency.

---

### Step 6: Role of the Main Class

The `Main` class acts as the **composition root**, responsible for:

* Creating concrete implementations
* Choosing which notification type to use
* Injecting dependencies into services

#### Example decisions made here:

* Email for normal production
* SMS for alternative communication channel
* Fake notification for testing

---

## 🧩 UML Diagram Representation

```text
+---------------------------+
|     Notification          |
+---------------------------+
| + send(message: String)   |
+---------------------------+
            ▲
   ------------------------
   |           |          |
+---------+ +--------+ +-------------+
| Email   | |  SMS   | | PushNotif   |
+---------+ +--------+ +-------------+
| send()  | | send() | | send()      |
+---------+ +--------+ +-------------+
            ▲
            |
     injected into
            |
+------------------+   +------------------+   +---------------------+
|   OrderService   |   | AccountService   |   | MarketingService    |
+------------------+   +------------------+   +---------------------+
| +placeOrder()    |   | +createAccount() |   | +sendPromotion()    |
+------------------+   +------------------+   +---------------------+
            \              |               /
             \             |              /
              \------------|-------------/
                           |
                    Main (Composition Root)
```

---

## ⚙️ Step 7: Java Implementation Highlights

* Services depend only on `Notification` abstraction
* No `new EmailNotification()` inside services
* Dependency selection is centralized in `Main`
* Supports multiple implementations without code changes
* Fake implementation enables isolated testing
* Fully adheres to **Dependency Inversion Principle (DIP)**

---

## 🧾 Example Execution Flow

```java
Notification email = new EmailNotification();

OrderService orderService = new OrderService(email);
AccountService accountService = new AccountService(email);
MarketingService marketingService = new MarketingService(email);

orderService.placeOrder("ORD-1001");
accountService.createAccount("maryam");
marketingService.sendPromotion("Winter Sale");
```

---

## 📌 Example Console Output

```text
Email sent: Order placed successfully: ORD-1001
Email sent: Account created for user: maryam
Email sent: New promotion campaign: Winter Sale

--- Switching to SMS ---

SMS sent: Order placed successfully: ORD-2002

--- Testing with Fake Notification ---

FAKE notification: Test Campaign
```

---

## 🧪 Testing Capability

A key advantage of this design is **testability**:

Instead of real external communication systems, we can inject:

```java
Notification fake = new FakeNotification();
```

This allows:

* Safe unit testing
* No external dependencies
* Predictable outputs

---

## 🚀 Advantages of This Design

* Eliminates tight coupling between services and implementations
* Makes system easily extendable (Open/Closed Principle)
* Improves testability using fake implementations
* Centralizes dependency creation in one place
* Enables runtime flexibility (switching behaviors easily)
* Reduces code duplication across services

---

## 📌 Key Insight

This activity demonstrates the core idea of **Dependency Injection**:

> High-level modules should not depend on low-level modules.
> 
> Both should depend on abstractions.

By injecting dependencies instead of creating them internally, the system becomes:

* Flexible
* Maintainable
* Scalable
* Testable

This is a foundational pattern in modern backend systems and is widely used in frameworks like Spring.
