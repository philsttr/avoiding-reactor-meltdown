Avoiding Reactor Meltdown
=========================

Demo project for the *Avoiding Reactor Meltdown* talk
presented at [Spring One 2019](https://springoneplatform.io/2019/sessions/avoiding-reactor-meltdown).

Branches:
* [`start`](https://github.com/philsttr/avoiding-reactor-meltdown/tree/start) - state at the start of the demo, with improper blocking calls
  * BlockHound disabled
  * [`GreetingController`](https://github.com/philsttr/avoiding-reactor-meltdown/blob/start/src/main/java/meltdown/demo/greeting/GreetingController.java) contains call that will block event loop
* [`master`](https://github.com/philsttr/avoiding-reactor-meltdown/tree/master) - reactive solution with proper handling of blocking calls 
  * [BlockHound enabled](https://github.com/philsttr/avoiding-reactor-meltdown/blob/master/src/main/java/meltdown/demo/MeltdownDemoApplication.java)
  * [`GreetingController`](https://github.com/philsttr/avoiding-reactor-meltdown/blob/master/src/main/java/meltdown/demo/greeting/GreetingController.java) calls `GreetingReactiveService`
  * [`GreetingReactiveServiceImpl`](https://github.com/philsttr/avoiding-reactor-meltdown/blob/master/src/main/java/meltdown/demo/greeting/GreetingReactiveServiceImpl.java) wraps blocking call to `GreetingService` properly

