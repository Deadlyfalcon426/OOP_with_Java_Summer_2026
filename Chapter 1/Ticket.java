// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1 
// Lab Name: Lab 01 — Campus Event Ticket Calculator 
public class Ticket{
    private String eventName;
    private double price;
    private int quantity;
    //constructor with two parameters
    public Ticket(String eventName, double price){
        this.eventName=eventName;
        this.price=price;
    }
    //setter/mutator for quantity parameter
    public void setQuantity(int qty){
        quantity=qty;
    }
    //getter/accessor for eventName parameter
    public String getEventName(){
        return eventName;
    }
    //getter/accessor for price parameter
    public double getPrice(){
        return price;
    }
    //getter/accessor for quantity parameter
    public int getQuantity(){
        return quantity;
    }
    //return subtotal based on price*quantity, as instructed in the directions
    public double getSubtotal(){
        return price*quantity;
    }
}