package com.cuit.resttemplate.controller;

import com.cuit.resttemplate.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * 学生管理员
 *
 * @author TP
 * @date 2022-07-20
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/rest")
public class StudentController {

    private final RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> getAll() {
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, Void.class);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}
