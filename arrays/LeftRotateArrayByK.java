package arrays;

public class LeftRotateArrayByK {

    public static void rotateByOne(int[] arr) {
        int first = arr[0];

        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = first;
    }

    public static void rotate(int[] arr, int k) {

        int n = arr.length;

        // Important: handle k > n
        k = k % n;

        for(int i = 0; i < k; i++) {
            rotateByOne(arr);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(arr, k);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}


