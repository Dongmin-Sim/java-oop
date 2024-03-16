package com.org.springpractice;

import com.org.springpractice.config.Config;
import com.org.springpractice.logic.JavaSort;
import com.org.springpractice.logic.Sort;
import com.org.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("result : " + sortService.doSort(Arrays.asList(args)));
    }
}
