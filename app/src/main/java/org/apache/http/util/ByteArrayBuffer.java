package org.apache.http.util;

import java.io.Serializable;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/ByteArrayBuffer.class */
public final class ByteArrayBuffer implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int i10) {
        Args.notNegative(i10, "Buffer capacity");
        this.buffer = new byte[i10];
    }

    private void expand(int i10) {
        byte[] bArr = new byte[Math.max(this.buffer.length << 1, i10)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.len);
        this.buffer = bArr;
    }

    public void append(int i10) {
        int i11 = this.len + 1;
        if (i11 > this.buffer.length) {
            expand(i11);
        }
        this.buffer[this.len] = (byte) i10;
        this.len = i11;
    }

    public void append(CharArrayBuffer charArrayBuffer, int i10, int i11) {
        if (charArrayBuffer == null) {
            return;
        }
        append(charArrayBuffer.buffer(), i10, i11);
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
        int i13 = this.len + i11;
        if (i13 > this.buffer.length) {
            expand(i13);
        }
        System.arraycopy(bArr, i10, this.buffer, this.len, i11);
        this.len = i13;
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
            this.buffer[i15] = (byte) cArr[i16];
            i16++;
            i15++;
        }
        this.len = i14;
    }

    public byte[] buffer() {
        return this.buffer;
    }

    public int byteAt(int i10) {
        return this.buffer[i10];
    }

    public int capacity() {
        return this.buffer.length;
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

    public int indexOf(byte b10) {
        return indexOf(b10, 0, this.len);
    }

    public int indexOf(byte b10, int i10, int i11) {
        int i12 = i10;
        if (i10 < 0) {
            i12 = 0;
        }
        int i13 = this.len;
        int i14 = i11;
        if (i11 > i13) {
            i14 = i13;
        }
        if (i12 > i14) {
            return -1;
        }
        for (int i15 = i12; i15 < i14; i15++) {
            if (this.buffer[i15] == b10) {
                return i15;
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

    public byte[] toByteArray() {
        int i10 = this.len;
        byte[] bArr = new byte[i10];
        if (i10 > 0) {
            System.arraycopy(this.buffer, 0, bArr, 0, i10);
        }
        return bArr;
    }
}
