public abstract class Car {
    String driver;
    String[] passengers;
    String licensePlate;
    int passengerCount;

    public Car(String driver, String licensePlate) {
        this.driver = driver;
        this.licensePlate = licensePlate;
        passengers = new String[3];
        passengerCount = 0;
    }

    public void addPassenger(String passenger) {
        if (passengerCount < passengers.length) {
            passengers[passengerCount] = passenger;
            passengerCount++;
        } else {
            System.out.println("car is full.");
        }
    }

    public abstract void getDetails();
}
