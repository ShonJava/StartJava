public class WolfModern {
    private String male = "man";
    private String nick = "Cucumber";
    public String getNick() {
        return nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    private int weight = 30;
    private String colour = "grey";
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    private int age = 8;
    public int getAge() {
        return age;
    }
    public void run() {
        System.out.println("running");
    }
    public void sit() {
        System.out.println("sitting");
    }
    public void walk() {
        System.out.println("walking");
    }
    public void sing() {
        System.out.println("singing");
    }
    public void hunt() {
        System.out.println("hunting");
    }
}