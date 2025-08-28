public class Main {
    public static void main(String[] args) {
        Monitor thisMonitor = new Monitor("U2723QE", "Dell", 27, "4K UHD");
        Motherboard thisMotherboard = new Motherboard("ROG STRIX Z790-E", "ASUS", 4, 3, "BIOS 3002");
        ComputerCase thisComputerCase = new ComputerCase("NZXT H510", "NZXT", "650W");
        PersonalComputer thisPersonalComputer = new PersonalComputer("Predator Orion 3000", "Acer", thisMonitor, thisMotherboard, thisComputerCase);

        thisPersonalComputer.pressUp();
        thisMotherboard.loadProgram("Windows 11");
    }
}

/*
 * This is a simple Java example demonstrating OOP concepts:
 * - Inheritance (Monitor, Motherboard, ComputerCase, PersonalComputer extend Product)
 * - Composition (PersonalComputer has Monitor, Motherboard, and ComputerCase)
 * - Encapsulation (fields are private and accessed via constructors/methods)
 *
 * Realistic computer components are used to make the example more practical.
 */
