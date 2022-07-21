package com.cuit.ribbon.controller;

import com.cuit.ribbon.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * 功能区控制器
 *
 * @author TP
 * @date 2022-07-21
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/ribbon")
public class RibbonController {

    private final RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> getAll() {
        return restTemplate.getForEntity("http://provider/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://provider/student/findById/{id}", Student.class, id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForObject("http://provider/student/save", student, Void.class);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://provider/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://provider/student/deleteById/{id}", id);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
