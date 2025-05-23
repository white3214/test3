package top.tntok.autobot;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: top.tntok.autobot.o0OOooo  reason: case insensitive filesystem */
public class C0400o0OOooo extends oo0OOoo implements DataInput {
    public C0400o0OOooo(InputStream inputStream) {
        super(inputStream);
    }

    public boolean readBoolean() throws IOException, EOFException {
        if (readByte() != 0) {
            return true;
        }
        return false;
    }

    public byte readByte() throws IOException, EOFException {
        return (byte) this.in.read();
    }

    public char readChar() throws IOException, EOFException {
        return (char) readShort();
    }

    public double readDouble() throws IOException, EOFException {
        return C0038OoooO0O.i1LIL11l(this.in);
    }

    public float readFloat() throws IOException, EOFException {
        return C0038OoooO0O.il1LilLllii(this.in);
    }

    public void readFully(byte[] bArr) throws IOException, EOFException {
        readFully(bArr, 0, bArr.length);
    }

    public int readInt() throws IOException, EOFException {
        return C0038OoooO0O.iilLil1i11I1(this.in);
    }

    public String readLine() throws IOException, EOFException {
        throw new UnsupportedOperationException("Operation not supported: readLine()");
    }

    public long readLong() throws IOException, EOFException {
        return C0038OoooO0O.iLLLILIiLi1Ii(this.in);
    }

    public short readShort() throws IOException, EOFException {
        return C0038OoooO0O.iilLiIIIi11i(this.in);
    }

    public String readUTF() throws IOException, EOFException {
        throw new UnsupportedOperationException("Operation not supported: readUTF()");
    }

    public int readUnsignedByte() throws IOException, EOFException {
        return this.in.read();
    }

    public int readUnsignedShort() throws IOException, EOFException {
        return C0038OoooO0O.i1L1lLllLLlIi(this.in);
    }

    public int skipBytes(int i) throws IOException, EOFException {
        return (int) this.in.skip((long) i);
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException, EOFException {
        int i3 = i2;
        while (i3 > 0) {
            int read = read(bArr, (i + i2) - i3, i3);
            if (-1 != read) {
                i3 -= read;
            } else {
                throw new EOFException();
            }
        }
    }
}
