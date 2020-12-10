package org.academiadecodigo.bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private List<ImagePost> feed = new ArrayList<>();

    public List<ImagePost> getFeed() {
        return feed;
    }

    public void setFeed(List<ImagePost> feed) {
        this.feed = feed;
    }

    public void addToFeed(ImagePost imagePost){
        feed.add(imagePost);
    }

    public void removeFromFeed(ImagePost imagePost){
        feed.remove(imagePost);
    }

    @Override
    public String toString() {
        return "Feed{" +
                "feed=" + feed +
                '}';
    }
}
