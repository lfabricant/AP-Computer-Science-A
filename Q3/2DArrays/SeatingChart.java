
/**
 * Write a description of class SeatingChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeatingChart
{
    private Student[][] theChart;
    private String teacher;
    public SeatingChart(){
        theChart = new Student[5][6];
        teacher = "Mr. C";
    }
    public SeatingChart(Student[] kids, String teacherName, int numRows){
        double l = kids.length;
        int numColumns = (int)(l/numRows + 0.5);
        theChart = new Student[numRows][numColumns];
        teacher = teacherName;
        int count = 0;
        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numColumns; c++){
                if(count < kids.length){
                    theChart[r][c] = kids[count];
                    count++;
                }
            }
        }
    }
    public void add(Student s, int r,int c) {
        theChart[r][c] = s;
    }         
    public void clearAllSeats() {
        for(int r = 0; r < theChart.length; r++){
            for(int c = 0; c < theChart[0].length; c++){
                theChart[r][c] = null;
            }
        }
    }         
    public void swap(int row1,int col1, int row2, int col2){
        Student temp = theChart[row1][col1];
        theChart[row1][col1] = theChart[row2][col2];
        theChart[row2][col2] = temp;
    } 
    public boolean swap(Student s1,Student s2) {
       int row = getRow(s1);
       int col = getCol(s1);
       int row2 = getRow(s2);
       int col2 = getCol(s2);
       if(row > -1 && col > -1 && row2 > -1 && col2 > -1){
           theChart[row][col] = s2;
           theChart[row2][col2] = s1;
           return true;
       }
       return false;
    }
    public boolean contains(Student s){
        for(int r = 0; r < theChart.length; r++){
            for(int c = 0; c < theChart[0].length; c++){
                if(theChart[r][c] != null && theChart[r][c].equals(s)){
                    return true;
                }
            }
        }
        return false;
    } 
    public int[] getCell(Student s){
        for(int r = 0; r < theChart.length; r++){
            for(int c = 0; c < theChart[0].length; c++){
                if(theChart[r][c] != null && theChart[r][c].equals(s)){
                    int[] arr = new int[2];
                    arr[0] = r;
                    arr[1]= c;
                    return arr;
                }
            }
        }
        return new int[0];
    }
    public int getRow(Student s){
        for(int r = 0; r < theChart.length; r++){
            for(int c = 0; c < theChart[0].length; c++){
                if(theChart[r][c] != null && theChart[r][c].equals(s)){
                    return r;
                }
            }
        }
        return -1;
    }
    public int getCol(Student s){
        for(int r = 0; r < theChart.length; r++){
            for(int c = 0; c < theChart[0].length; c++){
                if(theChart[r][c] != null && theChart[r][c].equals(s)){
                    return c;
                }
            }
        }
        return -1;
    }
    public Student get(int row ,int col){
        return theChart[row][col];
    }
    public String toString(){
        String s = "";
        for(int r = 0 ; r < theChart.length ; r++)
        {
            for(int c = 0 ; c < theChart[r].length; c++)
            {
                s += theChart[r][c] +"\t "; 
            }
            s += "\n`"; 
        }
        return s;
    }
    public boolean equals(SeatingChart other){
        int count = 0;
        int countTrue = 0;
        if(theChart.length == other.theChart.length && theChart[0].length == other.theChart[0].length){
            for(int r = 0; r < theChart.length; r++){
                for(int c = 0; c < theChart[0].length; c++){
                    if((theChart[r][c] == null && other.theChart[r][c] == null) || theChart[r][c].equals(other.theChart[r][c])){
                            countTrue++;
                    }
                     count++;   
                }  
            }
            return countTrue == count && other.teacher == teacher;
        } else {
            return false;
        }
    }
    public int compareTo(SeatingChart other){
        int first = numFilled(theChart);
        int second = numFilled(other.theChart);
        return second-first;
    }
    public int numFilled(Student[][] chart){
        int count = 0;
        for(int r = 0; r < chart.length; r++){
            for(int c = 0; c < chart[0].length; c++){
                if(chart[r][c] != null){
                    count++;
                }
            }
        }
        return count;
    }
}
