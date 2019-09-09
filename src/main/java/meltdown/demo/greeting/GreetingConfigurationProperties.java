package meltdown.demo.greeting;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Retrieves a list of greetings in different languages from the spring environment.
 */
@ConfigurationProperties
@Data
public class GreetingConfigurationProperties {

	/**
	 * A list of greetings in different languages.
	 */
	private List<String> greetings;

}
