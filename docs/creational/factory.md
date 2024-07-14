# Factory Method

> [!NOTE]
> Find source code [here](https://github.com/amritpandey23/design_patterns_java/tree/master/com.amrit.designpatterns.creational/src/com/amrit/designpatterns/creational/factorymethod)

## Introduction

- Opposite of Singleton.
- Second most used.

## Concepts

- Doesn't expose instantiation logic.
- Deferring to subclasses for creation of objects.
- Common interface of objects being created.
- Implemented by user.
- Example: Calendar, ResourceBundle etc.

## Design

- Responsible for creation life-cycle of objects.
- Common interface for all the objects.
- Concrete classes.
- Parametrized create method with contract enforced.

## Example

The general use of a factory is given below:

```java
Product item1 = ProductFactory.getProduct(ProductType.ITEM1);
Product item2 = ProductFactory.getProduct(ProductType.ITEM2);

System.out.println(item1.getProductName());
System.out.println(item2.getProductName());
```

The structure of a factory is as follows:

```java
public class ProductFactory {
	public static Product getProduct(ProductType productType) {
		switch (productType) {
		case ITEM1:
			return new ProductItem1();
		case ITEM2:
			return new ProductItem2();
		}
		return null;
	}
}
```

Each product is of a super type or interface Product. Existence of this interface is necessary.

```java
public abstract class Product {
	protected String productName;

	public Product() {
		this.createProduct();
	}

	public abstract void createProduct();

	public String getProductName() {
		return this.productName;
	}
}
```

An example product item:

```java
public class ProductItem1 extends Product {

	@Override
	public void createProduct() {
		this.productName = "Product Item 1";
	}

}
```
