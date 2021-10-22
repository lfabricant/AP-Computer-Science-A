
/**
 * This class describes triangle objects that can be displayed as shapes like this:
 * []
 * [][]
 * [][][]
 * 
 * The number of [] in the last row should be a parameter of the constructor.
 * 
 * @author (Lindsay Fabricant) 
 * @version (11/12/19)
 */
public class Triangle
{
    private int width;    
    public Triangle (int width)
    {
        this.width = width;
    }
    /**
     * returns the String representation of the triangle made from brackets.
     */
    public String toString()
    {
        String var = "";
        for (int rows = 0; rows < width; rows++)
        {
            for (int columns = 0; columns <= rows; columns++)
            {
                var+= "[]";
            }
            var +="\n";
        }
        return var;
    }
    /**
     * 
     * 
     * Write a main method that will create at least 3 Triangle objects and print the triangles 
     * to the terminal window.
     */
    public static void main(String[] args)
    {
        Triangle four = new Triangle(4);
        System.out.println(four);
        System.out.println();
        Triangle two = new Triangle(2);
        System.out.println(two);
        System.out.println();
        Triangle sixteen = new Triangle(16);
        System.out.println(sixteen);
        System.out.println();
    }
}
