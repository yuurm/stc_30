import java.util.Scanner;

public class Task1 {
    public static int recursion(double x) {

        if (x == 1) {
            return 1;
        }
        else if (x > 1 && x < 2) {
            return 0;
        }
        else {
            return recursion(x / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chislo dlya proverki - ");
        int x = scanner.nextInt();

        if (recursion(x) == 1) {
            System.out.println("Chislo " + x + " yavlyaetsya stepenyu dvoyki");
        } else {
            System.out.println("Chislo " + x + " ne yavlyaetsya stepenyu dvoyki");
        }
    }
}
