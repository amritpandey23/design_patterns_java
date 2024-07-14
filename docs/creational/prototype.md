# Prototype

> [!NOTE]
> Find source code [here](https://github.com/amritpandey23/design_patterns_java/tree/master/com.amrit.designpatterns.creational/src/com/amrit/designpatterns/creational/prototype)

## Introduction

- Type of object to create is based on a prototypical instance.

## Concepts

- Avoids Costly creation: refactory pattern, saves developers from recreating same object
- Avoids subclassing
- Avoids the use of keyword "new"
- Utilized an interface
- Implemented using registry: orignial object is kept in registry, we clone this object from registry when needed.
- Example: java.lang.Object#clone()

## Design

- Implement Clone/Cloneable interface
- Avoid keyword new instead use clone()
- Each copy is unique i.e. new reference in memory
- Construction is not handled by client
- Options: shallow and deep copy;

```java
public class Prototype implements Cloneable {
	private String val1;
	private String val2;
	private Test test;

	public Prototype(String val1, String val2, Test test) {
		super();
		this.val1 = val1;
		this.val2 = val2;
		this.test = test;
	}

	public Prototype clone() {
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

}
```

## How to use

```java
public class Main {
	public static void main(String[] args) {
		Prototype prototype1 = new Prototype("val1", "val2", new Test());

		System.out.println(prototype1.getVal1() + " " + prototype1.getVal2() + " " + prototype1.getTest());

		Prototype prototype2 = prototype1.clone(); // shallow copy

		System.out.println(prototype2.getVal1() + " " + prototype2.getVal2() + " " + prototype2.getTest());
	}
}
```

For deep copy modify the code as follows:

```java
public Prototype clone() {
	try {
		Prototype cloned = (Prototype) super.clone(); // return this for shallow copy
		cloned.setTest(this.test.clone()); // set property for deep copy
		return cloned;
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return null;
}
```

and make the property object cloneable:

```java
public class Test implements Cloneable {
	public Test clone() {
		try {
			return (Test) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
```

## Example of Registry

```java
public class Registry {
	private Map<String, Item> registry = new HashMap<>();

	public Registry() {
		loadItems();
	}

	public void loadItems() {
		Movie movie = new Movie("Tenet", 12.23, "http://movie.com", "thriller");
		this.registry.put("movie", movie);

		Book book = new Book("Game of Thrones", 23.12, "http://got.com", "I898989");
		this.registry.put("book", book);
	}

	public Item createItem(String itemName) {
		Item item = null;
		try {
			item = (Item) this.registry.get(itemName).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
}
```

## Pitfalls

- Not always clear when to use it.
- Goes with other patterns: makes it a framework
- Shallow vs Deep? (manual implementation)

## Advantages

- No constructors, cheap construction.
- Pre establish contract defaults.
