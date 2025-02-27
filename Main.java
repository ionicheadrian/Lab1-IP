public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar("Alex","IS-74-ADI");
        electricCar1.addPassenger("Bob");
        electricCar1.addPassenger("Calin");

        ElectricCar electricCar2 = new ElectricCar("Diana","NT-30-SAL");
        electricCar2.addPassenger("Evelin");
        electricCar2.addPassenger("Flavia");
        electricCar2.addPassenger("Gabriela");

        InternalCombustionCar combustionCar1 = new InternalCombustionCar("Eduard","test");
        combustionCar1.addPassenger("Ionut");
        combustionCar1.addPassenger("Adrian");

        InternalCombustionCar combustionCar2 = new InternalCombustionCar("Ioana","CJ-10-MNT");

        System.out.println("Electric Car 1:");
        electricCar1.getDetails();
        System.out.println();

        System.out.println("Electric Car 2:");
        electricCar2.getDetails();
        System.out.println();

        System.out.println("Internal Combustion Car 1:");
        combustionCar1.getDetails();
        System.out.println();

        System.out.println("Internal Combustion Car 2:");
        combustionCar2.getDetails();
    }
}
