public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate(10, 5,'^'));
    }

    public static int calculate(int firstNumber, int secondNumber, char symbol) {
        int result = 1;
        if (symbol == '+') {
            result = firstNumber + secondNumber;
        } else if (symbol == '-') {
            result = firstNumber - secondNumber;
        } else if (symbol == '*') {
            result = firstNumber * secondNumber;
        } else if (symbol == '/') {
            result = firstNumber / secondNumber;
        } else if (symbol == '^') {            
            while (secondNumber > 1) {
                result *= firstNumber;
                secondNumber--; 
            }
        } else if (symbol == '%') {
            result = firstNumber % secondNumber;
        }
        return result;
    }
}