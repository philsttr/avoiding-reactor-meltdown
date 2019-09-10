package meltdown.demo;

/**
 * Examples found in code reviews.
 * Names have been changed.
 */
public class BadExamples {

	/*
	public Mono<Void> removeFooBar(final long fooId, final long barId) {
		try {
			barClientService.removeBar(fooId, barId);
		} catch (Exception e) {
			return Mono.error(new ApplicationException());
		}
		return Mono.empty()
				.then(barNotifier.sendRemoveBarEvent(barId));
	}
	 */
}
