package com.aliao.learningdatabinding.model;

/**
 * Created by ALiao on 2015/7/15.
 */
public class User {
    public String userName;
    public String email;
    public String sex;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public User(String userName, String email, String sex) {
        this.userName = userName;
        this.email = email;
        this.sex = sex;
    }

}
