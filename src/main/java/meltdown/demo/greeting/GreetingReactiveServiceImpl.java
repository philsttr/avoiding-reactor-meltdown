package meltdown.demo.greeting;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@RequiredArgsConstructor
class GreetingReactiveServiceImpl implements GreetingReactiveService {

	private final GreetingService greetingService;

	/*
	 * Correct implementation
	 */
	public Mono<String> getGreeting() {
		return Mono.fromCallable(greetingService::getGreeting)
				// properly schedule above blocking call on
				// scheduler meant for blocking tasks
				.subscribeOn(Schedulers.elastic());
	}

	/**
	 * Incorrect implementation.
	 *   - Imposter Method (doing work before subscribing)
	 *   - Blocking in event loop
	 */
	private Mono<String> getGreeting_imposter() {
		try {
			// blocking work performed during assembly, before subscribing
			String greeting = greetingService.getGreeting();
			return Mono.just(greeting);
		} catch (Exception e) {
			return Mono.error(e);
		}
	}

	/**
	 * Incorrect implementation.
	 *   - Blocking in event loop
	 */
	private Mono<String> getGreeting_blocking() {
		// blocking call on event loop
		return Mono.fromCallable(greetingService::getGreeting);
	}

}
