class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("AMQ123", new Account("Andres Herrerasasd", "ANS123"));
        car2.passenger = 4;
        car2.printDataCar();
    }
}