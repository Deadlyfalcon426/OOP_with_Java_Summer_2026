// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 06 — Food Delivery App
public abstract class MenuItem {
    private String name;
    protected double basePrice;
    // constructor
    public MenuItem(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }
    // abstract class for shared menu item behavior
    public abstract double calculateFinalPrice();
    // print item name and final price
    public void printItem(){
        System.out.printf("%s | $%.2f%n", name, calculateFinalPrice());
    }
    // getters
    public String getName(){
        return name;
    }
    public double getBasePrice(){
        return basePrice;
    }
}
