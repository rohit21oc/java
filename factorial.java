public class factorial {
    public static int factorials(int n) {
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;  
    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorials(n);
        int fact_r = factorials(r);
        int fact_nmr = factorials(n-r);
        int bincoeff = fact_n / (fact_r*fact_nmr);
        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.println(factorials(5));
        System.out.println(factorials(2));
        System.out.println(binCoeff(5, 2));
        
    }
}