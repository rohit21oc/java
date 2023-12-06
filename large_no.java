import java.util.Scanner;

public class large_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A>=B && A>=B){
            System.out.println("Largest number is A");
        }
        else if(B>=C){
            System.out.println("B is greatest value");
        }
        else{
            System.out.println("C is gratest number");
        }
    }
}
