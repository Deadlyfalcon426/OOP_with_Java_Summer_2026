// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 10 — Contact Search Engine
public class ContactSearch {
    //O(n), linear search, sequentially checks every index until found
    public static int linearSearch(String[] contacts, String target){
        int compCount = 0;
        int location = Integer.MIN_VALUE;
        for(int i = 0; i<contacts.length;i++){
            compCount++;
            if(target.equalsIgnoreCase(contacts[i])){
                location=i; break;
                
            }
        }
        System.out.print("| Comparisons "+compCount);
        if(location>=0){
            return location;
        }
        return -1;
    }
    //O(log n), binary search, time needed is halved with every iteration
    public static int binarySearch(String contacts[], String target){
        int compCount = 0;
        boolean found = false;
        int low = 0;
        int high = contacts.length-1;
        int middle = 0;
        while(low<=high){
            middle = low + (high - low) / 2;
            compCount++;
            if(target.compareTo(contacts[middle])<0){
                high=middle-1;
            } else if (target.compareTo(contacts[middle])>0) {
                low=middle+1;
            } else{
                found=true;
                break;
            }
        }
        System.out.print("| Comparisons "+compCount);
        if(found){
            return middle;
        }
        return -1;
    }
    //O(n^2), selection sort, uses nested loops to select the smallest of each decreasing subarray. 
    //a bit simple and quite slow, but easy to implement
    public static void sortContacts(String[] contacts){
        int smallest;
        String temp;
        for(int i = 0; i<contacts.length-1;i++){
            smallest=i;
            for(int j = i+1; j<contacts.length;j++){
                if(contacts[smallest].compareTo(contacts[j])>0){
                    smallest = j;
                }
            }
            temp=contacts[smallest];
            contacts[smallest] = contacts[i];
            contacts[i] = temp;
        }
    }
    //O(n), printing them out, one at a time, however not any calculation so maybe O(1)?? still takes more time for a bigger input...
    public static void printContacts(String[] contacts){
        int counter = 0;
        for(String contact : contacts){
            counter++;
            System.out.printf("%d. %s  ",counter, contact);
        }
        System.out.println("");
    }
    
}
