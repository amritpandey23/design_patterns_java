# Composite Design Pattern

> [!NOTE]
> Find source code [here](https://github.com/amritpandey23/design_patterns_java/tree/master/com.amrit.designpatterns.structural/src/com/amrit/designpatterns/structural/composite)

```mermaid
classDiagram
    Component <|-- Leaf
    Component <|-- Composite
    Composite --o Component : 0..* contains 1

    class Component {
        +operation()
    }

    class Leaf {
        +operation()
    }

    class Composite {
        +add(Component)
        +remove(Component)
        +getChild(int) : Component
        +operation()
    }
```

This pattern is mainly used to denote the objects as a tree hierarchy. Example of this is in Java AWT library where each class or widget derive from the parent Component. And each component can be a collection of more components.

How to begin: Create an abstract class `Component` for all the objects in the system.

```java
package com.amrit.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	String name;
	String url;

	List<Component> children = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public void add(Component c) {
		throw new UnsupportedOperationException("This operation is not supported");
	}

	public void remove(Component c) {
		throw new UnsupportedOperationException("This operation is not supported");
	}

	public abstract String toString();
}
```

Now we can use this abstract class to create other objects and override methods wherever required.

Parent component:

```java
package com.amrit.designpatterns.structural.composite;

import java.util.Iterator;

public class Parent extends Component {

	public Parent(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public void add(Component c) {
		this.children.add(c);
	}

	@Override
	public void remove(Component c) {
		this.children.remove(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + "\n");
		Iterator<Component> itr = this.children.iterator();
		while (itr.hasNext()) {
			sb.append(itr.next().toString() + " ");
		}
		return sb.toString();
	}

}
```

And item object that goes inside parent:

```java
package com.amrit.designpatterns.structural.composite;

public class Item extends Component {

	public Item(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
```

And this is how it'll work:

```java
public static void main(String[] args) {
	Parent parent = new Parent("Parent", "");
	Item item1 = new Item("Item1", "");
	Item item2 = new Item("Item2", "");
	Item item3 = new Item("Item3", "");
	Item item4 = new Item("Item4", "");
	parent.add(item1);
	parent.add(item2);
	parent.add(item3);
	parent.add(item4);

	System.out.println(parent);
}
```

## Pitfalls

- Quite restrictive.
- Oversimplification.
