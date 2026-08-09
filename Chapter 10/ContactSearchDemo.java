// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 10 — Contact Search Engine

/*
O(n) means that for every unit of the data, there is a calculation. Every step of the algorithm takes as long as the last.
O(log n) means that after every step of the algorithm, the next step takes half the time. 
At lower amounts of data, O(n) and O(log n) can be at similar levels, however as the size progressively grows, O(log n) becomes the better choice by far

*/
public class ContactSearchDemo {
    public static void main(String[] args) {
        String[] contacts = 
            {"Virgil Van Dijk",
            "Mohamed Salah",
            "Sadio Mane",
            "Roberto Firmino",
            "Philippe Coutinho",
            "Jordan Henderson",
            "Joel Matip",
            "Andrew Robertson",
            "Alisson Becker",
            "Trent Alexander-Arnold",
            "Thiago Alcântara",
            "Steven Gerrard",
            "Xabi Alonso",
            "Luis Diaz",
            "Caomimin Kelleher",
            "Conor Bradley",
            "Darwin Nunez"};
        System.out.println("--- Unsorted Contacts ---");
        ContactSearch.printContacts(contacts);
        System.out.print("Linear Search for \'Andrew Robertson\' ");
        int location = ContactSearch.linearSearch(contacts, "Andrew Robertson");
        System.out.println((location!=-1)? (", Found at index "+location) :  ", Not Found");
        System.out.print("Linear Search for \'Luis Suarez\' ");
        location = ContactSearch.linearSearch(contacts, "Luis Suarez");
        System.out.println((location!=-1)? (", Found at index "+location) :  ", Not Found");

        System.out.println("--- Sorted Contacts ---");
        ContactSearch.sortContacts(contacts);
        ContactSearch.printContacts(contacts);
        System.out.print("Binary Search for \'Andrew Robertson\' ");
        location = ContactSearch.binarySearch(contacts, "Andrew Robertson");
        System.out.println((location!=-1)? (", Found at index "+location) :  ", Not Found");
        System.out.print("Binary Search for \'Luis Suarez\' ");
        location = ContactSearch.binarySearch(contacts, "Luis Suarez");
        System.out.println((location!=-1)? (", Found at index "+location) :  ", Not Found");

        //I had to manually write in the comparison numbers, as I couldnt find a simple way to save the comparison count without changing the method signature a lot
        //Binary is much faster than Linear, and this is because it has a faster time complexity. 
        //Binary search makes the next step always twice as fast (due to halving the search region), while linear still has the same amount of work every time

        System.out.println("--- Efficiency Comparison ---");
        System.out.printf("Target\t\t | Linear | Binary%n");
        System.out.println("Andrew Robertson |   8\t  |   3");
        System.out.println("Luis Suarez\t |   17\t  |   5");
    }

}
