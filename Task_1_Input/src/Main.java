import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valentyn Horanskyi (ID:63500, group 1)");
        System.out.println("Please enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Please enter second number: ");
        float secondNumber = scanner.nextFloat();

        System.out.println("Sum(+): " + (firstNumber + secondNumber));

        System.out.println("Difference(-): " + (firstNumber - secondNumber));

        System.out.println("Product(*): " + (firstNumber * secondNumber));

        System.out.println("Quotient(/): " + (firstNumber / secondNumber));


        scanner.close();
    }
}

