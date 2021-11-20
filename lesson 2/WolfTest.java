public class WolfTest {
    public static void main(String[] args) {
    Wolf wolf = new Wolf();

    System.out.println("Name of wolf " + wolf.nick);
    System.out.println("Color of wolf " + wolf.color);
    System.out.print("Wolf is ");
    wolf.run();
    System.out.print("Wolf is ");
    wolf.walk();
    }
}