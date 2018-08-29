import static org.junit.Assert.assertSame;

import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void testHelloMethod() {
		HelloWorld hello = new HelloWorld();
		assertSame("hello", hello.getString());
	}

}
