public class prime_in_renge {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void rangeInPrime(int n){
        for(int i=1;i<=n;i++){
            // System.out.println(i);
            if(isPrime(i)){
                System.out.print(i +" ");
            }
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(10));
        rangeInPrime(100);

    }
}