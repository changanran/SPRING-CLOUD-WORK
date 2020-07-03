package cn.com.rx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SupportMucroserviceApplication {
	public static final String ENV_KEY="spring.profiles.active";

	public static void main(String[] args) {
		System.setProperty(ENV_KEY,"dev");
		SpringApplication.run(SupportMucroserviceApplication.class, args);
	}

}
