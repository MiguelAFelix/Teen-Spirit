package org.academiadecodigo.bootcamp.maintest;

import org.academiadecodigo.bootcamp.model.ImagePost;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.UserService;

import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();
        System.out.println(userService.findUser(2).toString());
        System.out.println(userService.findUser(2).getBox().size());

        ImagePost imagePost = new ImagePost();
        Date date = imagePost.getPostDate();


    }
}
