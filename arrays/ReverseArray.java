package arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }


    }

    public static void main(String[]args){
        int numbers[]={1,2,3,4};
        reverseArray( numbers );

        for(int num: numbers ){
        System.out.print(num +" ");
        }
    }

    
}

//for (int i = 0; i < numbers.length; i++) {
//int num = numbers[i];
//}

