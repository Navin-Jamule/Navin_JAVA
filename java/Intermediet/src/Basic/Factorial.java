import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = facts(n);
        System.out.println("the factorial is " + result);

    }
    static int facts(int a){
        int sum = 1;
        for(int i = 1; i <= a;i++){
            sum = sum * i;
        }
        return sum;

    }
}
