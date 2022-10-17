# What is a Java?
- A list of instructions
- A high-level language
- Java source code is compiled to bytecode
- The bytecode is executed by a Java Virtual Machine (JVM)
- Java is Object-Oriented
- Small, simple, easy to write, easy to compile, easy to debug, and easy to learn
- Garbage Collection
- Based of C and C++
- Very similar to C#
- It is a platform

## History
- Developed by James Gosling team at Sun Microsystems
- Released in 1995
- JDK 1.0 (23 Jan, 1996)
- JDK 1.1 (19 Feb, 1997)
- J2SE 1.2 (8 Dec, 1998)
- J2SE 1.3 (8 May, 2000)
- J2SE 1.4 (6 Feb, 2002)
- J2SE 5.0 (30 Sep, 2004) - Big Language Changes
- Java SE 6 (11 Dec, 2006)
- Java SE 7 (28 Jul, 2011)
- Java SE 8 (18 Mar, 2014)

## Virtual Machine
Compiler -> Java Bytecode -> Java Virtual Machine -> Operating System
- JVMs uses just-in-time (JIT) compilation.
- JVM does garbage collecting
- Security

## Runtime Architecture
- It compiles to bytecode instead of machine language
- Java's bytecodes are portable between platforms with recompiling.
----------------------------------------
Custom-compiled bytecode
	^
Core runtime and additional libraries
	^
Java Virtual Machine (JVM)
	^
Operating System
----------------------------------------

## Java Class Libraries
- I/O: Read or Write to Disk
- Networking: Use with various protocols
- Math: Common Math Functions
- Collections: List, Map
- Regular Expressions
- Logging
- Graphics and UI
- Text Formatting
- XML
- Remote Method Invocation
- Security
- Databases
- Reflection: Inpect code and load dynamic classes
- More...

## Variables
- Variables are not objects
- Variables are locations in memory
- We can treat variables just like objects
- A variable is a container
- We create it, we name it, we put a value in it
- We change the value as we need to

## Data Types
- Types represents what that variable going to hold
- int (Integer): It hold a number. Type int allows math operations.
- String: It hold a word.
- boolean (Boolean): evaluates to either a true or a false
- Variable must be declared with a data type.

## Primitive Types
byte - 8 bits - (2^8=256; -128 to 127) Complement integer
short - 16 bits - (2^16=65536; -32768 to 32767) Complement integer
int - 32 bits - Complement integer
long - 64 bits - Complement integer
float - 32 bit IEEE 754 - () Decimal
double - 64 bit IEEE 754 - Decimal
boolean - 1 bit - true/false
char - 16 bits - Unicode characer

## Expressions & Operators
- An expression is a construct that evaluates to a single value, e.g. "Some Word".
- Arithmetic Operators:  +  ,  -  ,  *  ,  /  ,  % 
- Assignment Operators: = , += , -= , *= , /= , %= , ++ , --
- Operator Precedence: Multiply and divide before add and substraction
- Comparison Operators: < , > , <= , >= , == , !=
- Logical Operators: && , || 

## Arrays
- An array is a group of variables of the same data-type
- Variables in an array can be organized by index
- Index values start at zero and go to length-1

## Strings
- It is a sequences of characters

## What is a Class?
- A way we classify things in Java
### Method & Data
- A Class is a group of related methods and data
- A Class provides blueprints for creating an Object
- A Class is a non-primitive type
- A way of extending the type system
- Class are groupings of primitive types
- Herding complexity

### What is a Object?
- Object is an instance of a Class

### Defining a Class
- Classes have members - Data , Method

### Understanding Encapsulation
- Packaging of complex functionality to make it easy to use in an application
- Access to individual functions may be restricted
- The true nature of encapsulated data may be hidden

#### Conditional: ifelse , switch
#### Iterative: for , while , foreach
#### Jumping: continue , break

## Is-A(Inheritance) and Has-A(Composition)
- Classes do not stand alone
- Class are related
- e.g. 
	Cat -> Animal (Cat Is-A Animal), 
	Car -> Wheels + Engine (Car Has-A Wheels and Engine), 
	Car | Truck -> Vehicle (Car or Truck Is-A Vehicle)
- Need to be able to reuse code

## Polymorphism
- It means Many Forms
- There are two Components:
	1. Code is dependent on an interface.
	2. The behavior is determined by the actual class implementing that interface.

## Why do favour Composition over Inheritance?
- Almost all inheritance can be rewritten
- Object oriented programming changes less about modeling the real world, about modeling  interaction in a system, about modeling roles and responsibilites.
- Inheritance is difficult to maintain.

## Interfaces
- Inheritance without the baggage
- No implementation details
- Multiple implementations
- Works with polymorphism
- e.g. IAnimal -> DefaultAnimal , Cat , Dog

## What is a Generic?
- A way to write code independent of a type
- Class level generic - It is specify a type as a variable, Class of Type T
e.g. 
```java
	class House<T> { 
	   private T personList; 
	   public House(T personList) {
	   	this.personList = personList;
	   }  
     }

	House<MyPerson> house = new House<>(new MyPerson());
```
- Method level generic - It is specify a type of a parameter, Parameter of Type T
e.g.
```java
	public <U extends InterfaceName> void methodName(U item) {
	   item.method();
 	}
```

## Type Erasure
- Java Generics aren't real
- They disappear after being compiled

## Exceptions
- Way to handle errors
- Special object that indicates an error
- Exceptions that are not dealt with crash the application
- Cleaner than error codes
- Throwable <- Exception (Checked Exception)
- Throwable <- Error	 (Unchecked Exception)
- Exception <- RuntimeException (Unchecked Exception)

## Types of Exceptions
- Checked
	- Catch or specify
	- Subclasses Exception
	- Must handle in code
- Unchecked
	- Not expected to handle
	- Subclasses Error or RuntimeException
	- Never catch Errors

## Collection
- Group of objects
- Group by Uniqueness
- Group by Order
- Group by Process
- Group by Mapping
- Collection <- Set, List, Queue OR Map (Dictionary)

## List
- Ordered and sequential
- Can have duplicates

## Map
- Keys to values
- Keys must be unique

## Set
- No dublicates
- Must be able to compare

## Queue
- Ordered list
- Designed for processing














