package p142i4;

import android.util.Log;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jsoup.parser.CharacterReader;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/l.class
 */
/* renamed from: i4.l */
/* loaded from: combined.jar:classes1.jar:i4/l.class */
public class C5181l {

    /* renamed from: b */
    public static final byte[] f29576b;

    /* renamed from: c */
    public static final int[] f29577c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    public final c f29578a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/l$a.class
     */
    /* renamed from: i4.l$a */
    /* loaded from: combined.jar:classes1.jar:i4/l$a.class */
    public enum a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        a(boolean z10) {
            this.hasAlpha = z10;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/l$b.class
     */
    /* renamed from: i4.l$b */
    /* loaded from: combined.jar:classes1.jar:i4/l$b.class */
    public static class b {

        /* renamed from: a */
        public final ByteBuffer f29579a;

        public b(byte[] bArr) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f29579a = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public short m25858a(int i10) {
            return this.f29579a.getShort(i10);
        }

        /* renamed from: b */
        public int m25859b(int i10) {
            return this.f29579a.getInt(i10);
        }

        /* renamed from: c */
        public int m25860c() {
            return this.f29579a.array().length;
        }

        /* renamed from: d */
        public void m25861d(ByteOrder byteOrder) {
            this.f29579a.order(byteOrder);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/l$c.class
     */
    /* renamed from: i4.l$c */
    /* loaded from: combined.jar:classes1.jar:i4/l$c.class */
    public static class c {

        /* renamed from: a */
        public final InputStream f29580a;

        public c(InputStream inputStream) {
            this.f29580a = inputStream;
        }

        /* renamed from: a */
        public int m25862a() {
            return this.f29580a.read();
        }

        /* renamed from: b */
        public int m25863b() {
            return ((this.f29580a.read() << 8) & 65280) | (this.f29580a.read() & 255);
        }

        /* renamed from: c */
        public short m25864c() {
            return (short) (this.f29580a.read() & 255);
        }

        /* renamed from: d */
        public int m25865d(byte[] bArr) {
            int i10;
            int read;
            int length = bArr.length;
            while (true) {
                i10 = length;
                if (i10 <= 0 || (read = this.f29580a.read(bArr, bArr.length - i10, i10)) == -1) {
                    break;
                }
                length = i10 - read;
            }
            return bArr.length - i10;
        }

        /* renamed from: e */
        public long m25866e(long j10) {
            long j11;
            if (j10 < 0) {
                return 0L;
            }
            long j12 = j10;
            while (true) {
                j11 = j12;
                if (j11 <= 0) {
                    break;
                }
                long skip = this.f29580a.skip(j11);
                if (skip <= 0) {
                    if (this.f29580a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j12 = j11 - skip;
            }
            return j10 - j11;
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif����".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
        }
        f29576b = bArr;
    }

    public C5181l(InputStream inputStream) {
        this.f29578a = new c(inputStream);
    }

    /* renamed from: a */
    public static int m25851a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* renamed from: e */
    public static boolean m25852e(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0071  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m25853g(p142i4.C5181l.b r4) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p142i4.C5181l.m25853g(i4.l$b):int");
    }

    /* renamed from: b */
    public final byte[] m25854b() {
        short m25864c;
        int m25863b;
        long j10;
        long m25866e;
        do {
            short m25864c2 = this.f29578a.m25864c();
            if (m25864c2 != 255) {
                if (!Log.isLoggable("ImageHeaderParser", 3)) {
                    return null;
                }
                Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) m25864c2));
                return null;
            }
            m25864c = this.f29578a.m25864c();
            if (m25864c == 218) {
                return null;
            }
            if (m25864c == 217) {
                if (!Log.isLoggable("ImageHeaderParser", 3)) {
                    return null;
                }
                Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                return null;
            }
            m25863b = this.f29578a.m25863b() - 2;
            if (m25864c == 225) {
                byte[] bArr = new byte[m25863b];
                int m25865d = this.f29578a.m25865d(bArr);
                if (m25865d == m25863b) {
                    return bArr;
                }
                if (!Log.isLoggable("ImageHeaderParser", 3)) {
                    return null;
                }
                Log.d("ImageHeaderParser", "Unable to read segment data, type: " + ((int) m25864c) + ", length: " + m25863b + ", actually read: " + m25865d);
                return null;
            }
            j10 = m25863b;
            m25866e = this.f29578a.m25866e(j10);
        } while (m25866e == j10);
        if (!Log.isLoggable("ImageHeaderParser", 3)) {
            return null;
        }
        Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) m25864c) + ", wanted to skip: " + m25863b + ", but actually skipped: " + m25866e);
        return null;
    }

    /* renamed from: c */
    public int m25855c() {
        if (!m25852e(this.f29578a.m25863b())) {
            return -1;
        }
        byte[] m25854b = m25854b();
        boolean z10 = m25854b != null && m25854b.length > f29576b.length;
        if (z10) {
            int i10 = 0;
            while (true) {
                byte[] bArr = f29576b;
                if (i10 >= bArr.length) {
                    break;
                }
                if (m25854b[i10] != bArr[i10]) {
                    z10 = false;
                    break;
                }
                i10++;
            }
        }
        if (z10) {
            return m25853g(new b(m25854b));
        }
        return -1;
    }

    /* renamed from: d */
    public a m25856d() {
        int m25863b = this.f29578a.m25863b();
        if (m25863b == 65496) {
            return a.JPEG;
        }
        int m25863b2 = ((m25863b << 16) & (-65536)) | (this.f29578a.m25863b() & CharacterReader.EOF);
        if (m25863b2 != -1991225785) {
            return (m25863b2 >> 8) == 4671814 ? a.GIF : a.UNKNOWN;
        }
        this.f29578a.m25866e(21L);
        return this.f29578a.m25862a() >= 3 ? a.PNG_A : a.PNG;
    }

    /* renamed from: f */
    public boolean m25857f() {
        return m25856d().hasAlpha();
    }
}
