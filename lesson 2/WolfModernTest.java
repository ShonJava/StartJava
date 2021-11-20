public class WolfModernTest {
    public static void main(String[] args) {
    WolfModern wolfOne = new WolfModern();

    System.out.println("Nick of wolf " + wolfOne.getNick());
    wolfOne.setNick("Carrot");
    System.out.println("Nick of wolf " + wolfOne.getNick());
    
    System.out.println("Age wolf " + wolfOne.getAge());
    if(wolfOne.getAge() >= 8) {
        System.out.println("Age of wolf not correct");
    } else {
        System.out.println("Age of wolf correct");
    }

    System.out.println("Color of wolf " + wolfOne.getColour());
    wolfOne.setColour("green");
    System.out.println("Change color of wolf " + wolfOne.getColour());
    }
}