// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 04 — Ride-Share Vehicle System
public class ElectricCar extends Car{
    private int batteryRangeKm;
    //constructor, make sure to call previous constructor, which will call the grandparent constructor, a good example of constructor chaining
    public ElectricCar(String make, String model, int year, double baseFarePerMile, int numberOfSeats, int batteryRangeKm){
        super(make, model, year, baseFarePerMile, numberOfSeats);
        this.batteryRangeKm = batteryRangeKm;
    }
    /*
    override previous fare calculator and add a discount for electric vehicle, make sure to call
    the previous constructor. one thing to note is that, for a large electric car, both the markup
    and the discount apply due to the chaining. I think this is accurate to the real world as well.
     */
    @Override
    public double getFareEstimate(double miles){
        return 0.9*super.getFareEstimate(miles);
    }
    //override toString to append the new information
    @Override
    public String toString(){
        return (super.toString()+" | Battery: "+batteryRangeKm+"km");
    }
}
