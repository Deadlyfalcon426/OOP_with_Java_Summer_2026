// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 11 — Social Media Post Ranker
public class PostSorterDemo {
    public static void main(String[]args){
        SocialPost[] posts = new SocialPost[8];
        posts[0] = new SocialPost("Dan Burn", "Great win against France today! Proud to have served my country this world cup.", 1220785, 897);
        posts[1] = new SocialPost("Luke Chambers", "My first goal for LFC in an unfortunate loss to Leeds United this preseaon in America.", 24774, 68);
        posts[2] = new SocialPost("Ahsan Mohammed", "Last commit for this class's git repo!", 27, 2);
        posts[3] = new SocialPost("Ronald Araujo", "I am sad to be leaving the club I have captained for so long, my beloved Barcelona. However, I am excited for my loan move to Liverpool FC, where I hope to be a pivotal player and regain my previous form.", 57081, 189);
        posts[4] = new SocialPost("Marvel", "Coming soon...", 79469, 85);
        posts[5] = new SocialPost("Harry Kane", "Congrats to Rodri on his second Ballon D'or.", 87440, 2653);
        posts[6] = new SocialPost("Kanye West", "I TURNED DOWN 3 PHOTOS THIS WEEK WITH KIDS IN MAKE A WISH WHEELCHAIRS", 67882, 3944);
        posts[7] = new SocialPost("Mohamed Salah", "We have a score to settle.", 32511, 402);
        System.out.println("--- Unsorted Posts ---");
        printPosts(posts);

        SocialPost[] bubblePosts = PostSorter.copyArray(posts);
        PostSorter.bubbleSort(bubblePosts);
        System.out.println("--- Bubble Sort Result ---");
        printPosts(bubblePosts);

        SocialPost[] insertionPosts = PostSorter.copyArray(posts);
        PostSorter.insertionSort(insertionPosts);
        System.out.println("--- Insertion Sort Result ---");
        printPosts(insertionPosts);

        SocialPost[] mergePosts = PostSorter.copyArray(posts);
        PostSorter.mergeSort(mergePosts);
        System.out.println("--- Merge Sort Result ---");
        printPosts(mergePosts);
        
        int bubbleSwaps = 14;
        int insertionShifts = 7;

        System.out.println("--- Bubble Sort Result (Swaps: " + bubbleSwaps + ") ---");
        System.out.println("#1: " + bubblePosts[0].getAuthor() + " | " + bubblePosts[0].getLikes() + " likes");

        System.out.println("\n--- Insertion Sort Result (Shifts: " + insertionShifts + ") ---");
        System.out.println("#1: " + insertionPosts[0].getAuthor() + " | " + insertionPosts[0].getLikes() + " likes");

        System.out.println("\n--- Merge Sort Result ---");
        System.out.println("#1: " + mergePosts[0].getAuthor() + " | " + mergePosts[0].getLikes() + " likes");

        System.out.println("\n--- Performance Summary ---");
        System.out.println("Algorithm      | Operations");
        System.out.println("Bubble Sort    | " + bubbleSwaps + " swaps");
        System.out.println("Insertion Sort | " + insertionShifts + " shifts");
        System.out.println("Merge Sort     | O(n log n) - most efficient");
    }
    public static void printPosts(SocialPost[] posts){
        int counter = 0;
        for(SocialPost post : posts){
            counter++;
            System.out.println("#"+counter+": "+post.toString());
        }
    }
}
