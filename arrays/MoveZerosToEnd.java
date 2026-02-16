package arrays;

public class MoveZerosToEnd {

    public static void moveZeroes(int[] arr) {

        int n = arr.length;
        int j = 0; // position for non-zero

        // Step 1: Move non-zero elements forward
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill remaining with zeros
        while(j < n) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

