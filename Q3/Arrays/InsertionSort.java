/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSort
{
    public static void insertionSort(String[] elements){
        for(int j = 1; j < elements.length; j++){
            String temp = elements[j];
            int possibleIndex = j;
            while(possibleIndex > 0 && temp.compareTo(elements[possibleIndex-1]) > 0){
                elements[possibleIndex] = elements[possibleIndex-1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        String[] arr = new String[elements.length];
        int index = 0;
        for(int i = elements.length-1; i >= 0; i--){
            arr[index] = elements[i];
            index++;
        }
        printHelper(arr);
    }
    public static void printHelper(String[] arr){
        int lastIndex = arr.length-1;
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[lastIndex] + "]");
    }
    public static void main(String[] args){
       String[] arr = {"cat", "bat", "sat", "hat", "star", "barn", "heart"};
       insertionSort(arr);
    }
}
