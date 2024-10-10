# Flyweight

## Introduction

- Flyweight pattern is used to optimize the memory for similary typed objects during the runtime.
- It is an optimization problem.
- Applied on objecs that are immuatable.
- Example: String, Boolean.valueOf(), Byte.valueOf() etc.

## Design

Uses three components:

1. Factory
2. Client
3. Flyweight
4. Concrete flyweight

The client ask for a flyweight object from the factory. The factory then retrieves a flyweight based on user's demand, in case the flyweight is not available, a concrete flyweight is created from the flyweight blueprint and stored for future use.

## Example

We will use an inventory management system where the flyweight is a `Item` class from which many kinds of concrete flyweights can be created. The factory is our `InventoryManagementSystem` which creates/retrieves Item flyweight on user/client demand.

```java
public class Item {
	String itemName;
	int price;

	public Item(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
}
```

```java
public class Order {
	String itemName;
	int price;

	public Order(Item item) {
		this.itemName = item.itemName;
		this.price = item.price;
	}

	@Override
	public String toString() {
		return "<Order> Item Name: " + itemName + " Price: " + price;
	}

	public String getItemName() {
		return itemName;
	}

	public int getPrice() {
		return price;
	}
}
```

```java
public class InventoryManagementSystem {
	Map<String, Item> items;
	List<Order> orders;

	public InventoryManagementSystem() {
		this.items = new HashMap<>();
	}

	public void createOrder(String itemName, int price) {
		if (!items.containsKey(itemName)) {
			items.put(itemName, new Item(itemName, price));
		}
		Item item = items.get(itemName);
		orders.add(new Order(item));
	}

	public int totalItems() {
		return items.size();
	}
}
```

```java
public class Play {
	public static void main(String[] args) {
		InventoryManagementSystem ims = new InventoryManagementSystem();
		ims.createOrder("Book", 12);
		ims.createOrder("Compass", 100);
		ims.createOrder("Book", 12);
		ims.createOrder("Cup", 200);
		ims.createOrder("Cup", 200);
		ims.createOrder("Book", 12);
		ims.createOrder("Compass", 100);
		ims.createOrder("Cup", 200);
		ims.createOrder("Book", 12);

		System.out.println("Total items = " + ims.totalItems()); // 3
	}
}
```

In the above example, we can observe that only three items are created in the memory however 9 orders are in queue in total.

## Pitfalls

- Not actually a pattern rather a memory optimzation technique.
- Premature memory optimization.
- Dependency on factory pattern.
