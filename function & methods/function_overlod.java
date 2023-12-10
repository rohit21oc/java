/**
 * function_overlod
 */
// function to calc sum of 2 num
public class function_overlod {
    public static int sum(int a, int b){
        return a+b;
    }
    // function to calc sum of 3 num
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        
    }
}