import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,35};
        reverse(arr,0,arr.length-1);



    }
    //swaping index last with first and so on
    static void reverse(int[] a,int c ,int b){
        for (int i = c; i < b; i++) {
            int temp = a[c];
            a[c] = a[b];
            a[b] = temp;
            c++;
            b--;}
        System.out.println(Arrays.toString(a));

    }
}
