package io.github.neoqf.service.impl;

import io.github.neoqf.dao.StudentDao;
import io.github.neoqf.model.Student;
import io.github.neoqf.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;


    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
