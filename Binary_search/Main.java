package Binary_search;

public class Main {
    
    public static void main(String[] args) {
        
        int array[] = new int[1000000];
        int target = 865432;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if(index != -1){
            System.out.println("Element found at index: "+index);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] array, int target) {

        int min = 0;
        int max = array.length - 1;

        while(min <= max){

            int mid = min + (max-min)/2;

            if(array[mid] == target){
                return mid;
            }

            if(array[mid] < target){
                min = mid + 1;
            }

            if(array[mid] > target){
                max = mid - 1;
            }
        }
        return -1;
    }
}
