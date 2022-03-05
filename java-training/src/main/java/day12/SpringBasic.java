package day12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasic {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBasic.class, args);
        System.out.println("Starter spring project");


    }
}
