public class SortingAlgorithms {
    public static void selectionSort(int[] nums){
         int index = 0;
         for(int i = 0; i < nums.length; i++){
            index = i;
            for(int j = 0; j < nums.length;j ++){
                if(nums[j] < nums[index]){
                    nums = sort(i,index, nums);
                    index = i;
                }
            }
         }
         printHelperInt(nums);
    }
    public static int[] sort(int from, int to, int[] arr){
           int temp = arr[from];
           arr[to] = temp;
           arr[from] = to;
           return arr;
    }
    public static void printHelperInt(int[] arr){
        int lastIndex = arr.length-1;
        System.out.print("{");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[lastIndex] + "}");
    }
    public static void main(String[] args){
        int arrays = (int)((Math.random()*6)+5);
        for(int i = 0; i < arrays; i++){
            int[] arr = randArrayGenerator(1,100,(int)(Math.random()*6+15));
            System.out.println("Create an array: ");
            printHelperInt(arr);
            System.out.println();
            System.out.println("Sort an array: ");
            selectionSort(arr);
            System.out.println();
            insertionSort(arr);
            System.out.println();
            System.out.println();
        }
    }
    private static int[] randArrayGenerator(int start, int end, int numTerms){
        int[] arr = new int[numTerms];
        for(int i = 0; i < numTerms; i++){
            int val = (int)(Math.random()*(end-start+1)+start);
            arr[i] = val;
        }
        return arr;
    }
    public static void insertionSort(int[] elements){
        for(int j = 1; j < elements.length; j++){
            int temp = elements[j];
            int p = j;
            while(p > 0 && temp < elements[p-1]){
                elements[p] = elements[p-1];
                p--;
            }
            elements[p] = temp;
        }
        printHelperInt(elements);
    }
}
