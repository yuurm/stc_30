public class Task3 {
      public static void main(String args[]) {
            int array[] = {4, 2, 3, 5, 7};
            int number = 0;

          for (int i = 0; i < array.length; i++)
              number = number * 10 + array[i];

            System.out.println(number); // dolzhno vyvesti 42357
        }
    }

