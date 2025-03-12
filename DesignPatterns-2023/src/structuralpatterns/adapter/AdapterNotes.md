# Adapter
The Adapter pattern suggests defining a wrapper class around the object with the incompatible interface. This wrapper object is referred as an **adapter** and the object it wraps is referred to as an **adaptee**. The adapter provides the required interface expected by the client. The implementation of the adapter interface converts client requests into calls to the adaptee class interface. In other words, when a client calls an adapter method, internally the adapter class calls a method of the adaptee class, which the client has no knowledge of. This gives the client indirect access to the adaptee class. Thus, an adapter can be used to make classes work together that could not otherwise because of incompatible interfaces.

## Example
In object-oriented design, clients of a class access the services offered by the class through its interface. Sometimes, an existing class may provide the functionality required by a client, but its interface may not be what the client expects. This could happen due to various reasons such as the existing interface may be too detailed, or it may lack in detail, or the terminology used by the interface may be different from what the client is looking for.

In such cases, the existing interface needs to be converted into another interface, which the client expects, preserving the reusability of the existing class. This can be accomplished by using the **Adapter pattern**.

The term interface used in the discussion above:
* Does not refer to the concept of an interface in Java programming language, though a class’s interface may be declared using a Java interface.
* Does not refer to the user interface of a typical GUI application consisting of windows and GUI controls.
* Does refer to the programming interface that a class exposes, which is meant to be used by other classes. As an example, when a class is designed as an abstract class or a Java interface, the set of methods declared in it makes up the class’s interface.

## Types of Adapter pattern
Adapters can be classified into two categories — **class adapters** and **object adapters** — based on the way a given adapter is designed.

### Class Adapter
A class adapter is designed by subclassing the adaptee class. In addition, a class adapter implements the interface expected by the client object. When a client object invokes a class adapter method, the adapter internally calls an adaptee method that it inherited.

### Object Adapter
An object adapter contains a reference to an adaptee object. Similar to a class adapter, an object adapter also implements the interface, which the client expects. When a client object calls an object adapter method, the object adapter invokes an appropriate method on the adaptee instance whose reference it contains.