package singleton;

public class Main extends Thread {

    public static void main(String[] args) {
        Main threadA = new Main("TEST A");
        Main threadB = new Main("TEST B");
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consequence: " + Saving.getInstance().getMoney());
    }

    @Override
    public void run() {
        Saving sv = Saving.getInstance();
        sv.addMoney(10000);
        sv.subtractMoney(5000);
        System.out.println(Thread.currentThread().getName() + " - Money: " + sv.getMoney());
    }

    public Main(String name) {
        super(name);
    }
}
