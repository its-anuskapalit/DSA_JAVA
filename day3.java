//////find the number of elements that have odd freq
////import java.util.*;
////class q1 {
////    public static void main(String args[]){
////        int[] arr={1,2,7,5,6,1,5};
////        HashMap<Integer,Integer> map=new HashMap<>();
////
////    }
////}
//
////============DAY 4=======================================================
////import java.util.*;
////class q1{
////    public static void main(String args[]){
////        Vector<Integer> vl=new Vector<>();
////        Scanner sc=new Scanner(System.in);
////        for(int i=0;i<10;i++){
////            int a=sc.nextInt();
////            vl.add(a);
////        }
////        for (int i : vl) {
////            System.out.print(i);
////        }
////    }
////}
////class sorting {
////    static void bubblesort(int arr[],int n){
////        int i,j,temp;
////
////        for(i=0;i<n;i++){
////            for(j=0;j<n-i-1;j++){
////                if(arr[j]>arr[j+1]){
////                    temp=arr[j];
////                    arr[j]=arr[j+1];
////                    arr[j+1]=temp;
////                }
////            }
////        }
////    }
////    static void printArray(int arr[], int size){
////        int i;
////        for (i = 0; i < size; i++)
////            System.out.print(arr[i] + " ");
////        System.out.println();
////    }
////    static boolean sortzOrNot(int[] arr){
////        for(int i=0;i<arr.length-1;i++){
////            if(arr[i]>arr[i+1]) return false;
////        }
////        return true;
////    }
////    public static void main(String args[]){
////        int arr[]={64,34,25,12,22,11,90};
////        int n=arr.length;
////        bubblesort(arr,n);
////        System.out.println("Sorted array: ");
////        printArray(arr,n);
////        int arr1[]={64,34,25,12,22,11,90};
////        System.out.println("Sorted array Y/N: "+ sortzOrNot(arr1));
////    }
////}
//
//import java.util.HashMap;
//class freq{
//    public static void main(String args[]){
//        int[] arr={1,1,8,9,2,1,1,4,7,8,6};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i: arr){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        int a=1;
//        System.out.println(map.getOrDefault(a, 0));
//            }
//        }

