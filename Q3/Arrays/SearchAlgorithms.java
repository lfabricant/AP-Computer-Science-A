public class SearchAlgorithms
{
    public static void main(String[] args){
        int[] n = {5,6,9,-2,20,4,2};
        System.out.println(seqSearch(n, -2));
        String[] l = {"A","C","E","G","I","K","M"};
        System.out.println(binarySearch(l, "I"));
        int[] w = {1,2,4,7,8,10};
        System.out.println(binaryStringSearch(w, 10));
    }
    public static int seqSearch(int[] arr, int target){
        int count = 0;
        for(int n : arr){
            if(n == target){
                return count;
            }
            count++;
        }
        return -1;
    }
    public static int binarySearch(String[] strings, String target){
        int min = 0;
        int max = strings.length-1;
        while(min <= max){
            int mid = (max+min)/2;
            int compare = strings[mid].compareTo(target);
            if(compare == 0){
                return mid;
            }
            else if (compare < 0){
                min = mid + 1;
            }
            else {
                max = mid-1;
            }
        }
        return -1;
    }
    public static int binaryStringSearch(int[] nums, int target){
        int min = 0;
        int max = nums.length-1;
        while(min <= max){
            int mid = (max+min)/2;
            //int compare = nums[mid].compareTo(target);
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                min = mid + 1;
            }
            else {
                max = mid-1;
            }
        }
        return -1;
    }
}
