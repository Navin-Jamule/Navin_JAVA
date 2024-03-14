import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = odd_even(n);
        System.out.println(result);

    }
    static String odd_even(int n){
        if(n % 2 == 0)
            return "even";
        else
            return "odd";
    }
}
