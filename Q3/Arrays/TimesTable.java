/**
 * Practice with arrays and 2D arrays through creating times tables
 * 
 * @author (Lindsay Fabricant) 
 * @version (2/11/20)
 */
public class TimesTable
{
    public static void printArray(int[] arr)
    {
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void print2DArray(int[][] arr)
    {
        for(int[] nums: arr)
        {
            for(int n:nums)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    public static int[] timesRow(int rowNum){
        int[] arr = new int[20];
        for(int i = 1; i <= 20; i++){
            arr[i-1] = rowNum*i;
        }
        return arr;
    }
    public static int[] timesRow(int rowNum, int x){
        int[] arr = new int[x];
        for(int i = 1; i <= x; i++){
            arr[i-1] = rowNum*i;
        }
        return arr;
    }
    public static int[][] timesTable(){
        int[][] arr = new int[20][20];
        for(int i = 1; i <= 20; i++){
            int[] line = timesRow(i);
            arr[i-1] = line;
        }
        return arr;
    }
    public static int[][] timesTableVarRows(int n){
        int[][] arr = new int[n][20];
        for(int i = 1; i <= n; i++){
            int[] line = timesRow(i);
            arr[i-1] = line;
        }
        return arr;
    }
    public static int[][] timesTableGeneral(int rows, int columns){
        int[][] arr = new int[rows][columns];
        for(int i = 1; i <= rows; i++){
            int[] line = timesRow(i,columns);
            arr[i-1] = line;
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println();
        printArray(timesRow(3));
        System.out.println();
        printArray(timesRow(3,5));
        System.out.println();
        print2DArray(timesTable());
        System.out.println();
        print2DArray(timesTableVarRows(6));
        System.out.println();
        print2DArray(timesTableGeneral(7,4));
        System.out.println();
    }
}
