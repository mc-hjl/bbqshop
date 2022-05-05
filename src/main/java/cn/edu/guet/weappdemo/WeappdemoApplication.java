package cn.edu.guet.weappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import cn.edu.guet.weappdemo.mainlogin.mainlogin;

@SpringBootApplication
public class WeappdemoApplication {

    public static void main(String[] args) {
        new mainlogin();
        SpringApplication.run(WeappdemoApplication.class, args);
    }
}
