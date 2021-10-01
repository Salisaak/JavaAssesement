package umlQuestion;

public class CocaCola extends Drink{
    public CocaCola(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcDiscount() {
        double finalDrinkPay = (1-discountRate)*getPrice();
        return finalDrinkPay;
    }
}
