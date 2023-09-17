package singleton;

public class Saving {
    private int money = 0;
    private static final Saving sv = new Saving();
    private Saving() {}
    public static Saving getInstance() {
        return sv;
    }
    public synchronized void addMoney(int money) {
        this.money += money;
        System.out.println("Add: " + money);
        System.out.println("Total: " + this.money);
    }
    public synchronized void subtractMoney(int money) {
        this.money -= money;
        System.out.println("Subtract: " + money);
        System.out.println("Total: " + this.money);
    }
    public synchronized int getMoney() {
        return money;
    }
}
