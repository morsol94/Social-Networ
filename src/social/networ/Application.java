
package social.networ;

/**
 * Main class of tthe NetworkV-1. application.
 * 
 * @author Morten
 */
public class Application
{
    private NewsFeed newsFeed;
    private MessagePost messagePost1;
    private MessagePost messagePost2;
    private PhotoPost photoPost1;
    private PhotoPost photoPost2;
    
    
    /**
     * 
     */
    public Application()
    {
       newsFeed = new NewsFeed();
       makeDummies();
       display();
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
        //Making 2 message posts and 2 photo posts.
        messagePost1 = new MessagePost("kniven","Jeg er skarp idag");
        messagePost2 = new MessagePost("Oscar", "I dag er livet verdt å leve");
        photoPost1 = new PhotoPost("Eirik", "sol.jpg", "Sola skinner fint idag");
        photoPost2 = new PhotoPost("Ole Martin", "noSkjeg.jpg", "Tatt skjegget");
       
        //Adding posts to the newsfeed
        newsFeed.addMessagePost(messagePost1);
        newsFeed.addMessagePost(messagePost2);
        newsFeed.addPhotoPost(photoPost1);
        newsFeed.addPhotoPost(photoPost2);
        messagePost1.addComment("Skarping as");
        messagePost2.addComment("Like, Betyr likar");
        messagePost2.addComment("Så flott");
        photoPost1.addComment("Deilig med sol");
        photoPost2.addComment("Neeeeeeeeeeeeeeeeei! :'(");
                
    }
    
    /**
     * Display the information in the newsfeed and the comments
     */
    private void display()
    {
        //Displaying the posts
        newsFeed.show();
        
    }
    
}
