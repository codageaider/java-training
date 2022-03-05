package day12;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Sorting getQuickSort(){
        return new QuickSort();
    }
}
