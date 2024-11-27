public class Count implements Runnable{
    private Thread thread;

    public Count() {
        thread = new Thread(this, "My runnable thread");
        System.out.println("'" + thread.getName() + "' created");
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Count " + (i + 1));
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " interrupted");
        }
        System.out.println(thread.getName() + " exiting");
    }
}
