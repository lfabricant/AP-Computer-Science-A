/**
 * Write a description of class booleans here.
 *
 * @author (Lindsay Fabricant)
 * @version (10/3/19)
 */
public class booleans
{
  public static void main(String [] args)
  {
      System.out.println("sleepIn(false, false) -> " + sleepIn(false, false));
      System.out.println("sleepIn(true, false) -> " + sleepIn(true, false));
      System.out.println("sleepIn(false, true) -> " + sleepIn(false, true));
      System.out.println("parrotTrouble(true, 6) -> " + parrotTrouble(true, 6));
      System.out.println("parrotTrouble(true, 7) -> " + parrotTrouble(true, 7));
      System.out.println("parrotTrouble(false, 6) -> " + parrotTrouble(false, 6));
      System.out.println("makes10(9, 10) -> " + makes10(9, 10));
      System.out.println("makes10(9, 9) -> " + makes10(9, 9));
      System.out.println("makes10(1, 9) -> " + makes10(1, 9));
      System.out.println("nearHundred(90) -> " + nearHundred(90)); 
      System.out.println("nearHundred(89) -> " + nearHundred(89));
      System.out.println("nearHundred(209) -> " + nearHundred(209));
    }
  public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation)
        {
           return true;
        }
        else
           // you technically don't need brackets with one return in an 
           // else statement, but do it to be careful
           return false;
  }
  public static boolean parrotTrouble(boolean talking, int hour) 
  {
      if (talking)
      {     
          if (hour < 7 || hour > 20)
            {
                return true;
            }
          else
                return false;
      }
      else
 
            return false;
  }
  public static boolean makes10(int a, int b) {
      if((a == 10 || b == 10) || (a + b == 10))
      {
          return true;
        }
      else
          return false;
  }
  public static boolean nearHundred(int n) {
      if ((90 <= n) && (n <= 110) || (190 <= n) && (n <= 210))
      {
          return true;
      }
      else
          return false;
  }
}



