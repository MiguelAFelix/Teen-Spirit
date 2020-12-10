package org.academiadecodigo.bootcamp.maintest;

import org.academiadecodigo.bootcamp.model.ImagePost;
import org.academiadecodigo.bootcamp.model.User;

import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setUsername("GPS");
        user.setEmail("gps91@hotmail.com");

        ImagePost imagePost = new ImagePost();
        imagePost.setQuote("im feeling good");
        imagePost.setDescription("very good description");
        Date date = imagePost.getPostDate();


    }
}
