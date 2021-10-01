package umlQuestion;

public class Car extends Product{
    public Car(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcDiscount() {
        double finalPay = (1-discountRate)*getPrice();
        return finalPay;
    }
}
