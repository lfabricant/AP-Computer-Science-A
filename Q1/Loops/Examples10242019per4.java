/**
 * Write a description of class Examples10242019per4 here.
 *
 * @author (Lindsay Fabricant)
 * @version (10/24/19)
 */
public class Examples10242019per4
{
    public static void main (String[] args)
    {
        System.out.println();
        method1a(5);
        System.out.println();
        method1w(5);
        System.out.println();
        System.out.println();
        method2(5,8);
        System.out.println();
        method2(5,7);
        System.out.println();
        lettuce(5);
        System.out.println();
        joe(5,2,5);
    }
    public static void method1a(int numStars)
    {
        for (int i = 0; i < numStars; i++)
        {
            System.out.print("* ");
        }
    }
    public static void method1w(int numStars)
    {
        while (numStars > 0)
        {
            System.out.print("* ");
            numStars--;
        }
    }
    public static void method2(int cols, int rows)
    {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
            {
                if (r%2 == 0)
                // if r=1 at the beginning, then r%2 == 0 print "-"
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    public static void lettuce(int num)
    {
        for (int l = 1; l <= num; l++)
        {
            for (int c = 0; c < num; c++)
            {
                if (l%2 == 1)
                {
                    System.out.print("lettuce ");
                }
                else
                {
                    System.out.print("cookies ");
                }
            }
            System.out.println();
        }
    }
    public static void joe(int rows, int joes, int mamas)
    {
        for (int r = 0; r < rows; r++)
        {
            if (r%2 == 0)
            {
                for (int j = 0; j < joes; j++)
                {
                    System.out.print("Joe ");
                }
            }
            else
            {
                for (int m = 0; m < mamas; m++)
                {
                    System.out.print("Mama ");
                }
            }
            System.out.println();
        }
    }
}
