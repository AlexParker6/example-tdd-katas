package example.tdd.katas.greeter;
public class Greeter {

    private int timeOfDay;
    public Greeter(int timeOfDay){
        this.timeOfDay = timeOfDay;
    }

    public String greet(final String name){
        String newName = name.trim();
        newName = newName.substring(0,1).toUpperCase() + newName.substring(1);
        return greeting() + newName;
    }
    private String greeting() {
        if ((timeOfDay >= 6) && (timeOfDay <= 12)){
            return "Good morning ";
        }
        else if ((timeOfDay >= 18) && (timeOfDay < 22)) {
            return "Good evening ";
        }
        else if ((timeOfDay > 22) || (timeOfDay <= 5.59)){
            return "Good night ";
        }
        else
            return "Hello ";
    }
}
