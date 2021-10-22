
/**
 * Sandwich is a class that can be used at a restaurant when customers are placing 
 * orders for a sandwich. The fields of this class are the customer's name, the bread, 
 * the meat, and the cheese they have ordered, the number of slices of cheese that 
 * they would like in their sandwich, and the number of orders of this sandwich that 
 * they would like to place. 
 *
 * @author (Lindsay Fabricant)
 * @version (9/15/19)
 */
public class Sandwich
{
    private String name;
    private String bread;
    private String meat;
    private String cheese;
    private int numCheeseSlices;
    private int numOrders;
    
    /**
     * Constructor for objects of class Sandwich
     */
    public Sandwich(String n, String br, String chs, String mt)
    {
        name = n;
        bread = br;
        cheese = chs;
        meat = mt;
        numCheeseSlices = 2;
        numOrders = 1;
    }
    public String toString()
    {
        if (numOrders == 1)
        {
           return name + " has placed " + numOrders + " order for a sandwich of " + bread + " bread, " + numCheeseSlices + " slices of " + cheese + " cheese, and " + meat;
        } 
        else 
        {
            return name + " has placed " + numOrders + " orders for a sandwich of " + bread + " bread, " + numCheeseSlices + " slices of " + cheese + " cheese, and " + meat;
        }
    }  
    public String noCheese()
    {
        if (numCheeseSlices == 0)
        {
            return("So you're telling me that you want cheese and you want no slices of it? Is this a joke?\n");
        }
        else
        {
            return("");
        }
    }   
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Bread: " + bread);
        System.out.println("Meat: " + meat);
        System.out.println(numCheeseSlices + " slices of " + cheese + " cheese");
        System.out.print(noCheese());
        System.out.println("Number of Orders: " + numOrders);
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public String getBread()
    {
        return bread;
    }
    public String getMeat()
    {
        return meat;
    }
    public String getCheese()
    {
        return cheese;
    }
    public void setNumCheeseSlices(int newNumCheeseSlices)
    {
        numCheeseSlices = newNumCheeseSlices;
    }
    public void setNumOrders(int newNumOrders)
    {
        numOrders = newNumOrders;
    }
    
}
