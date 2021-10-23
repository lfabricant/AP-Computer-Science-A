import java.util.ArrayList;
/**
 * Write a description of class Word here.
 *
 * @author (Lindsay Fabricant)
 * @version (1/27/20)
 */
public class Word
{
    private String originalWord;
    private String sortedWord;
    // compareTo to alphabetize, then check if they are equal!
    public Word(String theWord){
        originalWord = theWord;
        sortedWord = sortWord();
    }
    private String sortWord(){
        sortedWord = "";
        ArrayList<String> w = new ArrayList<String>();
        for(int i = 0; i < originalWord.length(); i++){
            w.add(originalWord.substring(i,i+1));
        }
        for(int i = 0; i < originalWord.length(); i++){
            String s = w.get(0);
            int index = 0;
            for(int j = 1; j < w.size(); j++){
              String check = w.get(j);
              if(s.compareTo(check) > 0){
                 s = check;
                 index = j;
              }
            }
            sortedWord += s;
            w.remove(index);
        }
        return sortedWord;
    }
    public String getWord(){
        return originalWord;
    }
    public String getSortedWord(){
        return sortedWord;
    }
}

