/**
 * Write a description of class MatrixMath here.
 *
 * @author (Lindsay Fabricant)
 * @version (3/5/20)
 */
public class MatrixMath
{
    public static Matrix copy(Matrix A){
        Matrix copy = new Matrix(A.getRows(), A.getColumns());
        for(int r = 0; r < A.getRows(); r++){
            for(int c = 0; c < A.getColumns(); c++){
                copy.setElement(r,c,A.getElement(r,c));
            }
        }
        return copy;
    }
    public static Matrix getIdentity(int size){
        Matrix i = new Matrix(size,size);
        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++){
                if(r == c){
                    i.setElement(r,c,1);
                } else {
                    i.setElement(r,c,0);
                }
            }
        }
        return i;
    }
    public static Matrix add(Matrix A, Matrix B){
        if(A.getRows() == B.getRows() && B.getColumns() == A.getColumns()){
            Matrix n = new Matrix(A.getRows(), A.getColumns());
            for(int r = 0; r < A.getRows(); r++){
                for(int c = 0; c < A.getColumns(); c++){
                    n.setElement(r,c,A.getElement(r,c)+B.getElement(r,c));
                }
            }
            return n;
        } else {
            System.out.println("Can’t add, dimension mismatch.");
            return new Matrix();
        }
    }
    public static Matrix subtract(Matrix A, Matrix B){
        if(A.getRows() == B.getRows() && B.getColumns() == A.getColumns()){
            Matrix n = new Matrix(A.getRows(), A.getColumns());
            for(int r = 0; r < A.getRows(); r++){
                for(int c = 0; c < A.getColumns(); c++){
                    n.setElement(r,c,A.getElement(r,c)-B.getElement(r,c));
                }
            }
            return n;
        } else {
            System.out.println("Can’t add, dimension mismatch.");
            return new Matrix();
        }
    }
    public static Matrix multiply(Matrix A, double scalar){
        Matrix n = new Matrix(A.getRows(), A.getColumns());
        for(int r = 0; r < A.getRows(); r++){
            for(int c = 0; c < A.getColumns(); c++){
                n.setElement(r,c,A.getElement(r,c)*scalar);
            }
        }
        return n;
    }
    public static Matrix multiply(Matrix A, Matrix B){
        if(A.getRows() == B.getColumns() && B.getColumns() == A.getRows()){
            double total = 0;
            Matrix n = new Matrix(A.getRows(), A.getRows());
            for(int row = 0; row < n.getRows(); row++){
                    for(int c = 0; c <  A.getRows(); c++){
                        for(int r = 0; r < B.getRows(); r++){             
                        total += A.getElement(row,r)*B.getElement(r,c);
                    }
                    n.setElement(row,c,total);
                    total = 0;
                }
            }
            return n;
        } else {
            System.out.println("Can’t add, dimension mismatch.");
            return new Matrix();
        }
    }
    public static Matrix transpose(Matrix A){
        Matrix n = new Matrix(A.getColumns(), A.getRows());
        for(int r = 0; r < A.getRows(); r++){
            for(int c = 0; c < A.getColumns(); c++){
                n.setElement(c,r,A.getElement(r,c));
            }
        }
        return n;
    }
    public static double determinant2(Matrix A){
         if(A.getRows() == 2 && A.getColumns() == 2){
            double firstDiagonal = A.getElement(0,0)*A.getElement(1,1);
            double secondDiagonal = A.getElement(0,1)*A.getElement(1,0);
            return firstDiagonal-secondDiagonal;
        } else {
            System.out.println("Not capable of handling this task right now.");
            return 2147483647;
        }
    }
}
