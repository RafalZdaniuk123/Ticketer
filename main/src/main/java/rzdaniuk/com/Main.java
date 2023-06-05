package rzdaniuk.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "rzdaniuk.com")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}