# Builder pattern notes
- It separates the object construction process from its representation.
- This allows to create different representation of the objects using the same object construction process.
- That is it extracts the object construction code and puts it to a separate object called builder.
- In order to create an object, you need to execute a series of steps on the builder object.
- For example, to build a house we can have builders:
    - 1. a builder that builds everything from wood and glass, 
    - 2. a builder that builds everything with stone and iron
    - 3. a builder that uses gold and diamonds.
    - By calling the same set of steps, you can get:
        - a regular house from the first builder
        - a small castle from the second builder 
        - a palace from the third builder
        - This would only work if the client code that calls the building steps is able to interact with 
        builders using a common interface.
## Case study
- If you have a constructor with tens optional parameters, calling such a beast will be very inconvenient.
- In order to construct an A class instance if you need to create a B class object and a C class object, then Builder patten is a good choice to solve this issue.
- The Builder pattern lets you build the objects step by step, using only those steps that you really need. 
- So, implementing the Builder pattern allows you to don’t have to cram dozens of parameters into your constructors.
- So, use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
- The Builder pattern can be applied when construction of various representations of the product involves similar steps that differ only in the details.
- The **base builder interface** defines all possible construction steps, and **concrete builders** implement these steps to construct particular representations of the product. Meanwhile, the director class guides the order of construction.

1. **Builder interface**
    - declares product construction steps that are common to all types of builders
2. **Concrete Builders**
    - provide different implementations of the construction steps. 
    - Concrete builders may produce products that don’t follow the common interface.
3. **Products** 
    - They are resulting objects. 

### Example: Car can be built in different ways.
    - Extract the car assembly process into a separate car builder class
    - This class has a set of methods for assembling various parts of a car

### Example: House can be built in different ways.
    - Extract the House building process into a separate house builder class
    - This class has a set of methods for building various types of house.
    - To construct a house:
        - construct a four wall
        - install a door
        - fit a pair of windows
        - build a roof
    - features of a house:
        - regular house
        - small castle
        - palace
    - components
        - wood and glass
        - stone and iron
        - gold and diamond

**How to Implement**
1. Clearly define the common construction steps for building all available product representations. 
   If not, you won’t be able to implement the builder pattern.

2. Declare the common construction steps in a base builder interface.

3. Create a concrete builder class for each of the product representations and implement the base builder interface.
    - Implement a method for fetching the result of the construction. Because this method may not be declared inside the builder interface as various builders may construct products that don’t have a common interface. Therefore, you don’t know what would be the return type for such a method. However, if the products are from a single hierarchy, the fetching method can be safely declared to the base interface.

4. Create a concrete product classes which will be produced by the builders.

5. Create a concrete class for each of the features of the product if needed.

6. Create a director class (if needed). It may be usefull to encapsulate various ways to construct a product using the same builder object.

7. The client code should creates both the builder and the director (if available) objects. Before construction starts, the client must pass a builder object to the director.

8. The construction result can be obtained directly from the director only if all products are from the same interface. Otherwise, the client should fetch the result from the builder.

**The Builder pattern can be used to implement the Single Responsibility Principle.**