class CPU {

    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {

        CPU cpu = new CPU(45000);

        System.out.println("CPU Price: " + cpu.price);

        CPU.Processor processor = cpu.new Processor(8, "Intel");
        processor.display();

        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        ram.display();
    }
}
