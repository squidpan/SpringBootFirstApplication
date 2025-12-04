package com.squidpan.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien
{
    @Autowired
    Laptop laptop;
    public void code () {
        this.laptop.compile();
    }
}
