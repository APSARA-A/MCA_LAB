class CPU {
    int price;

    
    CPU(int price) {
        this.price = price;
    }

   
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void displayProcessor() {
            System.out.println("Processor Details:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAM() {
            System.out.println("RAM Details:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    void displayCPU() {
        System.out.println("CPU Price: " + price);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        
        CPU cpu = new CPU(50000);

        
        CPU.Processor p = cpu.new Processor(8, "Intel");

        
        CPU.RAM r = new CPU.RAM(16, "Corsair");

        cpu.displayCPU();
        p.displayProcessor();
        r.displayRAM();
    }
}
