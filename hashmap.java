//import java.util.*;
//class q1{
//    public static void main(String args[]){
//        HashMap<String,Integer> map=new HashMap<>();
//        map.put("apple",2);
//        map.put("banana",5);
//        map.put("orange",3);
//        System.out.println("Intial mao: "+map);
//        System.out.println("apple count "+map.get("apple"));
//        System.out.println("grape count: "+map.getOrDefault("grape",0));
//        System.out.println("contains banana? "+map.containsKey("banana"));
//        System.out.println("contains kiwi? "+map.containsKey("kiwi"));
//        map.putIfAbsent("banana",10);
//        map.putIfAbsent("kiwi",4);
//        System.out.println("After putIfAbsent: " + map);
//        map.compute("orange",(key,val)->(val==null)?1:val+2);
//        map.compute("mango", (key, val) -> (val == null) ? 1 : val + 1);
//        System.out.println("After compute: " + map);
//        // 8. merge() – Insert or update with merging logic
//        map.merge("apple", 3, Integer::sum);  // apple = 2 + 3 = 5
//        map.merge("peach", 2, Integer::sum);  // peach = 2
//        System.out.println("After merge: " + map);
//
//        // 9. remove() – Delete key
//        map.remove("kiwi");
//        System.out.println("After removing 'kiwi': " + map);
//
//        // 10. keySet(), values(), entrySet()
//        System.out.println("\nKeys: " + map.keySet());
//        System.out.println("Values: " + map.values());
//
//        System.out.println("\nEntries:");
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//    }
//}

////HASHSET
//import java.util.*;
//class q2{
//    public static void main(String args[]){
//        HashSet<Integer> set=new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        System.out.println("HashSet after adding elements: "+set);
//        System.out.println(set.contains(1));
//        System.out.println(set.contains(45));
//        set.remove(4);
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//        Iterator<Integer> it=set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        for(int i: set){
//            System.out.println(i);
//        }
//    }
//}