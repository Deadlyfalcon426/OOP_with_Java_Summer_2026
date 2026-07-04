// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 02 — Smart Home Device Manager
public class SmartDeviceDemo {
    public static void main(String[] args) {
        //set up array
        SmartDevice[] arr = new SmartDevice[3];
        //fill out array using constructor
        arr[0]= new SmartDevice("Living Room", "Light");
        arr[1]= new SmartDevice("Bedroom", "Thermostat");
        arr[2]= new SmartDevice("Front Door", "Camera");
        //test out turnOff()
        arr[0].turnOn();
        arr[0].turnOff();
        //test out turnOn()
        arr[1].turnOn();
        //test setPowerLevel()
        arr[0].setPowerLevel(70);
        arr[1].setPowerLevel(99);
        //test the warning feature
        arr[2].setPowerLevel(101);
        //print out the header
        System.out.println("--- Home Status Report ---");
        //print out rest of the report using a for loop
        for(int i = 0;i<arr.length;i++){
            //call getStatus for easy report
            System.out.println(arr[i].getStatus());
        }
    }
}
