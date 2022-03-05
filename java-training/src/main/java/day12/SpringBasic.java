package day12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

/*
Spring is a container for beans.
When we create objects in Spring they are called beans
container -> something that can store some data
Spring manages objects on our behalf.

IOC Container -> Inversion of control Container or ApplicationContext.

 */
@SpringBootApplication
public class SpringBasic {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Configuration.class, args);
        QuickSort quickSort = context.getBean(QuickSort.class);
        quickSort.sort(new ArrayList<>());
        System.out.println("Starter spring project");
        // How we can put beans into IOC Container or Application Context

    }
}
