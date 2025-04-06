package structuralpatterns.adapter;

import structuralpatterns.adapter.objectadapter.client.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("us", "Wall street 43", "100000", "NY", "Canada");
        System.out.println("Is valid address: " + customer.isValidAddress());
    }
}
