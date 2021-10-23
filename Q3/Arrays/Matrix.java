import java.text.DecimalFormat;
/**
 * Write a description of class Matrix here.
 *
 * @author (Lindsay Fabricant)
 * @version (3/5/20)
 */
public class Matrix
{
    private int rows;
    private int columns;
    private double[][] matrix;
    public Matrix()
    {
        rows = 1;
        columns = 1;
        matrix = new double[rows][columns];
        matrix[0][0] = 0.0;
    }
    public Matrix(int r, int c)
    {
        rows = r;
        columns = c;
        matrix = new double[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = 0.0;
            }
        }
    }
    public int getRows()
    {
       return matrix.length;
    }
    public int getColumns(){
        return matrix[0].length;
    }
    public double getElement(int r, int c){
        return matrix[r][c];
    }
    public void setElement(int r, int c, double value){
        matrix[r][c] = value;
    }
    public boolean equals(Matrix other){
        int count = 0;
        int countTrue = 0;
        if(rows == other.rows && columns == other.columns){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    if(matrix[i][j] == other.matrix[i][j]){
                            countTrue++;
                    }
                    count++;   
                }  
            }
            return countTrue == count;
        } else {
            return false;
        }
    }
    public String toString(){
        DecimalFormat n = new DecimalFormat("#,###.###");
        String s = "";
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                s += n.format(matrix[i][j]) + "\t";
            }
            s += "\n";
        }
        return s;
    }
    public void swapRows(int row1, int row2){
        double[] temp = new double[matrix[0].length]; 
        for(int i = 0; i < temp.length; i++){
            temp[i] = matrix[row1][i];
        }
        for(int i = 0; i < temp.length; i++){
            matrix[row1][i] = matrix[row2][i];
        }
        for(int i = 0; i < temp.length; i++){
            matrix[row2][i] = temp[i];
        }
    }
}
