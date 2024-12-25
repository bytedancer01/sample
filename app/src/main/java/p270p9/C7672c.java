package p270p9;

import android.text.format.DateUtils;
import com.google.android.gms.cast.MediaInfo;
import java.text.DateFormat;
import java.util.Date;
import p200l9.C5782l;
import p200l9.C5791o;
import p200l9.C5797q;
import p230n9.C6721i;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p9/c.class
 */
/* renamed from: p9.c */
/* loaded from: combined.jar:classes2.jar:p9/c.class */
public final class C7672c {

    /* renamed from: a */
    public C6721i f37414a;

    /* renamed from: f */
    public static C7672c m33606f() {
        return new C7672c();
    }

    /* renamed from: p */
    public static final String m33607p(long j10) {
        return j10 >= 0 ? DateUtils.formatElapsedTime(j10 / 1000) : "-".concat(String.valueOf(DateUtils.formatElapsedTime((-j10) / 1000)));
    }

    /* renamed from: a */
    public final int m33608a() {
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p()) {
            return 0;
        }
        C6721i c6721i2 = this.f37414a;
        if (!c6721i2.m31024r() && c6721i2.m31026s()) {
            return 0;
        }
        long m31006g = c6721i2.m31006g();
        long m33612e = m33612e();
        boolean m31023q0 = c6721i2.m31023q0();
        int i10 = (int) (m31006g - m33612e);
        int i11 = i10;
        if (m31023q0) {
            int m33611d = m33611d();
            i11 = Math.min(Math.max(i10, m33611d), m33610c());
        }
        return Math.min(Math.max(i11, 0), m33609b());
    }

    /* renamed from: b */
    public final int m33609b() {
        long m31006g;
        C6721i c6721i = this.f37414a;
        long j10 = 1;
        if (c6721i != null) {
            if (c6721i.m31020p()) {
                C6721i c6721i2 = this.f37414a;
                if (c6721i2.m31024r()) {
                    Long m33615i = m33615i();
                    if (m33615i == null) {
                        m33615i = m33613g();
                        if (m33615i == null) {
                            m31006g = c6721i2.m31006g();
                            j10 = Math.max(m31006g, 1L);
                        }
                    }
                    j10 = m33615i.longValue();
                } else {
                    if (c6721i2.m31026s()) {
                        C5791o m31008i = c6721i2.m31008i();
                        j10 = 1;
                        if (m31008i != null) {
                            MediaInfo m28283T = m31008i.m28283T();
                            j10 = 1;
                            if (m28283T != null) {
                                m31006g = m28283T.m13067a0();
                            }
                        }
                    } else {
                        m31006g = c6721i2.m31018o();
                    }
                    j10 = Math.max(m31006g, 1L);
                }
            } else {
                j10 = 1;
            }
        }
        return Math.max((int) (j10 - m33612e()), 1);
    }

    /* renamed from: c */
    public final int m33610c() {
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || !this.f37414a.m31024r()) {
            return m33609b();
        }
        if (!this.f37414a.m31023q0()) {
            return 0;
        }
        long longValue = ((Long) C9935o.m41850j(m33613g())).longValue();
        long m33612e = m33612e();
        return Math.min(Math.max((int) (longValue - m33612e), 0), m33609b());
    }

    /* renamed from: d */
    public final int m33611d() {
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || !this.f37414a.m31024r() || !this.f37414a.m31023q0()) {
            return 0;
        }
        long longValue = ((Long) C9935o.m41850j(m33614h())).longValue();
        long m33612e = m33612e();
        return Math.min(Math.max((int) (longValue - m33612e), 0), m33609b());
    }

    /* renamed from: e */
    public final long m33612e() {
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || !this.f37414a.m31024r()) {
            return 0L;
        }
        C6721i c6721i2 = this.f37414a;
        Long m33616j = m33616j();
        if (m33616j != null) {
            return m33616j.longValue();
        }
        Long m33614h = m33614h();
        return m33614h != null ? m33614h.longValue() : c6721i2.m31006g();
    }

    /* renamed from: g */
    public final Long m33613g() {
        C6721i c6721i;
        C5797q m31012l;
        C6721i c6721i2 = this.f37414a;
        if (c6721i2 == null || !c6721i2.m31020p() || !this.f37414a.m31024r() || !this.f37414a.m31023q0() || (m31012l = (c6721i = this.f37414a).m31012l()) == null || m31012l.m28313Y() == null) {
            return null;
        }
        return Long.valueOf(c6721i.m31002e());
    }

    /* renamed from: h */
    public final Long m33614h() {
        C6721i c6721i;
        C5797q m31012l;
        C6721i c6721i2 = this.f37414a;
        if (c6721i2 == null || !c6721i2.m31020p() || !this.f37414a.m31024r() || !this.f37414a.m31023q0() || (m31012l = (c6721i = this.f37414a).m31012l()) == null || m31012l.m28313Y() == null) {
            return null;
        }
        return Long.valueOf(c6721i.m31004f());
    }

    /* renamed from: i */
    public final Long m33615i() {
        C5782l m33621o;
        Long m33616j;
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || !this.f37414a.m31024r() || (m33621o = m33621o()) == null || !m33621o.m28243P("com.google.android.gms.cast.metadata.SECTION_DURATION") || (m33616j = m33616j()) == null) {
            return null;
        }
        return Long.valueOf(m33616j.longValue() + m33621o.m28247T("com.google.android.gms.cast.metadata.SECTION_DURATION"));
    }

    /* renamed from: j */
    public final Long m33616j() {
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || !this.f37414a.m31024r()) {
            return null;
        }
        C6721i c6721i2 = this.f37414a;
        MediaInfo m31009j = c6721i2.m31009j();
        C5782l m33621o = m33621o();
        if (m31009j == null || m33621o == null || !m33621o.m28243P("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA")) {
            return null;
        }
        if (m33621o.m28243P("com.google.android.gms.cast.metadata.SECTION_DURATION") || c6721i2.m31023q0()) {
            return Long.valueOf(m33621o.m28247T("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
        }
        return null;
    }

    /* renamed from: k */
    public final Long m33617k() {
        MediaInfo m31009j;
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || !this.f37414a.m31024r() || (m31009j = this.f37414a.m31009j()) == null || m31009j.m13066Z() == -1) {
            return null;
        }
        return Long.valueOf(m31009j.m13066Z());
    }

    /* renamed from: l */
    public final String m33618l(long j10) {
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p()) {
            return null;
        }
        C6721i c6721i2 = this.f37414a;
        if (((c6721i2 == null || !c6721i2.m31020p() || !this.f37414a.m31024r() || m33617k() == null) ? 1 : 2) - 1 != 1) {
            return (c6721i2.m31024r() && m33616j() == null) ? m33607p(j10) : m33607p(j10 - m33612e());
        }
        return DateFormat.getTimeInstance().format(new Date(((Long) C9935o.m41850j(m33617k())).longValue() + j10));
    }

    /* renamed from: m */
    public final boolean m33619m() {
        return m33620n(m33608a() + m33612e());
    }

    /* renamed from: n */
    public final boolean m33620n(long j10) {
        C6721i c6721i = this.f37414a;
        return c6721i != null && c6721i.m31020p() && this.f37414a.m31023q0() && (((long) m33610c()) + m33612e()) - j10 < 10000;
    }

    /* renamed from: o */
    public final C5782l m33621o() {
        MediaInfo m31009j;
        C6721i c6721i = this.f37414a;
        if (c6721i == null || !c6721i.m31020p() || (m31009j = this.f37414a.m31009j()) == null) {
            return null;
        }
        return m31009j.m13065Y();
    }
}
