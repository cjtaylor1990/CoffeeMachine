import java.util.*;

public class MachineStorage {
    private int[] components;
    final private String[] componentNames = {"water", "milk", "coffee beans", "disposable cups"};
    private int cash;

    public MachineStorage(List<Integer> storageLevels) {
        this.components = new int[4];
        this.components[0] = storageLevels.get(0);
        this.components[1] = storageLevels.get(1);
        this.components[2] = storageLevels.get(2);
        this.components[3] = storageLevels.get(3);
        this.cash = storageLevels.get(4);
    }

    public MachineStorage(int water, int milk, int coffeeBeans, int cups, int cash) {
        this(Arrays.asList(water, milk, coffeeBeans, cups, cash));
    }

    public MachineStorage() {
        this(Arrays.asList(0, 0, 0, 0));
    }

    public int getWater() {
        return this.components[0];
    }

    public int milk() {
        return this.components[1];
    }

    public int getCoffeeBeans() {
        return this.components[2];
    }

    public int getCups() {
        return this.components[3];
    }

    public int getCash() {
        return this.cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void fillStorage(List<Integer> newStock) {
        this.components[0] += newStock.get(0);
        this.components[1] += newStock.get(1);
        this.components[2] += newStock.get(2);
        this.components[3] += newStock.get(3);
    }

    public void makeCoffee(CoffeeType type) {
        int[] coffeeCosts = type.getAllComponents();
        for (int i = 0; i < coffeeCosts.length; i++) {
            if (this.components[i] < coffeeCosts[i]) {
                System.out.println("Sorry, not enough " + componentNames[i]);
                return;
            }
        }
        System.out.println("I have enough resources, making you a coffee");
        this.components[0] -= type.getWater();
        this.components[1] -= type.getMilk();
        this.components[2] -= type.getCoffeeBeans();
        this.components[3] -= type.getCups();
        this.cash += type.getCost();
    }

    public void printStorage() {
        System.out.println("The coffee machine has:");
        System.out.println(this.components[0] + " of water");
        System.out.println(this.components[1] + " of milk");
        System.out.println(this.components[2] + " of coffee beans");
        System.out.println(this.components[3] + " of disposable cups");
        System.out.println(this.cash + " of money");
    }
}
