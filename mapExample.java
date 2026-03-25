public class mapExample {
    public static void main(String[] args) {
        // A Map is a collection that maps keys to values, where each key is unique and maps to a single value.
        // It is part of the Java Collection Framework and implements the Map interface.
        // A Map does not allow duplicate keys, but it can have duplicate values.
        // The most commonly used implementations of the Map interface are HashMap, TreeMap, and LinkedHashMap.

        // In a Map, you can perform various operations such as adding key-value pairs, retrieving values based on keys,
        // removing key-value pairs, and checking if a key or value exists in the map.

        // Common methods in the Map interface include:
        // put - to add a key-value pair to the map
        // get - to retrieve a value based on a key
        // remove - to remove a key-value pair based on a key
        // containsKey - to check if a key exists in the map
        // containsValue - to check if a value exists in the map
        // keySet - to get a set of all keys in the map
        // values - to get a collection of all values in the map
        //entrySet - to get a set of all key-value pairs in the map
        //size - to get the number of key-value pairs in the map
        //clear - to remove all key-value pairs from the map

        // Example using HashMap
        java.util.Map<Integer, String> map = new java.util.HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        System.out.println("Map: " + map);

        // Retrieving a value based on a key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Removing a key-value pair
        map.remove(3);
        System.out.println("Map after removing key 3: " + map);

        // Checking if a key exists in the map
        boolean containsKey = map.containsKey(4);
        System.out.println("Map contains key 4: " + containsKey);

        // Checking if a value exists in the map
        boolean containsValue = map.containsValue("Banana");
        System.out.println("Map contains value 'Banana': " + containsValue);

        // Iterating through the keys and values in the map
        System.out.println("Keys in the Map: ");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.println("Values in the Map: ");
        for (String val : map.values()) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Key-Value pairs in the map: " + map.entrySet());
        System.out.println("Size of the Map: " + map.size());
        map.clear();
        System.out.println("Map after clear: " + map);
    }
}
