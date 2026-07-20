// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 06 — Food Delivery App
public class FoodItem extends MenuItem implements Discountable {
    private String category;
    private boolean isCombo;
    public FoodItem(String name, double basePrice, String category, boolean isCombo){
        super(name, basePrice);
        this.category = category;
        this.isCombo = isCombo;
    }
    // calculate final price for food items
    @Override
    public double calculateFinalPrice() {
        if (isCombo) {
            return basePrice + 2.00;
        } else {
            return basePrice;
        }
    }
    // apply combo deal discount
    @Override
    public double applyDiscount(double percent) {
        return calculateFinalPrice() * (1 - percent);
    }
    // return combo discount label
    @Override
    public String getDiscountLabel() {
        return "Combo Deal";
    }
}
