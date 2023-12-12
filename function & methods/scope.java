public class scope {
    public static void prints(){
        int s=45;
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println(s);//It will give error
    }
    {
        int s=40;
        System.out.println(s);
    }
    System.out.println(s) //It will give error

    for(int i=1;i<10;i++){
        
    }
    System.out.println(i)//It will give error
}

