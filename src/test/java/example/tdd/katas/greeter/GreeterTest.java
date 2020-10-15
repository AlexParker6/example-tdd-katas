package example.tdd.katas.greeter;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void shouldGreetWithName() {
        Greeter greeter = new Greeter();
        assertEquals("Hello Bob", greeter.greet("Bob"));
        assertEquals("Hello Bill", greeter.greet("Bill"));
    }

    @Test
    public void shouldTrimName() {
        Greeter greeter = new Greeter();
        assertEquals("Hello Bob", greeter.greet("  Bob  "));
        assertEquals("Hello Bill", greeter.greet("    Bill     "));
    }

    @Test
    public void shouldCapitaliseName() {
        Greeter greeter = new Greeter();
        assertEquals("Hello Bob", greeter.greet(" bob"));
        assertEquals("Hello Bill", greeter.greet(" bill"));
    }

    @Test
    public void shouldGreetGoodMorning() {
        Greeter greeter = new Greeter();
        assertEquals("Good morning Bob", greeter.greet(" bob"));
        assertEquals("Good morning Bill", greeter.greet(" bill"));

    }

    @Test
    public void shouldGreetGoodEvening() {
        Greeter greeter = new Greeter();
        assertEquals("Good evening Bob", greeter.greet(" bob"));
        assertEquals("Good evening Bill", greeter.greet(" bill"));

    }

    @Test
    public void shouldGreetGoodnight() {
        Greeter greeter = new Greeter();
        assertEquals("Good night Bob", greeter.greet(" bob"));
        assertEquals("Good night Bill", greeter.greet(" bill"));

    }
}