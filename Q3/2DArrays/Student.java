public class Student
{
    private String lastName;
    private String firstName;
    private double gpa;
    private int gradeLevel;
    private String idNumber;

    public Student(String last, String first, double gpa, int grade, String id){
        lastName = last;
        firstName = first;
        this.gpa = gpa;
        gradeLevel = grade;
        idNumber = id;
    }

    public String getID(){
        return idNumber;
    }
    
    public int getGradeLevel(){
        return gradeLevel;
    }
    
    public double getGPA() {
        return gpa; 
    }

    public String getName() { 
        return lastName + ", " + firstName; 
    }

    public String toString() { 
        return "NAME = " + getName() + " : GPA = " + gpa + " : GRADE = " + gradeLevel + " : ID Number =  " + idNumber;
    }
    
    public boolean equals(Student other)
    {
        return other.lastName.equals(lastName) && other.idNumber.equals(idNumber) && other.gradeLevel == gradeLevel;
    }
}
