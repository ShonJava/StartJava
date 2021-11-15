public class GuessNumber {   
    public static void main(String[] args) {
        int magicNumber = 10;
        int myNumber = -20;        
        System.out.println("Give a Number");
        while(myNumber < magicNumber) {            
            System.out.println((myNumber - 1) + " it's no GuessNumber, number greater than this");
            myNumber++;            
        }
        while(myNumber > magicNumber) {            
            System.out.println((myNumber + 1) + " it's no GuessNumber, number less than this");
            myNumber--;
        }
        if(myNumber == magicNumber) {
            System.out.println("yes, you find GuessNumber " + magicNumber);
        }
    }
}