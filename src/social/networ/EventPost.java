
package social.networ;

/**
 * This class stores information about a post in the social network news feed.
 * The main part of the post consists of a (possibly multi-line)
 * event. other data such as author and time, are also stored.
 * 
 * @author Morten
 * @version 11.03.2016 0.1
 */
public class EventPost extends Post
{
    
    private String event; // an arbitrarily long, multi-line message
    
    /**
     *  Constructor of object of class EventPost.
     * 
     * @param author    The username of the author of thios post.
     * @param event     The description of this post.
     */
    public EventPost(String author, String event)
    {
        super(author);      //Name of author
        this.event = event; //Description of the event
    }
    
    /**
     * Return the description of the event.
     * 
     * @return event description
     */
    public String getEvent()
    {
        return this.event;
    }
    
    
    @Override
    public void display()
    {
        System.out.println(getEvent());
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /**
     * Returns type of post and poster
     * 
     * @return username of poster 
     */
    @Override
    public String printShortSummary()
    {               
        String shortSummary = "Event post from ";
        
        shortSummary += super.printShortSummary();
        
        return shortSummary;
    }
}
