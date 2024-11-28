public class EvenThread  extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("EvenThread is interrupted");
        }
    }
}
