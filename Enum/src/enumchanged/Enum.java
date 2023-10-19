package enumchanged;

public class Enum {
	
	    // Define an enum for vehicle types with an additional "wheels" field
	    enum VehicleType {
	        CAR("4 wheels", "Gasoline", 4),
	        MOTORCYCLE("2 wheels", "Gasoline", 2),
	        BICYCLE("2 wheels", "Human-Powered", 2),
	        BUS("6 or more wheels", "Diesel", 6);

	        private final String description;
	        private final String fuelType;
	        private final int numberOfWheels;

	        VehicleType(String description, String fuelType, int numberOfWheels) {
	            this.description = description;
	            this.fuelType = fuelType;
	            this.numberOfWheels = numberOfWheels;
	        }

	        public String getDescription() {
	            return description;
	        }

	        public String getFuelType() {
	            return fuelType;
	        }

	        public int getNumberOfWheels() {
	            return numberOfWheels;
	        }
	    }

	    public static void main(String[] args) {
	        int minWheels = 2;
	        int maxWheels = 4;

	        // Filter and work with a range of vehicle types based on the number of wheels
	        for (VehicleType type : VehicleType.values()) {
	            int wheels = type.getNumberOfWheels();
	            if (wheels >= minWheels && wheels <= maxWheels) {
	                System.out.println("Vehicle with " + wheels + " wheels: " + type);
	            }
	        }
	    }
	}
	


