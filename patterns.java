//import java.util.Scanner;
//
//class starpattern {
//    public static void main(String args[]){
//        int n;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int stars = (i <= n/2) ? i + 1 : n - i;
//            for (int j = 0; j < n; j++) {
//                if (j < stars || j >= n - stars) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}
////==============================================================
//import java.util.*;
//class hollowpattern{
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==j || j+i==n-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
////==============================================================
//import java.util.*;
//class hourglasspattern{
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int mid = n / 2;
//        for (int i = 0; i < n; i++) {
//            int spaces = Math.abs(mid - i);
//            int stars = n - 2 * spaces;
//            for (int j = 0; j < spaces; j++) System.out.print(" ");
//            for (int j = 0; j < stars; j++) System.out.print("*");
//            System.out.println();
//    }
//}
//}