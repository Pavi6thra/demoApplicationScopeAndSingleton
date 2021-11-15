package com.example.Application.demoApplication.API.API;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;


//bean once it got created it will be attached with the servlet context. if we set any data in applicationScopeTest cls then it will be visible to the servlet context
@Component
@ApplicationScope
public class ApplicationScopeTest {

    private int no=0;

    public ApplicationScopeTest(){
        System.out.println("from ApplicationScopeTest constructor");
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
