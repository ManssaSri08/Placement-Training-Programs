import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadPoolManager {
    private ExecutorService executor;
    public ThreadPoolManager(int numberOfThreads) {
        executor = Executors.newFixedThreadPool(numberOfThreads);
    }
    public void submitTask(Runnable task) {
        executor.execute(task);
    }
    public void shutdownPool() {
        executor.shutdown();
        System.out.println("Thread Pool Shutdown Initiated...");
    }
}