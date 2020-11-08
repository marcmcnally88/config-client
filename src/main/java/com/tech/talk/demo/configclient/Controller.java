package com.tech.talk.demo.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcmcnally on 03/11/2020.
 */
@RefreshScope
@RestController
@RequestMapping("/rest")
public class Controller {


    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
    }

