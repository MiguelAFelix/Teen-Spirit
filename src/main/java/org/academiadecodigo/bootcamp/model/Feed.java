package org.academiadecodigo.bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private List<Post> feed = new ArrayList<>();

    public List<Post> getFeed() {
        return feed;
    }

    public void setFeed(List<Post> feed) {
        this.feed = feed;
    }

    public void addToFeed(Post post){
        feed.add(post);
    }

    public void removeFromFeed(Post post){
        feed.remove(post);
    }

    @Override
    public String toString() {
        return "Feed{" +
                "feed=" + feed +
                '}';
    }
}
