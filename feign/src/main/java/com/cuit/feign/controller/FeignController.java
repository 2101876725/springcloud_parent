package com.cuit.feign.controller;

import com.cuit.feign.entity.Student;
import com.cuit.feign.feign.FeignProviderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * 外部控制器
 *
 * @author TP
 * @date 2022-07-21
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/feign")
public class FeignController {

    private final FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> getAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return feignProviderClient.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        feignProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        feignProviderClient.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        feignProviderClient.deleteById(id);
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
