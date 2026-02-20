package arrays;
//brute solution
//time : o(n**2)
//space : o(1)

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int currentSum = 0;

            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

//optimal solution
//time : o(n)
//space : o(1)
// public class MaxSubarrayOptimal {

//     public static int maxSubArray(int[] nums) {

//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;

//         for (int num : nums) {

//             currentSum += num;

//             maxSum = Math.max(maxSum, currentSum);

//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }

//         return maxSum;
//     }

//     public static void main(String[] args) {
//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//         System.out.println(maxSubArray(nums));
//     }
// }

