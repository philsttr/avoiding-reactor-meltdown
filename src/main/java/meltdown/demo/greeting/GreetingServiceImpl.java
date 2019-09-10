package meltdown.demo.greeting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * An implementation of {@link GreetingService} that simulates blocking I/O
 * in {@link #getGreeting()}.
 */
@Service
@RequiredArgsConstructor
class GreetingServiceImpl implements GreetingService {

	private final GreetingConfigurationProperties config;

	@Override
	public String getGreeting() {
		try {
			// Simulate blocking I/O call with a blocking sleep call
			Thread.sleep(50);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		}
		int selectedGreetingIndex = ThreadLocalRandom.current()
				.nextInt(0, config.getGreetings().size());
		return config.getGreetings().get(selectedGreetingIndex) + "\n";
	}

}
