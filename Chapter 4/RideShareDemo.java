// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 04 — Ride-Share Vehicle System
public class RideShareDemo {
    //main method to carry out instructions using the help of the classes
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[4];
        arr[0] = new Car("BMW", "GTR M3", 2001, 0.33, 1);
        arr[1] = new ElectricCar("BMW", "i4 eDrive40", 2024, 0.05, 5, 500);
        arr[2] = new Car("Volkswagen", "Type 2 Microbus", 1965, 0.20, 9);
        arr[3] = new Vehicle("BMW", "CE 04 Electric Scooter", 2022, 0.013);
        for(int i = 0; i<4;i++){
            System.out.printf("%s | Fare for 10 miles: $%.2f | Type: %s%n", arr[i].toString(), arr[i].getFareEstimate(10), getType(arr[i]));
        }
        int electricCarCounter = 0;
        int carCounter = 0;
        int vehicleCounter = 0;
        for(int i = 0; i<4; i++){
            if(arr[i] instanceof Car){
                if(arr[i] instanceof ElectricCar){
                    electricCarCounter++;
                } else{
                    carCounter++;
                }
            } else{
                vehicleCounter++;
            }
        }
        System.out.printf("Fleet Summary: %d Vehicle(s), %d Car(s), %d Electric Car(s)", vehicleCounter, carCounter, electricCarCounter);
    }
    //helper method not requested in instructions. allows me to outsource a lot of the repetitive logic tree
    //i would prefer to use getClass(), however it always adds 'class' in the front, and '(Large)' still needs to be at the back
    public static String getType(Vehicle vehicle){
        if(vehicle instanceof Car){
            Car car  = (Car) vehicle;
            if(car.getSeats()>=6){
                if(car instanceof ElectricCar){
                    return "Electric Car (Large)";
                } else{
                    return "Car (Large)";
                }
            } else{
                if(car instanceof ElectricCar){
                    return "Electric Car";
                } else{
                    return "Car";
                }
            }
        } else{
            return "Vehicle";
        }
    }
}
