[<back](../DesignPattern.md)

# Simple Factory Design Pattern
<img src="../images/pattern/creational/SimpleFactory.svg" width="100%" />

* Here we simply move the instantiation logic to a separate class and most commonly to a static method of this class.
* Some do not consider simple factory to be a `design pattern`, as its simply a method that encapsulates object instantiation. Nothing complex goes on in that method.
* Typically we want to do this if we have more then one option when instantiating object and a simple logic is used to choose correct class.

**Implement Consideration**
* Simple factory can be just a method in existing class. Adding a separate class however allows other parts of your code to use simple factory more easily.
* Simple factory itself doesn't need any state tracking so it is best to keep this as a static method.

**Design Consideration**
* Simple factory will in turn may use other design pattern like builder to construct objects.
* In case you want to specialize your simple factory in sub classes, you need factory method design pattern instead.

### Implementation
* We start by creating a separate class for our simple factory
    * Add a method which returns desired object instance.
        * This method is typically static and will accept some argument to decide which class to instantiate
        * You can also provide additional arguments which will be used to instantiate objects

### Differences between Simple Factory & Factory Method
* Simple Factory:
    * We simply move our instantiation logic away from client code. Typically in a static method.
    * Simple factory know about all classes whose objects it can create.
* Factory Method:
    * Factory Method is more useful when you want to delegate object creation to subclasses.
    * In Factory method we don't know in advance about all product subclasses.

### Pitfalls
* The criteria used by simple factory to decide which object to instantiate can get more convoluted/complex over time. If you find yourself in such situation then use factory method.