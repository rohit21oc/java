public class type_promotion {
    public static void main(String[] args) {
        byte a = 10;
        int b = 15;
        float c = 10.25f;
        long d =25;
        double e = a+b+c+d;
        int e1 = (int) (a+b+c+d);
        System.out.println("Double:"+e+ "\nint:"+e1);

        char ch = 'a';
        char ch1 = 'b';
        // int sub = (int)(ch1 - ch);
        // System.out.println(sub);
        char sum = (char)(ch1 + ch);
        System.out.println(sum);
    }
}
