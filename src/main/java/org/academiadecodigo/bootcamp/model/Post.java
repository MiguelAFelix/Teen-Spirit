package org.academiadecodigo.bootcamp.model;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class Post {
    private Date postDate = new Date();
//    private File image;
    private String urlImage;
    private String quote;
    private String description;

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
//        try {
//            FileInputStream fileInputStreamReader = new FileInputStream(file);
//            byte[] bytes = new byte[(int)file.length()];
//            int pathImageEncoded = fileInputStreamReader.read(bytes);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return p;
//    }

//    public File getPathImage() {
//        return pathImage;
//    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

//    public void setPathImage(File pathImage) {
//        this.pathImage = pathImage;
//    }


    @Override
    public String toString() {
        return "ModelPost{" +
                "postDate=" + postDate +
                ", urlImage='" + urlImage + '\'' +
                ", quote='" + quote + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
