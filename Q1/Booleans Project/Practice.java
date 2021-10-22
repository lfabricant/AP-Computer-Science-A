/**
 * This class includes practice problems using artihmetic operations.
 *
 * @author (Lindsay Fabricant)
 * @version (10/18/19)
 */
public class Practice
{
    public static void main (String[] args)
    {
        System.out.println(dividesSelf(128));
        System.out.println(hasOne(877190083));
    }
    public static boolean dividesSelf(int num)
    {
        if (num == 0)
        {
            return false;
        }
        while (num > 0)
        { 
            int x = num%10;
            if (x == 0 || num%x != 0)
            {
                return false;
            }
            else
            {
                num/=10;
            }
        }
        return true;
    }
    public static boolean hasOne(int n)
    {
        int x = n;
        while (x%10 != 1 && x>= 1)
        {
            x/=10;
        }
        if (x%10 == 1)
        {
            return true;
        }
        return false;
    }
}
