package arrays;

public class LeftRotatebyOne {
    public static void rotate(int[] arr){
        if(arr.length<=1){
            return;
        }
        int first=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        rotate(arr);

        for(int num:arr){
        System.out.println(num);
        }
    }
}
