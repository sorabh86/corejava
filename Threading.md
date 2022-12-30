[<back](README.md)

# Java Multithreading, Concurrency & Performance Optimization

* Concurrency & Parallelism
	1. Responsiveness (Concurrency) is particularly critical in application with user interface. Responsiveness can be achieved by using multiple thread, with a separate thread for each task.
	2. Performance (Parallelism), we can create an illusion of multiple tasks executing in parallel using just a single core. With multiple cores we can truly run tasks completely in parallel.
	
* Operating system fundamentals
	1. **Context switch**: It is responsible for assigning various threads in system. It is not cheap, and is the price of multitasking(concurrency). Same as we humans when we multitask, we take time to focus. Each thread consumes resources in the CPU and memory.    
	When we switch to a different thread:
		1. Store data for one thread.
		2. Restore data for another thread.
	- **Key Takeaways**:  
		Too many threads can cause **Thrashing**, spending more time in management than real productive work. Threads consumes less resources than processes. Context switching between threads from the same process is cheaper than context switch between different processes. 
	2. **Thread scheduling**: Decision to When to run which thread. 
		1. Epochs
		2. Time Slices
		3. Dynamic Priority = Static Priority(Set by developer) + Bonus(adjusted by OS, -ve or +ve).
		4. Usign Dynamic Priority, the OS will give preference for Interactive threads (such as User Interface threads). OS will give preference to threads that did not complete in the last epochs, or did not get enough time to run, preventing starvation.
	3. **Thread vs Processes**: Multithreaded Architecture prefer if the tasks share a lot of data. Threads are much faster to create and destroy. Switching between threads of the same process is faster. If Security and stability are of higher importance. Tasks are unrelated to each other. 

1. Thread Creation
	1. java.lang.Runnable
	2. java.lang.Thread
2. Thread Compabilites
3. Thread Debugging

* **Thread.join(timeoutmiliseconds)**: Give more control over independent threads. Safely collect and aggregate  results. Gracefully handle runaway threads.
* Do not rely on the order of execution.
* Always use thread coordination.
* Design code for worst case scenario.
* Threads may take unreasonably long time.
* Always use the Thread.join(..) with a time limit.
* Stop the thread if it's not done in time.

## Performance & Optimizing
* Performance can be defined in many ways depending on the use case.
* High Speed Trading System: faster your application better the performance also known as minimum latency.
* Multithreaded Applications performance criteria
	* Latency - The time to completion of a task. Measured in time units. Theoretical reduction of latency by N = Performance improvement by a factor of N(number of cores).
	* Throughtput - The amount of tasks completed in a given period. Measured in tasks/time unit.
* Latency reduction by breaking the task into multiple, and running in parallel.

#### Types of Tasks
1. Parallelizable Tasks
2. Unbreakable, Sequential Task
3. Partially Parallelizable, Partially Sequential

