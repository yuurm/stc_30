public class Task3 {
        public static void main(String[] args) {
            int n = 10;
            System.out.println(fibonacciNumbers(n));

        }

        private static int fibonacciNumbers (int n) {
            int fnumber1 = 0;
            int fnumber2 = 1;
            int temp = 1;

            int i = 1;
            while (i < n) {
                temp = fnumber1 + fnumber2;
                fnumber1 = fnumber2;
                fnumber2 = temp;
                ++i;
            }
            return temp;
        }
    }



