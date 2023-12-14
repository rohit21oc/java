public class half_pyramid_num {
    public static void half_pyramid_number(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            // System.out.println(i);
        }
    }
    public static void main(String[] args) {
        half_pyramid_number(5);
        
    }
}
