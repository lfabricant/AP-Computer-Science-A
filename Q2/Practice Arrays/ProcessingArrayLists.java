import java.util.ArrayList;
/**
 * Write a description of class ProcessingArrayLists here.
 *
 * @author (Lindsay Fabricant)
 * @version (a version number or a date)
 */
public class ProcessingArrayLists
{
    public static void doubleReverse(ArrayList<String> strs){
        ArrayList<String> n = new ArrayList<String>();
        int count = 0;
        for(int s = strs.size()-1; s >= 0; s--){
            n.add(count, strs.get(s));
            count++;
        }
        for(int i = 0; i < n.size(); i++){
            String st = n.get(i);
            String ring = "";
            for(int j = st.length()-1; j > 0; j--){
                ring += st.substring(j,j-1);
            }
            System.out.println(ring);
           // n.set(i, ring);
        }
       // System.out.println(n);
    }
    public static void callReverse(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("Goodbye");
        words.add("Later");
        System.out.println(words);
        doubleReverse(words);
    }
}
