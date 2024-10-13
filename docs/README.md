# Design Patterns

![](img/site_banner.png)

## History on Design Patterns

Design patterns in software development have their origins in the architectural work of Christopher Alexander in the 1970s. Alexander introduced the concept of a "pattern language," a way to describe recurring problems and solutions in building design. This idea was later adapted to software engineering, particularly during the rise of object-oriented programming in the 1980s and 1990s. The most influential moment in the adoption of design patterns was the publication of the book [_Design Patterns: Elements of Reusable Object-Oriented Software_](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) in 1994 by the "Gang of Four"—Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides. This seminal work identified 23 fundamental design patterns that could be used to solve common software design problems, providing a structured and reusable approach to development.

## Why do we use design patterns in software engineering?

Design patterns are solutions to common design problems that software engineers frequently encounter in day-to-day programming. To make code more efficient, maintainable, and scalable, developers can utilize well-established design patterns. As the name suggests, "patterns" offer reusable approaches to solving problems that have already been addressed, thus avoiding the need to "reinvent the wheel." Think of design patterns as design templates that you can apply to your specific challenges.

For example, suppose you're creating a logger for your application that logs every user activity. You might begin by designing an interface and then creating a concrete class with all the logging logic. However, a common challenge you'll encounter is that only one instance of the logger should exist—meaning the application should have a single logger handling all logging activities. If multiple logger instances were running simultaneously, it could result in duplicate or inconsistent log entries.

To address this, you need to design your logger so that only one instance exists at runtime. This problem has already been solved by a design pattern known as the `Singleton`, a creational pattern that ensures a class has only one instance and provides a global point of access to that instance. You can read more about [Singleton](./creational/singleton.md) in the tutorial.

Design patterns are solutions to common engineering and design problems in programming. However, it's important to note that design patterns are not a one-size-fits-all solution for every scenario. While they provide a strong foundation for solving typical challenges, they do not cover every possible problem. In certain situations, design patterns may not work perfectly "out of the box" and might require adjustments or customization to fit the specific needs of a project. Developers often need to adapt these patterns to ensure they function as required in unique contexts, tailoring them to address the particular complexities or nuances of the system they are building.

## Where do we see desing patterns in real softwares?

Design patterns are not tied to a single programming language; rather, they are conceptual solutions that can be applied across multiple programming paradigms. However, many design patterns are especially suited to object-oriented programming languages such as Java, C++, and Python, where concepts like inheritance, polymorphism, and encapsulation are key. Here are some real-world source-code based evidences where design patterns are used.

- [Notification Popup API in Eclipse IDE using Builder Design Pattern](https://github.com/eclipse-platform/eclipse.platform.ui/blob/master/bundles/org.eclipse.jface.notifications/src/org/eclipse/jface/notifications/NotificationPopup.java): Builder is a design pattern which is used to construct an object without imposing contracts and allowing users to determine contracts they want to impose.

- [Java LogManager in JDK using Singleton Design Pattern](https://github.com/openjdk-mirror/jdk7u-jdk/blob/master/src/share/classes/java/util/logging/LogManager.java): Singleton is a design pattern that allows creation of just one instance of an object during the runtime.

## How to make best use of Design pattern knowledge?

As programmers, we constantly encounter a variety of challenges, many of which revolve around scalability, extensibility, maintainability, and reusability of the codebase. It’s not feasible to approach every problem from scratch, especially when it comes to addressing fundamental, recurring issues. This is where having a solid understanding of design patterns becomes invaluable, serving as a toolkit to solve commonly observed problems in software development. In the broader scope of software engineering, when we take a bird's-eye view of complex systems, we often find that at their core are the same atomic programming problems that developers have faced for decades.

Consider, for instance, the development of a database where, after thorough analysis, you determine that a custom B+ tree structure is the optimal solution for improving search efficiency. This isn’t a novel discovery—many developers have arrived at similar conclusions before. However, as you scale upwards in complexity, the problem tends to expand and evolve. Yet, at its foundation, the patterns and principles that address these problems remain consistent. The power of design patterns lies in their ability to offer proven, reusable solutions to these fundamental problems, allowing developers to focus on higher-level concerns rather than reinventing the wheel.

In this sense, understanding design patterns equips you with one of the most valuable toolkits in programming. It not only accelerates the problem-solving process but also enhances code quality by promoting best practices, ensuring that solutions are scalable, maintainable, and reusable.

## Classification of Design patterns

In the original book of design pattern "Design Patterns: Elements of Reusable Object-Oriented Software", patterns are classified into three types:

1. [Creational Design Patterns](./creational/README.md)
2. [Structural Design Patterns](./structural/README.md)
3. Behavioral Design Patterns
