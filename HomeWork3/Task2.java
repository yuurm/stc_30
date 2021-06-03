public class Task2 {
    public static double f(double x) {
        return x * x * Math.sin(x) * Math.sin(x) * Math.sin(x);
    }

    public static double calcIntegralSimpson(double a, double b, int n) {
        double h = (b - a) / n;
        double el1 = 0;
        double el2 = 0;



        for (int k = 1; k < n; k = k + 2) {
            el1 = el1 + f(a + k * h) ;
            el2 = el2 + f(a + (k+1) * h);
        }
            return h / 3 * (f ( a ) + 4 * el1 +  2 * el2);

        }



    public static void main(String[] args) {
        double result = calcIntegralSimpson(1, 3, 10000);
        System.out.println(result);
    }
}
