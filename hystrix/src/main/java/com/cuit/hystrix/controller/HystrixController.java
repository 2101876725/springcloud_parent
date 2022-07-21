package com.cuit.hystrix.controller;

import com.cuit.hystrix.entity.Student;
import com.cuit.hystrix.feign.FeignProviderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * hystrix控制器
 *
 * @author TP
 * @date 2022-07-21
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/hystrix")
public class HystrixController {

    private final FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
