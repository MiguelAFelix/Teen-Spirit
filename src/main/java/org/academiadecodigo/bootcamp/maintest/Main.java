package org.academiadecodigo.bootcamp.maintest;

import org.academiadecodigo.bootcamp.model.Feed;
import org.academiadecodigo.bootcamp.model.Post;
import org.academiadecodigo.bootcamp.model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("GPS");
        user.setEmail("gps91@hotmail.com");

        Post post = new Post();
        post.setQuote("im feeling good");
        post.setDescription("very good description");
        Date date = post.getPostDate();
        System.out.println(date);

        post.setUrlImage("https://image.freepik.com/free-vector/stylized-grunge-font-alphabet_53295-341.jpg");


        user.addPost(post);

        System.out.println(user);

        Feed feed = new Feed();

        feed.addToFeed(post);
        System.out.println(feed.getFeed().toString());

    }
}
