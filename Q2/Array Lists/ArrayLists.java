import java.util.ArrayList;

/**
 * Write a description of class ArrayLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayLists
{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<String> strs = new ArrayList<String>();
        nums.add(1); // add to the right
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(4,2); // at index 4, insert 2
        System.out.println(nums);
        nums.set(4,22);
        System.out.println(nums);
        System.out.println(sum(nums));
        swap(nums,2,4);
        System.out.println(nums);
    }
    public static ArrayList<Integer> swap(ArrayList<Integer> nums, int index1, int index2){
        int temp = nums.get(index1);
        nums.set(index1, nums.get(index2));
        nums.set(index2, temp);
        return nums;
    }
    public static int sum(ArrayList<Integer> someNums){
        int sum = 0; 
        for (int i = 0; i < someNums.size(); i++){
            sum = sum + someNums.get(i);
        }
        return sum;
    } 
}
