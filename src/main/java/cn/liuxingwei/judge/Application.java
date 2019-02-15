package cn.liuxingwei.judge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"file:${root}/conf/${env}/application.properties"})

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
