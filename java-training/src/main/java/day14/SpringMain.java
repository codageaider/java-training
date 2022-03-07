package day14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

/*
(i) XML
(ii) @Configuration , @Bean
(iii) @Component
 */
@SpringBootApplication
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringMain.class, args);
        BubbleSort heapSort = context.getBean(BubbleSort.class);
        MergeSort mergeSort = context.getBean(MergeSort.class);
        heapSort.sort(new ArrayList<>());
        mergeSort.sort(new ArrayList<>());
        Address address = context.getBean(Address.class);
        System.out.println(address.getHouseNo());
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress().getHouseNo());


    }
}
