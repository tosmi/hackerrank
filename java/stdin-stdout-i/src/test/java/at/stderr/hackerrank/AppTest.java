package at.stderr.hackerrank;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final String testInput = "1 2 3";
    private final PrintStream origOut = System.out;
    private final String expectedOutput = "1\n2\n3\n";
    private final ByteArrayOutputStream testOutput = new ByteArrayOutputStream();

    @Before
    public void redirectInOut() {
	System.setOut(new PrintStream(testOutput));
	System.setIn(new ByteArrayInputStream(testInput.getBytes()));
    }

    @After
    public void restoreOut() {
	System.setOut(origOut);
    }

    @Test
    public void testApp()
    {
	System.setOut(new PrintStream(testOutput));
	System.setIn(new ByteArrayInputStream(testInput.getBytes()));

	App.main(null);

	assertEquals(testOutput.toString(), expectedOutput);
    }
}
