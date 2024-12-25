package cd;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/m.class
 */
/* renamed from: cd.m */
/* loaded from: combined.jar:classes2.jar:cd/m.class */
public class C1073m {

    /* renamed from: a */
    public static final byte f7104a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f7105b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m6311b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m6312c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m6313a() {
        byte[] m6312c = m6312c(UUID.randomUUID(), new byte[17]);
        byte b10 = m6312c[0];
        m6312c[16] = b10;
        m6312c[0] = (byte) ((b10 & f7105b) | f7104a);
        return m6311b(m6312c);
    }
}
