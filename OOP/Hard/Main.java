package Hard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // =========================
        // 01 - Banking System
        // =========================
        System.out.println("===== BANKING SYSTEM =====");

        Account acc1 = new SavingsAccount("21412-2", 300, 0.05);
        Account acc2 = new CheckingAccount("32423-3", 420, 200);

        System.out.println("\nDepositing money...");
        acc1.deposit(50);
        acc2.deposit(50);

        System.out.println("\nWithdrawing money...");
        acc1.withdraw(300);
        acc2.withdraw(300);

        System.out.println("\nApplying interest to savings account...");
        ((SavingsAccount) acc1).applyInterest();

        System.out.println("\nFinal balances:");
        System.out.println("Savings Account: $" + acc1.getBalance());
        System.out.println("Checking Account: $" + acc2.getBalance());

        // =========================
        // 02 - Hotel Reservation System
        // =========================
        System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, true));
        rooms.add(new Room(102, true));
        rooms.add(new Room(103, true));

        Hotel hotel = new Hotel(rooms);

        System.out.println("\nInitial available rooms:");
        hotel.showAvailableRooms();

        System.out.println("\nBooking rooms...");
        Reservation res1 = hotel.bookRoom("Alice");
        Reservation res2 = hotel.bookRoom("Carlos");

        System.out.println("\nAvailable rooms after reservations:");
        hotel.showAvailableRooms();

        System.out.println("\nCancelling Alice's reservation...");
        hotel.cancelReservation(res1);

        System.out.println("\nAvailable rooms after cancellation:");
        hotel.showAvailableRooms();

        System.out.println("\nTrying to overbook rooms...");
        try {
            hotel.bookRoom("Charlie");
            hotel.bookRoom("David");
            hotel.bookRoom("Bob"); // Throws Exception
        } catch (NoRoomAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFinal state of rooms:");
        hotel.showAvailableRooms();

        // =========================
        // 03 - Inventory System
        // =========================
        System.out.println("\n===== INVENTORY SYSTEM =====");

        Inventory inventory = new Inventory();

        // Adding items
        inventory.addItem(new Potion("Health Potion", 2));
        inventory.addItem(new Weapon("Sword", 1));

        System.out.println("\nUsing items...");
        inventory.useItem("Health Potion");
        inventory.useItem("Sword");
        inventory.useItem("Health Potion");

        System.out.println("\nTrying to use the Health Potion again...");
        inventory.useItem("Health Potion");

        System.out.println("\nFinished testing Inventory System!");





    }
}
