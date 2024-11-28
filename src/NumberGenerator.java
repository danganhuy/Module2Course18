public class NumberGenerator implements Runnable{
    private Thread thread;
    @Override
    public void run() {
        try {
            System.out.println("Generating number");
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                System.out.print(i + " ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
