public class MathUtils {

    public static double add(int a, int b){
        return a + b;
    }

    public static double subtract(int a, int b){
        return a - b;
    }

    public static double multiply(int a, int b){
        return a * b;
    }

    public static double divide(int a, int b){
        if(b == 0){
            return Double.NaN;
        }
        return ((double) a / b);
    }

}
