import java.util.Scanner;

public class parameter {
    public static int parameters(int num1,int num2) {
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = parameters(a,b);
        System.out.println("Sum is: "+ sum);
        
        
        
    }
}
