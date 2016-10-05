package org.hello.demo;

import static org.junit.Assert.*;

import org.junit.Test;



public class HelloWorldTest {

	@Test
	public void testSayHi() {
		String greeting = HelloWorld.sayHi("world");
		assertEquals( "say hi to world",  "hi, world",greeting);
	}

}
