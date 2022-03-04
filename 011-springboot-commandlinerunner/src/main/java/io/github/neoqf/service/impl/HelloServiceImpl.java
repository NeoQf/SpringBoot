package io.github.neoqf.service.impl;

import io.github.neoqf.service.HelloService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好：" + name;
    }
}
