import java.util.Scanner;

class CPU {
    int price;

    // Non-static inner class
    class Processor {
        int no_cores;
        String manufacturer;

        Processor(int no_cores, String manufacturer) {
            this.no_cores = no_cores;
            this.manufacturer = manufacturer;
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 4: Create CPU object
        CPU cpu = new CPU();

        // Input Processor details
        System.out.print("Enter number of cores: ");
        int cores = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter processor manufacturer: ");
        String procMan = sc.nextLine();

        // Step 5: Create Processor object (needs CPU object)
        CPU.Processor processor = cpu.new Processor(cores, procMan);

        // Input RAM details
        System.out.print("Enter RAM memory (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM manufacturer: ");
        String ramMan = sc.nextLine();

        // Step 6: Create RAM object (no CPU object needed)
        CPU.RAM ram = new CPU.RAM(memory, ramMan);

        // Step 7: Calculate CPU price (example logic)
        cpu.price = (processor.no_cores * 2000) + (ram.memory * 500);

        // Step 8: Print details
        System.out.println("\n--- CPU DETAILS ---");
        System.out.println("Processor Cores: " + processor.no_cores);
        System.out.println("Processor Manufacturer: " + processor.manufacturer);

        System.out.println("RAM Memory: " + ram.memory + " GB");
        System.out.println("RAM Manufacturer: " + ram.manufacturer);

        System.out.println("Calculated CPU Price: " + cpu.price);

        sc.close();
    }
}