import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    public static String AppTest(InputStream in, PrintStream out) {
        Scanner hello = new Scanner(in);
        out.println("What is your name? ");
        String input = hello.nextLine();
        return input;
    }
}