
/**
 * Write a description of class NumberFunTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberFunTester
{
    public static void main (String args[])
    {
        NumberFun3 nf = new NumberFun3();
        nf.multiples(4,5);
        System.out.println("4, 8, 12, 16, 20 is expected. \n");
        
        nf.printFactors(96);
        System.out.println("1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 96 is expected. \n");
        
        System.out.println("Sum of the factors of 512: " + nf.sumFactors(512));
        
        System.out.println("Mean of the factors of 512: " + nf.meanOfFactors(512));
        
        System.out.println("Returns true that 496 is a perfect number: " + nf.isPerfect(496));
        
        System.out.println("Returns false that 6 is not prime: " + nf.isPrime(6));
        
        System.out.println("Returns true that 11 is prime: " + nf.isPrime(11));
        
        System.out.println("Returns the GCF of 6 and 6: " + nf.GCF(6,6));
        
        System.out.println("Returns if 120 contains the number 2: " + nf.containsDigit(120,2));
    }
}
