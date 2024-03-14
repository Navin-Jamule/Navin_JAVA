import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String result = voting(age);
        System.out.println(age +" " +result);
    }
    static String voting(int a){
        if (a >= 18)
            return "you are eligible";
        else
            return "you are not eligible";
    }
}
