[<back](../DesignPattern.md)

# Memento


<img src="../images/pattern/behavioral/Memento.svg" width="100%" />

* When we want to store object's state without exposing internal details about the state then we can use memento design pattern.
* The main intent behind saving state is often because we want to restore the object to a saved state.
* Using memento we can ask an object to give its state as a single, "sealed" object & store it for later use. This object should not expose the state for modification.
* This pattern often combined with Command design pattern to provide undo functionality in application.

## Implement Memento
* We start by finding originator state which is to be "stored" in memento.
* We then implement the memento with requirement that it can't be changed & read outside the originator.
* Originator provides a method to get its current snapshot out, which will return an instance of memento.
* Another method in originator takes a memento object as argument and the originator object resets itself to match with the state stored in memento.





