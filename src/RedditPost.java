import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;

public class RedditPost implements Comparable<RedditPost> {
    private int date;

    private String author;

    private int voteBalance;

    private String title;

    public RedditPost(int date, String author, int voteBalance, String title) {
        this.date = date;
        this.author = author;
        this.voteBalance = voteBalance;
        this.title = title;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current datetime is: " + dtf.format(now));
        System.out.println("The title of this post is: " + title + " and the author's name is:" + author);
        System.out.println("Balance of up");
        }



    public int getDate() {
        return date;
    }



    public String getAuthor() {
        return author;
    }

    public int getVoteBalance() {
        System.out.println(voteBalance);
        return voteBalance;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setVoteBalance(int votes) {
        this.voteBalance = votes;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int compareTo(RedditPost o) {
        int inte = 0;
        if (voteBalance == o.voteBalance) {
            System.out.println(0);
            return inte;
        } else if (voteBalance > o.voteBalance) {
            System.out.println(1);
            return (inte + 1);
        } else if (voteBalance < o.voteBalance) {
            System.out.println(-1);
            return (inte -1);

        } return inte;

    }


    }




