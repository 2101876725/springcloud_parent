package com.cuit.provider.repository.impl;

import com.cuit.provider.entity.Student;
import com.cuit.provider.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 学生知识库impl
 *
 * @author TP
 * @date 2022-07-20
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 20));
        studentMap.put(2L, new Student(2L, "李四", 20));
        studentMap.put(3L, new Student(3L, "王五", 20));
        studentMap.put(4L, new Student(4L, "赵六", 20));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
