/**
 * Squares and cubes of numbers
 *
 * @author (Lindsay Fabricant)
 * @version (12/3/19)
 */
public class Practice
{
    public static void pract2(){
        int[] cubes = new int[21];
        int i = 0;
        for(int w = 23; w >= 3; w--){
            cubes[i] = w*w*w;
            i++;
        }
        printHelper(cubes);
        
        int x = 23;
        for(int j = 0; j < 21; j++){
            cubes[j] = x*x*x;
            x--;
        }
        System.out.println();
        printHelper(cubes);
        
        int y = 23;
        int k = 0;
        while(k < 21){
            cubes[k] = y*y*y;
            y--;
            k++;
        }
        System.out.println();
        printHelper(cubes); 
    }
    public static void printHelper(int[] arr){
        int lastIndex = arr.length-1;
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[lastIndex] + "]");
    }
}
