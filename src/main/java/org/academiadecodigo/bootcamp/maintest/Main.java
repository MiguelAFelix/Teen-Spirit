package org.academiadecodigo.bootcamp.maintest;

import org.academiadecodigo.bootcamp.controller.WebController;
import org.academiadecodigo.bootcamp.model.Feed;
import org.academiadecodigo.bootcamp.model.Post;
import org.academiadecodigo.bootcamp.model.User;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setUsername("GPS");
        user.setEmail("gps91@hotmail.com");

        Post post = new Post();
        post.setQuote("im feeling good");
        post.setDescription("very good description");
        Date date = post.getPostDate();


    }
}
