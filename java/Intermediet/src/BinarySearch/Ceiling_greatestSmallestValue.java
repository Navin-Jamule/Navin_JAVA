package BinarySearch;

public class Ceiling_greatestSmallestValue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        //int ans = Celing(arr,target);
        int ans =floor(arr,target);
        System.out.println(ans);

    }
    //ceiling of the number
    //smallest number number greater than equal to  target
    static int Celing(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target<arr[mid]) {
                end = mid-1;
            }
            else
                return mid;

        }
        return start;
    }

    // floor of the number
    //smallest number smaller or = to target
    static int floor(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target<arr[mid]) {
                end = mid-1;
            }
            else
                return mid;

        }
        return end;
    }
}

