package org.academiadecodigo.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class WebController {

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


}
