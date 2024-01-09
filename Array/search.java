public class search {
    
    public static int findElementIndex(int[] arr, int x) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the given element
            if (arr[i] == x) {
                // Return the index if found
                return i;
            }
        }
        
        // If the element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        int x = 3;

        // Find the index of the element in the array
        int result = findElementIndex(arr, x);

        // Print the result
        if (result != -1) {
            System.out.println("Element " + x + " found at index " + result);
        } else {
            System.out.println("Element " + x + " not found in the array");
        }
    }
}
