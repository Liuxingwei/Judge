package cn.liuxingwei.judge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"file:${root}/conf/${env}/application.properties", "file:${root}/conf/${env}/business.properties"})
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
