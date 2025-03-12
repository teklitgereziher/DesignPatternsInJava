# Decorator
The Decorator Pattern is used to extend the functionality of an object dynamically without having to change the original class source or using inheritance. This is accomplished by creating an **object wrapper** referred to as a **Decorator** around the actual object.

# Characteristics of a Decorator
* The Decorator object is designed to have the same interface as the underlying object. This allows a client object to interact with the Decorator object in exactly the same manner as it would with the underlying actual object.
* The Decorator object contains a reference to the actual object.
* The Decorator object receives all requests (calls) from a client. It in turn forwards these calls to the underlying object.
* The Decorator object adds some additional functionality before or after forwarding requests to the underlying object. This ensures that the additional functionality can be added to a given object externally at runtime without modifying its structure.

In object-oriented design, without changing the code of an existing class, new functionality can be added by applying inheritance, i.e., by subclassing an existing class and overriding its methods to add the required new functionality. However, with every new feature that needs to be added, there will be a multiplicative growth in the number of subclasses and soon we will have an exploding class hierarchy.

The Decorator pattern recommends having a wrapper around an object to extend its functionality by **object composition** rather than by **inheritance**.

