/**
 * More practice questions using arrays.
 *
 * @author (Lindsay Fabricant)
 * @version (12/17/19)
 */
public class ArraysPractice
{
    public static boolean increasingValues(int[] values){
        int f = values[0];
        for(int n : values){
            if(n >= f){
                f = n;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean adjacentHundreds(int[] values){
        for(int i = 0; i < values.length-1; i++){
            if(values[i] == 100 && values[i+1] == 100){
                return true;
            }
        }
        return false;
    }
    public static boolean closeValues(int[] values){
        for(int i = 0; i < values.length-2; i++){
            if(values[i+2] - values[i] <= 2){
                return true;
            }
        }
        return false;
    }
    public static int twinning(String[] a, String[] b){
        int count = 0;
        for(String first : a){
            for(String second : b){
                if(first.length() > 0 && second.length() > 0){
                    if (first.substring(0,1).equals(second.substring(0,1))){
                       count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] higher = {1,1,4};
        System.out.println(increasingValues(higher));
        int[] hundreds = {100,100,10};
        System.out.println(adjacentHundreds(hundreds));
        int[] close = {3,4,5};
        System.out.println(closeValues(close));
        String[] twinsA = {"xx", "bb", "cc"};
        String[] twinsB = {"aaa", "", "bb"};
        System.out.println(twinning(twinsA, twinsB));
    }
}
