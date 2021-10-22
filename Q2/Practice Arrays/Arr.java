/**
 * Write a class that has 2 fields: an integer array and its length.
 * Write a constructor to initialize the array to the inclusive 
 *      consecutive integers from 2 parameters, low and high
 * Write a toString method that will return a String in the form: [ .. , .. , .. ]
 * Write a main method to test that your program works appropriately.
 * 
 * @author (Lindsay Fabricant) 
 * @version (12/11/19)
 */
public class Arr
{
    private int[] arr;
    private int len;
    /**
     * Constructs an arr initialized to include the integers from low to high, inclusive.
     */
    public Arr(int low, int high)
    {
        len = high+1-low;
        arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = low+i;
        }
    }
    public String toString()
    {
        String end = "["; 
        for(int i = 0; i < len-1; i++){
            end += arr[i] + ", ";
        }
        return end + arr[len-1] + "]";
    }
    public static void main(String[] args)
    {
        Arr var = new Arr(3,7);
        System.out.println(var);
        
        int[] next = {5, 6, 45, 99, 13, 5, 6};
            System.out.println(sameEnds(next, 3));
    }
    public static boolean  sameEnds(int[] nums, int len) {
      String first = "";
      for(int i = 0; i < len-1; i++){
        first += nums[i];
      }
      String second = "";
      for(int i = nums.length-len+1; i < nums.length; i++){
        second += nums[i];
      }
      return first.equals(second);
    }
}
