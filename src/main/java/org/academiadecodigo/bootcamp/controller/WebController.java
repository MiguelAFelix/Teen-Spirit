package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.ImagePost;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.AuthService;
import org.academiadecodigo.bootcamp.services.FeedService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class WebController {

    private AuthService authService;
    private FeedService feedService;
    private UserService userService;
    private ImagePost imagePost;


    @RequestMapping(method = RequestMethod.GET, path = {"", "/", "/home"})
    public String getHome() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/dashboard"})
    public String getDashboard() {

        return "dashboard";
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
    public String saveLogin(@Valid @ModelAttribute("user") User user,@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        if(authService.logIn(user.getUsername(), user.getPassword(), user.getId())){
            return "dashboard";
        }else {
            redirectAttributes.addFlashAttribute("lastAction", "Username or password incorrect");
            return "redirect:/login/";
        }

    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=cancel")
    public String cancel() {
        return "redirect:/home";
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
        imagePost = new ImagePost();
        model.addAttribute("imagePost", imagePost);
        return "test";
    }
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, path = {"/test"}, params = "action=save")
//    public String encodeImage(@RequestBody ImagePost imagePost, Model model, RedirectAttributes redirectAttributes) throws IOException {
//        model.addAttribute(imagePost);
//        File file = imagePost.getPic();
//        System.out.println(file + "------------------------------------------------------");
//
//        byte[] imageBytes = IOUtils.toByteArray(new FileInputStream(file));
//        String base64 = Base64.getEncoder().encodeToString(imageBytes);
//        imagePost.setEncodedImage(base64);
//        redirectAttributes.addFlashAttribute("lastAction", "saved");
//        return "redirect:/test2";
//    }

//    @RequestMapping(path = "/test", value = "/test", method = RequestMethod.POST)
//    public String handleUpload(@RequestParam("imagePost") MultipartFile file, Model model) throws IOException {
//
//        if (!file.isEmpty()) {
//
//                model.addAttribute(imagePost);
//                byte[] bytes = file.getBytes(); // alternatively, file.getInputStream();
//                String base64 = Base64.getEncoder().encodeToString(bytes);
//                imagePost.setDescription("lalala");
//                imagePost.setQuote("olaolaola");
//                imagePost.setEncodedImage(base64);
//                return "test2";
//
//        }
//        return "test";
//    }

//    @PostMapping
//    public String upload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
//        redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
//
//        return "redirect:/test";
//    }
}
