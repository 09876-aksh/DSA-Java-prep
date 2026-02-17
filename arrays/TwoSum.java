package arrays;
//brute solution
//time:o(n**2)
//space:o(1)

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;

        int [] result=twoSum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }
}

// better solution
// Sorting → O(n log n)
// Two pointer scan → O(n)
// Total → O(n log n)

// import java.util.*;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;

//         int[][] arr = new int[n][2];

//         for(int i = 0; i < n; i++) {
//             arr[i][0] = nums[i];
//             arr[i][1] = i;
//         }

//         Arrays.sort(arr, (a, b) -> a[0] - b[0]);

//         int left = 0;
//         int right = n - 1;

//         while(left < right) {
//             int sum = arr[left][0] + arr[right][0];

//             if(sum == target) {
//                 return new int[]{arr[left][1], arr[right][1]};
//             }
//             else if(sum < target) {
//                 left++;
//             }
//             else {
//                 right--;
//             }
//         }

//         return new int[]{};
//     }
// }



//optimal solution
// Time: O(n)
// Space: O(n)
// import java.util.*;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i < nums.length; i++) {
//             int required = target - nums[i];

//             if(map.containsKey(required)) {
//                 return new int[]{map.get(required), i};
//             }

//             map.put(nums[i], i);
//         }

//         return new int[]{};
//     }
// }


