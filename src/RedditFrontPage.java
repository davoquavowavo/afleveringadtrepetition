
import java.util.ArrayList;

public class RedditFrontPage {
    private ArrayList<RedditPost> posts;


    public static void deletePost(ArrayList<RedditPost> posts, int indexNumber){
        if (indexNumber >= 0 && indexNumber < posts.size()) {
            posts.remove(indexNumber);
        }
    }
}
