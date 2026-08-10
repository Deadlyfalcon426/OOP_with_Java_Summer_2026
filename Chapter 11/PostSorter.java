// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 11 — Social Media Post Ranker

public class PostSorter{
    // Worst: O(n^2) | Average: O(n^2) | Best: O(n)
    public static void bubbleSort(SocialPost[] posts){
        int shifts = 0;
        SocialPost temp;
        boolean complete;
        while(true){
            complete=true;
            for(int i = 0; i<posts.length-1;i++){
                if(posts[i].compareTo(posts[i+1])<0){
                    temp = posts[i];
                    posts[i] = posts[i+1];
                    posts[i+1] = temp;
                    complete=false;
                    shifts++;
                }
            }
            if(complete){
                System.out.println(shifts);
                break;
            }
        }
    }
    // Worst: O(n^2) | Average: O(n^2) | Best: O(n)
    public static void insertionSort(SocialPost[] posts){
        int swaps = 0;
        for(int i = 1; i<posts.length;i++){
            SocialPost current = posts[i];
            int j = i-1;
            while(j>=0 && (current.compareTo(posts[j])>0)){
                posts[j+1] = posts[j];
                j--;
            }
            posts[j+1] = current;
            swaps++;
        }
        System.out.println(swaps);
    }
    // Worst: O(n log n) | Average: O(n log n) | Best: O(n log n)
    public static void mergeSort(SocialPost[] posts, int left, int right){
        if(left<right){
            int mid = left + ( (right - left) / 2 );
            mergeSort(posts, left, mid);
            mergeSort(posts, mid+1, right);
            merge(posts, left, mid, right);
        }
    }
    //the merge helper handles the part where the broken down sub arrays are stitched back together properly
    private static void merge(SocialPost[] posts, int left, int mid, int right){
        SocialPost[] leftHalf = copyArray(posts, left, mid+1);

        SocialPost[] rightHalf = copyArray(posts, mid+1, right+1);

        int leftCounter = 0;
        int rightCounter= 0;
        for(int i = left; i<right+1;i++){

            if((leftCounter<leftHalf.length && rightCounter<rightHalf.length)&& leftHalf[leftCounter].compareTo(rightHalf[rightCounter])>=0){
                posts[i] = leftHalf[leftCounter];
                leftCounter++;
            } else if(rightCounter>=rightHalf.length){
                posts[i] = leftHalf[leftCounter];
                leftCounter++;
            } else{
                posts[i] = rightHalf[rightCounter];
                rightCounter++;
            }
        }

    }
    public static SocialPost[] copyArray(SocialPost[] array) { return copyArray(array, 0, array.length);}
    public static SocialPost[] copyArray(SocialPost[] array, int start_copy, int end_copy){
        SocialPost[] new_array = new SocialPost[end_copy-start_copy];
        int counter = 0;
        for(int i = start_copy; i<end_copy;i++){
            new_array[counter] = new SocialPost(array[i]);
            counter++;
        }
        return new_array;
    }
    //helper method, for convenience
    public static void mergeSort(SocialPost[]posts){
        mergeSort(posts, 0, posts.length-1);
    }

}

