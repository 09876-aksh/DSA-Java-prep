package arrays;
//brute solution
//time : o(n**2)
//space : o(1)

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

//better solution
//time : o(n)
//space : o(n)

// import java.util.HashMap;

// public class MajorityBetter {

//     public static int majorityElement(int[] nums) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int n = nums.length;

//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if (map.get(num) > n / 2) {
//                 return num;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(nums));
//     }
// }


// //optimal solution
// //time : o(n)
// //space : o(1)

// public class MajorityOptimal {

//     public static int majorityElement(int[] nums) {

//         int candidate = 0;
//         int count = 0;

//         for (int num : nums) {

//             if (count == 0) {
//                 candidate = num;
//             }

//             if (num == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }

//         return candidate;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(nums));
//     }
// }
