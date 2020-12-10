package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.ImagePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedService {

    private AuthService authService;
    private List<ImagePost> imagePostList;

    public FeedService(){
        imagePostList = new ArrayList<>();

    }

    public List<ImagePost> getPostList(){
        return imagePostList;
    }

    public void addPost(ImagePost imagePost){
        imagePostList.add(imagePost);
        authService.getAccessingUser().addPost(imagePost);

    }
    public void removePost(ImagePost imagePost){
        imagePostList.remove(imagePost);
        authService.getAccessingUser().removePost(imagePost);
    }

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }


}
