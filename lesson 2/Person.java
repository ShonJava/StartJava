public class Person {
    
    String male = "man";
    String name = "Piter";
    float height = 1.80f;
    int age = 20;

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("sit down");
    }

    void run() {
        System.out.println("running");
    }

    String speak() {
        System.out.println("speaking" + " ");
        return "hello";
    }
    
    boolean learn() {
        System.out.println("learning Java" + " ");
        return true;
    }
}