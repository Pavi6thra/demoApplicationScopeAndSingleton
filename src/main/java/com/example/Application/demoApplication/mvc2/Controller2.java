package com.example.Application.demoApplication.mvc2;


import com.example.Application.demoApplication.API.API.ApplicationScopeTest;
import com.example.Application.demoApplication.API.API.SingletonTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/app2")
public class Controller2 {

    @Autowired
    private ApplicationScopeTest applicationScopeTest;

    @Autowired
    private SingletonTest singletonTest;

    @ResponseBody
    @RequestMapping("/AccessValue")
    public String test1(){

        return "App two" +
                " >>>" + "ApplicationScopeTest value" + applicationScopeTest.getNo()+"." +
                " "+
                "singletonTest value" + singletonTest.getNo();
    }
}
