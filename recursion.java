//// Direct Recursion:
////i.tail recursion
//public class recursion {
//    static void fun(int n){
//        if(n>0){
//            System.out.print(n+" ");
//            fun(n-1);
//        }
//    }
//    public static void main(String[] args){
//        int x=3;
//        fun(x);
//    }
//}

////Head recursion
//class GFG{
//
//    // Recursive function
//    static void fun(int n)
//    {
//        if (n > 0) {
//
//            // First statement in the function
//            fun(n - 1);
//
//            System.out.print(" "+ n);
//        }
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        int x = 3;
//        fun(x);
//
//    }
//}

////Tower of Hanoi
//import java.io.*;
//import java.util.*;
//import java.util.*;
//public class recursion{
//    static void TowerOfHanoi(int n,char from,char to,char aux){
//        if(n==0)
//            return;
//        TowerOfHanoi(n-1,from,aux,to);
//        System.out.println("Move disk " + n + " from rod "
//                + from + " to rod "
//                + to);
//        TowerOfHanoi(n-1,aux,to,from);
//
//    }
//    public static void main(String args[])
//    {
//        int N = 3;
//
//        // A, B and C are names of rods
//        TowerOfHanoi(N, 'A', 'C', 'B');
//    }
//}
import java.util.*;
//class day {
//    static int fun(int n) {
//        if (n == 1 || n==0) {
//            return 1;
//        } else {
//            return fun(n - 1) * n;
//        }
//    }
//
//    public static void main(String[] args) {
//        int x = 10;
//        ArrayList<Integer> lis = new ArrayList<>();
//        for (int i = 0; i < x; i++) {
//            lis.add(fun(i));
//        }
//        System.out.println(lis);
//    }
//}

//class day {
//    static long fun(long n) {
//        if (n == 1 || n==0) {
//            System.out.println("1");
//            return 1;
//        }
//        long p=n*fun(n-1);
//        System.out.println(p);
//        return p;
//    }
//    public static void main(String[] args) {
//        int x = 10;
//        fun(x);
//    }
//}

//class day {
//    static void fun(int[] arr,int n) {
//        if(n>=arr.length) {
//            return ;
//        }
//        System.out.print(arr[n]);
//        fun(arr,n+1);
//        System.out.print(arr[n]);
//    }
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
//        fun(arr,0);
//
//    }
//}

//class day {
//    static void fun(String arr,int n) {
//        String s="";String s1="";
//        if(n>=arr.length()) {
//            return ;
//        }
//        s=s+(arr.charAt(n));
//        fun(arr,n+1);
//        s1=s1+arr.charAt(n);
//        if(s==s1){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
//
//    }
//    public static void main(String[] args) {
//        String arr="bob";
//        fun(arr,0);
//
//    }
//}


////1. print Given a number N
////. Print "I love Recursion" N
//class day{
//    static void fun(String s,int n){
//        if(n==0) return ;
//        System.out.println(s);
//        fun(s,n-1);
//    }
//    public static void main(String args[]){
//        String s="I love recursion";
//        fun(s,3);
//    }
//}
////2. Print from N to 1
//class day{
//    static void fun(int n){
//        if(n==0) return ;
//
//        System.out.println(n);
//        fun(n-1);
//    }
//    public static void main(String args[]){
//        int n=10;
//        fun(n);
//    }
//}
////3. Print from 1 to N
//class day{
//    static void fun(int n,int i){
//        if(i>n) return ;
//
//        System.out.println(i);
//        fun(n,i+1);
//    }
//    public static void main(String args[]){
//        int n=10;
//        fun(n,1);
//    }
//}

////4 Print digits
//class day{
//    static void fun(int n){
//        if(n==0) return ;
//
//        System.out.println(n%10);
//        fun(n/10);
//    }
//    public static void main(String args[]){
//        int n=1234;
//        fun(n);
//    }
//}
////5. based converstion
//class day{
//    static void fun(int n){
//        String s=" ";
//        if(n==0) return ;
//
//        s=s+n%2;
//        fun(n/2);
//        System.out.print(s);
//    }
//    public static void main(String args[]){
//        int n=29;
//        fun(n);
//    }
//}

////6.  Left Max
//class day{
//    static void fun(int[] n,int index){
//        if(index==n.length) return ;
//        int max=n[index];
//        for(int i=0;i<index;++i){
//            if(n[i]>max) max=n[i];
//        }
//        System.out.print(max);
//        fun(n,index+1);
//
//    }
//    public static void main(String args[]){
//        int[] arr={4,3,5,7,3};
//        fun(arr,0);
//    }
//}
