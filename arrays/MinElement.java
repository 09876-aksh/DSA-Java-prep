// Problem: Find Minimum Element
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

package arrays;

public class MinElement {
    public static void main(String[]args){
        int []arr={4,6,7,3};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]<min){
            min=arr[i];
           }
        }
        System.out.println("minimum element = "+min);
    }
    
}
