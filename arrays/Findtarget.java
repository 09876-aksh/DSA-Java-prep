package arrays;

public class Findtarget {
    public static int[] findTarget(int []arr){
        int target=15;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int current_sum=arr[left]+arr[right];
            if (current_sum==target){
                return new int[]{left,right};
            }
            else if(current_sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};

    }
public static void main(String[] args) {
    int[] number={1,2,3,5,7,10,11,15};
    
    findTarget(number);

    
}
}
