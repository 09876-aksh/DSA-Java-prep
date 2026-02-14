package Basics;

public class ReverseNum {
    public static int reverseNum(int n){
        int reverse=0;
        while(n>0){
            int lastdigit = n%10;
            reverse = reverse * 10 + lastdigit;
            n =n/10;
        }
        
        return reverse;
    }


    public static void main(String[] args) {
        int n=123;
        int reverse=reverseNum(n);
        System.out.println(reverse);
    }
    
}
