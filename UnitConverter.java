import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unit Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Temperature (Celsius to Fahrenheit)");
        System.out.println("2. Convert Distance (Kilometers to Miles)");
        System.out.println("3. Convert Weight (Kilograms to Pounds)");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
                break;
            case 2:
                System.out.print("Enter distance in Kilometers: ");
                double kilometers = scanner.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.println(kilometers + " Kilometers is equal to " + miles + " Miles.");
                break;
            case 3:
                System.out.print("Enter weight in Kilograms: ");
                double kilograms = scanner.nextDouble();
                double pounds = kilograms * 2.20462;
                System.out.println(kilograms + " Kilograms is equal to " + pounds + " Pounds.");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}