package example.tdd.katas.greeter;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void shouldGreetWithName() {
        Greeter greeter = new Greeter(13);
        assertEquals("Hello Bob", greeter.greet("Bob"));
    }

    @Test
    public void shouldTrimName() {
        Greeter greeter = new Greeter(13);
        assertEquals("Hello Bob", greeter.greet("  Bob  "));
    }

    @Test
    public void shouldCapitaliseName() {
        Greeter greeter = new Greeter(13);
        assertEquals("Hello Bob", greeter.greet(" bob"));
    }

    @Test
    public void shouldGreetGoodMorning() {
        Greeter greeter = new Greeter(9);
        assertEquals("Good morning Bob", greeter.greet(" bob"));

    }

    @Test
    public void shouldGreetGoodEvening() {
        Greeter greeter = new Greeter(19);
        assertEquals("Good evening Bob", greeter.greet(" bob"));

    }

    @Test
    public void shouldGreetGoodnight() {
        Greeter greeter = new Greeter(2);
        assertEquals("Good night Bob", greeter.greet(" bob"));

    }
}