import java.text.DecimalFormat;
/**
 * @author Mr C
 */
public class DecimalFormatClass 
{  
    public static void main(String[] args) 
    {
        DecimalFormat cs = new DecimalFormat("#,###.###"); //commas  
        // NUMBER SIGNS ARE OPTIONAL AND CAN CONDENSE
        // ZEROS ARE INCLUDED DECOMAL PLACES
        DecimalFormat ltz = new DecimalFormat("#,##0.000"); //zeros     
        DecimalFormat pct = new DecimalFormat("#,##0.00%"); //percentages   
        DecimalFormat sn = new DecimalFormat("0.00E0"); //scientific   
        double n1 = 0.0062;
        double n2 = 161234563468.5;
        double n3 = 1.530;
        double n4 = Math.PI;
        double n5 = 2.7;

        System.out.println("AS-IS");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        System.out.println("\nComma-separators");
        System.out.println(cs.format(n1));
        System.out.println(cs.format(n2));
        System.out.println(cs.format(n3));
        System.out.println(cs.format(n4));
        System.out.println(cs.format(n5));

        System.out.println("\nLeading & Trailing Zeros, & Commas");
        System.out.println(ltz.format(n1));
        System.out.println(ltz.format(n2));
        System.out.println(ltz.format(n3));
        System.out.println(ltz.format(n4));
        System.out.println(ltz.format(n5));

        System.out.println("\nPercentages");
        System.out.println(pct.format(n1));
        System.out.println(pct.format(n2));
        System.out.println(pct.format(n3));
        System.out.println(pct.format(n4));
        System.out.println(pct.format(n5));
        
        System.out.println("\nScientific Notation");
        System.out.println(sn.format(n1));
        System.out.println(sn.format(n2));
        System.out.println(sn.format(n3));
        System.out.println(sn.format(n4));
        System.out.println(sn.format(n5));
    }
}
