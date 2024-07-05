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
