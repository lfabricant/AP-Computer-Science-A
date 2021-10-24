/**
 * Write a description of class Array2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDArrayDemo
{
    public static void main(String[] args){
        new TwoDArrayDemo();
    }
    public TwoDArrayDemo()
    {

        int rows = 3;
        int cols = 2;    
        String[][] table =  {
                {"a","b","c"},
                {"d","e","f","g"},                        
                {"g","h"},
            };
        int r,i,c;

        for( i = 0 ; i < table.length ; i++)
        {
            System.out.println("table["+i+"].length = " + table[i].length +  " , table["+i+"] = " + table[i] ) ;
        }
        System.out.println("--------------------------------------");
        for( r = 0 ; r < table.length ; r++)
        {
            for( c = 0 ; c < table[r].length ; c++)
            {
                System.out.print("table["+r+"]["+c+"] : " + table[r][c] +"\t   "); 
            }
            System.out.println();
        }

        int[][] matrix = new int[3][4];
        for( r = 0 ; r < matrix.length ; r++)
            for( c = 0 ; c < matrix[r].length ; c++)
                matrix[r][c]= r +c;; 

        for( r = 0 ; r < matrix.length ; r++)
        {
            for( c = 0 ; c < matrix[r].length ; c++)
                System.out.print(matrix[r][c] +"\t");
            System.out.println();  
        }

    }

}
