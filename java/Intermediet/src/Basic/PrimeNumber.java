import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(AimstrongNumber(num));

    }

    static boolean AimstrongNumber(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            int cube = rem * rem * rem;
            sum += cube;
        }
        if (sum == original){
            return true;
        }
        else
            return false;

    }
    static boolean PrimeNumber(int number){
        if (number <= 1){
            return false;
        }
        int c = 2;
        while (c * c  <= number) {
            if (number % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
