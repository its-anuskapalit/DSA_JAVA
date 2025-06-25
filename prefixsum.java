//import java.util.ArrayList;
//
//public class prefixsum {
//    static ArrayList<Integer> findPrefixSum(int[] arr){
//        int n=arr.length;
//        ArrayList<Integer> prefix=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            prefix.add(0);
//        }
//        prefix.set(0,arr[0]);
//        for(int i=1;i<n;i++){
//            prefix.set(i,prefix.get(i-1)+arr[i]);
//        }
//        return prefix;
//    }
//    public static void main(String args[]){
//        int[] arr={10,20,30,40,50};
//        ArrayList<Integer> prefix=findPrefixSum(arr);
//        for(int i: prefix){
//            System.out.println(i+" ");
//        }
//    }
//}
//import java.util.*;
//
//public class ArrayOperations {
//
//    // 1. Remove duplicates from a sorted array
//    public static int[] removeDuplicates(int[] arr) {
//        if (arr.length == 0) return new int[0];
//        int j = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[j] != arr[i]) {
//                j++;
//                arr[j] = arr[i];
//            }
//        }
//        return Arrays.copyOfRange(arr, 0, j + 1);
//    }
//
//    // 2. Find the union of two arrays
//    public static int[] findUnion(int[] arr1, int[] arr2) {
//        Set<Integer> set = new TreeSet<>(); // TreeSet to keep it sorted
//        for (int num : arr1) set.add(num);
//        for (int num : arr2) set.add(num);
//        int[] result = new int[set.size()];
//        int i = 0;
//        for (int num : set) {
//            result[i++] = num;
//        }
//        return result;
//    }
//
//    // 3. Sort array of 0s, 1s and 2s (Dutch National Flag Algorithm)
//    public static void sort012(int[] arr) {
//        int low = 0, mid = 0, high = arr.length - 1;
//        while (mid <= high) {
//            switch (arr[mid]) {
//                case 0:
//                    swap(arr, low++, mid++);
//                    break;
//                case 1:
//                    mid++;
//                    break;
//                case 2:
//                    swap(arr, mid, high--);
//                    break;
//            }
//        }
//    }
//
//    // Helper function to swap elements
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
//    }
//
//    // 4. Stock Buy and Sell for maximum profit (single transaction)
//    public static int maxProfit(int[] prices) {
//        int minPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int price : prices) {
//            if (price < minPrice) minPrice = price;
//            else if (price - minPrice > maxProfit) maxProfit = price - minPrice;
//        }
//        return maxProfit;
//    }
//
//    // Main function to test all the methods
//    public static void main(String[] args) {
//        // 1. Remove duplicates
//        int[] sortedArr = {1, 1, 2, 2, 3, 4, 4};
//        System.out.println("After removing duplicates: " + Arrays.toString(removeDuplicates(sortedArr)));
//
//        // 2. Find union
//        int[] arr1 = {1, 2, 4, 5};
//        int[] arr2 = {2, 3, 5, 6};
//        System.out.println("Union of arrays: " + Arrays.toString(findUnion(arr1, arr2)));
//
//        // 3. Sort 0s, 1s, and 2s
//        int[] colors = {2, 0, 2, 1, 1, 0};
//        sort012(colors);
//        System.out.println("Sorted 0s, 1s, 2s: " + Arrays.toString(colors));
//
//        // 4. Stock buy and sell
//        int[] stockPrices = {7, 1, 5, 3, 6, 4};
//        System.out.println("Maximum Profit: " + maxProfit(stockPrices));
//    }
//}
//

//import java.util.Arrays;
//class prefix{
//    public static void main(String args[]){
//        int[] arr= {1,2,3,4,5};
//        int[] ar=new int[arr.length];
//        ar[0]=arr[0];
//        for(int i=1;i<arr.length;i++){
//            ar[i]=ar[i-1]+ arr[i];
//        }
//        System.out.println(Arrays.toString(ar));
//    }
//}
//import java.util.Arrays;
//class prefix {
//    static int q1(int[] arr, int l, int r) {
//        int sum = 0;
//        if(l==0) return arr[l];
//        while (l <= r) {
//            sum += arr[l];
//            l++;
//        }
//        return sum;
//    }
//
//    public static void main(String args[]) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
//        int l = 0, r = 2;
//        System.out.println(q1(arr,0,2));
//    }
//}

//import java.util.Arrays;
//class subfix{
//    public static void main(String args[]){
//        int[] arr= {1,2,3,4,5};
//        for(int i= arr.length-2;i>=0;i--){
//            arr[i]=arr[i+1]+ arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        int l=0,k=2;
//        int sum=arr[l]-arr[k]+arr[l];
//        System.out.println(sum);
//        Arrays.sort(arr);
//        System.out.println(arr[0]);
//    }
//}