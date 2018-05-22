/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.core.feed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author Gonzalo H. Mendoza
 * email: yogonza524@gmail.com
 * StackOverflow: http://stackoverflow.com/users/5079517/gonza
 */
@ManagedBean(name="feedBean")
@RequestScoped
public class FeedBean {

    public String imageOf(String link){
        String ytimgLink = "https://i.ytimg.com/vi/";
        String image = "/hqdefault.jpg";
        
        //The link has the next format, is a link of video from Youtube
        //https://www.youtube.com/watch?v=rGHWrWNg78o
        //We need the code id part after v=.....
        
        return ytimgLink + link.split("v=")[1] + image;
    }
}
