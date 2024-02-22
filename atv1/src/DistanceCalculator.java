import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point:");
        System.out.print("Coordinate x: ");
        double x1 = scanner.nextDouble();
        System.out.print("Coordinate y: ");
        double y1 = scanner.nextDouble();

        System.out.println("\nEnter the coordinates of the second point:");
        System.out.print("Coordinate x: ");
        double x2 = scanner.nextDouble();
        System.out.print("Coordinate y: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("\nThe distance between the two points is: " + distance);

        scanner.close();
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
