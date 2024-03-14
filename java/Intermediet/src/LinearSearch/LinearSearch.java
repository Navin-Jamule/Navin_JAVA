import java.util.Objects;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,8,4,3,7};
        int key = 20 ;
//        int ans = search(arr,key);
//        System.out.println("hey found the key at index "+ans);
        String[] name ={"navin","jamule","good","listner"};
        String word = "good";
        boolean ans = search(name,word);
        System.out.println(ans);
    }
    static boolean search(String[] a,String b){
        if(a.length == 0){
            return false;}

        int index = 0;
        for (; index < a.length-1; index++) {
            String bc  = a[index];
            if(Objects.equals(b, bc)){
                break;
            }
            else{
                return false;// element not exits
        }
    }
        return true;//returning the index where the elements where found
    }}




    // search for int type

//    static int search(int[] arr, int a){
//       if(arr.length == 0){
//           return -1;}
//
//        int index = 0;
//        for (; index < arr.length-1; index++) {
//            int element = arr[index];
//            if(arr[index]==a){
//                break;
//            }
//            else
//                return -1;// element not exits
//        }

        //return index;//returning the index where the elements where found


    //}
//}
