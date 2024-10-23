import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Oprations oprations = new Oprations();
        boolean close = false;

        while (!close) {

            System.out.println("Choose between +, -, /, or * to perform your action or quit using q or Q");
            String op = scanner.next();

            if (op.equalsIgnoreCase("q")) {
                close = true;
                System.out.println("Thank you for using my calculator!");
            } else {
                System.out.println("What is your first number?");
                double num1 = scanner.nextDouble();

                System.out.println("What is your second number?");
                double num2 = scanner.nextDouble();

                switch (op) {
                    case "-" -> oprations.subtract(num1, num2);
                    case "*" -> oprations.multiply(num1, num2);
                    case "/" -> oprations.divide(num1, num2);
                    case "+" -> oprations.add(num1, num2);
                    default -> System.out.println("Invalid operation.");
                }
            }
        }
    }
}