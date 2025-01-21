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