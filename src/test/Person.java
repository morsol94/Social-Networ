package test;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private Integer age; 

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;        
    }
    
    
    public String getInfo()
    {
        String info = "Name: " + name + " Age: " + age + " ";
        
        return info;
    }

}