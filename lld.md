# Coding Legos

# Low Level Design

- Implementation level blue print.
- Skeleton for code.
- Component, their relation and interaction between them and structure.
- Created by Developer before start of project.

## Prompt for Designing LLD

## Object oriented programming

- Object
- Class
  - Attribute (Variable)
  - Behavior (Method)
- Relation
  - is-a
  - has-a
    - Aggregation (can exist independently)
    - Composition (can not exist independently)
  - Association
  - Generalization
- Inheritance
  - Class (extends)
    - Simple
    - Abstract
    - Final
  - Interface (implements): a contract definition
- Encapsulation : Bundle data and code together
- Abstraction : hides complexity and implementation
- Polymorphism : multiple forms
  - Compile Time
  - Run time
  - Method overloading
  - Method overriding
- access modifier
  - private (class)
  - default (package)
  - protected (subclass)
  - public (everyone)

```
  Composition over Inheritance
```

## Design Principle

- SOLID
  - Single Responsibility Principle : modular class
  - Open/Close Principle - Open for extension, close for modification : safe refactor/ testing
  - Liskov's substitution Principle: substitution
  - Interface segregation : cleaner contract
  - Dependency inversion : loosely coupled design
- DRY
  - When to use it
  - When not to use it
- KISS
- YAGNI

## Design Pattern

- Creational
  - Factory Method
  - Simple Factory
  - Abstract Factory
  - Builder
  - Prototype
  - Singleton
  - Object pool
- Structural
  - Decorator : enhance
  - Adaptor
  - Facade
  - Proxy : control
  - Composite
  - Flyweight
- Behavioral
  - Strategy
  - Observer (EventPropagator: EventListener)
  - Delegation
  - Chain of responsibility
  - Iterator
  - Null-Empty Object
  - State

## Concurrency

- thread safe
- avoid race condition
- atomicity
- locking
  - synchronized
  - Reentrant lock
  - ReadWrite lock
- volatile
- Concurrent DS
  - Blocking queue
  - Concurrent HashMap
  - Atomic integer

## How to Navigate LLD interview

0. Understanding and Requirement gathering including Core concepts
1. Identify use case and sequence diagram
2. Identify Core entities/ Interface / Service / manager classes.
3. Identify Design Pattern
4. Identify variable and methods
5. Define relationship, lifetime, multiplicity
6. Interaction between them
7. Draw class diagram
8. Apply Design principle and pattern
9. Clean code (TERMS)

- Testable
- Extensibility
- Readable
- Maintainable
- Scalability

10. Walk through
11. Solve Core concepts (.......)
12. Discuss Trade offs (.......)
13. Exception and tests

```
Unrelated
- Cohesion and coupling
- DI and IOC
- Access Modifier
- Code smell
- Roting
- Bug
- visit refactoring guru
// https://refactoring.guru/java-dcl-issue
LRU
TTL
Write through
write back
eviction policy
multilevel caching
```

```
Parking lot
Tic tac toe
Car rental
Elevator
Logging system
Snake and Ladder
Ticketing System
Vending Machine
ATM
Chess
File System
Splitwise
Cricbuzz
Inventory Management
Word Processor
Design Undo Redo
Online Auction
Payment Gateway
```
