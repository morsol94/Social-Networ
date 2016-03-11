package social.networ;
import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class MessagePost extends Post
{
    private String message;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return message;
    }
    
    /**
     * Returns type of post and poster
     * 
     * @return username of poster 
     */
    public String printShortSummary()
    {               
        String shortSummary = "Message post from ";
        
        shortSummary += super.printShortSummary();
        
        return shortSummary;
    }
    
    public void displayMessagePost()
    {
        
        this.getText();
        
        
    }

    @Override
    public void display()
    {
        System.out.println(getText());
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
