package cn.com.rx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	public static final String ENV_KEY="spring.profiles.active";

	public static void main(String[] args) {
		System.setProperty(ENV_KEY,"dev");
		SpringApplication.run(TestApplication.class, args);
	}

}
