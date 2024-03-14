public class Swap {
    public static void main(String[] args) {






    }
    static void greet(String naam){
        System.out.println("kya bolte bhai "+naam);
    }
    static int swap(int a , int b){
        int temp = a ;
        a = b ;
        b = temp;
        System.out.println(a+ " "+ b);
        return temp;
    }
}
