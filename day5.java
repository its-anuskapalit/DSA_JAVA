//class insertion{
//    public static void main(String args[]){
//        int[] arr={10,5,6,7,4,1,2};
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int key=arr[i];
//            int j=i-1;
//            while (j>=0 && arr[j]>key){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//    }
//}

//======================2D-ARRAY======================================

//class day {
//    public static void main(String args[]) {
//        int[][] arr={{1,2,3,},{4,5,6},{7,8,9}};
//        for (int i = 0; i <3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(i + " " + j + "  ");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.*;
//class day {
//    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int[][] arr=new int[n][m];
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j < m; j++)
//            {
//                arr[i][j]=(i+1)*(j+1);
//            }
//        }
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(" "+arr[i][j]+"  ");
//            }
//            System.out.println();
//        }
//    }
//}
//import java.util.*;
//class SnakePattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int[][] arr =new int[n][m];
//        int rows = sc.nextInt();
//        int cols = arr.length;
//        int k=1;
//        for(int i=0;i<rows;i++){
//            for(int j=0;i<cols;i++){
//                arr[rows][cols]=k;
//                k++;
//            }
//        }
//
//        for (int i = 0; i < rows; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < cols; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            } else {
//                for (int j = cols - 1; j >= 0; j--) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }
//    }
//}
import java.util.*;
class SpiralOrder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int k = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = k++;
            }
        }
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1; //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }
}
