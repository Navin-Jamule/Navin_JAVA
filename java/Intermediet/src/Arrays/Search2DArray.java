import java.util.Arrays;
public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 6, 7, 9, 0},
                {45, 99, -78, 44},
                {56, 87, 99, 55, 23}
        };
        int target = -70;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                if(arr[rows][col]==target){
                    return new int[]{rows,col};// returing rows and col of found element
                }
            }
        }
        return new int[]{-1,-1};// element not present
    }
}
