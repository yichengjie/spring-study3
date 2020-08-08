package com.yicj.study.mvc.foo.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    private ApplicationContext applicationContext ;

    @RequestMapping(value="/hello", method=GET)
    public String home() {
        log.info("======> applicationContext :{}" ,applicationContext);
        return "home";
    }
 
}