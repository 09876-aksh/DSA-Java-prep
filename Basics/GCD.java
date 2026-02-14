package Basics;

public class GCD {
//     public static int gcdBrute(int a,int b){
//         int min= Math.min(a,b);
//         int gcd=1;

//             for(int i = 1;i<min;i++){
//                 if(a % i==0 && b % i==0){
//                     gcd=i;
//                 }
//             }
//             return gcd;
//     }
//     public static void main(String[] args) {
//         System.out.println(gcdBrute(12, 18));
//     }
// }
        public static int gcd(int a, int b){
            while(b!=0){
                int temp =b;
                b=a%b;
                a=temp;
            }
            return a;
        }
        public static void main(String[] args) {
             System.out.println(gcd(12, 18));

        }
}