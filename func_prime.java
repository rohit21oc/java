public class func_prime {
    public static boolean isPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeINrenge(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println(isPrime(12));
        primeINrenge(20);
        
    }
}