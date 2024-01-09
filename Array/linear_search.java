
/**
 * linear_search
 */
public class linear_search {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {12,15,27,10,33,26};
        int key = 10;
        int index = linearSearch(numbers, key);
        // System.out.println(index);
        if(index == -1){
            System.out.print("Not found");
        }
        else{
            System.out.print("Key is at index: "+ index);
        }
    }
}