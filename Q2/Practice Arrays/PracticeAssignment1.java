/**
 * Practice work form class on arrays.
 *
 * @author (Lindsay Fabricant)
 * @version (12/5/19)
 */
public class PracticeAssignment1
{
    public static int[] method1(int n){
        int count = 2;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = count;
            count+=2;
        }
        return arr;
    }
    public static int method2(int[] nums){
        return nums[nums.length-1] + nums[0];
    }
    public static int method3(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%5 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        printHelper(method1(6));
        System.out.println();
        printHelper(method1(1));
        System.out.println();
        int[] n = {2,3,4,5,6,7,8,9};
        System.out.println(method2(n));
        int[] n2 = {2};
        System.out.println(method2(n2));
        int[] n3 = {2,5,10,23,42,96,5,20};
        System.out.println(method3(n3));
        int[] n4 = {2};
        System.out.println(method3(n4));
    }
     public static void printHelper(int[] arr){
        int lastIndex = arr.length-1;
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[lastIndex] + "]");
    }
}
