// import java.util.Scanner;

// public class Except_mul_10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(n%10==0){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

import java.util.Scanner;

public class Except_mul_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Eneter the Number: ");
        int  n = sc.nextInt();
            if(n%10 ==0){
                continue;
            }
            System.out.println("Your Number is: " + n);
        }while(true);
    }
}