import java.util.*;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer, String>map=new HashMap<>();
        map.put(1, "APPLE");
        map.put(2, "BANANA");
        map.put(3, "CHERRY");
        map.put(4, "DATE");
        map.put(5, "ELDERBERRY");
        map.put(6, "FIG");
        map.put(7, "GRAPE");
        map.put(8, "HONEYDEW");
        map.put(9, "KIWI");
        map.put(10, "LEMON");
        
        System.out.println("Get value with key5:"+map.get(5));
        System.out.println("contains key7?"+map.containsKey(7));
        System.out.println("contains value 'FIG'?"+map.containsValue("FIG"));
        System.out.println("Contains value 'DATE'?"+map.containsValue("DATE"));
        map.remove(3);

        System.out.println("is hashmap empty?"+map.isEmpty());
        System.out.println("\nPrinting using entryset:");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        System.out.println("\nPrinting using keyset:");
        for(Integer key: map.keySet()){
            System.out.println(key+"->"+map.get(key)); 
        }          

    }

}
