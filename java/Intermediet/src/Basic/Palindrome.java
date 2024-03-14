import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = check(n);
        System.out.println(n +" "+result);

    }

    static String check(int x){
        int reverse = 0;
        int  temp = x;
        while (temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp/10;
        }
        if (reverse == x)
            return "palindrome";
        else
            return "not palindrome";
    }
}
