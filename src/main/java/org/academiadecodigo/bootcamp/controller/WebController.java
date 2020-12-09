package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.Post;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.AuthService;
import org.academiadecodigo.bootcamp.services.FeedService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

@Controller
@RequestMapping("")
public class WebController {

    private AuthService authService;
    private FeedService feedService;
    private UserService userService;
    private Post post;


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

    @RequestMapping(method = RequestMethod.GET, path = "/signUp")
    public String signUp(Model model) {

            model.addAttribute("user", new User());
            return "signUp";

    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action = save")
    public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "signUp";
        }

        if(authService.signUp(user.getUsername(), user.getPassword(), user.getEmail())){
            return "dashboard"; //?????????????????????
        }else {
            redirectAttributes.addFlashAttribute("lastAction", "Username already exists.");
            return "signUp";
        }

    }

    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String login(Model model) {

        model.addAttribute("user", new User());
        return "login";

    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public String saveLogin(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "login";
        }

        if(authService.logIn(user.getUsername(), user.getPassword(), user.getId())){
            return "dashboard"; //?????????????????????
        }else {
            redirectAttributes.addFlashAttribute("lastAction", "Username or password incorrect");
            return "login";
        }

    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=cancel")
    public String cancelSaveCustomer() {
        return "redirect:/dashboard/";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/logout"})
    public String logout(){
        authService.logout();
        return "home";
    }

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Autowired
    public void setFeedService(FeedService feedService) {
        this.feedService = feedService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET , path = "/test")
    public String uploadImage(Model model){
        post = new Post();
        model.addAttribute("post", post);
        return "test";
    }
//    @RequestMapping(method = RequestMethod.POST ,value = "/test", path = "/test")
//    public String encodeImage(@ModelAttribute("post") Post post, Model model) throws IOException {
//        model.addAttribute(post);
//        File file = post.getImage();
//
//        byte[] imageBytes = IOUtils.toByteArray(new FileInputStream(file));
//        String base64 = Base64.getEncoder().encodeToString(imageBytes);
//        post.setEncodedImage(base64);
//        return "test2";
//    }

    @RequestMapping(method = RequestMethod.GET, path = "/test2")
    public String testMethod(Model model){

        model.addAttribute("image", post.getEncodedImage());
        return "test2";
    }

    @RequestMapping(path = "/test", value = "/test", method = RequestMethod.POST)
    public String handleUpload(@RequestParam("file") MultipartFile file, BindingResult result, Model model) throws IOException {

        if (!file.isEmpty()) {
            if(result.hasErrors()) {
                model.addAttribute(post);
                byte[] bytes = file.getBytes(); // alternatively, file.getInputStream();
                String base64 = Base64.getEncoder().encodeToString(bytes);
                post.setDescription("lalala");
                post.setQuote("olaolaola");
                post.setEncodedImage(base64);
                return "test2";
            }
        }
        return "test";
    }
}
