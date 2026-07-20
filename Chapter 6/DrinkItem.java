// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 06 — Food Delivery App
public class DrinkItem extends MenuItem implements Discountable {
    private String size;
    public DrinkItem(String name, double basePrice, String size){
        super(name, basePrice);
        this.size = size;
    }
    // calculate final price for drink items
    @Override
    public double calculateFinalPrice() {
        switch (size) {
            case "Small":
                return basePrice;
            case "Medium":
                return basePrice + 0.50;
            case "Large":
                return basePrice + 1.00;
            default:
                return basePrice;
        }
    }
    // apply happy hour discount
    @Override
    public double applyDiscount(double percent) {
        return calculateFinalPrice() * (1 - percent);
    }
    // return happy hour label
    @Override
    public String getDiscountLabel() {
        return "Happy Hour";
    }
}
