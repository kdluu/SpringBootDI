package com.example.SpringBootDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field Injection need Autowired
//    @Autowired
//    @Qualifier("desktop")
    @Autowired
    @Qualifier("desktop")
    private Computer computer;

//    @Autowired
//    @Qualifier("laptop")
//    private Computer computer;computer

    // Constructor injection
//    private Laptop laptop;
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    // Setter injection need Autowired on the method
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }


    public void build() {
        computer.compile();
        System.out.println("Working on Awesome project!");
    }
}
