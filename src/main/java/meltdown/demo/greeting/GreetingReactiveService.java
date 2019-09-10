package meltdown.demo.greeting;

import reactor.core.publisher.Mono;

/**
 * A reactive service for retrieving greetings in a random language.
 */
interface GreetingReactiveService {

	/**
	 * Returns a Mono that emits a in a random language.
	 *
	 * @return a Mono that emits a in a random language.
	 */
	Mono<String> getGreeting();

}
