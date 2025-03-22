# Abstract Factory Pattern Example 3

Customer data management application with the following features:

- The basic functionality is to validate and save the input customer data consisting of account, address and credit card
  data.
- The application should be functional in both local and remote modes.
- In the remote mode, the application should make use of remote objects using Java Remote Method Invocation (RMI) and
  save the data to a central server.
- When the remote server is not available, users should be able to operate the application locally without interruption.
- The process of synchronizing both the local and the central databases is
  not considered as part of this example application.

## Classes Representing the Customer Data

Three different parts of the customer data:

| Product    | Family | Product Family   | Factory         |
|------------|--------|------------------|-----------------|
| Account    | Remote | RemoteAccount    | CustomerFactory |
| Address    | Local  | LocalAccount     |
| CreditCard |        | RemoteAddress    |
|            |        | LocalAddress     |
|            |        | RemoteCreditCard |
|            |        | LocalCreditCard  |

## Client Application

To eliminate the need for a client object to deal with the factory objects directly,
let us design a utility class CustomerUtil with a static method getCustFactory(
String mode) that takes the current mode of operation as input and returns
an appropriate CustomerFactory implementer object to the calling client object.

## Logical Flow When the Application Is Run

- The client object that needs to access the services of the customer data
  objects to validate and save the customer data is assumed to be aware of
  the current mode of operation (i.e., local or remote).
- By passing the application mode as the parameter, the client object can
  invoke the getCustomerFactory(String) static method of the CustomerUtil
  class.
- Inside the getCustomerFactory(String) method, the CustomerUtil
  creates an appropriate customer factory object and returns it to the client
  as an object of the CustomerFactory type.
- The client object can create the required customer data class (Account,
  Address or CreditCard) by invoking the CustomerFactory methods
  on the returned factory instance.
- Once an appropriate customer data object is created, the class object can
  use it to validate and save data.



