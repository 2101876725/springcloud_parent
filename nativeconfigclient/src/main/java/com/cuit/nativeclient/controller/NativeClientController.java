package com.cuit.nativeclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 本机客户端控制器
 *
 * @author TP
 * @date 2022-07-21
 */
@RestController
@RequestMapping("/nativeclient")
public class NativeClientController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port;
    }

    @GetMapping("/foo")
    public String foo() {
        return this.foo;
    }
}
