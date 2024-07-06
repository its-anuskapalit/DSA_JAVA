//============HASHING=================================================================
////CHAINING
import java.util.LinkedList;

class HashTable {
   // A class to represent an entry in the hash table
   private static class HashNode {
       String key;
       int value;

       // Reference to the next node
       HashNode next;

       // Constructor
       public HashNode(String key, int value) {
           this.key = key;
           this.value = value;
       }
   }

   // Size of the hash table
   private int capacity;

   // Array of linked lists (buckets)
   private LinkedList<HashNode>[] buckets;

   // Constructor
   public HashTable(int capacity) {
       this.capacity = capacity;
       buckets = new LinkedList[capacity];

       // Initialize each bucket as an empty linked list
       for (int i = 0; i < capacity; i++) {
           buckets[i] = new LinkedList<>();
       }
   }

   // Hash function to map a key to an index
   private int getBucketIndex(String key) {
       int hashCode = key.hashCode();
       return Math.abs(hashCode % capacity);
   }

   // Insert a key-value pair into the hash table
   public void put(String key, int value) {
       int bucketIndex = getBucketIndex(key);
       LinkedList<HashNode> bucket = buckets[bucketIndex];

       // Check if the key already exists
       for (HashNode node : bucket) {
           if (node.key.equals(key)) {
               node.value = value;  // Update the value
               return;
           }
       }

       // If the key does not exist, create a new node and add it to the bucket
       HashNode newNode = new HashNode(key, value);
       bucket.add(newNode);
   }

   // Retrieve the value associated with a key
   public Integer get(String key) {
       int bucketIndex = getBucketIndex(key);
       LinkedList<HashNode> bucket = buckets[bucketIndex];

       // Search for the key in the bucket
       for (HashNode node : bucket) {
           if (node.key.equals(key)) {
               return node.value;  // Return the value if the key is found
           }
       }

       return null;  // Return null if the key is not found
   }

   // Remove a key-value pair from the hash table
   public void remove(String key) {
       int bucketIndex = getBucketIndex(key);
       LinkedList<HashNode> bucket = buckets[bucketIndex];

       // Search for the key in the bucket
       HashNode toRemove = null;
       for (HashNode node : bucket) {
           if (node.key.equals(key)) {
               toRemove = node;
               break;
           }
       }

       if (toRemove != null) {
           bucket.remove(toRemove);  // Remove the node if the key is found
       }
   }

   // Main method for testing
   public static void main(String[] args) {
       HashTable hashTable = new HashTable(10);

       hashTable.put("key1", 1);
       hashTable.put("key2", 2);
       hashTable.put("key3", 3);

       System.out.println(hashTable.get("key1")); // Output: 1
       System.out.println(hashTable.get("key2")); // Output: 2
       System.out.println(hashTable.get("key3")); // Output: 3

       hashTable.remove("key2");

       System.out.println(hashTable.get("key2")); // Output: null
   }
}
//==============================================================================================================
import java.util.HashSet;
class HashSetExample{
   public static void main(String args[]){
       HashSet<String> set=new HashSet<>();
       set.add("Apple");
       set.add("Banana");
       set.add("Cherry");
       set.add("Date");
       System.out.println("HashSet: " + set);
       boolean containsApple = set.contains("Apple");
       System.out.println("Contains 'Apple': " + containsApple);
       set.remove("Date");
       System.out.println("After removing 'Date': " + set);
       System.out.println("Iterating through HashSet:");
       for (String fruit : set) {
           System.out.println(fruit);
       }
   boolean isEmpty = set.isEmpty();
       System.out.println("Is the HashSet empty? " + isEmpty);
   int size = set.size();
       System.out.println("Size of the HashSet: " + size);
       set.clear();
       System.out.println("After clearing the HashSet: " + set);
   int newSize = set.size();
       System.out.println("Size of the HashSet after clearing: " + newSize);
}

}

//==================================================================================================

import java.util.HashMap;
import java.util.Map;

class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);
        System.out.println("HashMap: " + map);

        // Accessing a value using its key
        int appleValue = map.get("Apple");
        System.out.println("Value for 'Apple': " + appleValue);

        // Checking if the HashMap contains a specific key
        boolean containsApple = map.containsKey("Apple");
        System.out.println("Contains key 'Apple': " + containsApple);

        // Checking if the HashMap contains a specific value
        boolean containsValue20 = map.containsValue(20);
        System.out.println("Contains value 20: " + containsValue20);

        // Removing a key-value pair from the HashMap
        map.remove("Date");
        System.out.println("After removing 'Date': " + map);

        // Iterating through the HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting the size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size);

        // Checking if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the HashMap empty? " + isEmpty);

        // Clearing all key-value pairs from the HashMap
        map.clear();
        System.out.println("After clearing the HashMap: " + map);

        // Checking the size of the HashMap after clearing
        int newSize = map.size();
        System.out.println("Size of the HashMap after clearing: " + newSize);
    }
}
