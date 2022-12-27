[<back](../DesignPattern.md)

# Null Object

<img src="../images/pattern/behavioral/NullObject.svg" width="100%" />

* We use "null" value to represent an absence of object. Using "Null Object" pattern we can provide an alternate representation to indicate an absence of object.
* Most important characteristic of a null object is that it'll basically do nothing & store nothing when an operation is called on it.
* Null object seems like a proxy as it stands in for a real object, however a proxy at some point will use real object or transform to a real object & even in absence of the real object proxy will provide some behaviour with side effect. Null object will not do any such thing. Null objects don't transform into real objects.
* We use this pattern when we want to treat absence of a collaborator transparently without null checks.
