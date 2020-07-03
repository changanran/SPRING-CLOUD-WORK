package cn.com.rx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan("cn.com.rx")
public class AppApplication {
    public static final String ENV_KEY="spring.profiles.active";

    public static void main(String[] args) {
        System.setProperty(ENV_KEY,"dev");
        SpringApplication.run(AppApplication.class, args);
    }

}
