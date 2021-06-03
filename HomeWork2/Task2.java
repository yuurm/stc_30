import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
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

        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;;

        for (i = 1; i < array.length; i++) {
            if (array [i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array [i] > max) {
                max = array [i];
                indexMax = i;
            }
        }

        System.out.println("Mimimalnyy element: " + min);
        System.out.println("Maksimalniy element: " + max);
        System.out.println("Index minimalnogo elementa: " + indexMin);
        System.out.println("Index maksimalnogo elementa: "+ indexMax);

        int temp = array [indexMin];
        array[ indexMin] = array [indexMax];
        array [indexMax] = temp;

        System.out.println("Posle zameny min na max: ");
        System.out.println(Arrays.toString(array)); // vyvodit massiv v zerkalnom predstavlenii
    }
}
