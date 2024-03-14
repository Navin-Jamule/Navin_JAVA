import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        sum();
        }
        static void sum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("the sum is "+sum);

        }
    }
