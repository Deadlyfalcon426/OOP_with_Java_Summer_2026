// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 07 — Fitness Tracker Data Logger

import java.io.*;
import java.util.ArrayList;

public class FitnessLogger {
    public static void saveRecords(String filename, ArrayList<WorkoutRecord> records){
        System.out.printf("Saving %d records to %s... %n", records.size(), filename);
        try(
            //opening output stream, wrapped in object stream
            ObjectOutputStream w_stream = new ObjectOutputStream(new FileOutputStream(filename))
            //using try with resources automatically closes the stream
        ){
            w_stream.writeObject(records);
        } catch(IOException ex){
            //we still have to catch the error, even if we do not have an alternate plan for it
        }
    }
    public static ArrayList<WorkoutRecord> loadRecords(String filename){
        System.out.printf("Loading records from %s... %n", filename);
        //opening input stream, wrapped in object stream
        try(ObjectInputStream w_stream = new ObjectInputStream(new FileInputStream(filename))){
            return (ArrayList<WorkoutRecord>) w_stream.readObject();
            //using try with resources automatically closes the stream
        } catch(IOException ex){
            return null;
            //we still have to catch the error, even if we do not have an alternate plan for it
            //here we return null because this method demands a certain object
        } catch(ClassNotFoundException ex){
            return null;
            //we still have to catch the error, even if we do not have an alternate plan for it
            //here we return null because this method demands a certain object
        }
    }
    public static void appendRecord(String filename, WorkoutRecord record){
        System.out.printf("Adding new record: %s... %n", record.getWorkoutType());
        ArrayList<WorkoutRecord> records = loadRecords(filename);
        records.add(record);
        saveRecords(filename, records);
    }
    public static void printSummary(ArrayList<WorkoutRecord> records){
        System.out.println("--- Workout Summary ---");
        double totalCal = 0;
        for(WorkoutRecord record : records){
            System.out.println(record.toString());
            totalCal+= record.getCaloriesBurned();
        }
        System.out.printf("Total Calories Burned: %.1f %n", totalCal);
    }
}
