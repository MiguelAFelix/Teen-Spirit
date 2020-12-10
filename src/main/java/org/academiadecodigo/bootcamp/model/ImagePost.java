package org.academiadecodigo.bootcamp.model;



import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

public class ImagePost {
    private Date postDate = new Date();
    private String urlImage;

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }


}
