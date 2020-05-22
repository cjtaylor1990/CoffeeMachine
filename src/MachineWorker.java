import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MachineWorker {
    private MachineStorage storage;

    public MachineWorker(MachineStorage storage) {
        this.storage = storage;
    }
    public MachineWorker(){
        this.storage = null;
    }

    public void fill(Scanner scanner, MachineStorage machineStorage) {
        List<Integer> newStorage = new ArrayList<>();
        for (Component component : Component.values()) {
            System.out.println("Write how many " + component.getUnit() + " of "
                    + component.getName() + " do you want to add:");
            newStorage.add(scanner.nextInt());
        }
        machineStorage.fillStorage(newStorage);
    }

    public void fill(Scanner scanner) {
        this.fill(scanner, this.storage);
    }

    public void buy(Scanner scanner, MachineStorage machineStorage) {
        System.out.print("What do you want to buy? ");
        CoffeeType[] types = CoffeeType.values();
        String currentTypeString;
        for (int i = 0; i < types.length; i++) {
            currentTypeString = types[i].getChoiceCode() + " - " + types[i].name().toLowerCase() + ", ";
            System.out.print(currentTypeString);
        }
        System.out.print("back - to main menu:\n");

        String userChoice = scanner.nextLine();
        if (!"back".equals(userChoice)) {
            for (CoffeeType type : types) {
                if (Integer.parseInt(userChoice) == type.getChoiceCode()) {
                    machineStorage.makeCoffee(type);
                    break;
                }
            }
        }
    }

    public void buy(Scanner scanner) {
        this.buy(scanner, this.storage);
    }

    public void take(MachineStorage machineStorage) {
        int cashTaken = machineStorage.getCash();
        machineStorage.setCash(0);
        System.out.println("I gave you $" + cashTaken);
    }

    public void take() {
        this.take(this.storage);
    }
}
