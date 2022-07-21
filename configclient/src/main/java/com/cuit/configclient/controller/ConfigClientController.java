package com.cuit.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置客户端控制器
 *
 * @author TP
 * @date 2022/07/21
 */
@RestController
@RequestMapping("/configclient")
public class ConfigClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return this.port;
    }
}
