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

//import java.util.*;
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

////7. Print Even Indices
//class day{
//    static void fun(int[] arr,int i){
//        if(i==arr.length) return;
//        fun(arr,i+2);
//        System.out.println(arr[i]);
//    }
//    public static void main(String args[]){
//        int[] arr={1,2,3,4,5,6};
//        fun(arr,0);
//    }
//}

//8. Pyramid
//import java.util.*;
//class day
//{
//    static void print_space(int space)
//    {
//        if (space == 0)
//            return;
//        System.out.print(" ");
//        print_space(space - 1);
//    }
//    static void print_asterisk(int asterisk)
//    {
//        if (asterisk == 0)
//            return;
//        System.out.print("* ");
//        print_asterisk(asterisk - 1);
//    }
//    static void pattern(int n, int num)
//    {
//        if (n == 0)
//            return;
//        print_space(n - 1);
//        print_asterisk(num - n + 1);
//        System.out.println("");
//
//        pattern(n - 1, num);
//    }
//
//    public static void main(String[] args)
//    {
//        int n = 5;
//        pattern(n, n);
//    }
//}

////9. Count vowel
//import java.io.*;
//class day {
//    static int isVowel(char chars)
//    {
//        if (chars == 'a' || chars == 'e' || chars == 'i'
//                || chars == 'o' || chars == 'u') {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
//    static int vowelno(String str, int l)
//    {
//        if (l == 1) {
//            return isVowel(str.charAt(l - 1));
//        }
//        return vowelno(str, l - 1)
//                + isVowel(str.charAt(l - 1));
//    }
//    public static void main(String[] args)
//            throws IOException
//    {
//        String str = "BufferedOutput";
//        str = str.toLowerCase();
//        System.out.println(
//                "Total number of vowels in string are:");
//        System.out.println(vowelno(str, str.length()));
//    }
//}

////10. Factorial
//class day{
//    static int nums(int i){
//        if(i<=1)  return 1;
//        return nums(i-1)*i;
//    }
//    public static void main(String args[]){
//        System.out.println(nums(5));
//    }
//}

////11.Max Number
//class day{
//    static int nums(int[] arr,int i){
//        if(i== arr.length-1) return arr[i];
//        int max=nums(arr,i+1);
//        return (arr[i] >max)? arr[i]: max;
//    }
//    public static void main(String args[]){
//        int[] arr={1 ,-3, 5, 4 ,-6};
//        System.out.println(nums(arr,0));
//    }
//}

////12.Summation
//class day{
//    static int nums(int[] arr,int i){
//        if(i==arr.length) return 0;
//        return arr[i]+nums(arr,i+1);
//    }
//    public static void main(String args[]){
//        int[] arr={1 ,4 ,2 ,7};
//        System.out.println(nums(arr,0));
//    }
//}
////13
//import java.util.*;
//
//class Main {
//    static int sumLastM(int[] arr, int index, int m) {
//        if (m == 0) return 0;  // base case
//        return arr[index] + sumLastM(arr, index + 1, m - 1);  // recursive step
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] A = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//
//        int result = sumLastM(A, N - M, M);
//        System.out.println(result);
//    }
//}

////14.fibonacci
//class day{
//    static int nums(int i){
//        if(i==0) return 0;
//        if(i==1) return 1;
//        return nums(i-1)+nums(i-2);
//    }
//    public static void main(String args[]){
//
//        System.out.println(nums(6));
//    }
//}
////15.Array Average
//class day{
//    static int nums(int[] arr,int i){
//        if(i==arr.length) return 0;
//        return arr[i]+nums(arr,i+1);
//
//    }
//    public static void main(String args[]){
//        int[] arr={1 ,4 ,2 ,7};
//        System.out.println(nums(arr,0)/ arr.length);
//    }
//}

////16. Combination
//class day{
//    static int nums(int i){
//        if(i<=1)  return 1;
//        return nums(i-1)*i;
//    }
//    public static void main(String args[]){
//        int ans=nums(4)/(nums(4-2)*2);
//        System.out.println(ans);
//    }
//}
