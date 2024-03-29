# Structural Design Patterns

## Adapter Design Pattern

This pattern is mainly used to use the old/legacy code with same interface.

Suppose that there is an `App` class that utilizes a class called `OldEmployee`. This old employee class implements an interface which has following methods:

```java
Employee {
	getId() : String
	getFirstName() : String
	getLastName() : String
}
```

Now due to new specification and demand in business logic, the new class is going to be `NewEmployee` which will not implement the methods that `OldEmployee` class implements. Instead the `NewEmployee` class will have following methods:

```java
NewEmployee {
	getId() : int
	getFirstName() : String
	getSurname() : String
}
```

This creates a problem because `App` class might still be using logic of the `OldEmployee` methods like `getLastName()` which is no longer available in the new class. To solve this issue, we will create an adapter class which is like a wrapper over the `NewEmployee` that will act similar to the `OldEmployee` but under the hood will be calling the methods of the new class. The implementation of the adapter is as follows:

```java
NewEmployeeAdapter implements Employee {
	NewEmployee emp;
	
	NewEmployeeAdapter(NewEmployee emp) {
		this.emp = emp;
	}
	
	getId() {
		return String.valueOf(emp.getId()); // int returned by new, String by old
	}
	
	getFirstName() {
		return emp.getFirstName();
	}
	
	getLastName() {
		return emp.getSurname();
	}
}
```

And now we can use the same logic in `App` class for `NewEmployee` as we did for `OldEmployee` without changing anything in the implementation of `App` business logic.