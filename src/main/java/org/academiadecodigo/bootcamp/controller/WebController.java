package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.Post;
import org.academiadecodigo.bootcamp.services.FeedService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class WebController {


    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String test() {

        return "test";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String addPost() {
        UserService userService = new UserService();
        FeedService feedService = new FeedService();

//        userService.getUserMap().get(1).addPost();
//        feedService.addPost(Post post);

        return "test";
    }
}
