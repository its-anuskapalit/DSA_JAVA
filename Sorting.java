class Sorting{
    static void bubbleSort(int arr[],int n){
        int tem;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }
    static void selectionSort(int arr[],int n){
     for(int i=0;i<n-1;i++){
         int minIdx=i;
         for(int j=i+1;j<n;j++){
             if(arr[j]<arr[minIdx]){
                 minIdx=j;
             }
         }
         int temp=arr[minIdx];
         arr[minIdx]=arr[i];
         arr[i]=temp;
     }
    }
    static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    static void mergeSort(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
            while(i<n1){
                arr[k]=L[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=R[j];
                j++;
                k++;
            }
        }

    }
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            mergeSort(arr, l, m, r);
        }
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array using bubble sort O(n^2): ");
        printArray(arr, n);
        selectionSort(arr,n);
        System.out.println("Sorted array using selection sort O(n^2): ");
        printArray(arr, n);
        insertionSort(arr,n);
        System.out.println("Sorted array using insertion sort O(n^2): ");
        printArray(arr, n);
        sort(arr,0,n-1);
        System.out.println("Sorted array using merge sort O(n log n): ");
        printArray(arr, n);

    }
}
//=========================================================
// Java implementation of QuickSort
import java.io.*;

class GFG {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    // To print sorted array
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}


//================================MERGE SORT====================================
////Merging two sorted array
//class day{
//    public static void main(String args[]){
//        int[] a1={1,3,5,7,9};
//        int[] a2={2,4,6,8,10,11,12,13,14};
//        ArrayList<Integer> a3=new ArrayList<>();
//        int i=0,j=0;
//        while(i<a1.length && j<a2.length){
//            if(a1[i]<a2[j]){
//                a3.add(a1[i]);
//                i++;
//            }else{
//                a3.add(a2[j]);
//                j++;
//            }
//        }
//        while(i<a1.length ){
//            a3.add(a1[i]);
//            i++;
//        }
//        while(j<a2.length ){
//            a3.add(a2[j]);
//            j++;
//        }
//        System.out.println(a3);
//    }
//}

////Merge sort
//class day{
//    static void merge(int[] arr,int start,int mid,int end){
//        int[] merge=new int[end-start+1];
//        int i=start,j=mid+1;
//        int c=0;
//        while(i<=mid && j<=end){
//            if(arr[i]<arr[j]){
//                merge[c++]=arr[i++];
//            }else{
//                merge[c++]=arr[j++];
//            }
//        }
//        while(i<=mid){
//            merge[c++]=arr[i++];
//        }
//        while(j<=end){
//            merge[c++]=arr[j++];
//        }
//        for (int k = 0; k < merge.length; k++) {
//            arr[start + k] = merge[k];
//        }
//    }
//    static void divide(int[] arr,int start,int end){
//        int mid=(start+end)/2;
//        if(start>=end) return;
//        divide(arr,start,mid);
//        divide(arr,mid+1,end);
//        merge(arr,start,mid,end);
//
//    }
//    public static void main(String args[]){
//        int[] arr={10,1,56,9,62,12,3,64};
//        divide(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//}

////QUICK SORT
//class day {
//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void sort(int start, int end, int[] arr) {
//        if (start >= end) return;
//        int pivot = partition(arr, start, end);
//        sort(start, pivot - 1, arr);
//        sort(pivot + 1, end, arr);
//    }
//    static int partition(int[] arr, int start, int end) {
//        int pivot = arr[end];
//        int i = start - 1;
//        for (int j = start; j <= end - 1; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, end);
//        return i + 1;
//    }
//
//    public static void main(String args[]) {
//        int[] arr = {10, 80, 30, 90, 40};
//        int n = arr.length;
//        sort(0, n - 1, arr);
//        System.out.println(Arrays.toString(arr));
//        }
//    }

