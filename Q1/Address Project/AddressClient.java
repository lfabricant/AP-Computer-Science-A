
/**
 * Write a description of class AddressClient here.
 *
 * @author (Lindsay Fabricant)
 * @version (9/5/19)
 */
public class AddressClient
{
    public static void main(String[] args)
    {
        AddressOBJ dAD = new AddressOBJ("Lindsay", "1", "1", "1", "1", "1" );
        dAD.display();
        AddressOBJ ma = new AddressOBJ("Brian","5", "Happy Drive", "Roslyn", "NY", "11576");
        ma.display();
        ma.setHousenum("601");
        ma.setStreet("Seven Drive");
        ma.display();
        System.out.println("\n" + ma.getZip() + "\n");
        System.out.println(ma);
    }
}
