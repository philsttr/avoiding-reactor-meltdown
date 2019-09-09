package meltdown.demo;

import meltdown.demo.greeting.GreetingConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GreetingConfigurationProperties.class)
public class MeltdownDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeltdownDemoApplication.class, args);
	}

}
