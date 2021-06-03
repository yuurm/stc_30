import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chislo");
        int currentNumber = scanner.nextInt();


        boolean isPrime = true;

        int numbersMultiplication = 1;


        while (currentNumber != 0) {
            int temp = currentNumber;
            int digitsSum = 0;

            while (temp != 0) {
                int lastDigit = temp % 10;
                digitsSum = digitsSum + lastDigit;
                temp = temp / 10;
            }

            System.out.println("Summa cifr - " + digitsSum);


            for (int i = 2; i < digitsSum; i++) {
                if (digitsSum % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                numbersMultiplication = numbersMultiplication * currentNumber;
            } else {
                System.out.println("chislo sostavnoe");
            }

            System.out.println("Proizvedenie chisel summa kotoryx prostoe chislo - " + numbersMultiplication);

            System.out.println("Vvedite chislo");
            currentNumber = scanner.nextInt();

        }
    }
}

