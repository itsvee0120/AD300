public class LambdaRunnable {
    public static void main(String[] args) {
        // Lambda expression for Runnable interface
        Runnable task = () -> System.out.println("Hello from the Runnable thread!");
        Thread thread = new Thread(task);
        thread.start();
    }
}
