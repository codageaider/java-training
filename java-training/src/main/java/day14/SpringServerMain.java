package day14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/*
Ex: Implement all the twitter and Facebook APIs only GET and POST.



 */
@SpringBootApplication
public class SpringServerMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringServerMain.class, args);
    }
}
