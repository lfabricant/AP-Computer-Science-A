/**
 * Write a description of class NumberFun3 here.
 * 
 * @author (Lindsay Fabric) 
 * @version (a version number or a date)
 */
public class NumberFun3
{
    /**
     * This method prints "amount" of "num"s multiples on new lines.
     */
    public void multiples(int num, int amount)
    {
        for (int i = 1; i<= amount; i++)
        {
            System.out.println(i*num);
        }
    }
     /**
      * This method prints all factors of num on new lines
      */
     public void printFactors(int num)
     {
        for (int i = 1; i<= num; i++)
        {
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
     /**
     * This method returns the sum of all factors of num
     * @precondition: num>=0
     */
    public int sumFactors(int num)
    {
        int x = 0;
        for (int i = num; i >= 1; i--)
        {
            if (num%i == 0)
            {
                x += i;
            }
            x = x;
        }
        return x;
    }
    /**
     * This method returns the average of the the factors of num.
     * @precondition: num>=0
     */
    public double meanOfFactors(int num)
    {
        double f = 0;
        double counter = 0;
        for (int i = num; i >= 1; i--)
        {
            if (num%i == 0)
            {
                f += i;
                counter++;
            }
            f = f;
        }
        return f/counter;
    }
    /**
     * This method returns true if num is a “perfect number”.
     * @precondtion: num>=0
     */
    public boolean isPerfect(int num)
    {
        if (sumFactors(num)-num == num)
        {
            return true;
        }
        return false;
     }
    /**
     * This method returns true if is num is a prime number
     * @precondition: num>=0
     */
    public boolean isPrime(int num)
    {
        if (sumFactors(num) == 1+num)
        {
            return true;
        }
        return false;
    }  
    /**
     * This method returns the greatest common factor of a and b
     * @precondition: a>=0, b>=0
     */
    public int GCF(int a, int b)
    {
        int counter = 1;
        int gcf = 1;
        if(b<a)
        {       
            if (a%b == 0)
            {
                gcf = b;
            }
            else
            {
                while(counter <= b)          
                {
                    if(b%counter == 0 && a%counter==0)
                    {
                        gcf = counter;
                    }
                    counter++;
                }
            }
        }
        if (b%a == 0)
        {
            gcf = a;
        }
        else
        {    
            while(counter <= a)          
            {
                if(a%counter == 0 && b%counter==0)
                {
                    gcf = counter;
                }
                counter++;
            }
        }
        return gcf;
    }
    /**
     * This method returns true if d is any digit in num
     * @precondition: num >= 1
     */
    public boolean containsDigit(int num, int d)
    {    
        if (num%10 == d)
        {
            return true;
        }
        else 
        {
            int i = num;
            if (i/10 > 0)
            {
                if (i%10 == d)
                {
                    return true;
                }
                i/=10;
            }
            return false;
        }    
        }
    }
  
 
