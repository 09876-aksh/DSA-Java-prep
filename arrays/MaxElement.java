package arrays;

// Problem: Find Maximum Element
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

// public class MaxElement {
//     public static void main(String[] args) {
//         int[] arr = {3, 7, 2, 9, 5};
//         int max = arr[0];

//         for(int i = 1; i < arr.length; i++) {
//             if(arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.println("Maximum element: " + max);
//     }
// }

import java.util.Arrays;

public class MaxElement {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8};

        Arrays.sort(arr);

        System.out.println("Largest: " + arr[arr.length - 1]);
    }
}

