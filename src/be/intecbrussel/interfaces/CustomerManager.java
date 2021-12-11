package be.intecbrussel.interfaces;

public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Customer added: " + customer.getFirstName());

        for(Logger logger : loggers){
            logger.log(customer.getFirstName());
        }
    }

    public void delete(Customer customer){
        System.out.println("Customer deleted: " + customer.getFirstName());

        for(Logger logger : loggers){
            logger.log(customer.getFirstName());
        }
    }
}
