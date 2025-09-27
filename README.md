## Design patterns

> Design Patterns are divided into tree parts:
>
> - Creational
> - Structural
> - Behavioral

## Creational Design Patterns

### Singleton Pattern

The Singleton Pattern ensures a class has only one instance, and provides a
global point of access to it.

This pattern could be broken by usage of

- Serialization
- Reflection
- Multiple class loader

### Simple Factory

### Factory Method

### Abstract Factory

## Structural Design Patterns

### Decorator Patter

The Decorator Pattern attaches additional responsibilities to an object
dynamically. Decorators provide a flexible alternative to subclassing for
extending functionality.

## Behavioral Design Patterns

### Strategy Pattern

The Strategy Pattern defines a family of algorithms, encapsulates each one, and
makes them interchangeable. Strategy lets the algorithm vary independently of
clients that use it.

### Observer Pattern

The Observer Pattern defines a one-to-many dependency between objects so that
when one object changes state, all of its dependents are notified and updated
automatically.

When two objects are loosely coupled, they can interact, but have very little
knowledge of each other. The Observer Pattern provides an object design where
subjects and observers are loosely coupled.

Note: Observer Pattern is different from Publisher Subscriber Pattern
