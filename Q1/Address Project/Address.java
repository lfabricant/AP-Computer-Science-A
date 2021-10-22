/**
 * Write a description of class Address here.
 * 
 * @author (Lindsay Fabricant) 
 * @version (9/4/19)
 */
public class Address
{
    public static void houseAddress(int houseNum, String name)
    {
        System.out.println(name);
        System.out.println(houseNum + " Candy St");
        System.out.println("New York, NY 10025/n");
    }
    public static void friendAddress()
    {
        System.out.println("Amelia Bedelia");
        System.out.println("123 Candy St");
        System.out.println("New York, NY 10025\n");
    }
    public static void main(String[] args)
    {
       friendAddress();
       houseAddress(900,"Sophia TheFirst");
    }
}
