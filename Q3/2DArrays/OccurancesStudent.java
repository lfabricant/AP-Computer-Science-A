import java.util.Arrays;
/**
 * Write a description of class Occurances here.
 *
 * @author (Lindsay Fabricant)
 * @version (2/11/20)
 */
public class OccurancesStudent
{
    // @precondition : for all methods, assume that all parameters are not empty, or null
    public static void main(String[] args){
        System.out.println();
        for(int i = 0; i < 5; i++)
        {
            int rows = (int)(Math.random() * 5 + 2);
            int cols = (int)(Math.random() * 5 + 2);
            int[][] arr = create(rows, cols);
            print(arr);
            System.out.println("find(arr, 3) : " + Arrays.toString(find(arr,3)));
            System.out.println();
            System.out.println("hasDouble(arr) : " + hasDouble(arr));
            System.out.println();
            System.out.println("numDoubles(arr) : " + numDoubles(arr));
            System.out.println();
            occuranceTable(arr);
            System.out.println("---------------------------------------------------");
            System.out.println();
        }
    }
    public static void print(int[][] x)
    { 
       for(int[] a : x ){
            for(int b : a ){
                System.out.print(b + "\t");
            }
            System.out.println();
        }
       System.out.println(); 
    }
    public static int[][] create(int r, int c)
    {
        int[][] x = new int[r][c];
        for(int a = 0; a<x.length; a++){ // # of rows
            for(int b = 0; b<x[a].length; b++){ // # ofcolumns
                x[a][b] = (int)(Math.random() * 20 + 1);
                       // (int)(Math.random() * b-1 + a); where # of terms (b-a+1 is the high-low+1), and # to start (a is the lowest term)
            }
        }
        return x;
    }
    public static int[] find(int[][] nums, int value)
    {
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[0].length; c++){
                if(nums[r][c] == value){
                    int[] arr = {r,c};
                    return arr;
                }
            }
        }
        int[] a = new int[0];
        return a;          
    }
    private static int numOccurances(int[][] x, int value)
    {
       int count = 0;
       for(int r = 0; r < x.length; r++){
            for(int c = 0; c < x[0].length; c++){
                if(x[r][c] == value){
                    count++;
                }
            }
        }
       return count;
    }
    public static boolean hasDouble(int[][] arr)
    {
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(numOccurances(arr,arr[r][c]) == 2)
                    return true;
            }
        } 
        return false;
    }
    public static boolean hasMultiples(int[][] arr)
    {
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(numOccurances(arr,arr[r][c]) >= 2)
                    return true;
            }
        } 
        return false;
    }
    public static boolean hasTriple(int[][] arr)
    {
         for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(numOccurances(arr,arr[r][c]) == 3)
                    return true;
            }
        } 
        return false;
    }
    public static boolean hasMultiple(int[][] arr, int numOccurances)
    {
         for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(numOccurances(arr,arr[r][c]) == numOccurances)
                    return true;
            }
        } 
        return false;
    }
    public static int numDoubles(int[][] arr)
    {
        int count = 0; 
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(numOccurances(arr,arr[r][c]) == 2){
                    count++;
                }
            }
        } 
        return count/2; // it would count every double twice
    }
    public static int[][] occuranceTable(int[][] x)
    {
        int[][] arr = new int[x.length][x[0].length];
        for(int r = 0; r < x.length; r++){
            for(int c = 0; c < x[0].length; c++){
                arr[r][c] = numOccurances(x, x[r][c]);
            }
        }
        return arr;
    }
}
