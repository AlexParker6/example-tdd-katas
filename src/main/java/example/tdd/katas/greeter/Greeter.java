package example.tdd.katas.greeter;

public class Greeter {

    String greet(String name) {
        name = name.trim();
        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1);
    }

}
