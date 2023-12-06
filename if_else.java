import java.util.Scanner;

public class if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Now you are Adult so You can Vote,Drive etc.");
        }
        if(age>=16 && age<18){
            System.out.println("Now you are Teenager so You can't Vote,Drive etc.");
        }
        // if(age>=60 && age<120){
        //     System.out.println("You are old man you can't drive, but you can vote");
        // }
        // if(age>120){
        //     System.out.println("Invalid age");
        // }
         else{
            System.out.println("Not adult");
        }

    }
}