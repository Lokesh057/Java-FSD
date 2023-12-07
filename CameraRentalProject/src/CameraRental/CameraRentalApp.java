package CameraRental;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Camera {
    private String brand;
    private String model;
    private double perDayRent;

    public Camera(String brand, String model, double perDayRent) {
        this.brand = brand;
        this.model = model;
        this.perDayRent = perDayRent;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPerDayRent() {
        return perDayRent;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", perDayRent=" + perDayRent +
                '}';
    }
}

class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        balance += amount;
		return false;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
            return false;
        }
        balance -= amount;
        return true;
    }
}

class CameraManager {
    private List<Camera> cameraList;
    private List<Camera> userCameras;

    public CameraManager() {
        this.cameraList = new ArrayList<>();
        this.userCameras = new ArrayList<>();
    }

    public void addCamera(Camera camera) {
        cameraList.add(camera);
        System.out.println("Your camera has been successfully added to the list.");
    }

    public void displayCameraList() {
        if (cameraList.isEmpty()) {
            System.out.println("No cameras available.");
        } else {
            System.out.println("Camera List:");
            for (int i = 0; i < cameraList.size(); i++) {
                System.out.println(i + 1 + ". " + cameraList.get(i));
            }
        }
    }

    public void removeCamera(int index) {
        if (index >= 0 && index < userCameras.size()) {
            Camera removedCamera = userCameras.remove(index);
            System.out.println("Your camera has been removed: " + removedCamera);
        } else {
            System.out.println("Invalid camera selection.");
        }
    }

    public void displayUserCameras() {
        if (userCameras.isEmpty()) {
            System.out.println("You don't have any cameras yet.");
        } else {
            System.out.println("Your Cameras:");
            for (int i = 0; i < userCameras.size(); i++) {
                System.out.println(i + 1 + ". " + userCameras.get(i));
            }
        }
    }

    public Camera rentCamera(int index) {
        if (index >= 0 && index < cameraList.size()) {
            Camera rentedCamera = cameraList.get(index);
            userCameras.add(rentedCamera);
            System.out.println("You have successfully rented a camera: " + rentedCamera);
            return rentedCamera;
        } else {
            System.out.println("Invalid camera selection.");
            return null;
        }
    }
}

public class CameraRentalApp {
    private static Wallet userWallet = new Wallet(5000.0); // Initial wallet balance for testing
    private static CameraManager cameraManager = new CameraManager();
    private static Scanner scanner = new Scanner(System.in);
    private static String loggedInUser;

    public static void main(String[] args) {
        displayWelcomeScreen();

        // Login
        login();

        // Display options menu
        displayOptionsMenu();

        // Sample usage of application features
        try {
            int choice;
            do {
                choice = scanner.nextInt();
                processOption(choice);
            } while (true);
        } catch (Exception e) {
            System.out.println("Invalid input. Exiting...");
        }
    }

    private static void displayWelcomeScreen() {
        System.out.println("WELCOME TO CAMERA RENTAL APP\nPLEASE LOGIN TO CONTINUE\n");
    }
    private static void login() {
        boolean loggedIn = false;

        do {
            System.out.print("USERNAME: ");
            String username = scanner.next();
            System.out.print("PASSWORD: ");
            String password = scanner.next();

            // Simple authentication (you might want to enhance this)
            if ("Lokesh".equals(username) && "password123".equals(password)) {
                loggedInUser = username;
                System.out.println("\nLogin successful. Welcome, " + loggedInUser + "!\n");
                loggedIn = true;
            } else {
                System.out.println("\nLogin failed. Please try again.\n");
                //this will gives that chance to re enter correct credentials, until you get logged in to the App.
            }
        } while (!loggedIn);
    }
  
    

    private static void displayOptionsMenu() {
        System.out.println("Options to be displayed:\n" +
                "1. MY CAMERA\n" +
                "2. RENT A CAMERA\n" +
                "3. VIEW ALL CAMERAS\n" +
                "4. MY WALLET\n" +
                "5. EXIT\n");
    }

