
/**
 * This class prints a list of 5 things I am thankful for.
 *
 * @author (Lindsay Fabricant)
 * @version (11/27/19)
 */
public class Thanksgiving
{
    public static void turkeyDay(String list)
    {
        list = list.replaceAll(",", "\n");
        System.out.println(list);
    }
    public static void main(String args[]){
        String things = "my family,friends,food,dance,home";
        turkeyDay(things);
    }
}
