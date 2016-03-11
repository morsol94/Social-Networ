package test;
/**
 * Write a description of class PhdStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhdStudent extends Student
{
    // instance variables - replace the example below with your own
    private String field;

    /**
     * Constructor for objects of class PhdStudent
     */
    public PhdStudent(String name, int age, double studentNr, String field)
    {
        super(name, age, studentNr);
        this.field = field;
    }
    
    
    public String getField()
    {
        String studentField = this.field;
        
        return studentField;
    }
    
    
    public String getInfo()
    {
        String info = super.getInfo();
        
        info += "Field: " + getField() + " " ;
        
        return info;
    }
}
