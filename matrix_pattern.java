/**
 * matrix_pattern
 */
public class matrix_pattern {
    public static void hollow_rectangle(int totrow,int totcoln){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcoln;j++){
                if(i==1||i==totrow||j==1||j==totcoln){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
        
    }
}