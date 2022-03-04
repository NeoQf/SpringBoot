package io.github.neoqf.service.impl;

import io.github.neoqf.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务方法sayHello:" + name);
    }
}
