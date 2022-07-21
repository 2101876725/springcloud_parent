package com.cuit.feign.feign.impl;

import com.cuit.feign.entity.Student;
import com.cuit.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Feign熔断机制
 *
 * @author TP
 * @date 2022-07-21
 */
@Component
public class FeignProviderClientError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public String index() {
        return "服务器维护中!";
    }
}
