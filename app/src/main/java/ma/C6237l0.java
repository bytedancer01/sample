package ma;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p200l9.C5742a;
import p200l9.C5746b;
import p200l9.C5797q;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;
import p270p9.C7672c;
import p285q9.C7852c;
import p285q9.C7853d;
import p285q9.C7855f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/l0.class
 */
/* renamed from: ma.l0 */
/* loaded from: combined.jar:classes2.jar:ma/l0.class */
public final class C6237l0 extends AbstractC7670a implements C6721i.e {

    /* renamed from: b */
    public final CastSeekBar f33868b;

    /* renamed from: c */
    public final long f33869c;

    /* renamed from: d */
    public final C7672c f33870d;

    public C6237l0(CastSeekBar castSeekBar, long j10, C7672c c7672c) {
        this.f33868b = castSeekBar;
        this.f33869c = j10;
        this.f33870d = c7672c;
        castSeekBar.setEnabled(false);
        castSeekBar.m13096d(null);
        castSeekBar.f14729e = null;
        castSeekBar.postInvalidate();
    }

    @Override // p230n9.C6721i.e
    /* renamed from: a */
    public final void mo29582a(long j10, long j11) {
        m29825h();
        m29824g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: b */
    public final C6721i mo29823b() {
        return super.mo29823b();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29826i();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        C6721i mo29823b = super.mo29823b();
        if (mo29823b != null) {
            mo29823b.m30999c(this, this.f33869c);
        }
        m29826i();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C6721i mo29823b = super.mo29823b();
        if (mo29823b != null) {
            mo29823b.m30988O(this);
        }
        super.mo29378f();
        m29826i();
    }

    /* renamed from: g */
    public final void m29824g() {
        CastSeekBar castSeekBar;
        C6721i mo29823b = super.mo29823b();
        C5742a c5742a = null;
        if (mo29823b == null || !mo29823b.m31030v()) {
            castSeekBar = this.f33868b;
            castSeekBar.f14729e = null;
        } else {
            int m31000d = (int) mo29823b.m31000d();
            C5797q m31012l = mo29823b.m31012l();
            if (m31012l != null) {
                c5742a = m31012l.m28306R();
            }
            int m28135S = c5742a != null ? (int) c5742a.m28135S() : m31000d;
            int i10 = m31000d;
            if (m31000d < 0) {
                i10 = 0;
            }
            int i11 = m28135S;
            if (m28135S < 0) {
                i11 = 1;
            }
            castSeekBar = this.f33868b;
            int i12 = i11;
            if (i10 > i11) {
                i12 = i10;
            }
            castSeekBar.f14729e = new C7853d(i10, i12);
        }
        castSeekBar.postInvalidate();
    }

    /* renamed from: h */
    public final void m29825h() {
        C6721i mo29823b = super.mo29823b();
        boolean z10 = true;
        if (mo29823b == null || !mo29823b.m31020p() || mo29823b.m31030v()) {
            this.f33868b.setEnabled(false);
        } else {
            this.f33868b.setEnabled(true);
        }
        C7855f c7855f = new C7855f();
        c7855f.f37923a = this.f33870d.m33608a();
        c7855f.f37924b = this.f33870d.m33609b();
        c7855f.f37925c = (int) (-this.f33870d.m33612e());
        C6721i mo29823b2 = super.mo29823b();
        c7855f.f37926d = (mo29823b2 != null && mo29823b2.m31020p() && mo29823b2.m31023q0()) ? this.f33870d.m33611d() : this.f33870d.m33608a();
        C6721i mo29823b3 = super.mo29823b();
        c7855f.f37927e = (mo29823b3 != null && mo29823b3.m31020p() && mo29823b3.m31023q0()) ? this.f33870d.m33610c() : this.f33870d.m33608a();
        C6721i mo29823b4 = super.mo29823b();
        if (mo29823b4 == null || !mo29823b4.m31020p() || !mo29823b4.m31023q0()) {
            z10 = false;
        }
        c7855f.f37928f = z10;
        this.f33868b.m13097e(c7855f);
    }

    /* renamed from: i */
    public final void m29826i() {
        CastSeekBar castSeekBar;
        ArrayList arrayList;
        int min;
        m29825h();
        C6721i mo29823b = super.mo29823b();
        MediaInfo m31009j = mo29823b == null ? null : mo29823b.m31009j();
        if (mo29823b != null && mo29823b.m31020p() && !mo29823b.m31026s() && m31009j != null) {
            CastSeekBar castSeekBar2 = this.f33868b;
            List<C5746b> m13057Q = m31009j.m13057Q();
            if (m13057Q != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<C5746b> it = m13057Q.iterator();
                while (true) {
                    castSeekBar = castSeekBar2;
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    C5746b next = it.next();
                    if (next != null) {
                        long m28151S = next.m28151S();
                        if (m28151S == -1000) {
                            min = this.f33870d.m33609b();
                        } else {
                            min = Math.min((int) (m28151S - this.f33870d.m33612e()), this.f33870d.m33609b());
                        }
                        if (min >= 0) {
                            arrayList2.add(new C7852c(min, (int) next.m28149Q(), next.m28153U()));
                        }
                    }
                }
            } else {
                castSeekBar = castSeekBar2;
                arrayList = null;
            }
        } else {
            castSeekBar = this.f33868b;
            arrayList = null;
        }
        castSeekBar.m13096d(arrayList);
        m29824g();
    }
}
