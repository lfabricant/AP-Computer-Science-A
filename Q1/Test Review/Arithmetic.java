
/**
 * Write a description of class Arithmetic here.
 *
 * @author (Lindsay Fabricant)
 * @version (10/29/19)
 */
public class Arithmetic
{
    public static void main (String[] args)
    {
        Arithmetic math = new Arithmetic();
        System.out.println(math.maxInt(1,100,1));
        System.out.println(math.divis23(15));
        System.out.println(math.notDivis23(15));
    }
    public int maxInt(int a, int b, int c)
    {
        if (a >= b && a >= c)
        {
            return a;
        }
        else if (b >= a && b >= c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public int divis23(int n)
    {
        int counter = 0;
        for (int i = 1; i <= n; i++)
        {
           if (i%2 == 0 || i%3 == 0)
           {
               counter++;
           }
        }
        return counter;
    }
    public int notDivis23(int n)
    {
        return n - divis23(n);
    }
}
