public class Calc {
    
    private int firstNumber;
    private int secondNumber;
    private char symbol = '+';
    private int result;    

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getResult() {
        return result;
    }

    public void operation() {
        switch(symbol) {
            case('+'):
                result = firstNumber + secondNumber;
                System.out.println("Summa " + result);
                break;
            case('-'):
                result = firstNumber - secondNumber;
                System.out.println("Ostatok ot vichetania " + result);
                break;
            case('*'):
                result = firstNumber * secondNumber;
                System.out.println("Proizvedenie " + result);
                break;
            case('/'):
                result = firstNumber / secondNumber;
                System.out.println("Ostatok ot deleniya" + result);
                break;
            case('%'):
                if(firstNumber % secondNumber == 0) {
                    System.out.println("Bez ostatka");
                } else {
                    System.out.println("Ostatok " + firstNumber % secondNumber);
                }
                break;
            case('^'):
                int result = 1;
                for(int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                    System.out.println("Stepen chisla " + result);
                break;
            default:
                System.out.println("Ispolzyite +  -  *  /  %  ^");
        }    
    }
}