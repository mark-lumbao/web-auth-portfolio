package com.em.web.controller;

import com.em.auth.Token;
import com.em.config.AppConfiguration;
import com.em.config.AuthConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Import(AppConfiguration.class)
public class AuthController {

    @Autowired
    private AuthConfig authConf;
    @Autowired
    private Token token02;

    @PostMapping("/token")
    public String getToken() {
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(AuthController.class);
        Token tk01 = ctxt.getBean("token-01", Token.class);
        System.out.println(authConf.getValue() + "-" + token02.getValue());
        return tk01.getValue() + token02.getValue();
    }

}
