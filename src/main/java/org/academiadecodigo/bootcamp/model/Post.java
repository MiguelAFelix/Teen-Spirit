package org.academiadecodigo.bootcamp.model;


import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

public class Post {
    private Date postDate = new Date();
    private File image;
    private String urlImage;
    private String quote;
    private String description;
    private String encodedImage;
    private MultipartFile file;

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }



    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



//    public int encodePathImage(File file){
//        byte[] imageBytes = IOUtils.resourceToByteArray();
//        String base64 = Base64.getEncoder().encodeToString(imageBytes);
//    }

    public File getImage() {
        return image;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setImage(File pathImage) {
        this.image = image;
    }




    public String getEncodedImage() {
        return encodedImage;
    }

    public void setEncodedImage(String encodedImage) {
        this.encodedImage = encodedImage;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
