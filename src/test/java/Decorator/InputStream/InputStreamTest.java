package Decorator.InputStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class InputStreamTest {
    @Test
    public void testUpperCaseInputStream()
            throws IOException {
        InputStream in = new UpperCaseInputStream(new BufferedInputStream(new ByteArrayInputStream("Hello".getBytes())));
        int x = in.read();
        String cand = "";
        while ( x != -1)  {
            cand = cand + (char) x;
            x = in.read();
        }
        in.close();
        assert cand.equals("hello");
    }
}
