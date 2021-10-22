/**
 * Write a description of class Date here.
 *
 * @author (Lindsay Fabicant)
 * @version (10/10/19)
 */
public class Date
{
    private int month;
    private int day;
    private int year;
    /**
     * Constructor for objects of class Date
     */
    public Date()
    {
        month = 1;
        day = 1;
        year = 0;
    }
    public Date(int d, int m, int yr)
    {
        day = d;
        // or this.day = day;
        // name of parameter can't be the same as the field
        month = m;
        year = yr;
    }
    public void setDate(int d, int m, int yr)
    {
        // void, to change existing info
        day = d;
        month = m;
        year = yr;
        // no need to make anew object with a setter method
    }
    public int getMonth()
    {
       return month; 
    }
    public int getDay()
    {
        return day;
    }
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
    public int getYear()
    {
        return year;
    }
    
     public void increaseYear(int yr)
     {
         if (yr + 1 == 100)
         {
             year = 0;
         }
         else
         { 
             year = year + 1;
         }
        }    
    public boolean equals(Date otherDate)
    {
        return (day == otherDate.getDay() && month == otherDate.getMonth() && year == otherDate.getYear());
    }
}
