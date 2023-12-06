import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18 && age<=60){
            System.out.println("Adult");
        }
        else if(age>=16 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Note Adult");
        }
    }
}
