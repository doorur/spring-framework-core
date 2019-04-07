package me.doorur.springapplicationcontext;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }

}
