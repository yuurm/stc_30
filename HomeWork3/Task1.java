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

            int sum = 0;

            for (i = 0; i < array.length; i++) {
                sum  = sum + array[i];
                }
            System.out.println("Summa elementov: " + sum); 

            for (i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length  - 1 - i] = temp;
            }
            System.out.println("Posle perevorota: ");
            System.out.println(Arrays.toString(array)); 


            System.out.println("Srednee arifmeticheskoe: " + sum / n); 

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

            int temp = array [indexMin];
            array[ indexMin] = array [indexMax];
            array [indexMax] = temp;

            System.out.println("Posle zameny min na max: ");
            System.out.println(Arrays.toString(array));

            boolean isSwap = true;
            int temp1;

            while (isSwap) {
                isSwap = false;
                for (i = 0; i < array.length - 1; i++){
                    if (array [i] > array [i + 1]){
                        temp1 = array [i];
                        array [i] = array [i + 1];
                        array [i+1] = temp1;
                        isSwap = true;
                    }
                }

            }
            System.out.println("Sortirovka puzyrkom: ");
            System.out.println(Arrays.toString(array));

            int number = 0;

            for (i = 0; i < array.length; i++) {
                number = number * 10 + array[i];
            }

            System.out.println("Predstavlenie massiva v vide chisla: " + number);
        }
}