    private static void processOption(int option) {
        switch (option) {
            case 1:
                myCameraMenu();
                break;
            case 2:
                rentACameraMenu();
                break;
            case 3:
                cameraManager.displayCameraList();
                break;
            case 4:
                myWalletMenu();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please select a valid option.");
        }
    }

    private static void myCameraMenu() {
        int choice;
        do {
            System.out.println("1. ADD A CAMERA\n2. REMOVE A CAMERA\n3. VIEW MY CAMERAS\n4. GO TO PREVIOUS MENU");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCameraMenu();
                    break;
                case 2:
                    removeCameraMenu();
                    break;
                case 3:
                    cameraManager.displayUserCameras();
                    break;
                case 4:
                    displayOptionsMenu();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        } while (choice != 4);
    }
    private static void addCameraMenu() {
        System.out.println("\nAdd a camera:\n");

        System.out.print("ENTER THE CAMERA BRAND: ");
        String brand = scanner.next();
        scanner.nextLine(); // consume the newline character

        System.out.print("ENTER THE MODEL: ");
        String model = scanner.nextLine();

        double perDayRent = 0.0;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("ENTER THE PER DAY PRICE (INR): ");
            try {
                perDayRent = scanner.nextDouble();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for the per day price.");
                scanner.next(); // consume the invalid input
            }
        }

        Camera newCamera = new Camera(brand, model, perDayRent);
        cameraManager.addCamera(newCamera);
    }

    

    private static void removeCameraMenu() {
        System.out.println("\nRemove a camera:\n");
        cameraManager.displayUserCameras();
        System.out.print("ENTER THE CAMERA NUMBER TO REMOVE: ");
        int index = scanner.nextInt();
        cameraManager.removeCamera(index - 1);
    }
    private static void rentACameraMenu() {
        System.out.println("\nRent a camera:\n");
        cameraManager.displayCameraList();

        try {
            System.out.print("ENTER THE CAMERA NUMBER TO RENT: ");
            int index = scanner.nextInt();

            Camera rentedCamera = cameraManager.rentCamera(index - 1);

            if (rentedCamera != null) {
                double rentAmount = rentedCamera.getPerDayRent();
                boolean transactionStatus = userWallet.withdraw(rentAmount);

                if (transactionStatus) {
                    System.out.println("YOUR TRANSACTION FOR CAMERA - " + rentedCamera.getBrand() + " " +
                            rentedCamera.getModel() + " with rent INR. " + rentAmount +
                            " HAS SUCCESSFULLY COMPLETED.");
                    System.out.println("YOUR REMAINING WALLET BALANCE IS INR. " + userWallet.getBalance());
                    additionalMenuAfterRental();
                } else {
                    System.out.println("ERROR: TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE. PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET.");
                    additionalMenuAfterRental();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid camera number.");
            scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
        }
    }

    private static void additionalMenuAfterRental() {
		// TODO Auto-generated method stub
		
	}
    private static void myWalletMenu() {
        System.out.println("\nMY WALLET OR ADD MONEY\n");

        System.out.println("YOUR CURRENT WALLET BALANCE IS INR." + userWallet.getBalance());
        System.out.print("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET? (1: YES 2: NO) - ");

        try {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    depositToWalletMenu();
                    break;
                case 2:
                    displayOptionsMenu();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid choice.");
            scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
        }
    }
    private static boolean depositToWalletMenu() {
        System.out.println("\nMY WALLET\n");
        System.out.println("OUR CURRENT WALLET BALANCE IS INR. " + userWallet.getBalance());

        System.out.print("\nDO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET? (1: YES, 2. NO) - ");
        int depositChoice = scanner.nextInt();

        switch (depositChoice) {
            case 1:
                System.out.print("\nENTER THE AMOUNT (INR): - ");
                double depositAmount = scanner.nextDouble();
                boolean depositResult = userWallet.deposit(depositAmount);

                if (depositResult) {
                    System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE INR. " + userWallet.getBalance());
                } else {
                    System.out.println("ERROR: TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE. PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET.");
                }
                return depositResult;
            case 2:
                displayOptionsMenu();
                return true;
            default:
                System.out.println("Invalid option. Please select a valid option.");
                return false;
        }
    }

    }



