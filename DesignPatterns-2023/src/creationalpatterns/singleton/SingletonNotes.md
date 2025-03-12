# Singleton
**Singleton** is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## How to Implement
1. Add a private static field to the class for storing the singleton instance.
2. Declare a public static creation method for getting the singleton instance.
3. Implement “lazy initialization” inside the static method. It should create a new object on its first call and put it into the static field. The method should always return that instance on all subsequent calls.
4. Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.
5. In the client code replace all direct calls to the singleton’s constructor with calls to the static creation method.

## Double-Checked Locking
It is a software design pattern used to reduce the overhead of acquiring a lock by testing the locking criterion (the "lock hint") before acquiring the lock. Locking occurs only if the locking criterion check indicates that locking is required.
Double-Checked Locking is widely cited and used as an efficient method for implementing lazy initialization in a multithreaded environment. However, it will not work reliably in a platform independent way when implemented in Java, without additional **synchronization**.
It is typically used to reduce locking overhead when implementing **lazy initialization** in a multi-threaded environment, especially as part of the **Singleton pattern**. **Lazy initialization** avoids initializing a value until the first time it is accessed.