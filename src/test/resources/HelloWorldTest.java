package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	HelloWorld test = new HelloWorld();

	@Test
	public void testHelloWorld() {
		String output = test.helloWorld();
		assertEquals("It doesn't return 'Hello World'", "Alian", output);
	}

}
