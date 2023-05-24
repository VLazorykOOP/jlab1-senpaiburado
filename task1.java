import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        scanner.close();

        double result = (1 / (a * Math.pow(b, 2) * -2 * b)) + (1 / 3 * Math.pow(a, 2) + 2) * b;
        System.out.println("Result: " + result);
    }
}
