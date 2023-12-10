import java.util.Scanner;

public class fn_multi {
    public static int prod_multi(int a,int b){
        int multi = a*b;
        return multi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println(prod_multi(a,b));
        }


        
    }