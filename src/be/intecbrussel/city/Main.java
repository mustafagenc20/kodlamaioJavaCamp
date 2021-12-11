package be.intecbrussel.city;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.add(new Customer(1,"Jonas","Genc",28,new City(1,"BEL","Antwerpen"),true));
        customerManager.add(new Customer(2,"Gizem","Değirmenci",23,new City(1,"BEL","Antwerpen"),true));
        customerManager.add(new Customer(3,"Hakan","Çoban",22,new City(3,"BEL","Brussel"),true));
        customerManager.add(new Customer(4,"Mustafa","Turan",24,new City(2,"BEL","Gent"),false));

        List<Customer> customers=customerManager.getAll();
        for (Customer customer:customers)
            System.out.println(customer.toString());
    }
}
