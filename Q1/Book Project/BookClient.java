/**
 * BookClient is also a class. It accompanies the class, Book, to print out
 * the information about the book. While the author, title, and number of pages
 * in Book are not subject to change in BookClient, the reference number and 
 * amount of times that this book has been borrowed can be altered by plugging
 * them in here. 
 * 
 * @author (Lindsay Fabricant)
 * @version (9/10/19)
 */
public class BookClient
{
    public static void main(String[] args)
    {
        Book show = new Book("John Jimmy Johnny", "The Story of My Life", "721");
        show.display();
        
        System.out.println(show.toString());
        
        System.out.println("\n" + show.getAuthor());
        System.out.println(show.getTitle());
        System.out.println(show.getNumPages() + "\n");

        show.setTimesBorrowed(6);
        show.setRefNumber("ZZZ");
        show.display();
        System.out.println(show.toString());
    }
}
