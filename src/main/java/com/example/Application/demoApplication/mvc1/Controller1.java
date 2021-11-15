package com.example.Application.demoApplication.mvc1;


import com.example.Application.demoApplication.API.API.ApplicationScopeTest;
import com.example.Application.demoApplication.API.API.SingletonTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/app1")
public class Controller1 {

    @Autowired
    private ApplicationScopeTest applicationScopeTest;

    @Autowired
    private SingletonTest singletonTest;

    @ResponseBody
    @RequestMapping("/changeDefaultValue")
    public String test(){
        //changing ApplicationScopeTest default value
        //ApplicationScopeTest applicationScopeTest=new ApplicationScopeTest();
        applicationScopeTest.setNo(4);
        //changing SingletonTest default value
        System.out.println(applicationScopeTest);
        singletonTest.setNo(5);

        return "App one >>>" + "ApplicationScopeTest value" + applicationScopeTest.getNo()+". "+
                "singletonTest value" + singletonTest.getNo();
    }
}
