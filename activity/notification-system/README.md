# 🧩 Activity: Flexible Notification System (Dependency Injection)

## 🎯 Objective

Apply everything learned in this lab:

- Understand the **real purpose of Dependency Injection**
- Identify **tight coupling and hidden dependencies**
- Separate **object creation from business logic**
- Design a system that is **flexible and easy to extend**

---

## 📌 Scenario

You are building a backend system that includes multiple services:

- OrderService  
- AccountService  
- MarketingService  

All of these services need to:

- Send notifications to users  
- Inform users about important events  
- Deliver messages through different channels  

---

## ❌ Current Problem

Each service directly creates its own notification method.

This leads to:

- Strong dependency on a specific notification type  
- Repeated object creation across services  
- Difficulty in changing notification behavior  
- Inflexible system when adding new notification types

---

## 💡 Hints

- Ask yourself:
  - Who should create the notification object?  
  - Should services know which type is used?  

- Focus on:
  - Removing `new` from inside services  
  - Making dependencies visible  
  - Keeping services independent  

---

## ✅ Expected Outcome

- Services depend on a **general abstraction**  
- No direct dependency on specific implementations  
- Notification type can be changed without modifying services  
- Clean separation between creation and usage  
- Flexible and maintainable design  

---

## ⭐ Bonus (Optional)

- Add a new notification type (e.g., Push Notification)  
- Ensure no changes are made to existing services  
- Demonstrate how easily the system can be extended  

---

## 🧩 Challenge Extension (Optional)

- Create a fake notification implementation for testing  
- Simulate sending notifications without real delivery  
- Analyze how DI improves testability  

---

## 📌 Final Insight

The goal is not just to make the system work.

The goal is to design it so that:

> Changes in behavior do not require changes in existing classes

This is the essence of Dependency Injection.
