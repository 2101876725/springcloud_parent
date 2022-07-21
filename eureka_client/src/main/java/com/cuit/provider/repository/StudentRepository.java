package com.cuit.provider.repository;

import com.cuit.provider.entity.Student;

import java.util.Collection;

/**
 * 学生接口
 *
 * @author TP
 * @date 2022-07-20
 */
public interface StudentRepository {

    Collection<Student> findAll();

    Student findById(long id);

    void saveOrUpdate(Student student);

    void deleteById(long id);
}
