class Task implements Runnable {
    private int taskId;
    public Task(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println(
            "Executing Task " + taskId + 
            " by " + Thread.currentThread().getName()
        );
        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "Completed Task " + taskId + 
            " by " + Thread.currentThread().getName()
        );
    }
}