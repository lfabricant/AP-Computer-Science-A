
/**
 * Write a description of class StringPractice here.
 *
 * @author (Lindsay Fabricant)
 * @version (11/19/19)
 */
public class StringPractice
{
    public static int numE(String str){
        int len = str.length();
        int countE = 0;
        for (int i = 0; i < len; i++)
        {
            if(str.charAt(i) == 'e')
            {
                countE++;
            }
        }
        return countE;
    }
    public static boolean twoE(String str){
        return numE(str) == 2;
        // faster in return rather than in an if statement
    }
    public static int momDad(String str){
        int count = 0;
        int len = str.length();
        for (int i = 0; i < (len-2); i++){
            String sub = str.substring(i, i+3);
            if (sub.equals("mom") || sub.equals("dad")){
                count++;
            }
        }
        return count;
    }
    public static int middleChar(String str){
        int len = str.length();
        if (len%2 == 0){
            return 0;
        }
        int count = 0;
        int midIndex = len/2;
        // remember it returns and int and counting starts at zero
        String midChar = str.substring(midIndex, midIndex+1);
        // stops before second term
        for (int i = 0; i < len; i++)
        {
            if (midChar.equals(str.substring(i,i+1)))
            {
                count++;
            }
        }
        return count;
    }
    public static void main (String args[]){
        String s1 = "Event";
        String s2 = "event";
        System.out.println(numE(s1));
        System.out.println(numE(s2));
        System.out.println(twoE(s1));
        System.out.println(twoE(s2));
        System.out.println(momDad("momdadbro"));
        System.out.println(momDad("bromomsis"));
        System.out.println(momDad("momom"));
        System.out.println(momDad("dmodmom"));
        System.out.println(middleChar("mom"));
    }
}
