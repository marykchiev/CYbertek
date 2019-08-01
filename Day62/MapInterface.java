package Day62;

import java.util.*;

public class MapInterface {

  public static void main(String[] args) {
    
    
    /**
     * An object that maps keys to values. 
     * A map cannot contain duplicate keys; 
     * each key can map to at most one value.
     *  * 
     *      Map
     *         General Implementation  -- HashMap
     *    
     *        SortedMap     extends Map interface
     *      NavigatableMap  extends SortedMap interface  
     *        TreeMap      implements NavigatableMap
     *  
     *  Legacy class  Hashtable 
     */
    
    //-------------Map Interface Methods ------------------
    
    Map<String, Double> priceMap = new HashMap<>();     
    
    // Hashmap store key value pair and it does not maintain insertion order , sorted order 
    
        //    int size();
    System.out.println( "priceMap size : " + priceMap.size() );
    
    //    V put(K key, V value);
    priceMap.put("Cucumber", 4.12) ; 
    priceMap.put("Potato", 3.02) ; 
    priceMap.put("Tomato", 7.1) ; 
    priceMap.put("Celery", 1.2) ; 
    priceMap.put("Corn", 0.99) ;
    
    priceMap.put("Tomato", 3.99) ; 
    
    System.out.println(  priceMap  );
    
    System.out.println( "priceMap size : " + priceMap.size() );
    
    //    V get(Object key);
    Double potatoPrice = priceMap.get("Potato"); 
    System.out.println(" my Potato price is  : " + potatoPrice );
    // if not found return null 
    System.out.println(" my banana price is  : " + priceMap.get("Banana") );
        
    //    boolean isEmpty();
    System.out.println("Is my map empty ? : " + priceMap.isEmpty());
    
    //    boolean containsKey(Object key);
    System.out.println("So we have  banana? : " + priceMap.containsKey("banana")    );
    System.out.println("So we have  Potato? : " + priceMap.containsKey("Potato")    );

        //    boolean containsValue(Object value);
    System.out.println( "do we have price value 3.02 ? : " + priceMap.containsValue(3.02) );
    System.out.println( "do we have price value 99.02 ? : " + priceMap.containsValue(99.02) );
    
    
    //    V remove(Object key);
        //    void putAll(Map<? extends K, ? extends V> m);
        //    void clear();

        //    Set<K> keySet();        
        //    Collection<V> values();
        //    Set<Map.Entry<K, V>> entrySet();
        
        // V putIfAbsent(K key, V value)
    
        // V getOrDefault(Object key, V defaultValue)
        // boolean remove(Object key, Object value)
        // boolean replace(K key, V oldValue, V newValue)
        // V replace(K key, V value)
    
    
    
    
    

  }

}


