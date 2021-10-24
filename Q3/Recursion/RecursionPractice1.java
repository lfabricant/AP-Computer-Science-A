/**
 * Write a description of class RecursionPractice1 here.
 *
 * @author (Lindsay Fabricant)
 * @version (3/11/20)
 */
public class RecursionPractice1
{
    public static int bunnyEars(int bunnies){
       if(bunnies <= 0){
           return 0;
       } else {
           return bunnyEars(bunnies-1)+2;
       } 
    }
    public static int sumDigits(int n){
       if(n <= 0){
           return 0;
       } else {
           return sumDigits(n/10)+n%10;
       } 
    }
    public static int count7(int n){
       int count = 0;
       if(n <= 0){
           return 0;
       } else if(n%10 == 7){
           count++;
           return count7(n/10)+count;
       } else {
           return count7(n/10);
       }
    } 
    public static int countHi(String str){
        if(str.length() <= 1){
           return 0;
        } else if(str.substring(str.length()-2).equals("hi")){
           return countHi(str.substring(0,str.length()-2))+1;
        } else {
           return countHi(str.substring(0,str.length()-1));
        }
    }
    public static int countHi2(String str){
        if(str.length() <= 1){
           return 0;
        } else if(str.substring(str.length()-2).equals("hi") && !str.substring(str.length()-3,str.length()-2).equals("x")){
           return countHi2(str.substring(0,str.length()-3))+1;
        } else {
           return countHi2(str.substring(0,str.length()-1));
        }
    }
    public static boolean strCopies(String str, String sub, int n){
        if(str.length() < sub.length() && n != 0){
           return false;
        } else if(str.length() < sub.length() && n == 0){
           return true;
        } else if(str.substring(0, sub.length()).equals(sub)){ 
           return strCopies(str.substring(sub.length()),sub,n-1);
        } else {
           return strCopies(str.substring(1),sub,n);
        }
    }
    public static void main(String[] args){
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(12));
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }
}
