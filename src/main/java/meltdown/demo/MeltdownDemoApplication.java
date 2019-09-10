package meltdown.demo;

import meltdown.demo.greeting.GreetingConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import reactor.blockhound.BlockHound;

@SpringBootApplication
@EnableConfigurationProperties(GreetingConfigurationProperties.class)
public class MeltdownDemoApplication {

	static {
		BlockHound.install();
	}

	public static void main(String[] args) {
		SpringApplication.run(MeltdownDemoApplication.class, args);
	}

}
