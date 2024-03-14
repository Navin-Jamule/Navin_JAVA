import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2,n3;
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        int[] result = Max_Min(n1,n2,n3);
        int max = result[0];
        int min = result[1];
        System.out.println("max no is "+max);
        System.out.println("min no is "+min);


    }
    static int[] Max_Min(int a , int b, int c) {
        int ans =max(a, b, c);
        int ans2 =  mix(a, b, c);
        int[] result = {ans,ans2};
        return result;

    }
    static int max(int a ,int b, int c){
        if (a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;
    }

    static int mix(int a ,int b, int c){
        if (a<b && a<c)
            return a;
        else if (b<a && b<c)
            return b;
        else
            return c;
    }
}
