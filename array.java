////Rearrange array such that even positioned are greater than odd
//public class array {
//    public  static void main(String args[]){
//        int[] arr={100,45,55,5,16};
//        int n=arr.length;
//        int temp;
//        for(int i=1;i<n;i++){
//            if ((i + 1) % 2 == 0) {
//                if (arr[i] < arr[i - 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = temp;
//                }
//            }else{
//                if (arr[i] > arr[i - 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = temp;
//                }
//            }
//        }
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}

//Rearrange an array in maximum minimum form using Two Pointers:
//public class array {
//    public static void main(String args[]){
//        int[] arr={ 1, 2, 3, 4, 5, 6 };
//        int n = arr.length;
//        int[] temp=new int[n];
//        int small=0,big=n-1;
//        boolean flag=true;
//        for(int i=0;i<n;i++){
//            if(flag){
//                temp[i]=arr[big--];
//            }else{
//                temp[i]=arr[small++];
//            }
//            flag=!flag;
//        }
//        for (int num : temp) {
//            System.out.print(num + " ");
//        }
//    }
//}

////posible number of triangles

//
//class array {
//    // Function to count all possible triangles with arr[]
//    // values as sides
//    static int countTriangles(int[] arr) {
//        int res = 0;
//
//        // The three loops select three different values from
//        // array
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    // Sum of two sides is greater than the third
//                    if (arr[i] + arr[j] > arr[k] &&
//                            arr[i] + arr[k] > arr[j] &&
//                            arr[k] + arr[j] > arr[i]) {
//                        res++;
//                    }
//                }
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {4, 6, 3, 7};
//        System.out.println(countTriangles(arr));
//    }
//}

////Print all Distinct (Unique) Elements in given Array
//// Java program to print all distinct elements in an
//// array using sorting
//
//import java.util.Arrays;
//import java.util.ArrayList;
//
//class GfG {
//    static ArrayList<Integer> findDistinct(int[] arr) {
//        ArrayList<Integer> res = new ArrayList<>();
//        int n = arr.length;
//
//        // First sort the array so that all occurrences
//        // become consecutive
//        Arrays.sort(arr);
//
//        for (int i = 0; i < n; i++) {
//
//            // Store elements only if they are different
//            // from previous element
//            if (i == 0 || arr[i] != arr[i - 1]) {
//                res.add(arr[i]);
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
//
//        ArrayList<Integer> res = findDistinct(arr);
//        for (int ele : res) {
//            System.out.print(ele + " ");
//        }
//    }
//}