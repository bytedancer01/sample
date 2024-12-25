package org.apache.http.util;

import java.io.Serializable;
import java.nio.CharBuffer;
import org.apache.http.protocol.HTTP;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/CharArrayBuffer.class */
public final class CharArrayBuffer implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int i10) {
        Args.notNegative(i10, "Buffer capacity");
        this.buffer = new char[i10];
    }

    private void expand(int i10) {
        char[] cArr = new char[Math.max(this.buffer.length << 1, i10)];
        System.arraycopy(this.buffer, 0, cArr, 0, this.len);
        this.buffer = cArr;
    }

    public void append(char c10) {
        int i10 = this.len + 1;
        if (i10 > this.buffer.length) {
            expand(i10);
        }
        this.buffer[this.len] = c10;
        this.len = i10;
    }

    public void append(Object obj) {
        append(String.valueOf(obj));
    }

    public void append(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i10 = this.len + length;
        if (i10 > this.buffer.length) {
            expand(i10);
        }
        str.getChars(0, length, this.buffer, this.len);
        this.len = i10;
    }

    public void append(ByteArrayBuffer byteArrayBuffer, int i10, int i11) {
        if (byteArrayBuffer == null) {
            return;
        }
        append(byteArrayBuffer.buffer(), i10, i11);
    }

    public void append(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, 0, charArrayBuffer.len);
    }

    public void append(CharArrayBuffer charArrayBuffer, int i10, int i11) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer, i10, i11);
    }

    public void append(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null) {
            return;
        }
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > bArr.length) {
            throw new IndexOutOfBoundsException("off: " + i10 + " len: " + i11 + " b.length: " + bArr.length);
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.len;
        int i14 = i11 + i13;
        int i15 = i13;
        int i16 = i10;
        if (i14 > this.buffer.length) {
            expand(i14);
            i16 = i10;
            i15 = i13;
        }
        while (i15 < i14) {
            this.buffer[i15] = (char) (bArr[i16] & 255);
            i16++;
            i15++;
        }
        this.len = i14;
    }

    public void append(char[] cArr, int i10, int i11) {
        int i12;
        if (cArr == null) {
            return;
        }
        if (i10 < 0 || i10 > cArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > cArr.length) {
            throw new IndexOutOfBoundsException("off: " + i10 + " len: " + i11 + " b.length: " + cArr.length);
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.len + i11;
        if (i13 > this.buffer.length) {
            expand(i13);
        }
        System.arraycopy(cArr, i10, this.buffer, this.len, i11);
        this.len = i13;
    }

    public char[] buffer() {
        return this.buffer;
    }

    public int capacity() {
        return this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.buffer[i10];
    }

    public void clear() {
        this.len = 0;
    }

    public void ensureCapacity(int i10) {
        if (i10 <= 0) {
            return;
        }
        int length = this.buffer.length;
        int i11 = this.len;
        if (i10 > length - i11) {
            expand(i11 + i10);
        }
    }

    public int indexOf(int i10) {
        return indexOf(i10, 0, this.len);
    }

    public int indexOf(int i10, int i11, int i12) {
        int i13 = i11;
        if (i11 < 0) {
            i13 = 0;
        }
        int i14 = this.len;
        int i15 = i12;
        if (i12 > i14) {
            i15 = i14;
        }
        if (i13 > i15) {
            return -1;
        }
        for (int i16 = i13; i16 < i15; i16++) {
            if (this.buffer[i16] == i10) {
                return i16;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.len;
    }

    public void setLength(int i10) {
        if (i10 >= 0 && i10 <= this.buffer.length) {
            this.len = i10;
            return;
        }
        throw new IndexOutOfBoundsException("len: " + i10 + " < 0 or > buffer len: " + this.buffer.length);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i10);
        }
        if (i11 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i11 + " > length: " + this.len);
        }
        if (i10 <= i11) {
            return CharBuffer.wrap(this.buffer, i10, i11);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
    }

    public String substring(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i10);
        }
        if (i11 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i11 + " > length: " + this.len);
        }
        if (i10 <= i11) {
            return new String(this.buffer, i10, i11 - i10);
        }
        throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
    }

    public String substringTrimmed(int i10, int i11) {
        int i12;
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + i10);
        }
        if (i11 > this.len) {
            throw new IndexOutOfBoundsException("endIndex: " + i11 + " > length: " + this.len);
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("beginIndex: " + i10 + " > endIndex: " + i11);
        }
        while (true) {
            i12 = i11;
            if (i10 >= i11) {
                break;
            }
            i12 = i11;
            if (!HTTP.isWhitespace(this.buffer[i10])) {
                break;
            }
            i10++;
        }
        while (i12 > i10 && HTTP.isWhitespace(this.buffer[i12 - 1])) {
            i12--;
        }
        return new String(this.buffer, i10, i12 - i10);
    }

    public char[] toCharArray() {
        int i10 = this.len;
        char[] cArr = new char[i10];
        if (i10 > 0) {
            System.arraycopy(this.buffer, 0, cArr, 0, i10);
        }
        return cArr;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.len);
    }
}
