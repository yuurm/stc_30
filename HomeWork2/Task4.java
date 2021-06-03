import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
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


            boolean isSwap = true;
            int temp;

            while (isSwap) {
                isSwap = false;
                for (i = 0; i < array.length - 1; i++){
                    if (array [i] > array [i + 1]){
                        temp = array [i];
                        array [i] = array [i + 1];
                        array [i+1] = temp;
                        isSwap = true;
                    }
                }

            }
            System.out.println("Posle perevorota: ");
            System.out.println(Arrays.toString(array)); // vyvodit massiv v zerkalnom predstavlenii
        }

}

