
/**
 * Book is a class that could be used in a library when someone is checking 
 * out a book, as it contains relevant information about this book for their 
 * system. The fields of this classs are the author, title, number of pages,
 * reference number, and number of times that this book has been borrowed. 
 *
 * @author (Lindsay Fabricant)
 * @version (9/10/19)
 */
public class Book
{
    private String author;
    private String title;
    private String numPages;
    private String refNumber;
    private int timesBorrowed;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String a, String t, String nPgs)
    {
        author = a;
        title = t;
        numPages = nPgs;
        refNumber = "JJJ";
        timesBorrowed = 0;
    }
    public String toString()
    {
        return "\"" + title + "\"" + " by " + author + " has "+ numPages + " pages with a reference#:" + refNumber + " has been borrowed " + timesBorrowed + " times";
    }
    public void display()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + numPages);
        System.out.println("Ref #: " + refNumber);
        System.out.println("The number of times this book has been borrowed is: " + timesBorrowed);
    }
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getNumPages()
    {
        return numPages;
    }
    public void setRefNumber(String newRefNumber)
    {
        refNumber = newRefNumber;
    }
    public void setTimesBorrowed(int newTimesBorrowed)
    {
        timesBorrowed = newTimesBorrowed;
    }
    
}
