package example.tdd.katas.greeter;

public class Greeter {

    String greet(String name) {
        name = name.trim();
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        int timeOfDay = 14;

        if (timeOfDay >=6 && timeOfDay <=12){
            return "Good morning " + name; }
        else if (timeOfDay >=18 && timeOfDay <=22){
            return "Good evening " + name; }
        else if (timeOfDay >22 || timeOfDay <=5.59){
            return "Good night " + name; }
        else
            return "Hello " + name;
    }

}
