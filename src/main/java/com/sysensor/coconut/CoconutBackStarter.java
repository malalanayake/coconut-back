package com.sysensor.coconut;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class CoconutBackStarter {

    public static Logger LOG = Logger.getLogger(CoconutBackStarter.class.getName());

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CoconutBackStarter.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            LOG.info(beanName);
        }

        CamelSpringBootApplicationController configurableApplicationContextBean =
                ctx.getBean(CamelSpringBootApplicationController.class);

    }
}
