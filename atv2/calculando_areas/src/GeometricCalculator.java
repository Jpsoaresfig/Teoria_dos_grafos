import java.util.Scanner;

public class GeometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a geometric figure:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Parallelogram");
        System.out.println("5. Rhombus");
        System.out.println("6. Trapezoid");
        System.out.println("7. Circle");
        System.out.print("Enter the corresponding number for the desired figure: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateTriangle();
                break;
            case 2:
                calculateSquare();
                break;
            case 3:
                calculateRectangle();
                break;
            case 4:
                calculateParallelogram();
                break;
            case 5:
                calculateRhombus();
                break;
            case 6:
                calculateTrapezoid();
                break;
            case 7:
                calculateCircle();
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }

    private static void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;
        double perimeter = base * 3;

        displayResult("Triangle", area, perimeter);

        scanner.close();
    }

    private static void calculateSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;
        double perimeter = 4 * side;

        displayResult("Square", area, perimeter);

        scanner.close();
    }

    private static void calculateRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the rectangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + height);

        displayResult("Rectangle", area, perimeter);

        scanner.close();
    }

    private static void calculateParallelogram() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + height);

        displayResult("Parallelogram", area, perimeter);

        scanner.close();
    }

    private static void calculateRhombus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the larger diagonal of the rhombus: ");
        double largerDiagonal = scanner.nextDouble();

        System.out.print("Enter the smaller diagonal of the rhombus: ");
        double smallerDiagonal = scanner.nextDouble();

        double area = (largerDiagonal * smallerDiagonal) / 2;
        double perimeter = 4 * Math.sqrt((largerDiagonal * largerDiagonal + smallerDiagonal * smallerDiagonal) / 2);

        displayResult("Rhombus", area, perimeter);

        scanner.close();
    }

    private static void calculateTrapezoid() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the larger base of the trapezoid: ");
        double largerBase = scanner.nextDouble();

        System.out.print("Enter the smaller base of the trapezoid: ");
        double smallerBase = scanner.nextDouble();

        System.out.print("Enter the height of the trapezoid: ");
        double height = scanner.nextDouble();

        double area = ((largerBase + smallerBase) * height) / 2;
        double perimeter = largerBase + smallerBase + 2 * Math.sqrt(Math.pow((largerBase - smallerBase) / 2, 2) + height * height);

        displayResult("Trapezoid", area, perimeter);

        scanner.close();
    }

    private static void calculateCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        displayResult("Circle", area, perimeter);

        scanner.close();
    }

    private static void displayResult(String figure, double area, double perimeter) {
        System.out.println("\nResults for " + figure + ":");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
