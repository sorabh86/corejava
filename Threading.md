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

## Thread Pooling
* Implement a thread pool is not trivial
* JDK comes with a few implementations of thread pool.
* Fixed Thread Pool executor
	```
	int numberOfThread = 6;
	Executor executor = Executors.newFixedThreadPool(numberOfThread);
	Runnable task = ...;
	executor.execute(task);
	```

### HTTP server
com.github.sorabh86.threads.server

### Measure throughput using Apache Jmeter
* Java performance automation tool
* Does not require writing any code

#### Process
1. start application `java -jar .\ApacheJMeter.jar`
2. rename and save testplan.jmx
3. Right click on plan, add->Threads->ThreadGroup, set number of threads to 200.
4. right click on thread group, add->Logic Controller->While Controller
5. right click on While Controller, add->Config Element-> CSV Data Set Config, and browse the file.
6. right click on While Controller, add->Sampler->HTTP Request, set protocol, IP, port, request method, context url & params.
7. right click on While Controller, add->Listener->Summary Report.
8. right click on While Controller, add->Listener->View Result Tree.
9. Run test plans with different numbers of threads pool sizes.

### Performance measurement and analysis
Best performance will be near when number of cores = number of threads. Increase of number of thread after that will have almost constant with no improvements.

## Data Sharing between Threads
1. **Stack Memory Region**: Stack is a memory region where methods are executed, arguments are passed, local variables are stored.    
Stack + Instruction Pointer = State of each thread's execution 
	* All variables belong to the thread executing on that stack.
	* Statically allocated when the thread is created.
	* The stack's size is fixed, and relatively small(platform specific)
	* If our calling hierarchy is too deep. We may get an StackOverflow Exception. (Risky with recursive calls)
2. **Heap Memory Region**: Heap is a shared memory region, where Objects(anything created with the new operator) e.g. String, Object, Collection, etc, Members of classes, Static variables. Heap is manage and Governed by Garbage Collector. Objects - stay as long as we have a reference to them. Members of classes exist as long as their parent objects exist(same life cycle as their parents). Static variables stay forever.

### Difference between References & Objects
References can be allocated on the stack or ont the heap if they are members of a class. but Objects are always allocated on the heap.
* Heap(shared): Objects, Class methods, Static variables.
* Stack(exclusive): Local primitive types, Local references.

### Resource Sharing
Resource in terms of computer programming is something that represent data or state. These can be
* Variables (integers, string, ...)
* Data structure (array, collections, maps, ...)
* File or connection handles (connections to file or databases, ...)
* Message or work queues
* Any Object we create ...

### Atomic Operation
* Operations those are thread safe.
* An operation or a set of operations is considered atomic, if it appears to the rest of the system as if it occurred at once.
* Single step - "all or nothing"
* No intermediate states
* All reference assignments are atomic. We can get and set references to objects automatically.
* All assignments to primitive types are safe `except long and double`, that means reading from, and writing to the following types i.e. int, short, byte, float, char, boolean. long and double are 64bit data type, java didn't guareenty accessing them in single operation, sometimes reading it will happend in 2 different lower and uper 32bits operations.
* **volatile**: Assignment to long and double if declared volatile i.e. `volatile double x = 1.0; //atomic`
* Classes java.util.concurrent.atomic are more advanced operations, those classes are performing non-atomic operations atomically using some techniques and tricks.	
* **Metrics Aggrigation**

## Concurrency
* **Synchroized**: Locking resources: two ways we can lock by using synchronized keyword or synchronized block. Synchronized block is called `Reentrant`. A thread cannot prevent itself from entering a critical section means a thread in the synchroized block can access another synchroized block, but other thread are locked to enter.

### Race Condition
When multiple threads are accessing a shared resources. At least one thread is modifying the resource, the timing of threads scheduling may cause incorrect results. The core of the problem is non atomic operations performed on the shared resource.

**Solution**: Identification of the critical section where the race condition is happening, then protect critical section by a synchronized block.

### Data Race
* Compiler and CPU may execute the instructions Out of Order to optimize performance and utilization.
* They will do so while maintaining the logical correctness of the code.
* Out of Order execution by the compiler and CPU are important features to speed up the code.
* The compiler re-arranges instructions for better
	* Branch predication (optimized loops, if statements, etc.)
	* Vectorization: Parallel instruction execution (SIMD)
	* Prefetching instructions: better cache performance.
* CPU re-arranges instructions for better hardware units utilization.

**Solution**: Java do not guareenty semantics executed by differnt threads running concurrently. There are two methods
	* Synchronization of methods which modify shared variables.
	* Declaration of shared variables with the volatile keyword.

## Locking Strategy
* `Fine-Grained Locking`: Locking individual resource.
* `Coarse-Grained Locking`: Looking every resources.

### Deadlock
In Fine-Grained Locking this problem occurred.
* Mutual Exclusion: Only one thread can have exclusive access to a resource.
* Hold and Wait: At least one thread is holding a resource and is waiting for another resource.
* Non-preemptive allocation: A resource is released only after the thread is done using it.
* Circular wait: A chain of at least two threads each one is holding one resource and waiting for another resource.

**Solution**: Avoid Circular wait: Enforce a strict order in lock acquisition. Enforcing a strict order on lock acquisition prevents deadlocks. Easy to do with a small number of locks. 

Maybe hard to accomplish if there are many locks in different places. You can use other techniques:
* Deadlock detection: Watchdog
* Thread interruption(not possible with synchronized)
* tryLock operations(not possible with synchronized)

## Locking
* java.util.concurrent.locks.ReentrantLock
	* It works just like the synchronized keyword applied on an object.
	* It requires explicit locking and unlocking.
	* If deadlock happened. **Solution**: Surround your code in try and unlock object in finally block.
* ReentrantLock.lockInterruptibly()
	* This is very useful if we implement `watchdog` for deadlock detection and recovery.
	* Waking up threads to do clean and close the application.
* ReentrantLock.tryLock()
	* `boolean tryLock(long timeout, TimeUnit unit)`
		* return true and acquires a lock if available.
		* return false and does not get suspended, if the lock is unavailable.
	* Under no circumstance does the tryLock() method block.
	* Regardless of the state of the lock, it always returns immediately.
	* Real Time applications where suspending a thread on a lock() method is unacceptable.
* ReentrantReadWriteLock
	* Synchronized and ReentrantLock do not allow multiple readers to access a shared resource concurrently.
	* Not a big problem in the general case.
	* If we keep the critical sections short, the chances of a contention over a lock are minimal.
	* Use it when read operations are predominant, or the read operation are not as fast for read from many variable, read from a complex data structure.

## Semaphore

