public class PersonTest {
    public static void main(String[] args) {
    Person personOne = new Person();
    System.out.println("Name of person " + personOne.name);
    System.out.println("Male of person " + personOne.male);
    System.out.println("Height of peroson " + personOne.height);
    System.out.println("Age of person " + personOne.age);
    System.out.print("Person have ");
    personOne.run();
    System.out.print(personOne.learn());
    }
}