/**
 * This class inserts a value into an array.
 *
 * @author (Lindsay Fabricant)
 * @version (12/9/19)
 */
public class DowNow129
{
    public static int[] insertValue(int[] sortedNums, int valueToInsert){
        int lastZero = sortedNums.length-1;
        while(sortedNums[lastZero] == 0){
            lastZero--;
        }
        lastZero++; // goes to term before without this
        int indexToReplace = lastZero;
        for(int i = 0; i < indexToReplace; i++){
            if(sortedNums[i] > valueToInsert){
                indexToReplace = i;
                break;
            }
        }
        for(int i = lastZero; i > indexToReplace; i--){
            sortedNums[i] = sortedNums[i-1];
        }
        sortedNums[indexToReplace] = valueToInsert;
        return sortedNums;
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
        int[] test = {1,1,2,3,8,21,0,0,0};
        printHelper(insertValue(test, 5));
    }
}
