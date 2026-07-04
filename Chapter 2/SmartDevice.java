// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 02 — Smart Home Device Manager
public class SmartDevice {
    //initialize private fields
    private String deviceName;
    private String type;
    private boolean isOn;
    private int powerLevel;
    //constructor with 2 fields and defaults for rest
    public SmartDevice(String deviceName, String type){
        this.deviceName = deviceName;
        this.type = type;
        isOn = false;
        powerLevel = 50;
    }
    //mutator for boolean, true
    public void turnOn(){
        isOn=true;
    }
    //mutator for boolean, false
    public void turnOff(){
        isOn=false;
    }
    //mutator for power level with warning safeguard built in
    public void setPowerLevel(int level){
        if(level>=0 && level<=100){
            powerLevel=level;
        } else{
            System.out.println("Warning: Power level must be 0-100. No change made.");
        }
    }
    //accessor for device name
    public String getDeviceName(){
        return deviceName;
    }
    //accessor for type
    public String getType(){
        return type;
    }
    //accessor for boolean 'On'
    public boolean isOn(){
        return isOn;
    }
    //accessor for powerLevel
    public int getPowerLevel(){
        return powerLevel;
    }
    //creates formatted string of status
    public String getStatus(){
        return String.format("%s [%s] | %s| Power: %d%%", type, deviceName, (isOn)? "ON  ": "OFF " , powerLevel);
    }
}
