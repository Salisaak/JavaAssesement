package umlQuestion;

public class CheeseBurger extends Food{
    public CheeseBurger(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcDiscount() {
        double finalFoodPay = (1-discountRate)*getPrice();
        return finalFoodPay;
    }
}
