/**
 * Write a description of class ForEach1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForEach1
{
    public static void print(int[] arr){
        // int l = arr.length;
        // for(int i = 0; i < arr.length; i++){
            // System.out.print(arr[i] + " ");
        // }
        // System.out.println(); OLD WAY
        for(int n : arr){
          System.out.print(n + " ");  
        }
    }
    public static void printTwice(int[] arr){
        for(int n : arr){
            System.out.print(n + "" + n + " ");
        }
    }
    public static void printDouble(int[] arr){
        for(int n : arr){
            System.out.print(n*2+ " ");
        }
    }
    public static void doubleContents(int[] arr){
        int i = 0;
        for(int n : arr){
            arr[i] = n*2;
            i++;
        }
        // for(int i = 0; i < arr.length; i++){
            // arr[i] *= 2;
        // } EASIER
    }
    public static String[] yesNo(boolean[] truths){
        String[] arr = new String[truths.length];
        int count = 0;
        for(boolean t : truths){
            if(t){ // same as (n == true)
                arr[count] = "YES";
            } else {
                arr[count] = "NO";
            }
            count++;
        }
        return arr;
    }
    public static void print(String[] arr){
        for(String n : arr){
          System.out.print(n + " ");  
        }
    }
    public static void main(String[] args){
        int[] nums = {1,3,6};
        print(nums);
        System.out.println();
        printTwice(nums);
        System.out.println();
        printDouble(nums);
        System.out.println();
        doubleContents(nums);
        print(nums);
        System.out.println();
        boolean[] var = {true, false, true, false, false, true};
        print(yesNo(var));
    }
}
