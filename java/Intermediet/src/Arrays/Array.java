import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {



        // this for primatives datatypes
       int[] arr = new int[5];
        // taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
        //printing output
//        for (int j : arr) {
//            System.out.println(j);
//        }



        //array of objects
//        String[] str = new String[5];
//        for (int i = 0; i < str.length; i++) {
//            str[i]=in.next();
//        }
//        System.out.println(Arrays.toString(str));

    }
    static void change(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

    }

}
