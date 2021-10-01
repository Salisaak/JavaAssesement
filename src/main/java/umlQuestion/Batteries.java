package umlQuestion;

public class Batteries extends Product{
    public Batteries(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcDiscount() {
        double finalPay = (1-discountRate)*getPrice();
        return finalPay;
    }
}
