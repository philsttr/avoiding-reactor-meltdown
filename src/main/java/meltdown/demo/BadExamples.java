package meltdown.demo;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * Examples found in code reviews.
 * Names have been changed.
 */
public class BadExamples {

	/*
	BAD
	public Mono<Void> removeFooBar(final long fooId, final long barId) {
		try {
			barClientService.removeBar(fooId, barId);
		} catch (Exception e) {
			return Mono.error(new ApplicationException());
		}
		return barNotifier.sendRemoveBarEvent(barId);
	}

	GOOD
	public Mono<Void> removeFooBar(final long fooId, final long barId) {
		return Mono.fromRunnable(() -> barClientService.removeBar(fooId, barId))
			// if removeBar is blocking, subscribe on a bounded elastic scheduler
			.subscribeOn(Schedulers.boundedElastic())
			.onErrorMap(ApplicationException::new)
			.then(barNotifier.sendRemoveBarEvent(barId));
	}
	 */
}
