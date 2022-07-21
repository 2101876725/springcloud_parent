package com.cuit.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * NativeServer启动类
 *
 * @author TP
 * @date 2022-07-21
 */
@EnableConfigServer
@SpringBootApplication
public class NativeServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeServerApplication.class, args);
    }
}
