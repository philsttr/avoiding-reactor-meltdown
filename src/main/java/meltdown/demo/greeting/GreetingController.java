package meltdown.demo.greeting;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class GreetingController {

	private final GreetingService greetingService;

	@GetMapping("/hello")
	public String hello() throws Exception {
		return greetingService.getGreeting();
	}
}
