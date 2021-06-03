public class Task1 {
    public static void main(String[] args) {
        int number = 12345; // заданное число
        int digitsSum = 0; // начальное значение суммы цифр

        int lastDigit5 = number % 10; // 5-я цифра числа - остаток от деления
        digitsSum = digitsSum + lastDigit5; // 1-я промежуточная сумма цифр
        number = number / 10; // число без 5-й цифры
        int lastDigit4 = number % 10; // 4-я цифра числа - остаток от деления
        digitsSum = digitsSum + lastDigit4; // 2-я промежуточная сумма цифр
        number = number / 10; // число без 2-х последних цифр
        int lastDigit3 = number % 10; // 3-я цифра числа - остаток от деления
        digitsSum = digitsSum + lastDigit3; // 3-я промежуточная сумма цифр
        number = number / 10; // число без 3-х последних цифр
        int lastDigit2 = number % 10; // 2-я цифра числа - остаток от деления
        digitsSum = digitsSum + lastDigit2; // 4-я промежуточная сумма цифр
        number = number / 10; // число без 4-х последних цифр
        int lastDigit1 = number % 10; // 1-я цифра числа - остаток от деления
        digitsSum = digitsSum + lastDigit1; // сумма всех цифр


        System.out.println(digitsSum);



    }
}
