// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1 
// Lab Name: Lab 01 — Campus Event Ticket Calculator 
import java.util.Scanner;

public class TicketDemo {
    // Main method that runs the ticket calculator program.
    public static void main(String[] args) {
        //setup the ticket array
            //indexes:     0           1               2
            //eventtypes:  concert     sports game     workshop
            //initialize
        Ticket[] arr = new Ticket[3];
            //plug in the values for each eventType
        arr[0] = new Ticket("Concert", 25.00);
        arr[1] = new Ticket("Sports Game", 15.00);
        arr[2] = new Ticket("Workshop", 10.00);
        //ok now we actually start asking the user about their choices
        //we will be needing a few more variables so lets go ahead and initalize them all
            //we initialize our scanner
        Scanner read = new Scanner(System.in);
            //set up user name
        String name;
            //boolean for student or not
        boolean is_student;
            //store total
        double running_total = 0.0;
        //ok now we can start the actual output and input
            //first fill in name
        System.out.print("Enter your name: ");
        name = read.nextLine();
            // Prompt the user for student status.
            // Any response other than 'y' is treated as not a student.
        System.out.print("Are you a student? (y/n): ");
        is_student = Character.toLowerCase(read.next().charAt(0))=='y';
            //ask for how many of each ticket
            //since we have the event names as a string, we can easily iterate over them in a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("How many %s tickets? ", arr[i].getEventName());
            arr[i].setQuantity(read.nextInt());    
        }
            //begin printing our receipt
        System.out.printf("--- Receipt for %s --- %n", name);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getQuantity()!=0){
                //print for receipt with plenty of formatting
                System.out.printf("%-16s x%-4d $%.2f%n", arr[i].getEventName(), arr[i].getQuantity(), arr[i].getSubtotal());
                //add subtotal to running total
                running_total+=arr[i].getSubtotal();
            }
        }
            // Apply the student discount if applicable.
        if(is_student){
            System.out.printf("Student Discount (10%%): -$%.2f%n", running_total*0.1);
            // Update the running total after applying the discount.
            running_total*=0.9;
        }
            // Display the final grand total.
        
        System.out.printf("%-23s $%.2f%n", "Grand Total:", running_total);

    }
}
