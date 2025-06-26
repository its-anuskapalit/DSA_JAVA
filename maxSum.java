////Max Sum of subarray
//import java.util.*;
//class day{
//    public static void main(String args[]){
//        int[] arr={1,2,-1,3,4,10,5,-6,-15};
//        int sum=0;
//        int max=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j< arr.length;j++){
//                sum+=arr[i];
//                max=Math.max(max,sum);
//            }
//        }
//        System.out.println(sum);
//    }
//}

//using prefix-sum and kadane's
//import java.util.*;
//class prefix{
//    public static void main(String args[]){
//        int[] arr={1,2,-1,3,4,10,5,-6,-15};
//        int[] ar=new int[arr.length];
//        ar[0]=arr[0];
//        for(int i=1;i<arr.length;i++){
//            ar[i]=ar[i-1]+ arr[i];
//        }
//        System.out.println(Arrays.toString(ar));
//        int minprefix=0,maxprefix=0;
//        for(int i=0;i< ar.length;i++){
//            maxprefix=Math.max(ar[i]-minprefix,maxprefix);
//            minprefix=Math.min(minprefix,ar[i]);
//        }
//        System.out.println(maxprefix);
//        System.out.println(maxSubArray(arr));
//    }
//        public static int maxSubArray(int[] nums) {
//            int currentMax = nums[0];
//            int globalMax = nums[0];
//            for (int i = 1; i < nums.length; i++) {
//                currentMax = Math.max(nums[i], currentMax + nums[i]);
//                if (currentMax > globalMax) {
//                    globalMax = currentMax;
//                }
//            }
//            return globalMax;
//        }
//}
