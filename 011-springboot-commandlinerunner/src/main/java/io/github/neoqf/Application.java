package io.github.neoqf;

import io.github.neoqf.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource   // @Resource的作用：直接获取对象，而不用new对象
    private HelloService helloService;

    public static void main(String[] args) {
        // 准备创建容器对象
        System.out.println("准备创建容器对象");
        // 创建容器对象
        SpringApplication.run(Application.class, args);
        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {

        String str = helloService.sayHello("lisi");
        System.out.println("调用容器中的对象" + str);
        // 可以做自定义操作，如：读取文件、数据库等
        System.out.println("在容器对象创建好后，执行的方法");
    }
}
