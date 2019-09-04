package org.ymh.restdemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;


@ServletComponentScan
@SpringBootApplication
@ImportResource({"classpath:dubbo_provider.xml"})
public class RestdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestdemoApplication.class, args);
    }

}
