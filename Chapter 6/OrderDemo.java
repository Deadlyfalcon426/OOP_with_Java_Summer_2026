// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 06 — Food Delivery App
import java.util.ArrayList;
public class OrderDemo {
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new FoodItem("Burger Combo", 8.99, "Burger", true));
        items.add(new FoodItem("Hawaiian Pizza", 6.99, "Pizza", false));
        items.add(new DrinkItem("Large Soda", 3.50, "Large"));
        items.add(new DrinkItem("Small Water", 1.50, "Small"));

        System.out.println("--- Order Summary ---");
        for (MenuItem item : items) {
            item.printItem();
        }

        double total = 0.0;
        System.out.println("--- After Discounts ---");
        for (MenuItem item : items) {
            if (item instanceof Discountable) {
                Discountable discount = (Discountable) item;
                double discountedPrice = discount.applyDiscount(0.15);
                System.out.printf("%s (%s): $%.2f%n", item.getName(), discount.getDiscountLabel(), discountedPrice);
                total += discountedPrice;
            } else {
                total += item.calculateFinalPrice();
            }
        }

        System.out.printf("Order Total: $%.2f%n", total);
    }
}
