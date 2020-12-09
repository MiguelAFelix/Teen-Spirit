package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.services.AuthService;
import org.academiadecodigo.bootcamp.services.FeedService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class WebController {

    private UserService userService;
    private AuthService authService;
    private FeedService feedService;


    @RequestMapping(method = RequestMethod.GET, path = {"", "/", ""})
    public String getHome() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/dashboard"})
    public String getDashboard() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/about"})
    public String getAbout() {

        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/contact"})
    public String getContact() {

        return "contact";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/feelgood"})
    public String getFeelGoodPlace() {

        return "feelgoodplace";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/sos"})
    public String getSOS() {

        return "sos";
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/"})
    public String signIn() {

        return "sos";
    }


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Autowired
    public void setFeedService(FeedService feedService) {
        this.feedService = feedService;
    }
}
