package thinkin.think_in.feed_section;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import thinkin.think_in.Card_Pojo;
import thinkin.think_in.R;

/**
 * Created by Gourav Beura on 11-01-2016.
 */
public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {
    List<Card_Pojo> feedPojo;
    String post_heading[]={"What are some Bollywood movies which dared to do something risky for the first time?","What is the best way to study for your finals such to retain every possible thing?","What are some of the silliest and funniest dialogues in Hindi movies?","What are some of the best Computer Science/Programming books of all time?"};
    String post_date[]={"11/1/16","2/1/16","1/1/16","31/12/15"};
    String post_time_stamp[]={"2 mins ago","10 days ago","11 days ago","12 days ago"};
    String post_content[]={"After visiting a childhood friend, Chef wants to get back to his home. Friend lives at the first street, and Chef himself lives at the N-th (and the last) street. Their city is a bit special: you can move from the X-th street to the Y-th street if and only if 1 <= Y - X <= K, where K is the integer value that is given to you. Chef wants to get to home in such a way that the product of all the visited streets' special numbers is minimal (including the first and the N-th street). Please, help him to find such a product.","The first line of input consists of two integer numbers - N and K - the number of streets and the value of K respectively. The second line consist of N numbers - A1, A2, ..., AN respectively, where Ai equals to the special number of the i-th street.","CodeChef was created as a platform to help programmers make it big in the world of algorithms, computer programming and programming contests. At CodeChef we work hard to revive the geek in you by hosting a programming contest at the start of the month and another smaller programming challenge in the middle of the month. We also aim to have training sessions and discussions related to algorithms, binary search, technicalities like array size and the likes. Apart from providing a platform for programming competitions, CodeChef also has various algorithm tutorials and forum discussions to help those who are new to the world of computer programming.","A Place to hone your 'Computer Programming Skills' \n" +
            "Try your hand at one of our many practice problems and submit your solution in a language of your choice. Our programming contest judge accepts solutions in over 35+ programming languages. Preparing for coding contests were never this much fun! Receive points, and move up through the CodeChef ranks. Use our practice section to better prepare yourself for the multiple programming challenges that take place through-out the month on CodeChef."};

    public FeedAdapter()
    {
        feedPojo=new ArrayList<Card_Pojo>();
        Card_Pojo[] cardPojos=new Card_Pojo[post_content.length];
        for(int i=0;i<cardPojos.length;i++)
        {
            cardPojos[i]=new Card_Pojo();
            cardPojos[i].setHeading(post_heading[i]);
            cardPojos[i].setDate(post_date[i]);
            cardPojos[i].setContent(post_content[i]);
            cardPojos[i].setTimestampt(post_time_stamp[i]);
            feedPojo.add(cardPojos[i]);
        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_feed,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Card_Pojo feedItems=feedPojo.get(position);
        holder.tv_heading.setText(feedItems.getHeading());
        holder.tv_date.setText(feedItems.getDate());
        holder.tv_content.setText(feedItems.getContent());
        holder.tv_timestamp.setText(feedItems.getTimestamp());

    }

    @Override
    public int getItemCount() {
        return feedPojo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_heading,tv_date,tv_content,tv_timestamp;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_heading= (TextView) itemView.findViewById(R.id.txt_feed_heading);
            tv_date= (TextView) itemView.findViewById(R.id.txt_feed_date);
            tv_content= (TextView) itemView.findViewById(R.id.txt_feed_content);
            tv_timestamp= (TextView) itemView.findViewById(R.id.txt_feed_stamp);


        }
    }
}
