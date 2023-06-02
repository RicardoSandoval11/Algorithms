package Linear_search;

public class Main {
    
    public static void main(String[] args) {
        /*
         * linear search = Iterate through a collection one element at a time
         * 
         * rintime complexity: O(n)
         * Disadvantages:
         * Slow for large data sets
         * 
         * Advantages:
         * Fast for searching of small to medium data sets
         * Does not need to sorted
         * Useful for data structures that do not have random access (Linked List)
         */

        int[] array = {1,23,5,12,543,12,54,68,34,76};

        int index = linearSearch(array, 100);

        if(index != -1){
            System.out.println("Element found at index: "+index);
        }else{
            System.out.println("Element not found");
        }
        
    }

    private static int linearSearch(int[] array, int value) {
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
