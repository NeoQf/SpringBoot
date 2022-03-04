package io.github.neoqf;

import io.github.neoqf.config.SpringConfig;
import io.github.neoqf.vo.Cat;
import io.github.neoqf.vo.Student;
import io.github.neoqf.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01() {
        String config = "beans.xml";
        ApplicationContext ctx =  new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象" + student);
    }

    /**
     * 使用JavaConfig
     */
    @Test
    public void test02(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        System.out.println("使用JavaConfig创建的bean对象：" + student);
    }

    @Test
    public void test03(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("lisiStudent");
        System.out.println("使用JavaConfig创建的bean对象："+student);
    }

    @Test
    public void test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat  = (Cat) ctx.getBean("myCat");
        System.out.println("cat=="+cat);
    }

    @Test
    public void test05(){
        //没有xml配置文件，使用java类代替xml配置文件 的作用
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println("tiger=="+tiger);
    }
}
