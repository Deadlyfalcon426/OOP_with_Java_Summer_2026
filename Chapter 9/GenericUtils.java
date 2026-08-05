// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 09 — Generics: Reusable Data Storage Box
public class GenericUtils{
    //this is a bounded type, an upper bound only allowing for types which implement comparable
    public static <T extends Comparable<T>> T findMax(T[] arr){
    T best = arr[0];
    for(T item : arr){
        if(item.compareTo(best)>0){
            best=item;
        }
    }
    return best;
    }
    //unbounded type, it can be any object. even null this time. 
    public static <T> void swap(T[]arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //unbounded type again, can be any object without issue. 
    public static <T> void printAll(T[]arr){
        for(T item : arr){
            System.out.println(item);
        }
    }
}