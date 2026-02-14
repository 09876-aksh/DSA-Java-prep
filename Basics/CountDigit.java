package Basics;

public class CountDigit {
    public static int countDigit(int n){
        
        int count=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            n=n/10;//remove one digit
            count++;//increase the count
        }
        return count;//return the value
        
    }
    public static void main(String[] args) {
        int numbers=12345;
        System.out.println(countDigit(numbers));
    }
}
