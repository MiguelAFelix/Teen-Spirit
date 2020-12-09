package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.User;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<Integer, User> userMap = new HashMap<>();


    public Map<Integer, User> getUserMap() {
        return userMap;
    }


    public void addUser(User user){
        userMap.put(user.getId(), user);

    }

    public void removeUser(User user){
        userMap.remove(user.getId());
    }

    public User findUser(Integer id){
       return userMap.get(id);
    }


}
