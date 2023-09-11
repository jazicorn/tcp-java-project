package com.tcp.inventorymanagement;

import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//@SpringBootTest
class MainTest {

	@Test
	void helloWorld() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(outContent));
    	Main.main(null);
    	assertEquals("Hello world!" + System.getProperty("line.separator"), outContent.toString());
    	System.setOut(null);
	}

}
