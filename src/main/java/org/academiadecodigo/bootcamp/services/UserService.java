package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.model.ImagePost;
import org.academiadecodigo.bootcamp.model.User;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<Integer, User> userMap = new HashMap<>();

    public UserService(){

        User user = new User();
        user.setEmail("gurpadurpa@gmail.com");
        user.setId(1);
        user.setUsername("Gurpa");
        user.setPassword("durpagurpa");
        userMap.put(1, user);
        List<ImagePost> box = new ArrayList<>();
        user.setBox(box);
        ImagePost post = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/1399817_10151741548592963_1208926145_o.jpg?_nc_cat=104&ccb=2&_nc_sid=174925&_nc_eui2=AeGBsOWz85ltjnVivXNZwn0N0_pniyRST9nT-meLJFJP2SFw4TaEyqQSZ92BVY2K8Rw&_nc_ohc=gTaeaSF-KwIAX8xT86_&_nc_ht=scontent.flis5-1.fna&oh=6ce983572eb4e5a186fe440c3f569bb0&oe=5FF674FC");
        user.getBox().add(post);
        ImagePost post1 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/15129612_1547408611942931_355695205876422301_o.jpg?_nc_cat=109&ccb=2&_nc_sid=8bfeb9&_nc_eui2=AeEXvnSpzKB2ET6_0ZXted8-OKF1igpcX984oXWKClxf32QAneqOm2mCitMO_NqWrW0&_nc_ohc=uRaBGusxUtkAX9lhqwN&_nc_ht=scontent.flis5-1.fna&oh=b0ae77852d262cf0dfd88d2b406ea77b&oe=5FF74C29");
        user.getBox().add(post1);
        ImagePost post2 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/13217154_10153623536772963_7936688576442843657_o.jpg?_nc_cat=104&ccb=2&_nc_sid=9267fe&_nc_eui2=AeE7QoJH3_AZWMtTFzzDSuRFyWxaDwTv19rJbFoPBO_X2hl8E9UtxuGkWfYUU3oGXE4&_nc_ohc=tpP1Khlzy0MAX9qTuPo&_nc_oc=AQlIi4GyGxGzAOikvZCWXaKYorRbWP_aYYnPW4OUjYSI9kgM9OS3hnhDlcHNVZPa-j_3BLfGg6F3ZP0DzTm7tHag&_nc_ht=scontent.flis5-1.fna&oh=e7b9fdb03168d08afd6c27464a05e9df&oe=5FF90C03");
        user.getBox().add(post2);
        ImagePost post3 = new ImagePost();
        post.setUrlImage("https://www.fiumani.it/wp-content/uploads/2019/04/fiumani-led-art-canvas-painting-5.jpg");
        user.getBox().add(post3);
        ImagePost post4 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t1.0-9/90708403_3426551780692328_3376961621808119808_o.jpg?_nc_cat=107&ccb=2&_nc_sid=a26aad&_nc_eui2=AeFQCA3xVibGThIokFpa8gzk4TSfTwH0aH3hNJ9PAfRofTak-5VMw4bUYK-UKkYhgSc&_nc_ohc=eVbFUVTTBdkAX8wt6j7&_nc_ht=scontent.flis5-1.fna&oh=06e89beff35ec5ce8542694e055b45c0&oe=5FF700BA");
        user.getBox().add(post4);
        ImagePost post5 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t1.0-9/59286230_2713529165327930_2389545706995056640_o.jpg?_nc_cat=102&ccb=2&_nc_sid=9267fe&_nc_eui2=AeHS3-z0rMXTEaxienB21sJB-6cMB4u15Zn7pwwHi7XlmVmWX9ekNoe_KThnC1N4-wI&_nc_ohc=ZqtHgqT6ACQAX_iLZB1&_nc_ht=scontent.flis5-1.fna&oh=2fb1641eb05adbbe9409bd48c21d7b74&oe=5FF5BE15");
        user.getBox().add(post5);
        ImagePost post6 = new ImagePost();
        post.setUrlImage("https://video-images.vice.com/_uncategorized/1526426881718-fiumani-freak.png");
        user.getBox().add(post6);
        ImagePost post7 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t1.0-9/93778189_3483848748295964_5476581986757771264_o.jpg?_nc_cat=109&ccb=2&_nc_sid=9267fe&_nc_eui2=AeELFPU3tSvcwMTQ5WOUlZjGO0R0pBVulo07RHSkFW6WjeYHRMBVsNuFCB5xW8TPYZY&_nc_ohc=rFr9lpIBIXkAX8LYovr&_nc_ht=scontent.flis5-1.fna&oh=d604abf7374c922fcc5438c7cb8409f0&oe=5FF779C8");
        user.getBox().add(post7);

        User user1 = new User();
        user1.setEmail("gonniedarko@gmail.com");
        user1.setId(2);
        user1.setUsername("Gonniemini");
        user1.setPassword("darko123");
        userMap.put(2, user1);
        List<ImagePost> box1 = new ArrayList<>();
        user1.setBox(box1);
        ImagePost post8 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t1.0-9/117390975_3818085878205581_5220163878361694165_o.jpg?_nc_cat=102&ccb=2&_nc_sid=9267fe&_nc_eui2=AeEX0Jp-qz1Z5PHiDelJmltKTKaRLGxvwrFMppEsbG_CsV2ERuj8rG75iDRYPy2VHdI&_nc_ohc=V4vZ4pFqssoAX9aA9fX&_nc_ht=scontent.flis5-1.fna&oh=8c7894a4624abfdd0cea8892731d1c81&oe=5FF95B48");
        user1.getBox().add(post8);
        ImagePost post9 = new ImagePost();
        post.setUrlImage("https://www.fiumani.it/wp-content/uploads/2020/03/fiumani_plastic_face_art_website_recycle_art-2-768x592.jpg");
        user1.getBox().add(post9);
        ImagePost post10 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/28701276_2093049734042546_3134919922096357118_o.jpg?_nc_cat=109&ccb=2&_nc_sid=9267fe&_nc_eui2=AeFObq9RF171Q_6fIFiIf5EHTZAAz6O5w8NNkADPo7nDw4F7BC1dF_1P6b1UXteqh8E&_nc_ohc=6uRhE7rz4KYAX_jBCUA&_nc_ht=scontent.flis5-1.fna&oh=3499d72454274ffd58286376c4e28130&oe=5FF7949C");
        user1.getBox().add(post10);
        ImagePost post11 = new ImagePost();
        post.setUrlImage("https://www.fiumani.it/wp-content/uploads/2019/04/fiumani-led-art-canvas-painting-3.jpg");
        user1.getBox().add(post11);
        ImagePost post12 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/10493026_10152301125767963_6088629575482571337_o.jpg?_nc_cat=103&ccb=2&_nc_sid=9267fe&_nc_eui2=AeErp5uWc4YFNb_BK_PtN6Np3n5QW6NQS4PeflBbo1BLg_h5um_U9aekYuuOVeUkUMA&_nc_ohc=DyuNCLxkbVoAX_KG3ui&_nc_ht=scontent.flis5-1.fna&oh=1cc4afb201366f6073a69f5576f46d21&oe=5FF756FC");
        user1.getBox().add(post12);

        User user2 = new User();
        user2.setEmail("gepetomariachi@gmail.com");
        user2.setId(3);
        user2.setUsername("ElGepeto");
        user2.setPassword("mariachi");
        userMap.put(3, user2);
        List<ImagePost> box2 = new ArrayList<>();
        user2.setBox(box2);
        ImagePost post13 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/11145139_10153181003817963_355697657324638182_o.jpg?_nc_cat=104&ccb=2&_nc_sid=9267fe&_nc_eui2=AeHnx_bB4_cR4AmK2M7kQGdDzTmbCLk2rS_NOZsIuTatLxosWWOlfjMj-ub80TEuYxo&_nc_ohc=Vk30Ae1T_XQAX_yqThd&_nc_ht=scontent.flis5-1.fna&oh=43122b3a0d4e710882d0b587566282c3&oe=5FF68BBE");
        user2.getBox().add(post13);
        ImagePost post14 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t1.0-9/48314903_2487461367934712_8180587624159772672_o.jpg?_nc_cat=103&ccb=2&_nc_sid=9267fe&_nc_eui2=AeF2-0-u6vCWWexA3too4BrELWVpWY50fW8tZWlZjnR9b2EtmxlSGhUbkEX2wgEe2U4&_nc_ohc=aaThYwrIHJIAX-Wi-ed&_nc_ht=scontent.flis5-1.fna&oh=909ca4731c328427956beacc3de31ebb&oe=5FF6C1AC");
        user2.getBox().add(post14);
        ImagePost post15 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/29750026_2122653704415482_8710443868321440078_o.jpg?_nc_cat=111&ccb=2&_nc_sid=9267fe&_nc_eui2=AeEd-NbLd1lU9zMKow6W5CW77aVog4gSRTPtpWiDiBJFM4V-55XMsfqBXbQSHSo68CU&_nc_ohc=WRX9GMRdLB4AX-TW31H&_nc_ht=scontent.flis5-1.fna&oh=4dfc328206f685ad7bef01152877c38e&oe=5FF918A9");
        user2.getBox().add(post15);
        ImagePost post16 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t1.0-9/65286172_10156347597917963_2340742199769038848_o.jpg?_nc_cat=107&ccb=2&_nc_sid=8bfeb9&_nc_eui2=AeFgh8pf522Q1tPndn20KS_pi6aSGCCmMi2LppIYIKYyLV6rlO4pXzmofXCqgJvqbqo&_nc_ohc=3908PM4luIUAX--cBTT&_nc_ht=scontent.flis5-1.fna&oh=6bf2d66df223b3d711ddd49ea6a06cb3&oe=5FF8B1EC");
        user2.getBox().add(post16);
        ImagePost post17 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/1557275_10151885361937963_1430040865_o.jpg?_nc_cat=111&ccb=2&_nc_sid=9267fe&_nc_eui2=AeGWHVFBBp_p_El2eB2c_vp9hB2GwAm2fSKEHYbACbZ9IhE0w63QYsvRzg6hXniGWdA&_nc_ohc=MGbIBGL2f7IAX_wjQnw&_nc_ht=scontent.flis5-1.fna&oh=6dece2bcec88c92c76bba0c38153a408&oe=5FF8088F");
        user2.getBox().add(post17);
        ImagePost post18 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/1402916_10151763876847963_1374088931_o.jpg?_nc_cat=111&ccb=2&_nc_sid=9267fe&_nc_eui2=AeE3I-7vMMBrqSRxt2UFoA5JGsPM660TZzwaw8zrrRNnPHTU6_H3nRoEqG-_Lmm5EwU&_nc_ohc=vVzIv3HxhycAX9eY2CN&_nc_ht=scontent.flis5-1.fna&oh=8364ea66d32bbff264453c8a3d1df12f&oe=5FF98574");
        user2.getBox().add(post18);
        ImagePost post19 = new ImagePost();
        post.setUrlImage("https://scontent.flis5-1.fna.fbcdn.net/v/t31.0-8/22135564_1922651554418633_6938138591055539277_o.jpg?_nc_cat=107&ccb=2&_nc_sid=84a396&_nc_eui2=AeFT4npqXrtVSU1q4NTruPupUV7IsGs-y0VRXsiwaz7LRZSGqAH3NCV2QTV7PqWie8c&_nc_ohc=DCPKSZBZWDcAX_FuEZ5&_nc_ht=scontent.flis5-1.fna&oh=ad62c918e754a5e93381e26072387bbc&oe=5FF7D304");
        user2.getBox().add(post19);


    }


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
