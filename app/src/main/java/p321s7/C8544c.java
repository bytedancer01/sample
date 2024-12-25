package p321s7;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s7/c.class
 */
/* renamed from: s7.c */
/* loaded from: combined.jar:classes2.jar:s7/c.class */
public final class C8544c {

    /* renamed from: a */
    public final ByteArrayOutputStream f39954a;

    /* renamed from: b */
    public final DataOutputStream f39955b;

    public C8544c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f39954a = byteArrayOutputStream;
        this.f39955b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m36772b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] m36773a(C8542a c8542a) {
        this.f39954a.reset();
        try {
            m36772b(this.f39955b, c8542a.f39948b);
            String str = c8542a.f39949c;
            if (str == null) {
                str = "";
            }
            m36772b(this.f39955b, str);
            this.f39955b.writeLong(c8542a.f39950d);
            this.f39955b.writeLong(c8542a.f39951e);
            this.f39955b.write(c8542a.f39952f);
            this.f39955b.flush();
            return this.f39954a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
