// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 05 — Student Grade File Processor
import java.io.*;
import java.util.Scanner;
public class GradeProcessorDemo {
    public static void main(String[] args) {
        //this try-catch block catches a more basic error, whether the file itself can be found or not. it also has the finally block at the end to show the task is completed
        try(
            Scanner read = new Scanner(new File("Chapter 5/grades.txt"));
            PrintWriter write = new PrintWriter(new File("Chapter 5/results.txt"));
        ){
            System.out.println("Reading grades.txt...");
            write.println("--- results.txt contents ---");
            String[] str_arr;
            double avg;
            double class_avg = 0.0;
            int students = 0;
            while(read.hasNextLine()){
                //this try-catch block is for catching invalid lines, it remains within a while loop to allow for the full file to be iterated over
                try {
                    str_arr = GradeProcessor.processLine(read.nextLine());
                    avg = 0;
                    for(int i = 1; i<4;i++){
                        avg+=Integer.parseInt(str_arr[i]);
                    }
                    avg/=3;
                    class_avg+=avg;
                    students++;
                    write.printf("%-7s| Avg: %.1f | Grade: %c%n", str_arr[0], avg, GradeProcessor.getLetterGrade(avg));
                } catch(InvalidScoreException ex){
                    System.err.println(ex.getMessage());
                } 
            }
            write.printf("Class Average: %.1f", class_avg/students);
        } catch (FileNotFoundException ex){
            System.err.println("Error: File not found");
        }finally{
            System.out.println("Processing complete.");
        }
    }
}
