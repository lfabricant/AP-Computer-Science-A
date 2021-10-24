/**
 * Write a description of class TwoDArrayProjects1 here.
 *
 * @author (Lindsay Fabricant)
 * @version (2/7/2020)
 */
public class TwoDArrayProjects1
{
    public static void main(String[] args){
        int[][] twoDArray1 = {{1,2} , {3,4}, {5,6}};
        int[][] twoDArray2 = {{5,6} , {7,12,13,5}, {5,6,0}};
        print(twoDArray1);
        System.out.println(sum(twoDArray1));
        printRow(twoDArray1, 1);
        printRow(twoDArray2, 2);
    }
    /**
     * Constructor for objects of class TwoDArrayProjects1
     */
    public static void print(int[][] arr)
    {
        int rows = arr.length;
        int columns = arr[0].length;
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                System.out.println(arr[r][c]);
            }
        }
    }
    public static int sum(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;
        int sum = 0;
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                sum += arr[r][c];
            }
        }
        return sum;
    }
    public static void printRow(int[][] arr, int row){
        for(int c = 0; c < arr[row].length; c++){
            System.out.println(arr[row][c]);
        }
    }
}
