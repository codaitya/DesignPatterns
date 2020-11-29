package Decorator.InputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected UpperCaseInputStream(final InputStream in) {
        super(in);
    }

    @Override
    public int read()
            throws IOException {
        int c = in.read();
        return c == -1 ? -1 : Character.toLowerCase((char) c);
    }

    @Override
    public int read(final byte[] b, final int off, final int len)
            throws IOException {
        int res = in.read(b, off, len);
        for ( int idx = off; idx < off + res; idx++ ) {
            b[idx] = (byte)Character.toLowerCase((char) b[idx]);
        }
        return res;
    }
}
