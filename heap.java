//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//class priority implements Comparator<int[]>{
//    public int compare(int a[],int b[]){
//
//    if(a[1]==b[1]) return a[0]-b[0];
//    return a[1]-b[1]; //desending *(-1)
//    }
//}
//class heap{
//    public static void main(String args[]){
//        int[] a = {5, 2};
//        int[] b = {3, 2};
//        int[] c = {4, 2};
//        priority ob=new priority();
//        PriorityQueue<int[]> pq=new PriorityQueue<>(ob);
//        pq.add(a);
//        pq.add(b);
//        pq.add(c);
//        while(!pq.isEmpty()){
//            System.out.println(Arrays.toString(pq.poll()));
//        }
//    }
//}

//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//class The_Comparator implements Comparator<String> {
//    public int compare(String str1, String str2)
//    {
//        String first_Str=str1;
//        String second_Str=str2;
//        return second_Str.compareTo(first_Str);
//    }
//}
// class Priority_Queue_Demo {
//    public static void main(String[] args)
//    {
//        The_Comparator obj=new The_Comparator();
//        PriorityQueue<String> queue=new PriorityQueue<>(obj);
//        queue.add("G");
//        queue.add("E");
//        queue.add("E");
//        queue.add("K");
//        queue.add("S");
//        queue.add("4");
//
//        while(!queue.isEmpty()){
//            System.out.print(" "+queue.poll());
//        }
//    }
//}

//import java.util.PriorityQueue;
//class heap{
//    public static void main(String args[]){
//        int[] a={11,4,5,6,7,9,3};
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        int k=2;
//        for(int i:a){
//            pq.offer(i);
//            while(pq.size()>k){
//                pq.poll();
//            }
//        }
//        System.out.println(pq.peek());
//    }
//}

//import java.util.Arrays;
//class heap{
//    static void heapify(int arr[], int n, int i) {
//        int root = i;
//        int left = 2 * i + 1;
//        int right = 2 * i + 2;
//        if (left < n && arr[left] > arr[root]) {
//            root = left;
//        }
//        if (right < n && arr[right] > arr[root]) { // change signs for min heao
//            root = right;
//        }
//        if (root != i) {
//            int swap = arr[i];
//            arr[i] = arr[root];
//            arr[root] = swap;
//            heapify(arr, n, root);
//        }
//    }
//
//    public static void main(String args[]) {
//        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
//        int n = arr.length;
//        int p=(n/2)-1;
//        for (int i = p ;i >= 0; i--) {
//            heapify(arr, n, i);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//==================HEAPSORT=========================

import java.util.Arrays;
class heap{
    static void heapify(int arr[], int n, int i) {
        int root = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[root]) {
            root = left;
        }
        if (right < n && arr[right] > arr[root]) { // change signs for min heao
            root = right;
        }
        if (root != i) {
            int swap = arr[i];
            arr[i] = arr[root];
            arr[root] = swap;
            heapify(arr, n, root);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1,8,4,10,96,41,5,6,74,32,12,55,0,65};
        int n = arr.length;
        int p=(n/2)-1;
        for (int j = p ;j >= 0; j--) {
            heapify(arr, n, j);
        }
            for (int i = n - 1; i > 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }
}
