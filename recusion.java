//=============RECURSION=============
class Recursion {
   static void fun(int n){
       if(n==0)
           return;
       System.out.println(n);
       fun(n-1);
       System.out.println(n);
   }
   public static  void main(String args[]){
       fun(3);
   }
}
//==============================================================================================
class Recursion {
   static int fun(int n){
       if(n==1)
           return 0;
       else
           return 1+fun(n/2);
   }
   public static  void main(String args[]){
       int i=fun(16);
       System.out.println(i);
   }
}
//==============================================================================================
////fun(16)=>1+fun(8)=>1+fun(4)=>1+fun(2)=>1+fun(1)
// //4-3-2-1

//// PRINT N TO 1 USING RECURSION
class Recursion{
   static void print(int n){
       if(n==0)
           return;
       System.out.println(n);
       print(n-1);
    }
   public static void main(String args[]){
       print(5);
   }
}
//==============================================================================================

//// SUM OF DIGITS USING RECURSION
////print(25)+3=>print(2)+5=>print(0)+2
class Recursion{
   static int print(int n){
       if(n==0)
           return 0;
       return (n%10+print(n/10));
    }
   public static void main(String args[]){
       System.out.println(print(111));

   }
}
//==============================================================================================
/*ROPE CUTTING PROBLEM
GIVE A RODE OF LENGTH N WE HAVE TO CUT INTO MAX AMT OF PIECES SUCH THAT EACH LENGTH IS A OR B OR C
INPUT: N=5 A=2 B=5 C=1
OUTPUT: 5(EACH OR 1)
INPUT: N=23,A=12,B=9 C=11
OUPUT: 2 (12 & 11)
INPUT: N=5,A=4,B=2 C=6
OUPUT: -1(not possible)
*/
import java.util.*;
class Recursion {
   static int rope(int n, int a, int b, int c) {
       if (n == 0)
           return 0;
       if (n < 0)
           return -1;
       int resA = rope(n - a, a, b, c);
       int resB = rope(n - b, a, b, c);
       int resC = rope(n - c, a, b, c);
       int res = Math.max(Math.max(resA, resB), resC);
       if (res == -1)
           return -1;
       return res + 1;
   }
   public static void main(String args[]) {
       System.out.println(rope(5, 2, 3, 1));
   }
}
//============================================================================

class Permutations {
    static void permute(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, answer + ch);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }
}
//===========================================================
public class TowerOfHanoi {

    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
