
package no.ntnu.student;

import social.networ.MessagePost;
import social.networ.NewsFeed;
import social.networ.PhotoPost;
import social.networ.EventPost;
import test.Test;

/**
 * Main class of tthe NetworkV-1. application.
 * 
 * @author Morten
 */
public class Application
{
    private NewsFeed newsFeed;
    private Test test;
//    private MessagePost messagePost1;
//    private MessagePost messagePost2;
//    private PhotoPost photoPost1;
//    private PhotoPost photoPost2;
    
    
    /**
     * 
     */
    public Application()
    {
       newsFeed = new NewsFeed();
       test = new Test();
       
       makeDummies();
       display();
       displayShortSummary();
       runTest();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Application testRunner = new Application();
        
    }
    
    /**
     * Fills the newsfeed with dummies
     */
    private void makeDummies()
    {
        
       MessagePost messagePost1;
       MessagePost messagePost2;
       PhotoPost photoPost1;
       PhotoPost photoPost2;
       EventPost eventPost1;
     
        //Making 2 message posts and 2 photo posts.
        messagePost1 = new MessagePost("kniven","Jeg er skarp idag");
        messagePost2 = new MessagePost("Oscar", "I dag er livet verdt å leve");
        photoPost1 = new PhotoPost("Eirik", "sol.jpg", "Sola skinner fint idag");
        photoPost2 = new PhotoPost("Ole Martin", "noSkjeg.jpg", "Tatt skjegget");
        eventPost1 = new EventPost("Ole Martin", "Ole Martin has joined Solider of Are og Odin");
       
        //Adding posts to the newsfeed
        newsFeed.addPost(messagePost1);
        newsFeed.addPost(messagePost2);
        newsFeed.addPost(photoPost1);
        newsFeed.addPost(photoPost2);
        newsFeed.addPost(eventPost1);
        newsFeed.addComment(messagePost1, "Skarping as");
        newsFeed.addComment(messagePost2, "Så flott!");
        newsFeed.addComment(messagePost2, "Like, Betyr likar");
        newsFeed.addComment(photoPost1, "Deilig med sol");
        newsFeed.addComment(photoPost2, "Neeeeeeeeeeeeeeeeei! :'(");
            
    }
    
    /**
     * Display the information in the newsfeed and the comments
     */
    private void display()
    {
        //Displaying the posts
        newsFeed.show();
        
    }
    
    /**
     * Dysplay shortSummary, 
     */
    private void displayShortSummary()
    {
        newsFeed.displayShortSummary();
         
    }
    
    public void runTest()
    {
        System.out.println();
        System.out.println("Exercise 8.12: ");
        test.fillDummies();
        test.displayInfo();
    }
    
    
    
}
