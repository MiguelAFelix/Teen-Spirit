package org.academiadecodigo.bootcamp.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class User {


    @NotNull(message = "last name is mandatory")
    @NotBlank(message = "last name is mandatory")
    @Size(min=3, max=64)
    private String username;
    private int id;

    @Email
    private String email;

    @Size(min=7, max=16)
    private String password;

    private List<Post> box = new ArrayList<>();


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getBox() {
        return box;
    }

    public void setBox(List<Post> box) {
        this.box = box;
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

    public void addPost(Post post){
        box.add(post);
    }

    public void removePost(Post post){
        box.remove(post);
    }

    @Override
    public String toString() {
        return "ModelUser{" +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", box=" + box +
                '}';
    }
}
