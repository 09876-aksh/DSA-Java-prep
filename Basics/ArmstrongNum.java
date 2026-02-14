package Basics;

public class ArmstrongNum {
    public static boolean isarmStrong(int n){
        int original =n;
        int lastdigit=0;
        int sum=0;
        int count=0;
        
        int temp=n;
        while(temp>0){
            temp/=10;//remove one digit
            count++;//increase the count
        }
        temp=n;
        while(temp>0){
         lastdigit =temp%10;
         sum+=Math.pow(lastdigit,count);
         temp/=10;
        }
    return sum == original;       
    }

    public static void main(String[] args) {
        int number=9474;
        if(isarmStrong(number)){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong");
        }

    }
}
