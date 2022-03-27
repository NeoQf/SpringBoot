package io.github.neoqf.config;

import io.github.neoqf.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplication {
    // 定义方法，注册servlet对象
    @Bean
    public ServletRegistrationBean<MyServlet> servletRegistrationBean() {
        // public ServletRegistrationBean(T servlet, String... urlMappings)
        // 第一个参数是Servlet对象，第二个参数是Url地址
        /*ServletRegistrationBean bean =
                new ServletRegistrationBean(new MyServlet(), "/myservlet");*/

        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login", "/test");

        return bean;
    }
}
