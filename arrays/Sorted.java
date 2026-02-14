package arrays;

public class Sorted {
    public static boolean isSorted (int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    



    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        if(isSorted(numbers)){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
