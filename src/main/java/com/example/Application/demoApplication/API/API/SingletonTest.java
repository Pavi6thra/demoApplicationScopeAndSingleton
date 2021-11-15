package com.example.Application.demoApplication.API.API;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class SingletonTest {
    private int no=0;

    public SingletonTest(){
        System.out.println("from singletontest constructor");
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
