package creationalpatterns.singleton.threadsafe;

public class ClientThreadSafe {
    public static void main(String[] args) {
        System.out.println("Thread safe Singleton Pattern implementation." + "\n");

        Thread sd = new Thread(new Sd());
        Thread sod = new Thread(new Sod());

        sd.start();
        sod.start();
    }

    static class Sd implements Runnable {
        @Override
        public void run() {
            Government gov = Government.getInstance("SD");
            System.out.println(gov.name);
        }
    }

    static class Sod implements Runnable {
        @Override
        public void run() {
            Government gov = Government.getInstance("SOD");
            System.out.println(gov.name);
        }
    }
}
