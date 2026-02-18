package arrays;
import java.util.Arrays;

public class sort012 {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 🔥 Main function
    
    public static void main(String[] args) {

        sort012 sol = new sort012();

        int[] nums = {2, 0, 2, 1, 1, 0};

        sol.sortColors(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}



