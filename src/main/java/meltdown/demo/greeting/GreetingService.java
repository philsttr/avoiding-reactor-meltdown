package meltdown.demo.greeting;

/**
 * A blocking service that returns greetings in random languages.
 */
interface GreetingService {

	/**
	 * Returns a greeting in a random language.
	 *
	 * <p>Blocks while retrieving a greeting.</p>
	 *
	 * @return a greeting in a random language.
	 * @throws Exception if there was any problem retrieving the greeting.
	 */
	String getGreeting() throws Exception;

}
