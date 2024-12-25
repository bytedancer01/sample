package org.apache.commons.codec.binary;

import java.util.Arrays;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/BaseNCodec.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/BaseNCodec.class */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final int EOF = -1;
    public static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    public static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @Deprecated
    public final byte PAD;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    public final int lineLength;
    public final byte pad;
    private final int unencodedBlockSize;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/codec/binary/BaseNCodec$Context.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/BaseNCodec$Context.class */
    public static class Context {
        public byte[] buffer;
        public int currentLinePos;
        public boolean eof;
        public int ibitWorkArea;
        public long lbitWorkArea;
        public int modulus;
        public int pos;
        public int readPos;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos));
        }
    }

    public BaseNCodec(int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, (byte) 61);
    }

    public BaseNCodec(int i10, int i11, int i12, int i13, byte b10) {
        this.PAD = (byte) 61;
        this.unencodedBlockSize = i10;
        this.encodedBlockSize = i11;
        this.lineLength = i12 > 0 && i13 > 0 ? (i12 / i11) * i11 : 0;
        this.chunkSeparatorLength = i13;
        this.pad = b10;
    }

    public static boolean isWhiteSpace(byte b10) {
        return b10 == 9 || b10 == 10 || b10 == 13 || b10 == 32;
    }

    private byte[] resizeBuffer(Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[getDefaultBufferSize()];
            context.pos = 0;
            context.readPos = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            context.buffer = bArr2;
        }
        return context.buffer;
    }

    public int available(Context context) {
        return context.buffer != null ? context.pos - context.readPos : 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (this.pad == b10 || isInAlphabet(b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i10, int i11, Context context);

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i10 = context.pos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i10, int i11, Context context);

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, 0, bArr.length, context);
        encode(bArr, 0, -1, context);
        int i10 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10, context);
        return bArr2;
    }

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i10, Context context) {
        byte[] bArr = context.buffer;
        return (bArr == null || bArr.length < context.pos + i10) ? resizeBuffer(context) : bArr;
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.unencodedBlockSize;
        long j10 = (((length + i10) - 1) / i10) * this.encodedBlockSize;
        int i11 = this.lineLength;
        long j11 = j10;
        if (i11 > 0) {
            j11 = j10 + ((((i11 + j10) - 1) / i11) * this.chunkSeparatorLength);
        }
        return j11;
    }

    public boolean hasData(Context context) {
        return context.buffer != null;
    }

    public abstract boolean isInAlphabet(byte b10);

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public boolean isInAlphabet(byte[] bArr, boolean z10) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isInAlphabet(bArr[i10])) {
                if (!z10) {
                    return false;
                }
                byte b10 = bArr[i10];
                if (b10 != this.pad && !isWhiteSpace(b10)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i10, int i11, Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int min = Math.min(available(context), i11);
        System.arraycopy(context.buffer, context.readPos, bArr, i10, min);
        int i12 = context.readPos + min;
        context.readPos = i12;
        if (i12 >= context.pos) {
            context.buffer = null;
        }
        return min;
    }
}
