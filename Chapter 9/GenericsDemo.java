// Student Name: Ahsan Mohammed
// Course: CSC-162-INE1
// Lab Name: Lab 09 — Generics: Reusable Data Storage Box
public class GenericsDemo{
    public static void main(String[] args) {

        //storage box section
        StorageBox<String> strBox1 = new StorageBox<>("Name Tag", "Luke Chambers");
        StorageBox<Integer> intBox1 = new StorageBox<>("Age", 22);
        StorageBox<Double> floatBox1 = new StorageBox<>("GPA", 3.89);
        System.out.println(strBox1);
        System.out.println(intBox1);
        System.out.println(floatBox1);
        //Pair section
        Pair<String, Integer> rank = new Pair<>(strBox1.getItem(), intBox1.getItem());
        Pair<String, String> location = new Pair<>("Liverpool", "United Kingdom");
        System.out.println(rank);
        System.out.println(location);
        //findMax section
        Integer[] intArr = {1, 5, 99, 57, 46};
        String[] strArr = {"Kaide Gordon", "Bobby Clark", "Trent Kone-Doherty", "Rio Ngumoha", "Luke Chambers"};
        int maxInt = GenericUtils.findMax(intArr);
        String maxStr = GenericUtils.findMax(strArr);
        System.out.println("Max Integer: "+maxInt);
        System.out.println("Max String: "+maxStr);
        //double section
        Double[] testArr = {3.0, 4.7, 8.8, 2.2, 9.5};
        GenericUtils.swap(testArr, 1, 4);
        //<T> void printAll(T[] arr) —prints each element on its own line.
        System.out.println("After Swap: ");
        GenericUtils.printAll(testArr);

    }
}