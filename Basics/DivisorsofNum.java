package Basics;

public class DivisorsofNum {
    public static void printDivisor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");

                if(i!=n/i){
                    System.out.println(n/1+" ");
                }
            }
        }
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             System.out.print(i+" ");
    //         }
    //     }
     }
    public static void main(String[] args) {
        printDivisor(7);
    }
}
