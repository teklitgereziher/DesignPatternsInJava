# Abstract Factory
- It lets you produce families of related objects without specifying their concrete classes
- Is a factory of factories
- It provides a way to encapsulate a group of individual factories that have a common theme
- It instantiates a concrete factory and then create products using the factory

How it works:
- products
    - product_1
        - <<product_1>> (which is interface)
            - Example: Button
        - family of product_1 (which are concrete classes and implement the interface)
            - Windows Button
            - MacOs Button
            - Linux Button
    - factories:
        - <<General factory>> which is an interface
        - family of product_1 factories (which implement the General factory and instantiate the concrete 
        class family of product_1)
            Example:
                - Windows factory
                - MacOs factory
    - Client app
        - just uses the General factory that instantiate the family of product_1 factory 
        and in return they instantiate the family of product_1 concrete classes

**How to Implement**
1. Create a matrix of distinct product types versus their variants.
2. Explicitly declare interfaces for each distinct product of the product family
    - Button --> interface
    - CheckBox --> interface
    - Then create a concrete class for each variants of the products and implement their corresponding product interfaces
        - MacOS Button implements Button
        - Windows Button implements Button

3. Create an **Abstract Factory** — an interface with a list of creation methods for all products that are part of the product family.
    - createButton()
    - createCheckBox()
    - These methods must return abstract product types represented by the interfaces created previously: **Button**, **CheckBox** 

4. For each variant of a product family, implement a set of concrete factory classes based on the **Abstract Factory** interface. A factory is a class that returns products of a particular kind. 

5. Create factory initialization code in the client app that instantiate one of the concrete factory classes. Pass this factory object to all classes that construct products.

**NB**
Abstract factory can be used to achieve the design principles.
- Single Responsibility Principle - where you can extract the product creation code into one place, making the code easier to support.
 - Open/Closed Principle - where you can introduce new variants of products without breaking existing client code