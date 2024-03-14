public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};

        int ans = maxrange(arr,0,2);
        System.out.println(ans);
//        int result = max(arr);
//        System.out.println(result);
    }

    static int maxrange(int[] arr, int a,int b){
        int max = 0;
        for (int i = a; i < b; i++) {
            if (max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int max(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {

            if(max <= a[i])
                max = a[i];
        }
        return max;
    }
}
