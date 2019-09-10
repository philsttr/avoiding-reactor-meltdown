package meltdown.demo.greeting;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
class GreetingController {

	private final GreetingReactiveService greetingReactiveService;

	/**
	 * @return a Mono that emits a random greeting
	 */
	@GetMapping("/hello")
	public Mono<String> hello() {
		return greetingReactiveService.getGreeting();
	}

	/**
	 * @return a Flux that emits four random greetings
	 */
	@GetMapping("/hellos")
	public Flux<String> hellos() {
	    return greetingReactiveService.getGreeting()
	            .repeat(4);
	}
}
