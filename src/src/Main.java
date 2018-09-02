import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("введите знак");
        String znak = scanner.next();
        System.out.println("введите второе число");
        int b = scanner.nextInt();

        System.out.println(operat(a, b, znak));
    }
    public static int operat (int a, int b, String znak){
        switch (znak) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                return 0;
        }
    }
}
