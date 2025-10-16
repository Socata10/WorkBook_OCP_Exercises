package Chapter1_3.Ex1;

import java.util.Scanner;

public class VehicleSpeedMonitor {
    public static void main(String[] args){
        try(Scanner scannerIn = new Scanner(System.in))
        {
            while (true){
                System.out.print("Enter vehicle type (Car, Bus, Bike): ");
                String vehicleType = scannerIn.nextLine().trim();
                System.out.print("Enter vehicle speed (in km/h): ");
                String vehicleSpeed = scannerIn.nextLine().trim();
                int speed;
                try {
                    speed = Integer.parseInt(vehicleSpeed);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid speed input. Please enter a numeric value.");
                    continue;
                }

                if (speed < 0){
                    System.out.println("Existing system...");
                    break;
                }

                int speedLimit = switch (vehicleType){
                    case String s when s.equalsIgnoreCase("car") -> 100;
                    case String s when s.equalsIgnoreCase("bus") -> 80;
                    case String s when s.equalsIgnoreCase("bike") -> 60;
                    default -> -1;
                };

                if (speedLimit == -1) {
                    System.out.println("Unknown vehicle type.");
                }

                if (speed > speedLimit){
                    System.out.println("Speeding!");
                }
                else {
                    System.out.println("Speed OK!");
                }
            }
        }
    }
}

