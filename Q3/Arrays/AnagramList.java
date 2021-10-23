import java.util.ArrayList;
/**
 * Write a description of class AnagramList here.
 *
 * @author (Lindsay Fabricant)
 * @version (1/28/20)
 */
public class AnagramList
{   
    private ArrayList<Word> wordList;
    public AnagramList(){
        wordList = new ArrayList<Word>();
    }
    public void addWord(String newString){
        Word s = new Word(newString);
        wordList.add(s);
    }
    public boolean checkAnagram(Word aWord, Word anotherWord){
        String checkA = aWord.getSortedWord();
        String checkB = anotherWord.getSortedWord();
        return checkA.equals(checkB);
    }
    public void printAnagram(String key){
        Word k = new Word(key);
        String var = k.getSortedWord();
        for(int i = 0; i < wordList.size(); i++){
            if(checkAnagram(wordList.get(i),k)){
                System.out.println(wordList.get(i).getWord());
            }
        }
    }
    public static void main(String[] args){
        AnagramList check = new AnagramList();
        check.addWord("stop");
        check.addWord("tops");
        check.addWord("post");
        check.addWord("arc");
        check.addWord("car");
        check.printAnagram("pots");
    }
}


