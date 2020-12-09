package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AuthService {

    private UserService userService;
    private Integer counter = 0;
    private User accessingUser;



    public boolean signUp(String username, String password, String email){
       List<User> list = new ArrayList<User>(userService.getUserMap().values());

       for(User user: list){
           if(user.getUsername().equals(username)){
               return false;
           }
       }
        counter ++;
        User user = new User();
        user.setId(counter);
        user.setPassword(password);
        user.setEmail(email);
        user.setUsername(username);
        userService.addUser(user);

        accessingUser = user;
        return true;
    }

    public boolean logIn(String username, String password, Integer id){
        User user = userService.findUser(id);
        if(user.getUsername().equals(username) && user.getPassword().equals(password)){
            accessingUser = user;
            return true;
        }
        return false;
    }

    public User getAccessingUser() {
        return accessingUser;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
