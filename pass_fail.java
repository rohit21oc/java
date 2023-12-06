import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        // int marks = 64;
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String reportCard = (marks >=33)? "PASS":"FAIL";
        System.out.println(reportCard);
    }
}
