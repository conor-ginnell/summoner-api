package com.staxrt.summoner.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        return "error";
    }
}
