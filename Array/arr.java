import java.util.Scanner;

/**
 * arr
 */
public class arr {

    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy: " +marks[0]);
        System.out.println("Chem: " +marks[1]);
        // System.out.println("Math: " +marks[2]);
        // marks[2] = marks[2] + 2;
        System.out.println("Math: " +marks[2] +"+" + 2 + "(Gress Marks)");
    }
}