package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AuthService {

    private UserService userService;
    private Integer counter = 0;
    private User accessingUser;



    public boolean signUp(String username, String password, String email){
       List<User> list = new ArrayList<>(userService.getUserMap().values());

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

    public void logout(){
        accessingUser = null;
    }

    public User getAccessingUser() {
        return accessingUser;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
