
/**
 * Write a description of class ClassroomClient here.
 *
 * @author (Lindsay Fabricant)
 * @version (10/29/19)
 */
public class ClassroomClient
{
    public static void main (String args[])
    {
         Classroom test = new Classroom();
         System.out.println("What is the room number? " + test.getRoomNum());
         System.out.println("Is the door locked? " + test.getIsLocked());
         System.out.println("Is the room old? " + test.getIsOld());
         System.out.println("Does the room need painting? " + test.needsPainting());
         System.out.println();
         Classroom test2 = new Classroom(320,true,true);
         System.out.println("What is the room number? " + test2.getRoomNum());
         System.out.println("Is the door locked? " + test2.getIsLocked());
         System.out.println("Is the room old? " + test2.getIsOld());
         System.out.println("Does the room need painting? " + test2.needsPainting());
    }
}
