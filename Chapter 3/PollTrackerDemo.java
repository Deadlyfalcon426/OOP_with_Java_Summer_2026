// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 03 — Campus Poll Tracker
import java.util.Scanner;
public class PollTrackerDemo {
    //main method to run the function
    public static void main(String[] args) {
        PollTracker pollTracker = new PollTracker();
        Scanner read = new Scanner(System.in);
        addStudent(read, pollTracker);
        addStudent(read, pollTracker);
        addStudent(read, pollTracker);
        addStudent(read, pollTracker);
        addStudent(read, pollTracker);
        pollTracker.printResults();
        System.out.printf("Winner: %s with %d votes!%n",pollTracker.getWinner(),pollTracker.getWinnerVotes(pollTracker.getWinner()));
        System.out.println("Total Votes Cast: "+pollTracker.getTotalVotes());
        System.out.println("Voters: "+pollTracker.getVoterList());
    }
    //this helper method is to simplify the code, as it consists of simple actions that are repeated several times
    public static void addStudent(Scanner read, PollTracker pollTracker){
        System.out.print("Enter student name: ");
        String name = read.nextLine();
        System.out.print("Enter choice (0-3): ");
        int choice = read.nextInt();
        read.nextLine(); //there is the extra /n after reading in just the integer
        pollTracker.castVote(name, choice);
    }
}
