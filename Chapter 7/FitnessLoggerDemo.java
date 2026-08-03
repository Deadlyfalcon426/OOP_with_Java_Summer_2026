// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 07 — Fitness Tracker Data Logger

import java.util.ArrayList;

public class FitnessLoggerDemo {
    public static void main(String[] args) {
        ArrayList<WorkoutRecord> records = new ArrayList<WorkoutRecord>();
        records.add(new WorkoutRecord("Running", 30, 320.0, "2025-09-01"));
        records.add(new WorkoutRecord("Cycling", 45, 410.5, "2025-09-02"));
        records.add(new WorkoutRecord("Yoga", 60, 180.0, "2025-09-03"));
        records.add(new WorkoutRecord("Swimming", 40, 390.0, "2025-09-04"));
        FitnessLogger.saveRecords("workouts.dat", records);
        records = FitnessLogger.loadRecords("workouts.dat");
        FitnessLogger.printSummary(records);
        FitnessLogger.appendRecord("workouts.dat", new WorkoutRecord("Hiking", 99, 200.0, "2025-09-06"));
        records = FitnessLogger.loadRecords("workouts.dat");
        FitnessLogger.printSummary(records);
        
    }
}
