package org.academiadecodigo.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
    public String test() {

        return "test";
    }
}
