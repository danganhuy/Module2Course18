import java.util.Random;

public class Car implements Runnable {
    public static int DISTANCE = 1000;
    public static int STEP = 5;

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;

                StringBuilder log = new StringBuilder("|");
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (runDistance >= i + STEP) {
                        log.append("=");
                    } else if (runDistance >= i && runDistance < i + STEP) {
                        log.append("o");
                    } else {
                        log.append("-");
                    }
                }
                log.append("|");

                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000f + "s");
    }
}
