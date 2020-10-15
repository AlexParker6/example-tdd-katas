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
        assertEquals("Hello Bob", greeter.greet("bob"));
        assertEquals("Hello Bill", greeter.greet("bill"));
    }
}