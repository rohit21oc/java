import java.util.Scanner;

public class switch_statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 3:");
        int number = sc.nextInt();
        
        // int number = 2;
        switch(number){
            case 1:System.out.println("Apple");
            break;
            case 2:System.out.println("Mango");
            break;
            case 3:System.out.println("Orange");
            break;
            default:System.out.println("Out of stock");
        }
    }
}
