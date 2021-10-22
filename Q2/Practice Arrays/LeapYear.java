/**
 * Classwork based on calculating a leap year.
 *
 * @author (Lindsay Fabricant)
 * @version (1/6/20)
 */
public class LeapYear
{
    public static boolean isLeapYear(int year){
        if(year % 100 == 0 && year % 400 == 0){
            return true;
        } else if (year % 100 != 0 && year%4 == 0) {
            return true;
        }
        return false;
    }      
    public static int febDays (int year){
        if(isLeapYear(year) == true){
            return 29;
        } else {
            return 28;
        }
    }
    public static int daysInYear(int year){
        return febDays(year) + 337;
    }
    public static int[] daysIn100Years(int year){
        int[] arr = new int[100];
        int count = 0;
        for(int i = year; i < year+100; i++){
            arr[count] = daysInYear(i);
            count++;
        }
        return arr;
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
        System.out.println(isLeapYear(2100));
        System.out.println(febDays(2100));
        System.out.println(daysInYear(2100));
        printHelper(daysIn100Years(2080));
    }
}
