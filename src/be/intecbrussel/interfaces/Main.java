package be.intecbrussel.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        Customer mustafa = new Customer(1,"Mustafa", "Genc");
        customerManager.add(mustafa);
    }
}
