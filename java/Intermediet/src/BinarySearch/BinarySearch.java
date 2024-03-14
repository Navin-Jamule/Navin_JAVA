public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-12,-10,-3 ,0,1, 5, 7, 8, 9, 45, 99, 555};
        int target = 0;
        int result = BinarySearch(arr, target);
        System.out.println(result);
    }
    //increasing order array binary search
    static int BinarySearch(int[] a, int target) {
        int start = 0;                              // starting from index zero
        int end = a.length - 1;                     // ending at length - 1 of array

        while (start <= end) {                      // flowing this till the last element in array is one. start = end

            int mid = start + (end - start) / 2;    // calculate the middle index

            if (target > a[mid]) {                       // element on right side . start = mid + 1 and remain same
                start = mid + 1;
            }
            else if (target < a[mid]) {               // element on left side . reduce end and start remain same
                end = mid - 1;
            }
            else {
                return mid;                        // this refer to target == mid which return answer which is mid
            }                                      // which return index of element
        }
        return -1;                              // element not present in array
    }

    //decreassing order binary search
    static int DeareaasingOrderBinarySearch(int[] a, int target) {
        int start = 0;                              // starting from index zero
        int end = a.length - 1;                     // ending at length - 1 of array

        while (start <= end) {                      // flowing this till the last element in array is one. start = end

            int mid = start + (end - start) / 2;    // calculate the middle index

            if (target > a[mid]) {                       // element on right side . start = mid + 1 and remain same
                end = mid - 1;
            }
            else if (target < a[mid]) {               // element on left side . reduce end and start remain same
                start = mid + 1;
            }
            else {
                return mid;                        // this refer to target == mid which return answer which is mid
            }                                      // which return index of element
        }
        return -1;                              // element not present in array
    }
}



