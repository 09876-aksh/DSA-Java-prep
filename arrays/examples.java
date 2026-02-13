//O(N)

package arrays;

public class examples {

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(linearSearch(numbers, 30));
    }
}


