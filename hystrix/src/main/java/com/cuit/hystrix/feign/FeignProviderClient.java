package com.cuit.hystrix.feign;

import com.cuit.hystrix.entity.Student;
import com.cuit.hystrix.feign.impl.FeignProviderClientError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(value = "provider", fallback = FeignProviderClientError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/findById/{id}")
    Student findById(@PathVariable("id") long id);

    @PostMapping("/student/save")
    void save(@RequestBody Student student);

    @PutMapping("/student/update")
    void update(@RequestBody Student student);

    @DeleteMapping("/student/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);

    @GetMapping("/student/index")
    String index();
}
