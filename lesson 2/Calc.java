public class Calc {
    
    private int firstNumber;
    private int secondNumber;
    private char sign;
    private int result;    

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }    

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }    

    public void setSign(char sign) {
        this.sign = sign;
    }
    
    public void operate() {
        switch(sign) {
            case('+'):
                result = firstNumber + secondNumber;
                System.out.println("Sum of numbers is " + result);
                break;
            case('-'):
                result = firstNumber - secondNumber;
                System.out.println("Remaider from deduction is " + result);
                break;
            case('*'):
                result = firstNumber * secondNumber;
                System.out.println("Multiplication of numbers is " + result);
                break;
            case('/'):
                result = firstNumber / secondNumber;
                System.out.println("Remaider of the division is " + result);
                break;
            case('%'):
                if(firstNumber % secondNumber == 0) {
                    System.out.println("Without a remainder");
                } else {
                    System.out.println("Remainder is " + firstNumber % secondNumber);
                }
                break;
            case('^'):
                int result = 1;
                for(int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println("The power of the number is " + result);
                break;
            default:
                System.out.println("Use: +  -  *  /  %  ^");
        }    
    }
}