import java.util.*;

public class HashmapPractice{
    public static void main(String[] args) {
        // prints in order
        LinkedHashMap<String,Integer> map= new LinkedHashMap();
        map.put("anbu",1519);
        map.put("selvan",4777);
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("");
        
        // prints in random based on hashvalue
        HashMap<String,Integer> map2= new HashMap();
        map2.put("anbu",1519);
        map2.put("selvan",4777);
        map2.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("");

        // thread-safe
        Hashtable<String,Integer> map3= new Hashtable();
        map3.put("anbu",1519);
        map3.put("selvan",4777);
        map3.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}