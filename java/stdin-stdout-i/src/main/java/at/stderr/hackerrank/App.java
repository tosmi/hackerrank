package at.stderr.hackerrank;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
	Scanner scanner = new Scanner(System.in);
	int[] integers = new int[3];

	for( int i = 0 ; i < 3; i++) {
	    integers[i] = scanner.nextInt();
	}
	scanner.close();

	for (int i : integers) {
		System.out.println(i);
	}
    }
}
