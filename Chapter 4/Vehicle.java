// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 04 — Ride-Share Vehicle System
public class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double baseFarePerMile;
    //basic constructor to set up the vehicle
    public Vehicle(String make, String model, int year, double baseFarePerMile){
        this.make = make;
        this.model = model;
        this.year = year;
        this.baseFarePerMile = baseFarePerMile;
    }
    //return fare estimate
    public double getFareEstimate(double miles){
        return baseFarePerMile*miles;
    }
    //override toString to give us what we want, which is essentially the name of the car
    @Override
    public String toString(){
        return String.format("%s %s %d", make, model, year);
    }
    
}
