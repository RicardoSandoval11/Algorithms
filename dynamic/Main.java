package dynamic;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
        System.out.println("Empty: "+dynamicArray.isEmpty());
        System.out.println("Size: "+dynamicArray.size());
        System.out.println("Capacity: "+dynamicArray.capacity());
        System.out.println("Searched index: "+dynamicArray.search("C"));
        System.out.println(arrayList);
    }
}
