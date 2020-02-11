package xyz.fefine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "xyz.fefine")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
