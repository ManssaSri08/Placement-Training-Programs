public class Main {
    public static void main(String[] args) {
        // create thread pool with 3 threads
        ThreadPoolManager poolManager = new ThreadPoolManager(3);
        // submit tasks
        for (int i = 1; i <= 6; i++) {
            Task task = new Task(i);
            poolManager.submitTask(task);
        }
        // shutdown pool
        poolManager.shutdownPool();
    }
}