package BinarySearch;

public class FirstLastOccurence_leetcode34 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int first = BinarySearch(nums,target,true);
        int last = BinarySearch(nums,target,false;

        ans[0] = first;
        ans[1] = last;

        return ans
    }

    static int BinarySearch(int[] a, int target, boolean FirstOccure) {
        int start = 0;                              // starting from index zero
        int end = a.length - 1;                     // ending at length - 1 of array
        int ans = -1;
        while (start <= end) {                      // flowing this till the last element in array is one. start = end

            int mid = start + (end - start) / 2;    // calculate the middle index

            if (target > a[mid]) {                       // element on right side . start = mid + 1 and remain same
                start = mid + 1;
            } else if (target < a[mid]) {               // element on left side . reduce end and start remain same
                end = mid - 1;
            } else {
                if (FirstOccure == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

}
