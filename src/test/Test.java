package test;

import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private ArrayList<Person> persons;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        persons = new ArrayList<Person>();
    }
    
    /**
     * creates instances of PhdStudent, Student, and person. Then adds them to the
     * arraylist "persons".
     */
    public void fillDummies()
    {
        PhdStudent phd1 = new PhdStudent("Kåre", 58, 130315, "Kommunikasjon");
        PhdStudent phd2 = new PhdStudent("Per", 32, 130216, "maskin");
        Student student1 = new Student("Stine", 22, 150263);
        Person person1 = new Person("Stian", 22);
        
        persons.add(phd1);
        persons.add(phd2);
        persons.add(student1);
        persons.add(person1);
        
    }
    
    
    public void displayInfo()
    {
        for(Person person: persons)
        {
            System.out.println(person.getInfo());
        }
    }
    
}
