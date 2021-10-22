/**
 * Write a description of class DoNow1210 here.
 *
 * @author (Lindsay Fabricant)
 * @version (12/10/19)
 */
public class DoNow1210
{
    public static int[] randomArray(int n, int a, int b){
         int[] var = new int[n];
         int count = 0;
         for(int i = 0; i <= n-1; i++){
             var[i] = (int)(Math.random()*(b+1-a)+a);
         }
         return var;
    }
    public static void printHelper(int[] arr){
        int lastIndex = arr.length-1;
        System.out.print("{");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[lastIndex] + "}");
    }
    public static void main(String[] args){
        printHelper(randomArray(6,1,22));
    }
}
