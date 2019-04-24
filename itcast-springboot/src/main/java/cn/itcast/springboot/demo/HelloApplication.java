package cn.itcast.springboot.demo;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*1、@SpringBootApplication：SpringBoot项目的核心注解，主要目的是开启自动配置。；
 *2、@Configuration：这是一个配置Spring的配置类；
 *3、@Controller：标明这是一个SpringMVC的Controller控制器；
 *4、main方法：在main方法中启动一个应用，即：这个应用的入口*/
@Controller
@SpringBootApplication(exclude = { RedisAutoConfiguration.class })
@Configuration
public class HelloApplication {
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello world！";
    }
    //自定义消息转化器(不配置，springboot默认utf-8)
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("ISO-8859-1"));
        return converter;
    }

    public static void main(String[] args) {
       SpringApplication.run(HelloApplication.class, args);
       /* SpringApplication application = new SpringApplication(HelloApplication.class);
        application.setBannerMode(Mode.OFF);
        application.run(args);*/
    }

}
