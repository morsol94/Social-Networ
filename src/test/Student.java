package test;
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private double studentNr;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int age, double studentNr)
    {
        super(name, age);
        this.studentNr = studentNr;
    }
    
    
    public double getStudentNr()
    {
        double studentNumber = this.studentNr;
        
        return studentNumber;
    }
    
    public String getInfo()
    {
        String info = super.getInfo();
        
        info += "Student Number: " + getStudentNr() + " ";
        
        return info;
    }

}
