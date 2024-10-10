# Singleton

> [!NOTE]
> Find source code [here](https://github.com/amritpandey23/design_patterns_java/tree/master/com.amrit.designpatterns.creational/src/com/amrit/designpatterns/creational/singleton/example/db)

## Introduction

Singleton pattern is used to restrict user in spawning multiple instances of an object.
Usually if a job has to be done via single object instance and creating multiple instances of an object causes anomalous behavior, Singleton pattern is used.

## Concepts

- Only one instance is instantiated.
- Gurantees control of resource.
- Lazily loaded.
- Example:
  - Runtime
  - Logger
  - Garbage Collector

## Design

- Class is responsible for lifecycle
- Static in nature
- Needs to be thread safe
- Private instance
- Private constructor
- No parameters!

## Example

We will be demonstrating three ways of creating a singleton class.

### Type-1

Cons: Non-thread safe

```java
public class Singleton{
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### Type-2

Pros: Thread-safe
Cons: Synchronization overhead

```java
public class Singleton{
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result == null) {
            synchronized(Singleton.class) {
                if (result == null) {
                    result = new Singleton();
                    instance = result;
                }
            }
        }
        return result;
    }
}
```

### Type-3

```java
public class Singleton{
    private Singleton() {

    }

    private static class LazyLoader {
        public static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyLoader.INSTANCE;
    }
}
```

Pros: Thread-safe, Lazy loaded

```java
public class Play {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj);
        System.out.println(obj2); // same object
    }
}
```

## Pitfalls

- Difficult to unit test
- Requires thread-safety
- Cannot use parameters to modify behaviour
