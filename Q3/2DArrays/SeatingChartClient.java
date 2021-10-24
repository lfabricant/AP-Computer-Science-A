import java.util.Arrays;
/**
 * Write a description of class SeatingChartClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeatingChartClient
{
    public static void main(String[] args)
    {
        Student extra = new Student("Griffin", "Stewie", 4.0,8,"1011");
        Student[] students = new Student[10];
        students[0] = new Student("Bunny", "Bugs",4.0,12,"1004");
        students[1] = new Student("Mouse", "Mickey", 3.89,12,"1007");
        students[2] = new Student("Doo", "Scooby", 2.4,9,"1003");
        students[3] = new Student("SquarePants", "SpongeBob", 3.4,9,"1001");
        students[4] = new Student("Simpson", "Homer", 1.9,11,"1002");
        students[5] = new Student("Rogers", "Shaggy", 2.2,12,"1008");
        students[6] = new Student("Brown", "Charlie", 2.75,10,"1006");
        students[7] = new Student("Flintstone", "Fred", 3.3,10,"1010");
        students[8] = new Student("Griffin", "Peter", 2.5,11,"1005");
        students[9] = new Student("Lightyear", "Buzz", 3.4,9,"1009");
        SeatingChart period2 = new SeatingChart();
        System.out.println(period2);
        period2.add(students[9],0,0);
        period2.add(students[5],1,0);
        System.out.println(period2);
        System.out.println("\n");

        SeatingChart period3 = new SeatingChart(students,"Ciavarella",4);
        System.out.println(period3);
        System.out.println(period3.get(0,0));
        System.out.println(period3.getRow(students[8]));
        System.out.println(period3.getRow(extra));
        System.out.println(period3.getCol(students[8]));
        System.out.println(period3.getCol(extra));
        System.out.println(period3.contains(students[9]));
        System.out.println(period3.contains(extra));
        int[] c1 = period3.getCell(students[8]);
        int[] c2 = period3.getCell(extra);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        System.out.println(period3.equals(period2));
        System.out.println(period3.equals(period3));
        System.out.println(period3.compareTo(period2));
        System.out.println(period2.compareTo(period3));
        //System.out.println(period3.alphabetize());
        //System.out.println(period2.alphabetize());
    }
}
