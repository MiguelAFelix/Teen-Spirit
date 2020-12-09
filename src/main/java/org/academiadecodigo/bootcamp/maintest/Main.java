package org.academiadecodigo.bootcamp.maintest;

import org.academiadecodigo.bootcamp.model.ModelPost;
import org.academiadecodigo.bootcamp.model.ModelUser;

import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ModelUser modelUser = new ModelUser();
        modelUser.setUsername("GPS");
        modelUser.setName("GPS1991");
        modelUser.setEmail("gps91@hotmail.com");

        ModelPost modelPost = new ModelPost();
        modelPost.setQuote("im feeling good");
        modelPost.setDescription("very good description");
        Date date = modelPost.getPostDate();
        System.out.println(date);
        modelPost.setPathImage((new File("/home/gps/Developer/Hackathon/betahackathon/src/main/resources/testimage.jpg")));
        modelPost.setUrlImage("https://image.freepik.com/free-vector/stylized-grunge-font-alphabet_53295-341.jpg");
        System.out.println(modelPost.getPathImage());

        modelUser.addPost(modelPost);

    }
}
