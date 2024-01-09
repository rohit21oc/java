/**
 * binarySearch
 */
public class binarySearch {
    public static int binarysearchtech(int numbers[], int key){
        int start = 0;
        int end = numbers.length -1;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] ={10,15,20,25,30,35,40,45,50,55,60,65,70,75};
        int key =75;
        int index = binarysearchtech(numbers, key);
        // System.out.println("index key is at: "+index);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("index key is at: "+ index);
        }

        
    }
}