package BinarySearch;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        int[] arr = {-12,-10,-3 ,0,1, 5, 7, 8, 9, 45, 99, 555};
        int[] a = {99,54,23,12,10,4,0,-1,-9};
        int target = 0;
        int incresing = OrderAgnostic(arr,target);
        int deacring = OrderAgnostic(a,target);
        System.out.println("increasing order "+incresing);
        System.out.println("deacrsing order "+deacring);

    }
    static int OrderAgnostic(int[] arr,int target){
        int start = 0;                              // starting from index zero
        int end = arr.length - 1;                     // ending at length - 1 of array

        boolean order;// checking order of the  array
        if(arr[start]<arr[end]) //increasing order
            order = true;
        else
            order = false;  //deacring order

        while (start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target)
                return mid;
            //increasing order. order == true increasing order
            if(order){
                if (target > arr[mid]) {                       // element on right side . start = mid + 1 and remain same
                    start = mid + 1;
                }
                else  {               // element on left side . reduce end and start remain same
                    end = mid - 1;
                }
            }
            //decresing order. order == false deacrsing order
            else {
                if (target > arr[mid]) {                       // element on left side . end = mid - 1 and remain same
                    end = mid - 1;
                }
                else {               // element on right  side . reduce end and start remain same
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

