import java.util.Scanner;

public class type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 25.99f;
        int b = (int)a;
        System.out.println(b);
        char ch = 'b';
        int ch1 = ch;
        System.out.println(ch1);
        char ch2 = 'c';
        int ch3 = ch2;
        System.out.println(ch3);


    }
}
