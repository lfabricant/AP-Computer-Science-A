/**
 * Write a description of class TimesTable here.
 *
 * @author (Lindsay Fabricant)
 * @version (10/23/19)
 */
public class TimesTable
{
   public static void main(String[] args)
   {
       TimesTable t = new TimesTable();
       System.out.println(t.multiples(3,6));
       System.out.println();
       t.print2Rows();
       System.out.println();
       t.printNRows(6);
       System.out.println();
       t.printTable(12,12);
   }
   public String multiples(int a, int num)
   {
      String l = "";
      for(int i = 1; i <= a; i++)
      {
           l += i*num + " ";
      }
      return l;
   }
   public void print2Rows()
   {
      //printTable(2,12)
      for(int r = 1; r <= 2; r++)
      {
          for(int c = 1; c <= 12; c++)
          {
              System.out.print(r*c + " ");
          }
          System.out.println();
      }
   }
   public void printNRows(int n)
   {
      //printTable(n,12)
      for(int r = 1; r <= n; r++)
      {
          for(int c = 1; c <= 12; c++)
          {
             System.out.print(r*c + "  ");
          }
          System.out.println();
      }
   }
   public void printTable(int rows, int columns)
   {
      for(int r = 1; r <= rows; r++)
      {
          for(int c = 1; c <= columns; c++)
          {
              if (r*c < 10)
              {
                  System.out.print(r*c + "  ");
                }
              else
              {
                  System.out.print(r*c + " ");
                }
              
          }
          System.out.println();
      }
   }
}
