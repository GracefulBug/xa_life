package com.xa.xalife.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/v1/test")
@RestController
@Slf4j
public class TestController {


    @GetMapping(value = "/test1")
    public void test1() {
        log.info("test controller test1");
    }

    @RequestMapping("/test1")
    public void test2() {
        log.info("test controller test2");
    }
}
