// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 05 — Student Grade File Processor
public class GradeProcessor {
    public static String[] processLine(String line) throws InvalidScoreException{
        String[] tokens = line.split(" ");
        for (int i = 1; i < 4; i++) {
            //this try-catch is for throwing the invalid score exception, it carries the format
            try{
                //this try-catch is for throwing the initial exception, both the same exception with a different message, to allow for a single, sumple catch block
                try {
                    Integer.parseInt(tokens[i]);
                } catch (NumberFormatException ex) {
                    throw new NumberFormatException("Invalid data for line");
                }
                int result = Integer.parseInt(tokens[i]);
                if(result>100 || result<0){
                    throw new NumberFormatException("Invalid score value for line");
                }
            } catch (NumberFormatException ex){
                throw new InvalidScoreException("WARNING: "+ex.getMessage()+": '"+line+"' - skipping.");
            }
        }
        return tokens;
    }

    public static char getLetterGrade(double avg){
        if(avg>=90){
            return 'A';
        } else if(avg>=80){
            return 'B';
        } else if(avg>=70){
            return 'C';
        } else if(avg>=60){
            return 'D';
        } else{
            return 'F';
        }
    }
}
//this is the custom exception. it is a checked exception and doesnt have anything really special to it.
class InvalidScoreException extends Exception{
    public InvalidScoreException(String m){
        super(m);
    }
}

