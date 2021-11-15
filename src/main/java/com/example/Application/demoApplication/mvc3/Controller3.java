package com.example.Application.demoApplication.mvc3;


import com.example.Application.demoApplication.API.API.ApplicationScopeTest;
import com.example.Application.demoApplication.API.API.SingletonTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/app3")
public class Controller3 {

    @Autowired
    private ApplicationScopeTest applicationScopeTest;

    @Autowired
    private SingletonTest singletonTest;

    @ResponseBody
    @RequestMapping("/AccessValueByController3")
    public String test1(){


        return "App three" +
                " >>>" + "ApplicationScopeTest value" + applicationScopeTest.getNo()+"." +
                " "+
                "singletonTest value" + singletonTest.getNo();
    }
}
