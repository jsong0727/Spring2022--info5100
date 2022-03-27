import java.util.Random;

public class Fisherman implements Runnable {
    @Override
    public void run() {
        Random rand = new Random();
        int counter = 1;
        while (true) {
            Main.fishMarket.add(Thread.currentThread().getName())
        }
    }
}
