package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(App.class,args);

        int length = context.getBeanDefinitionNames().length;
        log.trace("Spring boot启动初始化了 {} 个 Bean", length);
        log.debug("Spring boot启动初始化了 {} 个 Bean", length);
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
        log.warn("Spring boot启动初始化了 {} 个 Bean", length);
        log.error("Spring boot启动初始化了 {} 个 Bean", length);

        try{
            int i=1;
            i = i/0;
        }catch (Exception e){
            log.error("Springboot启动异常"+e);
        }

    }
}
