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
        assertEquals("Good morning Bob", greeter.greet(" bob"), greeter.whatTime(10));
        assertEquals("Good morning Bill", greeter.greet(" bill"), greeter.whatTime(10));

    }

    @Test
    public void shouldGreetGoodEvening() {
        Greeter greeter = new Greeter();
        assertEquals("Good evening Bob", greeter.whatTime(20), greeter.greet(" bob"));
        assertEquals("Good evening Bill", greeter.whatTime(19), greeter.greet(" bill"));

    }

    @Test
    public void shouldGreetGoodnight() {
        Greeter greeter;
        greeter = new Greeter();
        assertEquals("Good night Bob", greeter.whatTime(23), greeter.greet(" bob"));
        assertEquals("Good night Bill", greeter.whatTime(2), greeter.greet(" bill"));

    }
}