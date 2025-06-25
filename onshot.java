//class keyboard{
//    int keys;
//    String color="pink";
//    public keyboard(){
//        keys=100;
//    }
//    public void pressed(){
//        System.out.println("Signal send "+ color);
//    }
//}
//class Advkeyboard extends keyboard{
//    public void hitnum(){
//        System.out.println("send number");
//    }
//}
//class oopclass {
//    public static void main(String args[]){
//        int num;
//        num=8;
//        keyboard obj=new keyboard();
//        obj.pressed();
//        Advkeyboard obj1=new Advkeyboard();
//        obj1.pressed();
//        obj1.hitnum();
//    }
//}

//=========String =========
//class string {
//    public static void main(String args[]) {
//        // String is immutable
//        String s = "Anuska Palit";
//        String s2 = "Java";
//        String s3 = "  Hello World  ";
//
//        // 1. Length of the string
//        System.out.println("Length: " + s.length());
//
//        // 2. charAt()
//        System.out.println("Char at 2: " + s.charAt(2));
//
//        // 3. substring()
//        System.out.println("Substring(0, 6): " + s.substring(0, 6));
//
//        // 4. contains()
//        System.out.println("Contains 'Palit': " + s.contains("Palit"));
//
//        // 5. equals()
//        System.out.println("Equals 'Java': " + s.equals(s2));
//
//        // 6. equalsIgnoreCase()
//        System.out.println("EqualsIgnoreCase 'anuska palit': " + s.equalsIgnoreCase("anuska palit"));
//
//        // 7. toUpperCase()
//        System.out.println("Uppercase: " + s.toUpperCase());
//
//        // 8. toLowerCase()
//        System.out.println("Lowercase: " + s.toLowerCase());
//
//        // 9. trim()
//        System.out.println("Trimmed: '" + s3.trim() + "'");
//
//        // 10. replace()
//        System.out.println("Replace 'a' with 'X': " + s.replace('a', 'X'));
//
//        // 11. indexOf()
//        System.out.println("Index of 'P': " + s.indexOf('P'));
//
//        // 12. lastIndexOf()
//        System.out.println("Last index of 'a': " + s.lastIndexOf('a'));
//
//        // 13. startsWith()
//        System.out.println("Starts with 'Anu': " + s.startsWith("Anu"));
//
//        // 14. endsWith()
//        System.out.println("Ends with 'it': " + s.endsWith("it"));
//
//        // 15. isEmpty()
//        System.out.println("Is empty: " + s.isEmpty());
//
//        // 16. concat()
//        System.out.println("Concatenation: " + s.concat(" - Java Developer"));
//
//        // 17. split()
//        String[] parts = s.split(" ");
//        System.out.println("Split:");
//        for (String part : parts) {
//            System.out.println(part);
//        }
//
//        // 18. matches() with regex
//        System.out.println("Matches regex '.*Palit': " + s.matches(".*Palit"));
//
//        // 19. compareTo()
//        System.out.println("CompareTo 'Anuska': " + s.compareTo("Anuska"));
//
//        // 20. compareToIgnoreCase()
//        System.out.println("CompareToIgnoreCase 'anuska palit': " + s.compareToIgnoreCase("anuska palit"));
//
//        // 21. toCharArray()
//        char[] chars = s.toCharArray();
//        System.out.println("Char Array:");
//        for (char c : chars) {
//            System.out.print(c + " ");
//        }
//        System.out.println();
//
//        // 22. valueOf()
//        int num = 123;
//        String strNum = String.valueOf(num);
//        System.out.println("String value of 123: " + strNum);
//
//        // 23. intern()
//        String a = new String("hello").intern();
//        String b = "hello";
//        System.out.println("a == b: " + (a == b)); // true
//
//        // 24. format()
//        String formatted = String.format("Name: %s, Age: %d", "Anuska", 22);
//        System.out.println("Formatted: " + formatted);
//
//        // 25. join()
//        String joined = String.join("-", "2025", "06", "16");
//        System.out.println("Joined: " + joined);
//
//        // 26. repeat() - Java 11+
//        System.out.println("Repeat: " + s2.repeat(3));
//    }
//}
////=========Array=========
//class array {
//    static void reverseArray(int[] arr) {
//        int left = 0, right = arr.length - 1;
//        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++; right--;
//        }
//        System.out.println("After reversal");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String args[]) {
//
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println("Original array:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        int n = 2, value = 10; // insert value 10 at index 2
//        int[] newarr = new int[arr.length + 1]; // size = 6
//
//        int k = 0;
//        for (int i = 0; i < newarr.length; i++) {
//            if (i == n) {
//                newarr[i] = value;
//            } else {
//                newarr[i] = arr[k];
//                k++;
//            }
//        }
//
//        System.out.println("After insertion:");
//        for (int i = 0; i < newarr.length; i++) {
//            System.out.print(newarr[i] + " ");
//        }
//        reverseArray(arr);
//    }
//}
