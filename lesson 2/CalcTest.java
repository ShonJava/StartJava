import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Calc calc = new Calc();
        String otvet;

        do {
            System.out.println("Give a first number");
            calc.setFirstNumber(s.nextInt());
            System.out.println("Give a math operation symbol");
            calc.setSymbol(s.next().charAt(0));
            System.out.println("Give a second number");
            calc.setSecondNumber(s.nextInt());
            calc.operation();
            do {
                System.out.println("Hotite prodoljit? [yes/no]: ");
                otvet = s.nextLine();
            } while(!otvet.equals("yes") && !otvet.equals("no"));
        } while(otvet.equals("yes"));
    }
}