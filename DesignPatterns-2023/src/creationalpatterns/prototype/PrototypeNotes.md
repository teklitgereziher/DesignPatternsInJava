# Prototype Pattern
- According to GoF, Prototype pattern is used to specify the kinds of objects to create using a **prototypical instance** and creates new objects by copying this creationalpatterns.prototype.
- It lets you copy existing objects without making your code dependent on their classes.

## Problem
Let's say you have an object, and you want to create an exact copy of that object. How would you do it? 
Intutive solution:
- First, you have to create a new object of the same class. 
- Then you have to go through all the fields of the original object and copy their values over to the new object.
- However, not all objects can be copied that way because some of the object’s fields may be private and not visible from outside of the object itself.
- Another problem, you have to know the object’s class to create a duplicate, and this makes your code dependent on that class.

## Solution
The Prototype pattern delegates the cloning process to the actual objects that are being cloned. The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object. Usually, such an interface contains just a single clone method. 
The implementation of the clone method is very similar in all classes. The method creates an object of the current class and carries over all of the field values of the old object into the new one. You can even copy private fields because most programming languages let objects access private fields of other objects that belong to the same class.
An object that supports cloning is called a **creationalpatterns.prototype**. 

## How to Implement
1. Create the **creationalpatterns.prototype interface** and declare the clone method in it. Or you can add the method to all classes of an existing class hierarchy, if available.

2. A **creationalpatterns.prototype class** must define the alternative constructor that accepts an object of that class as an argument and it must copy the values of all fields defined in the class from the passed object into the newly created instance. If you’re changing a subclass, you must call the parent constructor to let the superclass handle the cloning of its private fields.

3. The cloning method usually consists of just one line: running a new operator with the prototypical version of the constructor. Note, that every class must explicitly override the cloning method and use its own class name along with the new operator. Otherwise, the cloning method may produce an object of a parent class.
