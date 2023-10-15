package list;
public class Demo {
    // Define an enum for vehicle types
    enum VehicleType {
        CAR("4 wheels", "Gasoline"),
        MOTORCYCLE("2 wheels", "Gasoline"),
        BICYCLE("2 wheels", "Human-Powered"),
        BUS("6 or more wheels", "Diesel");

        private final String description;
        private final String fuelType;

        VehicleType(String description, String fuelType) {
            this.description = description;
            this.fuelType = fuelType;
        }

        public String getDescription() {
            return description;
        }

        public String getFuelType() {
            return fuelType;
        }
    }

    public static void main(String[] args) {
        // Using the VehicleType enum
        VehicleType myCar = VehicleType.CAR;
        VehicleType myBicycle = VehicleType.BICYCLE;

        // Printing properties of the vehicles
        System.out.println("My car has " + myCar.getDescription() + " and runs on " + myCar.getFuelType() + ".");
        System.out.println("My bicycle has " + myBicycle.getDescription() + " and is " + myBicycle.getFuelType() + ".");
    }
}

