public class largestnum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;

    }
    public static void main(String[] args) {
        int numbers[] = {10,27,70,90,24,64};
        int largest = getLargest(numbers);
        System.out.println(largest);
        
    }
}

