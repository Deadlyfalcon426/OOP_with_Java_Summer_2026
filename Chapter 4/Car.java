// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 04 — Ride-Share Vehicle System
public class Car extends Vehicle {
    protected int numberOfSeats;
    /*
    here we override our previous fare estimator to add a markup for larger vehicles, 
    and we outsource the rest of the calculation to the superclass method,
    not necessarily for convenience but more so for consistency
    */
    @Override
    public double getFareEstimate(double miles){
        if(numberOfSeats >= 6){
            return 1.2 * super.getFareEstimate(miles);
        } else{
            return super.getFareEstimate(miles);
        }
    }
    /*
    basic constructor, we make sure to call the superclass constructor and give it parameters
     */
    public Car(String make, String model, int year, double baseFarePerMile, int numberOfSeats){
        super(make, model, year, baseFarePerMile);
        this.numberOfSeats = numberOfSeats;
    }
    //override toString to append the new information
    @Override
    public String toString(){
        return (super.toString()+" | Seats: "+numberOfSeats);
    }
    //not requested in the instuctions, but a helper method to simplify things in the demo
    public int getSeats(){
        return numberOfSeats;
    }
}