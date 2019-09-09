package meltdown.demo.greeting;



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
