import java.util.*;
/**
 * Practice problems with ArrayLists
 *
 * @author (Lindsay Fabricant)
 * @version (1/10/20)
 */
public class BeginnerPractice
{
    public static void main(String[] args){
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        // (int)(Math.random()*(b-a+1)+a)
        for(int i = 0; i < 25; i++){
            int randValue = (int) (Math.random()*(31) + 30);
            randNums.add(randValue);
        }
        System.out.println(randNums);
        addFive(randNums);
        System.out.println(has30And60(randNums));
        System.out.println(count50s(randNums));
        System.out.println(sum(randNums));
        evens(randNums);
        makeOdd(randNums);
    }
    public static ArrayList<Integer> addFive(ArrayList<Integer> vals){
        for(int i = 0; i < vals.size(); i++){
            vals.set(i, vals.get(i)+5);
        }
        System.out.println(vals);
        return vals;
    }
    public static boolean has30And60(ArrayList<Integer> values){
        boolean thirty = false;
        boolean sixty = false;
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) >= 30 && values.get(i) <= 39){
                thirty = true;
            }
            if(values.get(i) >= 60 && values.get(i) <= 69){
                sixty = true;
            }
        }
        return thirty && sixty;
    }
    public static int count50s(ArrayList<Integer> arr){
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 50)
                count++;
        }
        return count;
    }
    public static int sum(ArrayList<Integer> nums){
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }
    public static ArrayList<Integer> evens(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNums = new ArrayList<Integer>();
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                evenNums.add(numbers.get(i));
            }
        }
        System.out.println(evenNums);
        System.out.println(numbers);
        return evenNums;
    }
    public static void makeOdd(ArrayList<Integer> numerals){
        System.out.println(numerals);
         for(int i = 0; i < numerals.size(); i++){
            if(numerals.get(i) % 2 == 0){
                numerals.remove(numerals.get(i));
            }
        }
        System.out.println(numerals);
    }
}
