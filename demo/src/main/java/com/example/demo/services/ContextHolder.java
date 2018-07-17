package com.example.demo.services;

import com.example.demo.persistence.entities.Admin;
import com.example.demo.persistence.entities.User;
import org.springframework.stereotype.Component;

@Component
public class ContextHolder {

    private User user;

    public User getLoggedInUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
