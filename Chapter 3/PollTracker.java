// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 03 — Campus Poll Tracker
import java.util.ArrayList;
public class PollTracker {
    private String[] options;
    private int[] votes;
    private ArrayList<String> voterNames;
    //no-arg constructor, default setup
    public PollTracker(){
        String[] opt = {"Coffee Shop","Gym","Study Lounge","Game Room"};
        options = opt;
        votes = new int[4];
        voterNames = new ArrayList<>();
    }
    //add a vote, changes the voter names list and the votes count
    public void castVote(String voterName, int choice){
        voterNames.add(voterName);
        if(choice>=0 && choice<=3){//over here is the validation logic, to prevent invalid votes for unexisistent choices
            votes[choice]++;
        }
    }
    //return winner as a string
    public String getWinner(){
        int max_index = 0;
        for(int i = 0; i<votes.length;i++){
            if(votes[max_index]<votes[i]){
                max_index=i;
            }
        }
        return options[max_index];
    }
    //taking advantage that winner is already found, we search for the winner's votes and return
    //not asked for in instructions, but simplifies the lab and wasn't prohibited
    public int getWinnerVotes(String winner){
        for(int i =0;i<options.length;i++){
            if(winner.equals(options[i])){
                return votes[i];
            }
        }
        return -1;
    }
    //return total votes by summing votes for each choice, notably doesn't account for invalid votes
    public int getTotalVotes(){
        int sum = 0;
        for(int i = 0; i<votes.length;i++){
            sum+=votes[i];
        }
        return sum;
    }
    //print formatted report for each option, with a header
    public void printResults(){
        System.out.println("=== Campus Poll Results ===");
        String stars = "";
        for(int i = 0; i<options.length;i++){
            stars="";
            for(int j =0; j<votes[i];j++){
                stars+="*";
            }
            System.out.printf("%-13s(%d): %s (%d votes)%n", options[i], i, stars, votes[i]);
        }
        
    }
    //return the voterNames ArrayList.
    public ArrayList<String> getVoterList(){
        return voterNames;
    }
}
