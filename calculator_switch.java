import java.util.Scanner;

public class calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a: ");
        int a = sc.nextInt();
        System.out.print("Enetr b: ");
        int b = sc.nextInt();
        System.out.print("Enetr operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println("a+b: "+(a+b));
                break;
            case '-': System.out.println("a-b: "+(a-b));
                break;
            case '*': System.out.println("a*b: "+(a*b));
                break;
            case '/': System.out.println("a/b: "+(a/b));
                break;
            case '%': System.out.println("a%b: "+(a%b));
                break;
            default:System.out.println("Wrong operator");
                break;
        }
    }
}
