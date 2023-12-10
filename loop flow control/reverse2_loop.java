public class reverse2_loop {
    public static void main(String[] args) {
        int n = 10889;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            n /=10;
            rev =(rev*10)+lastDigit;
        }
        System.out.println(rev);
    }
}