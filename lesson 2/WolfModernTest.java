public class WolfModernTest {
    public static void main(String[] args) {
        WolfModern wolf = new WolfModern();
        System.out.println("Nick of wolf " + wolf.getNick());
        wolf.setNick("Carrot");
        System.out.println("Nick of wolf " + wolf.getNick());    
        System.out.println("Age wolf " + wolf.getAge());
        wolf.setAge(10);        
        wolf.setAge(5);
        System.out.println("Second change age wolf " + wolf.getAge());
        System.out.println("Color of wolf " + wolf.getColour());
        wolf.setColour("green");
        System.out.println("Change color of wolf " + wolf.getColour());
    }
}