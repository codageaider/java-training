package day12;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:bean-config.xml")
public class MyConfig {

    @Bean
    public Sorting getQuickSort() {
        return new QuickSort();
    }

    @Bean
    public Sorting getMergeSort() {
        return new MergeSort();
    }
}
/*
These beans go into Application context and then we can fetch them
from Application Context
 */