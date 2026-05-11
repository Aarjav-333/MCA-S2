import java.util.*;

class Vehicle {
    int vehicleId;
    String brand;
    double rentPerDay;

    Vehicle(int vehicleId, String brand, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }

    void displayVehicle() {
        System.out.println(vehicleId + "\t\t" + brand + "\t\t" + rentPerDay);
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    Car(int vehicleId, String brand, double rentPerDay, int seatingCapacity) {
        super(vehicleId, brand, rentPerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    void displayVehicle() {
        System.out.println(vehicleId + "\t\t" + brand + "\t\tCar\t\t" +
                           rentPerDay + "\t\t" + seatingCapacity + " seats");
    }
}

class Bike extends Vehicle {
    int engineCC;

    Bike(int vehicleId, String brand, double rentPerDay, int engineCC) {
        super(vehicleId, brand, rentPerDay);
        this.engineCC = engineCC;
    }

    @Override
    void displayVehicle() {
        System.out.println(vehicleId + "\t\t" + brand + "\t\tBike\t\t" +
                           rentPerDay + "\t\t" + engineCC + " CC");
    }
}

public class VehicleRentalSystem {

    static void addDefaultVehicles(ArrayList<Vehicle> vehicles) {
        vehicles.add(new Car(101, "Maruti", 1500, 5));
        vehicles.add(new Car(102, "Toyota", 2500, 7));
        vehicles.add(new Bike(201, "Yamaha", 800, 150));
        vehicles.add(new Bike(202, "RoyalEnfield", 1200, 350));
    }

    static void displayHeader() {
        System.out.println("Vehicle ID\tBrand\t\tType\t\tRent/Day\tExtra Details");
        System.out.println("---------------------------------------------------------------------");
    }

    static void displayAllVehicles(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }

        displayHeader();

        for (Vehicle v : vehicles) {
            v.displayVehicle();
        }
    }

    static Vehicle findVehicleById(ArrayList<Vehicle> vehicles, int vehicleId) {
        for (Vehicle v : vehicles) {
            if (v.vehicleId == vehicleId) {
                return v;
            }
        }

        return null;
    }

    static void rentVehicle(ArrayList<Vehicle> vehicles, Scanner sc) {
        System.out.println("Enter Vehicle ID:");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicleById(vehicles, vehicleId);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        System.out.println("Enter number of days:");
        int days = sc.nextInt();

        if (days <= 0) {
            System.out.println("Invalid number of days.");
            return;
        }

        double totalRent = vehicle.calculateRent(days);

        System.out.println("\n------ Rent Details ------");
        System.out.println("Vehicle ID   : " + vehicle.vehicleId);
        System.out.println("Brand        : " + vehicle.brand);
        System.out.println("Rent Per Day : " + vehicle.rentPerDay);
        System.out.println("Days         : " + days);
        System.out.println("Total Rent   : " + totalRent);
    }

    static void displayVehiclesSortedByRent(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }

        ArrayList<Vehicle> sortedVehicles = new ArrayList<>(vehicles);

        sortedVehicles.sort(
            Comparator.comparingDouble((Vehicle v) -> v.rentPerDay)
        );

        System.out.println("\n------ Vehicles Sorted by Rent ------");
        displayHeader();

        for (Vehicle v : sortedVehicles) {
            v.displayVehicle();
        }
    }

    static void displayMenu() {
        System.out.println("\n------ Vehicle Rental Menu ------");
        System.out.println("1. Display All Vehicles");
        System.out.println("2. Rent Vehicle by ID");
        System.out.println("3. Display Vehicles Sorted by Rent");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        addDefaultVehicles(vehicles);

        boolean running = true;

        while (running) {
            displayMenu();

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayAllVehicles(vehicles);
                    break;

                case 2:
                    rentVehicle(vehicles, sc);
                    break;

                case 3:
                    displayVehiclesSortedByRent(vehicles);
                    break;

                case 4:
                    running = false;
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}