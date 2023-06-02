import java.util.Hashtable;

public class Main{

    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<Integer, String>(10);
        
        table.put(100, "Bob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        System.out.println(table.get(100));

    }
}