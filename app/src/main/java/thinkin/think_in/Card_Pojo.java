package thinkin.think_in;

/**
 * Created by Gourav Beura on 10-01-2016.
 */
public class Card_Pojo {
    private String heading;
    private String date;
    private String publisher;
    private String content;
    private String post_time;
    private int vote_counter;
    private String tags;
    private String timestamp;


    public String getHeading(){
        return heading;
    }

    public void setHeading(String title){
        heading=title;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content=content;
    }
    public String getPost_time()
    {
        return post_time;
    }
    public void setPost_time(String post_time)
    {
        this.post_time=post_time;
    }

    public String getTags()
    {
        return tags;
    }
    public  void setTags(String tags)
    {
        this.tags=tags;
    }
    public int getVote_counter()
    {
        return vote_counter;
    }
    public void setVote_counter(int vote_counter)
    {
        this.vote_counter=vote_counter;
    }

    public String getTimestamp()
    {
        return timestamp;
    }
    public void setTimestampt(String timestamp)
    {
        this.timestamp=timestamp;
    }



}
