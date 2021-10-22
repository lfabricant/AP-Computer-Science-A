
/**
 * Write a description of class DoNow1218 here.
 *
 * @author (Lindsay Fabricant)
 * @version (12/18/19)
 */
public class DoNow1218
{
    public int occursNum(String[] arr, String str){
        int count = 0;
        for(String x : arr){
            if(x.equals(str)){
                count++;
            }
        }
        return count;
    }
    public int lengthOccursNum(String[] arr, String str){
        int count = 0;
        for(String x : arr){
            if(x.length() == str.length()){
                count++;
            }
        }
        return count;
    }
    public int containsStr(String[] arr, String str){
        int count = 0;
        for(String x : arr){
            for(int i = 0; i < x.length()-str.length(); i++){
                if(x.substring(i, str.length()).equals(str)){
                    count++;
                }
                // .indexOf or .contains is another option
                // if(a.indexOf(str) >= 0){  ** if the string is not in it, then it returns -1
                //    count++;
                //}
            }
        }
        return count;
    }
    public static void main(String[] args){
        DoNow1218 t = new DoNow1218();
        String[] strs = {"a","bb","c","bb","bb","a"};
        System.out.println(t.occursNum(strs, "a"));
        System.out.println(t.lengthOccursNum(strs, "XX")); // length of 2
        System.out.println(t.containsStr(strs, "b"));
    }
}
