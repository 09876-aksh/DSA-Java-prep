package Basics;

public class Palindrome {
    public static int palindrome(int n){
        int reverse=0;
        while(n>0){
            int lastdigit = n%10;
            reverse = reverse * 10 + lastdigit;
            n =n/10;
        }
        
        return reverse;
    }
    public static void main(String[] args) {
        int n=121;
        int reverse=palindrome(n);
        if(reverse==n){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("the number is not a palindrome");
        }
        
    }
}
