package p182k7;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.nio.ByteBuffer;
import java.util.UUID;
import p059d9.C4361f0;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/l.class
 */
/* renamed from: k7.l */
/* loaded from: combined.jar:classes2.jar:k7/l.class */
public final class C5521l {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/l$a.class
     */
    /* renamed from: k7.l$a */
    /* loaded from: combined.jar:classes2.jar:k7/l$a.class */
    public static class a {

        /* renamed from: a */
        public final UUID f31513a;

        /* renamed from: b */
        public final int f31514b;

        /* renamed from: c */
        public final byte[] f31515c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f31513a = uuid;
            this.f31514b = i10;
            this.f31515c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m27470a(UUID uuid, byte[] bArr) {
        return m27471b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m27471b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        int i10 = length;
        if (uuidArr != null) {
            i10 = length + (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.putInt(i10);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m27472c(byte[] bArr) {
        return m27473d(bArr) != null;
    }

    /* renamed from: d */
    public static a m27473d(byte[] bArr) {
        C4361f0 c4361f0 = new C4361f0(bArr);
        if (c4361f0.m21990f() < 32) {
            return null;
        }
        c4361f0.m21983P(0);
        if (c4361f0.m21998n() != c4361f0.m21985a() + 4 || c4361f0.m21998n() != 1886614376) {
            return null;
        }
        int m27342c = AbstractC5510a.m27342c(c4361f0.m21998n());
        if (m27342c > 1) {
            C4392v.m22275i("PsshAtomUtil", "Unsupported pssh version: " + m27342c);
            return null;
        }
        UUID uuid = new UUID(c4361f0.m22007w(), c4361f0.m22007w());
        if (m27342c == 1) {
            c4361f0.m21984Q(c4361f0.m21975H() * 16);
        }
        int m21975H = c4361f0.m21975H();
        if (m21975H != c4361f0.m21985a()) {
            return null;
        }
        byte[] bArr2 = new byte[m21975H];
        c4361f0.m21994j(bArr2, 0, m21975H);
        return new a(uuid, m27342c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m27474e(byte[] bArr, UUID uuid) {
        a m27473d = m27473d(bArr);
        if (m27473d == null) {
            return null;
        }
        if (uuid.equals(m27473d.f31513a)) {
            return m27473d.f31515c;
        }
        C4392v.m22275i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m27473d.f31513a + InstructionFileId.DOT);
        return null;
    }

    /* renamed from: f */
    public static UUID m27475f(byte[] bArr) {
        a m27473d = m27473d(bArr);
        if (m27473d == null) {
            return null;
        }
        return m27473d.f31513a;
    }

    /* renamed from: g */
    public static int m27476g(byte[] bArr) {
        a m27473d = m27473d(bArr);
        if (m27473d == null) {
            return -1;
        }
        return m27473d.f31514b;
    }
}
