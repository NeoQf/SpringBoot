package io.github.neoqf.service.impl;

import io.github.neoqf.model.Student;
import io.github.neoqf.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * 使用dubbo中的注解暴露服务
 */
//@Component可以不用加
@DubboService(interfaceClass = StudentService.class, version = "1.0", timeout = 5000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student student = new Student();
        if (1001 == id) {
            student.setId(1001);
            student.setName("===1001-张三");
            student.setAge(20);
        } else if (1002 == id) {
            student.setId(1002);
            student.setName("****1002-张三");
            student.setAge(22);
        }

        return student;
    }
}
