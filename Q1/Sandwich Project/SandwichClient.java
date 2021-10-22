/**
 * SandwichClient is a class that prints out someone's order using the previous code 
 * in the class, Book. The accessors in Sandwich get the bread, cheese, and meat in 
 * the sandwich. In SandwichClient, the "waiter" can also set the number of orders, 
 * number of slices of cheese, and name of customer without creating a new sandwich.
 *
 * @author (Lindsay Fabricant)
 * @version (9/15/19)
 */
public class SandwichClient
{
    public static void main(String[] args)
    {
        Sandwich show = new Sandwich("Janine", "Rye", "American", "Bacon");
        show.display();
        
        System.out.println("\n" + show.toString() + "\n");
        
        System.out.println(show.getBread());
        System.out.println(show.getCheese());
        System.out.println(show.getMeat());
        
        show.setNumOrders(2);
        show.setNumCheeseSlices(0);
        
        System.out.println("\n");
        show.setName("Pamela");
        show.display();
        
        System.out.println("\n" + show.toString());
    }
}
