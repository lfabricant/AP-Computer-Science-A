
/**
 * Write a description of class Classroom here.
 *
 * @author (Lindsay Fabricant)
 * @version (10/29/19)
 */
public class Classroom
{
    private int roomNum;
    private boolean isLocked,isOld; 
    public Classroom()
    {
         // Constructors have no return type, same name as the class
         //main goal of a constructor is to initialize the fields
         //this(906,true,false) will call the other constructor to put in these values and make life easier
         roomNum = 906;
         isLocked = true;
         isOld = false;
    }
    public Classroom(int r, boolean l, boolean o)
    {
        roomNum = r;
        isLocked = l;
        isOld = o;
    }
    public int getRoomNum()
    {
        return roomNum;
    }
    public boolean getIsLocked()
    {
        return isLocked;
    }
    public boolean getIsOld()
    {
        return isOld;
    }
