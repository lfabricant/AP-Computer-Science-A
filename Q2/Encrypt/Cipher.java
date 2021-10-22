
/**
 * This class encrypts a set of code and then can decrypt it after.
 *
 * @author (Lindsay Fabricant)
 * @version (11/26/19)
 */
public class Cipher
{
    public static void main (String[] args){
        System.out.println(encrypt("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(decrypt("LM#Q&$+U^W%@BYZCD=FGH!?KN*"));
        
        System.out.println(encrypt("abcdefghijklmnopqrstuvwxy"));
        System.out.println(decrypt("LM#Q&$+U^W%BCY@D=FGH!?KN*"));
        System.out.println(encrypt(" Chelsea"));
        System.out.println(decrypt("=LH$@C="));
    }
    public static String encrypt(String word){
        word = word.trim();
        word = word.toUpperCase();
        
        word = word.replace('A', '@');
        word = word.replace('E', '=');
        word = word.replace('I', '!');
        word = word.replace('J', '?');
        word = word.replace('O', '*');
        word = word.replace('P', '#');
        word = word.replace('R', '&');
        word = word.replace('S', '$');
        word = word.replace('T', '+');
        word = word.replace('V', '^');
        word = word.replace('X', '%');
        word = word.replace(' ', '_');
        
         int len = word.length();
        String secondHalf = word.substring((len+1)/2);
        String firstHalf = word.substring(0, (len+1)/2);
        word = secondHalf + firstHalf;
        
        String firstTwo = word.substring(0,2);
        String secondTwo = word.substring(len-2);
        String middle = word.substring(2, len-2);
        word = secondTwo + middle + firstTwo;
        
        if(len%2 == 0){
            String secondMid = word.substring(len/2, len/2+2);
            String firstMid = word.substring(len/2-2, len/2);
            String left = word.substring(0, len/2-2);
            String right = word.substring(len/2 + 2);
            word = left + secondMid + firstMid + right;
        } 
        else {
           String secondMid = word.substring(len/2+1, len/2+3);
           String firstMid = word.substring(len/2-1, len/2+1);
           String left = word.substring(0, len/2-1);
           String right = word.substring(len/2 + 3);
           word = left + secondMid + firstMid + right;
        }
       
        return word;
       
    }
    public static String decrypt(String codeWord){
        codeWord = codeWord.trim();
        
        int len = codeWord.length();
        if(len%2 == 0){
            String secondMid = codeWord.substring(len/2, len/2+2);
            String firstMid = codeWord.substring(len/2-2, len/2);
            String left = codeWord.substring(0, len/2-2);
            String right = codeWord.substring(len/2 + 2);
            codeWord = left + secondMid + firstMid + right;
        } 
        else {
           String secondMid = codeWord.substring(len/2+1, len/2+3);
           String firstMid = codeWord.substring(len/2-1, len/2+1);
           String left = codeWord.substring(0, len/2-1);
           String right = codeWord.substring(len/2 + 3);
           codeWord = left + secondMid + firstMid + right;
        }
       
        String firstTwo = codeWord.substring(0,2);
        String secondTwo = codeWord.substring(len-2);
        String middle = codeWord.substring(2, len-2);
        codeWord = secondTwo + middle + firstTwo;
        
        if(len%2 == 0){
            String secondHalf = codeWord.substring((len+1)/2);
            String firstHalf = codeWord.substring(0, (len+1)/2);
            codeWord = secondHalf + firstHalf;
        } else {
            String secondHalf = codeWord.substring((len-1)/2);
            String firstHalf = codeWord.substring(0, (len-1)/2);
            codeWord = secondHalf + firstHalf;
        }
        
        codeWord = codeWord.replace('@', 'A');
        codeWord = codeWord.replace('=', 'E');
        codeWord = codeWord.replace('!', 'I');
        codeWord = codeWord.replace('?', 'J');
        codeWord = codeWord.replace('*', 'O');
        codeWord = codeWord.replace('#', 'P');
        codeWord = codeWord.replace('&', 'R');
        codeWord = codeWord.replace('$', 'S');
        codeWord = codeWord.replace('+', 'T');
        codeWord = codeWord.replace('^', 'V');
        codeWord = codeWord.replace('%', 'X');
        codeWord = codeWord.replace('_', ' ');
        
        codeWord = codeWord.toLowerCase();
        
        return codeWord;
    }   
}
