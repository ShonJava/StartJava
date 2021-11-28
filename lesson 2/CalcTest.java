import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calc calc = new Calc();
        String otvet;

        do {
            System.out.println("Write the first number");
            calc.setFirstNumber(console.nextInt());
            System.out.println("Write math sign");
            calc.setSign(console.next().charAt(0));
            System.out.println("Write the second number");
            calc.setSecondNumber(console.nextInt());
            calc.operate();
            do {
                System.out.println("Do you want to continue? [yes/no]: ");
                otvet = console.nextLine();
            } while(!otvet.equals("yes") && !otvet.equals("no"));
        } while(otvet.equals("yes"));
    }
}