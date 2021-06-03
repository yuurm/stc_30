import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite chislo elementov massiva");
        int n = scanner.nextInt();

        int array[] = new int[n];

        int i = 0;

        System.out.println("Zapolnite massiv");
        while (i < array.length) {
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(array));

        i = 0;

        for (i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length  - 1 - i] = temp;
        }
        System.out.println("Posle perevorota: ");
        System.out.println(Arrays.toString(array)); // vyvodit massiv v zerkalnom predstavlenii
    }
}