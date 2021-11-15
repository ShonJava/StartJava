public class ConditionalStatement {   
    public static void main(String[] args) {
        int age = 21;        
        if(age > 20) {
            System.out.println("age > " + age);
        }

        boolean male = true;
        if(male) {
            System.out.println("it's man");
        }
        if(!male) {
            System.out.println("it's not man");
        }

        float height = 1.90f;
        if(height > 1.80f) {
            System.out.println("people's height > 1.80");
        } else {
            System.out.println("people's height < 1.80");
        }

        char pervayaBykvaImeni = 'M';
        if(pervayaBykvaImeni == 'M') {
            System.out.println("first of name is " + pervayaBykvaImeni);
        } else if(pervayaBykvaImeni == 'I') {
            System.out.println("first of name is " + pervayaBykvaImeni);
        } else {
            System.out.println("error");
        }
    }
}