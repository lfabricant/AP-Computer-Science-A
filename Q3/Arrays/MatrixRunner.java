/**
 * Write a description of class MatrixRunner here.
 *
 * @author (Lindsay Fabricant)
 * @version (3/5/20)
 */
public class MatrixRunner
{
    public static void main(String[] args){
        Matrix a = new Matrix(2,3);
        System.out.println(a);
        a.setElement(0,0,4);
        a.setElement(0,1,2.65);
        a.setElement(0,2,13);
        a.setElement(1,0,9);
        a.setElement(1,1,72);
        a.setElement(1,2,6);
        System.out.println(a);
        a.swapRows(0,1);
        System.out.println(a);
        Matrix b = new Matrix();
        System.out.println(a.equals(b));
        System.out.println(a.equals(a));
        System.out.println("COPY: \n" + MatrixMath.copy(a));
        System.out.println("IDENTITY: \n" + MatrixMath.getIdentity(3));
        Matrix c = new Matrix(2,3);
        c.setElement(0,0,5);
        c.setElement(0,1,615);
        c.setElement(0,2,13);
        c.setElement(1,0,4.13);
        c.setElement(1,1,19);
        c.setElement(1,2,2.010);
        System.out.println(c);
        System.out.println("ADD: \n" + MatrixMath.add(a,b));
        System.out.println("ADD: \n" + MatrixMath.add(a,c));
        System.out.println("SUBTRACT: \n" + MatrixMath.subtract(a,b));
        System.out.println("SUBTRACT: \n" + MatrixMath.subtract(a,c));
        System.out.println("MULTIPLY: \n" + MatrixMath.multiply(a,6));
        Matrix o = new Matrix(1,3);
        o.setElement(0,0,1);
        o.setElement(0,1,2);
        o.setElement(0,2,3);
        System.out.println(o);
        Matrix t = new Matrix(3,1);
        t.setElement(0,0,1);
        t.setElement(1,0,3);
        t.setElement(2,0,-3);
        System.out.println(t);
        System.out.println("MULTIPLY: \n" + MatrixMath.multiply(o,t));
        System.out.println("TRANSPOSE: \n" + MatrixMath.transpose(a));
        System.out.println("TRANSPOSE: \n" + MatrixMath.transpose(b));
        System.out.println("TRANSPOSE: \n" + MatrixMath.transpose(c));
        Matrix d = new Matrix(2,2);
        d.setElement(0,0,44);
        d.setElement(0,1,34.5);
        d.setElement(1,0,17.28);
        d.setElement(1,1,10102);
        System.out.println("DETERMINANT: \n" + MatrixMath.determinant2(a));
        System.out.println("DETERMINANT: \n" + MatrixMath.determinant2(d));
    }
}
