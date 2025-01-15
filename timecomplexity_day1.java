////The below program takes a constant amount of time.
//import java.util.*;
//public class timecomplexity_day1 {
//    public static void checkEvenOdd(int n){
//        int r=n%2;
//        if(r==0){
//    System.out.println("Its an even number");
//    }else{
//        System.out.println("Its an odd number");
//}
//    }
//        public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        checkEvenOdd(n);
//        }
//        }

//The below program takes logarithmic complexity.

class timecomplexity_day1{
    static  int binarySerach(int arr[],int l,int r,int x){
        if(r>=l){
            int mid=l+(r-1)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]>x)
                return binarySerach(arr,l,mid-1,x);
            return binarySerach(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int n = arr.length;
        int result = binarySerach(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + result);
    }
}
