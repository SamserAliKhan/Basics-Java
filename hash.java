import java.util.HashMap;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        //creating a hashmap whth key(String) and value(Integer)
        //creat
        HashMap <String, Integer> map = new HashMap<>();

        //adding elements to the hashmap
        //update
        map.put("India", 12);
        map.put("USA", 13);
        map.put("UK", 14);
        System.out.println(map);

        //Read
        //cheack if the key is present in the hashmap
        //map.containsKey(key) => reutens boolean value
        if(map.containsKey("India"))
            System.out.println("India is present in the hashmap");
        else
            System.out.println("India is not present in the hashmap");
        
        //get the value of the key
        //map.get(key) => returns the value of the key
        System.out.println("The value of India is: " + map.get("India"));

        //delete a key from the hashmap
        //map.remove(key) => removes the key and value from the hashmap
        map.remove("UK");

        System.out.println(map);

        //itaerate over the hashmap
        //Map.Entry<key,valuue>e:map.entrySet() => returns a set of entries
        //e.getKey() => returns the key of the entry
        //e.getValue() => returns the value of the entry
        for (HashMap.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        //map.entrySet() => returns a set of entries i.e, key-value pairs

        //get all the keys from the hashmap
        //map.keySet() => returns a set of keys
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}