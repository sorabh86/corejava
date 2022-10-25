[<back](README.md)

# Design Patterns
* **Creational**: Creational patterns deal with the process of creation of objects of classes. for example your requirement to create multiple objects or only single object of a class.
    * Builder
    * Simple Factory
    * Factory Method
    * Prototype
    * Singleton
    * Abstract Factory
    * Object Pool
* **Structural**: Structural patterns deal with how classes and objects are arranged or composed.
* **Behavioral**: Behavioral patterns describes how classes and objects interact & communicate with each other.


## Builder Design Pattern
![Builder](images/pattern/creational/builder.svg)
* We have a complex process to construct an object involving multiple steps, then builder design pattern can help us.
* In builder we remove the logic related to object construction from "client" code & abstract it in separate classes.

#### Implement Builder
* We start by creating a builder
    * Identify the `parts` of the object & provide methods to create those parts.
    * It should provide a method to `assemble` or build the object.
    * It must provide a way/method to get fully built object out. Optionally builder can keep reference to an product it has built so the same can be returned again in future.
* A director can be a separate class or client can play the role of director.

#### Consideration
* You can easily create an immutable class by implementing builder as an inner static class. You'will find this type of implementation used quite frequently even if immutability is not a main concern.
* The director role is rarely implemented as separate class, typically the consumer of the object instance or the client handles that role.
* Abstract builder is also not required if "product" itself is not part of any inheritance hierarchy. You can directly create concrete builder.

