package day12;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import static org.springframework.boot.BootstrapRegistry.Scope.SINGLETON;
@Configuration
@ImportResource("bean-config.xml")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Sorting getQuickSort() {
        System.out.println("Inside @Bean @Scope method");
        return new QuickSort();
    }

    @Bean
    public Sorting getMergeSort() {
        return new MergeSort();
    }

    @Bean
    public Users getUsers(){
        // For the users object it will display the hashcode
        // of getQuickSort() object
        return new Users(getQuickSort());
    }
    /*
    @Bean methods -> There objects that these functions returned are cached or stored.
    And if the method is called again. It checks if an object is already available or
    not. If its avaiable it doesnt createa a new object.
     */
}
/*
These beans go into Application context and then we can fetch them
from Application Context
 */