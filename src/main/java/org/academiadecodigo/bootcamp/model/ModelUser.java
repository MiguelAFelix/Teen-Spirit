package org.academiadecodigo.bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class ModelUser {


    private String name;
    private String username;
    private int id;
    private String email;
    private List<ModelPost> box = new ArrayList<>();


    public List<ModelPost> getBox() {
        return box;
    }

    public void setBox(List<ModelPost> box) {
        this.box = box;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addPost(ModelPost modelPost){
        box.add(modelPost);
    }

    public void removePost(ModelPost modelPost){
        box.remove(modelPost);
    }
}
