// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 07 — Fitness Tracker Data Logger

import java.io.*;
/*serializable is needed here because we plan to write this object onto a .dat file. 
Adding the interface tells the computer that this class produces objects that can be written to a .dat*/
public class WorkoutRecord implements Serializable{
    private final String workoutType;
    private final int durationMinutes;
    private final double caloriesBurned;
    private final String date;

    public WorkoutRecord(String workoutType, int durationMinutes, double caloriesBurned, String date){
        this.workoutType        =   workoutType;
        this.durationMinutes    =   durationMinutes;
        this.caloriesBurned     =   caloriesBurned;
        this.date               =   date;
    }

    public String getWorkoutType(){
        return workoutType;
    }
    public int getDurationMinutes(){
        return durationMinutes;
    }
    public double getCaloriesBurned(){
        return caloriesBurned;
    }
    public String getDate(){
        return date;
    }

    @Override
    public String toString(){
        return String.format("%-8s| %d min | %4.1f cal | %s", workoutType, durationMinutes, caloriesBurned, date);
    }
}
