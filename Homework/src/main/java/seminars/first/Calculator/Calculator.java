package seminars.first.Calculator;

public class Calculator {
    public static double calculateDiscount(double price, int discount) {
        double result;
        result = (price * (100 - discount)) / 100;
            if(result < 0) {
                throw new ArithmeticException("Сумма не может быть меньше нуля!");
            } else if (result == 0) {
                throw new ArithmeticException("Сумма не может равна нулю!");
            } else if (discount < 0) {
                throw new ArithmeticException("Скидка не может быть больше нуля!");
            }
        System.out.println(result);
        return result;
    }
}