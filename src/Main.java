import java.util.*;

public class Main {
    public static boolean userInteraction(Scanner scanner, MachineWorker worker, MachineStorage storage) {
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        String userChoice = scanner.nextLine();
        switch (userChoice) {
            case "buy":
                worker.buy(scanner);
                break;
            case "fill":
                worker.fill(scanner);
                break;
            case "take":
                worker.take();
                break;
            case "remaining":
                storage.printStorage();
                break;
            case "exit":
                return false;
            default:
                System.out.println("Invalid input");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MachineStorage storage = new MachineStorage(400, 540, 120, 9, 550);
        MachineWorker worker = new MachineWorker(storage);

        boolean isMachineOn = true;
        while (isMachineOn) {
            isMachineOn = userInteraction(scanner, worker, storage);
        }
    }
}
