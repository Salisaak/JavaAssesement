package umlQuestion;

public abstract class Product {
    protected ExpirationDate expirationDate;
    private String name;
    private double price;
    public double discountRate = .15;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public  void printExpireDate(){
        System.out.println(expirationDate);;
    }

    public abstract double calcDiscount();

    }

