public class HelloWorld {

    boolean isValid;

    int age;

    float value;

    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        greeting.greet();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.dataTypes();

    }

    public void dataTypes() {

        System.out.println("Int Value = " + age + " Float Value = " + value + " Boolean Valid = " + isValid);
    }

}

class Greeting {

    public void greet() {
        System.out.println("Welcome to Java....");
    }

}