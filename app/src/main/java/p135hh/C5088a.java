package p135hh;

import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/a.class
 */
/* renamed from: hh.a */
/* loaded from: combined.jar:classes2.jar:hh/a.class */
public class C5088a {

    /* renamed from: a */
    public String f29210a;

    /* renamed from: b */
    public int f29211b;

    public C5088a(String str, int i10) {
        this.f29211b = i10;
        this.f29210a = str;
    }

    public C5088a(String str, String str2) {
        this.f29210a = str;
        this.f29211b = m25394a(str2);
    }

    /* renamed from: a */
    public static int m25394a(String str) {
        long m25395c = m25395c(str) + IjkMediaMeta.AV_CH_WIDE_RIGHT;
        int i10 = 0;
        while ((1 & m25395c) == 0) {
            i10++;
            m25395c >>= 1;
        }
        return m25395c != (8589934591 >> i10) ? 32 : 32 - i10;
    }

    /* renamed from: c */
    public static long m25395c(String str) {
        return (Long.parseLong(str.split("\\.")[0]) << 24) + 0 + (Integer.parseInt(r0[1]) << 16) + (Integer.parseInt(r0[2]) << 8) + Integer.parseInt(r0[3]);
    }

    /* renamed from: b */
    public long m25396b() {
        return m25395c(this.f29210a);
    }

    /* renamed from: d */
    public boolean m25397d() {
        long m25395c = m25395c(this.f29210a);
        long j10 = (4294967295 << (32 - this.f29211b)) & m25395c;
        if (j10 == m25395c) {
            return false;
        }
        this.f29210a = String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(((-16777216) & j10) >> 24), Long.valueOf((16711680 & j10) >> 16), Long.valueOf((65280 & j10) >> 8), Long.valueOf(j10 & 255));
        return true;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%s/%d", this.f29210a, Integer.valueOf(this.f29211b));
    }
}
