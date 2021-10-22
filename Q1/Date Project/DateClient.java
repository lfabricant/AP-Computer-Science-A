/**
 * Write a description of class DateClient here.
 *
 * @author (Lindssy Fabricant)
 * @version (10/10/19)
 */
public class DateClient
{
    public static void main (String[] args)
    {
        Date date1 = new Date();
        // Date is the type of object we will be creating
        System.out.println("Date1: " + date1);
        // automatically calling toString method
        
        Date date2 = new Date(6,6,16);
        // Date is the type of object we will be creating
        System.out.println("Date2: " + date2);
        
        System.out.println("date2.setDate(10,10,20)");
        date2.setDate(10,10,20);
        
        System.out.println("date2 Day: " + date2.getDay());
        System.out.println("date2 Month: " + date2.getMonth());
        System.out.println("date2 Year: " + date2.getYear());
        System.out.println("Date2: " + date2);
        
        System.out.println("Equals? " + date1.equals(date2));
        
    } 
}
