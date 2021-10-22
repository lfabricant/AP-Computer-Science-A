/**
 * Write a description of class ArrayFun here.
/**
 * Write a description of class ArrayFun1 here.
 *
 * @author (Lindsay Fabricant)
 * @version (12/3/19)
 */
public class ArrayFun1
{
        public static void main(String[] args){
        int[] var = {3,2,5};
        System.out.print("Swap First and Last: ");
        printHelperInt(swapFirstLast(var));
        System.out.println();
        
        int[] var2 = {7,6,9,12};
        System.out.print("Swap First and Last: ");
        printHelperInt(swapFirstLast(var2));
        System.out.println();
        
        String[] var3 = {"a","b","c"};
        System.out.print("Swap First and Middle: ");
        printHelperString(swapFirstMiddle(var3));
        System.out.println();
        
        String[] var4 = {"zoo","foo", "xoo"};
        System.out.print("Swap First and Middle: ");
        printHelperString(swapFirstMiddle(var4));
        System.out.println();
        
        int[] var5 = {1,2,3,4};
        printEveryOther(var5);
       // System.out.println();
        
        int[] var6 = {13,42,33,44,52};
        printEveryOther(var6);
       // System.out.println();
       
        int[] var7 = {5,2,4,6,7};
        System.out.println(sumOdds(var7));
        
        int[] var8 = {13,3,2,6,7};
        System.out.println(sumOdds(var8));
        
        int[] var9 = {2,8};
        System.out.println(sum(var9));
        
        int[] var10 = {2,8,4};
        System.out.println(sum(var10));
        
        int[] var11 = {2,8};
        System.out.println(mean(var11));
        
        int[] var12 = {2,8,4,7};
        System.out.println(mean(var12));
        
        double[] var13 = {2.6,8.2,5.2};
        System.out.println(largest(var13));
        
        double[] var14 = {-2,-11,-4};
        System.out.println(largest(var14));
        
        int[] var15 = {1,2,3,4};
        System.out.println(sumEveryN(var15,2));
        
        int[] var16 = {13,42,15,33,44,16,52};
        System.out.println(sumEveryN(var16,3));
        
        int[] var17 = {5,2,7,2,5};
        System.out.println(isPalindromic(var17));
        
        int[] var18 = {5,2,7,3,5};
        System.out.println(isPalindromic(var18));
    }
    public static void printHelperString(String[] arr){
        int lastIndex = arr.length-1;
        System.out.print("{");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print("\"" + arr[i] + "\",");
        }
        System.out.print("\"" + arr[lastIndex] + "\"}");
    }
    public static void printHelperInt(int[] arr){
        int lastIndex = arr.length-1;
        System.out.print("{");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[lastIndex] + "}");
    }
    public static int[] swapFirstLast(int[] nums){
        int len = nums.length;
        int[] nums2 = new int[len];
        int lastIndex = nums.length-1;
        for(int i = 0; i <= lastIndex; i++)
        {
            nums2[i] = nums[i];
        }
        int temp = nums2[0];
        nums2[0] = nums[lastIndex];
        nums2[lastIndex] = temp;
        return nums2;
    }
    public static String[] swapFirstMiddle(String[] strs){
        int len = strs.length;
        String[] strs2 = new String[len];
        int lastIndex = strs.length-1;
        for(int i = 0; i <= len-1; i++)
        {
            strs2[i] = strs[i];
        }
        String temp = strs2[0];
        strs2[0] = strs[len/2];
        strs2[len/2] = temp;
        return strs2;
    }
    public static void printEveryOther(int[] nums){
        int len = nums.length;
        for(int i = 0; i <= len-1; i++)
        {
            System.out.println(nums[i]);
        } 
    }
    public static int sumOdds(int[] nums){
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i <= len-1; i++)
        {
            if(nums[i]%2 == 1){
                sum += nums[i];
            }
        } 
        return sum;
    }
    public static int sum(int[] nums){
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i <= len-1; i++)
        {
           sum += nums[i];
        }
        return sum;
    } 
    public static double mean(int[] nums){
        int len = nums.length;
        int sum = 0;
        double count = 0;
        for(int i = 0; i <= len-1; i++)
        {
           sum += nums[i];
           count++;
        }
        return sum/count;
    } 
    public static double largest(double[] nums){
        int len = nums.length;
        double var;
        double store = nums[0];
        for(int i = 1; i <= len-1; i++){
            var = nums[i];
            if(var > store){
                store = var;
            }
        }
        return store;
    }
    public static int sumEveryN(int[] nums, int n){
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i <= len-1; i+=n)
        {
           sum += nums[i];
        }
        return sum;
    } 
    public static boolean isPalindromic(int[] nums){
        int len = nums.length;
        int mid = len/2;
        int countF = 0;
        int[] first = new int[mid];
        for(int i = mid-1; i >= 0; i--){
            first[countF] = nums[i];
            countF++;
        }
        printHelperInt(first);
        int countS = 0;
        int[] second = new int[mid];
        for(int i = mid+1; i < len; i++){
            second[countS] = nums[i];
            countS++;
        }
        printHelperInt(second);
        if(second.equals(first)){
            return true;
        }
        return false;
    }
}




