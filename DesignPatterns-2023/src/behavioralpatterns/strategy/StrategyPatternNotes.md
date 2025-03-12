# Strategy Pattern
The Strategy pattern is useful when there is a set of related algorithms and a client object needs to be able to dynamically pick and choose an algorithm from this set that suits its current need.

The Strategy pattern suggests keeping the implementation of each of the algorithms in a separate class. Each such algorithm encapsulated in a separate class is referred to as a **strategy**. An object that uses a Strategy object is often referred to as a **context object**.

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Problem: Navigation app
Develop navigation app with the following features:
* Driving route
* Walking route
* Public transport routes
* Cycling routes
* Tourist attractions routes

## Solution to the Problem
Apply the Strategy pattern and extract all of the specific algorithms from the one big class that does something specific in a lot of different ways into separate classes called **strategies**. The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.
