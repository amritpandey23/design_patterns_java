# Decorator Design Pattern

> [!NOTE]
> Find source code [here](https://github.com/amritpandey23/design_patterns_java/tree/master/com.amrit.designpatterns.structural/src/com/amrit/designpatterns/structural/decorator)

## Introduction

This pattern is used for extending the feature of existing class and adding more.

This pattern plays out well where you don't want to modify the existing code of the legacy class but want to add more feature in it.

A common question that might occur is "Isn't inheritence the same thing?". And the answer is yes. Inheritence is where we take the existing base class and change it's behaviour in the super class. However, this is not flexible. For example, Let's say we have a class A and I want to add new feature `A1` and `A2` to it, to achieve this I have to create two sub classes A1 and A2. What if new requirement comes and I want to add a third feature? I have to deal with creating A3 class probably.

To answer this inheritence entanglement, we have decorator pattern. Decorators are basically additional features that can be easily added to the base class to extend it's functions.

## Example

Let's say we have a computer interface to manufacture computers as follows:

```java
public interface Computer {
	public String make();
}
```

Now let's create a simple computer:

```java
public class SimpleComputer implements Computer{
	@Override
	public String make() {
		return "Spanit lab's computer";
	}
}
```

Let's say I have requirement of adding a keyboard to this simple computer during manufacturing? I can create a simple Keyboard Decorator to add a keyboard to the make string. But let's first create a simple abstract decorator class to freeze the decorator creation pattern.

```java
public abstract class ComputerDecorator implements Computer {
	Computer computer;

	public ComputerDecorator(Computer computer) {
		this.computer = computer;
	}
}
```

Now let's create a simple Keyboard decorator:

```java
public class KeyboardDecorator extends ComputerDecorator {
	public KeyboardDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public String make() {
		return computer.make() + " + Keyboard";
	}
}
```

Finally let's see how everything works out:

```java
class DecoratorDemo() {
    public static void main(String[] args) {
        Computer myComputer = new KeyboardDecorator(new SimpleComputer());

        System.out.println(myComputer.make()); // Spanit labs computer + Keyboard
    }
}
```

## Pitfall

- Need to create many decorators.
- Every feature will need it's own decorator.
