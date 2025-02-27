public class InternalCombustionCar extends Car {
    public InternalCombustionCar(String driver,String licensePlate) {
        super(driver,licensePlate);
    }

    public void getDetails() {
        System.out.println("GV - Driver: " + driver);
        System.out.println("Passengers:");
        for (int i = 0; i < passengerCount; i++) {
            System.out.println(" - " + passengers[i]);
        }
    }
}
