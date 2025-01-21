////Bubble sort O(n^2)
////in each pass the largest goes to its original position
//public class sorting {
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
//    public static void main(String args[]){
//        int arr[]={64,34,25,12,22,11,90};
//        int n=arr.length;
//        bubblesort(arr,n);
//        System.out.println("Sorted array: ");
//        printArray(arr,n);
//    }
//}

////Selection sort O(n^2)
////finds the smallest and put in first
//// Java program for implementation of Selection Sort
//import java.util.Arrays;
//
//class GfG {
//
//    static void selectionSort(int[] arr){
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//
//            // Assume the current position holds
//            // the minimum element
//            int min_idx = i;
//
//            // Iterate through the unsorted portion
//            // to find the actual minimum
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[min_idx]) {
//
//                    // Update min_idx if a smaller element
//                    // is found
//                    min_idx = j;
//                }
//            }
//
//            // Move minimum element to its
//            // correct position
//            int temp = arr[i];
//            arr[i] = arr[min_idx];
//            arr[min_idx] = temp;
//        }
//    }
//
//    static void printArray(int[] arr){
//        for (int val : arr) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args){
//        int[] arr = { 64, 25, 12, 22, 11 };
//
//        System.out.print("Original array: ");
//        printArray(arr);
//
//        selectionSort(arr);
//
//        System.out.print("Sorted array: ");
//        printArray(arr);
//    }
//}

//// Java program for implementation of Insertion Sort
//class InsertionSort {
//    /* Function to sort array using insertion sort */
//    void sort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 1; i < n; ++i) {
//            int key = arr[i];
//            int j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position */
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }
//
//    /* A utility function to print array of size n */
//    static void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//
//        System.out.println();
//    }
//
//    // Driver method
//    public static void main(String args[])
//    {
//        int arr[] = { 12, 11, 13, 5, 6 };
//
//        InsertionSort ob = new InsertionSort();
//        ob.sort(arr);
//
//        printArray(arr);
//    }
//}

//Merge Sort O(n log n)
public class sorting {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merge[]=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<= mid && idx2 <=ei){
            if(arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];
            }else{
                merge[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++]=arr[idx1++];

        }
        while(idx2<=ei){
            merge[x++]=arr[idx2++];

        }
        for (int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }

    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
