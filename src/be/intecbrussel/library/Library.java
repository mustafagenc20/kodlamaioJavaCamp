package be.intecbrussel.library;

public class Library {

    String type;
    int averagePageCount;
    double marketPrice;
    int bookCount;

    public Library(){
        System.out.println("Ben çalıştım");
    }
    public Library(String type, int averagePageCount, double marketPrice, int bookCount){
        this();
        this.type = type;
        this.averagePageCount= averagePageCount;
        this.marketPrice= marketPrice;
        this.bookCount=bookCount;
    }
}
