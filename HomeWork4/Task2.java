package HomeWork4;

import java.util.Scanner;

class Task2 {

       public static int binarySearch (int array [], int element) {
           int left = 0;
           int right = array.length - 1;

           while (left <= right) {

               int middle = left + (right - left) / 2;

               if (array[middle] == element) {
                   return middle;
               }

               if (array[middle] < element) {
                   left = middle + 1;
               } else {
                   right = middle - 1;
               }
           }
           return -1;
       }


    public static void main(String args[])    {

        Task2 bs = new Task2 ();

        int array [] = { 1, 2, 3, 4, 5 };

        int element = 3;

        int resultOfSearch = bs.binarySearch(array, element);

        if (resultOfSearch == -1){
            System.out.println("Elementa v vassive net");
        } else {
            System.out.println("Element  " + element + " najden v massive pod indexom " + resultOfSearch);
        }

    }

}




