//import java.util.Arrays;
//import java.util.Scanner;
//
//class array {
//    public static void main(String args[]){
//        System.out.println("Length");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int max=0,second=0;
//        for(int i=0;i<n;i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]<max && arr[i]>second){
//                second=arr[i];
//            }
//        }
//        System.out.println("maximum: "+max);
//        System.out.println("second maximum: "+second);
//
//
//
//
//    }
//
//import java.util.*;
//class sorting {
//    static void bubblesort(int arr[],int n){
//        int i,j,temp;
//
//        for(i=0;i<n;i++){
//            for(j=0;j<n-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    static void printArray(int arr[], int size){
//        int i;
//        for (i = 0; i < size; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//    static void alternate(int arr[],int size){
//        int l=0;
//        int r=size-1;
//        while(l<r){
//            System.out.print(arr[l]+" "+arr[r]+" ");
//            l++;
//            r--;
//        }
//
//    }
//    static void circular(int arr[],int size){
//        int[] a=new int[size];
//        int k=size-1;
//        for(int i=0;i<size;i++){
//            a[i]=arr[k];
//            k--;
//        }
//        printArray(a,size);
//    }
//    public static void main(String args[]){
//        System.out.println("length: ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        bubblesort(arr,n);
//        System.out.println("Sorted array: ");
//        printArray(arr,n);
//        System.out.println("Alternate array: ");
//        alternate(arr,n);
//        System.out.println("Circular array: ");
//        circular(arr,n);
//    }
//}

// 1.Check if the array is sorted

//import java.util.*;
//class q1 {
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        Arrays.sort(arr);
//
//    }
//}

//import java.util.*;
//class q2 {
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        boolean a=true;
//        for(int i=1;i<n;i++){
//            if(arr[i-1]>arr[i]){
//                a=false;
//                break;
//            }
//
//        }
//
//        System.out.println(a);
//    }
//}
//import java.util.*;
//class q3 {
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int temp=arr[0];
//        for(int i=0;i<n-1;i++){
//            arr[i]=arr[i+1];
//        }
//        arr[n-1]=temp;
//        System.out.println("left shiift:" +Arrays.toString(arr));
//        int temp2=arr[n-1];
//        for(int i=n-1;i>0;--i){
//            arr[i]=arr[i-1];
//        }
//        arr[0]=temp2;
//        System.out.println("right shiift:" +Arrays.toString(arr));
//    }
//}

//import java.util.*;
//class q4 {
//    static void reverse(int[] arr,int start,int end){
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;end--;
//        }
//    }
//    static void leftRotate(int[] arr, int k) {
//        int n = arr.length;
//        k %= n; // handle k > n
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//        reverse(arr, 0, n - 1);
//    }
//
//    // Right Rotate by k
//    static void rightRotate(int[] arr, int k) {
//        int n = arr.length;
//        k %= n; // handle k > n
//        reverse(arr, n - k, n - 1);
//        reverse(arr, 0, n - k - 1);
//        reverse(arr, 0, n - 1);
//    }
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int k=2;
//
//        System.out.println(Arrays.toString(arr));
//        leftRotate(arr, 2);
//        System.out.println("Left Rotated by 2: " + Arrays.toString(arr));
//
//        rightRotate(arr, 2);
//        System.out.println("Right Rotated by 2: " + Arrays.toString(arr));
//
//
//    }
//}
//import java.util.*;
//class q5{
//    public static void main(String args[]){
//        int[] arr={1,0,6,0,7,8,9,0,10};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int s=0,e= arr.length-1;
//        while(s<e){
//            int temp=arr[s];
//            arr[s]=arr[e];
//            arr[e]=temp;
//            s++;e--;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}
//import java.util.*;
//
//class q6 {
//    public static void main(String args[]) {
//        int[] arr = {1, 0, 6, 0, 7, 8, 9, 0, 10};
//
//        System.out.println("Input Array: " + Arrays.toString(arr));
//
//        HashMap<Integer, Integer> freq = new HashMap<>();
//
//        // Count frequencies
//        for (int i = 0; i < arr.length; i++) {
//            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
//        }
//
//        System.out.println("Frequency of elements (0 to max element):");
//
//
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(i + " -> " + freq.getOrDefault(i, 0));
//        }
//    }
//}

