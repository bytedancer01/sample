package p415y2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import p395x2.AbstractC9635n;
import p395x2.C9626e;
import p395x2.C9632k;
import p395x2.C9634m;
import p395x2.C9637p;
import p395x2.C9643v;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/i.class
 */
/* renamed from: y2.i */
/* loaded from: combined.jar:classes1.jar:y2/i.class */
public class C9812i extends AbstractC9635n<Bitmap> {

    /* renamed from: w */
    public static final Object f45134w = new Object();

    /* renamed from: q */
    public final Object f45135q;

    /* renamed from: r */
    public C9637p.b<Bitmap> f45136r;

    /* renamed from: s */
    public final Bitmap.Config f45137s;

    /* renamed from: t */
    public final int f45138t;

    /* renamed from: u */
    public final int f45139u;

    /* renamed from: v */
    public final ImageView.ScaleType f45140v;

    public C9812i(String str, C9637p.b<Bitmap> bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, C9637p.a aVar) {
        super(0, str, aVar);
        this.f45135q = new Object();
        m40542M(new C9626e(1000, 2, 2.0f));
        this.f45136r = bVar;
        this.f45137s = config;
        this.f45138t = i10;
        this.f45139u = i11;
        this.f45140v = scaleType;
    }

    /* renamed from: S */
    public static int m41340S(int i10, int i11, int i12, int i13) {
        float f10 = 1.0f;
        while (true) {
            float f11 = f10;
            float f12 = 2.0f * f11;
            if (f12 > Math.min(i10 / i12, i11 / i13)) {
                return (int) f11;
            }
            f10 = f12;
        }
    }

    /* renamed from: T */
    public static int m41341T(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (i12 * (i11 / i13));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = i13 / i12;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            if (i10 * d10 < d11) {
                i10 = (int) (d11 / d10);
            }
            return i10;
        }
        double d12 = i11;
        if (i10 * d10 > d12) {
            i10 = (int) (d12 / d10);
        }
        return i10;
    }

    @Override // p395x2.AbstractC9635n
    /* renamed from: I */
    public C9637p<Bitmap> mo40538I(C9632k c9632k) {
        C9637p<Bitmap> m41343R;
        synchronized (f45134w) {
            try {
                m41343R = m41343R(c9632k);
            } catch (OutOfMemoryError e10) {
                C9643v.m40579c("Caught OOM for %d byte image, url=%s", Integer.valueOf(c9632k.f43981b.length), m40531B());
                return C9637p.m40573a(new C9634m(e10));
            }
        }
        return m41343R;
    }

    @Override // p395x2.AbstractC9635n
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo40550g(Bitmap bitmap) {
        C9637p.b<Bitmap> bVar;
        synchronized (this.f45135q) {
            bVar = this.f45136r;
        }
        if (bVar != null) {
            bVar.mo6909a(bitmap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        if (r0.getHeight() > r0) goto L13;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p395x2.C9637p<android.graphics.Bitmap> m41343R(p395x2.C9632k r7) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p415y2.C9812i.m41343R(x2.k):x2.p");
    }

    @Override // p395x2.AbstractC9635n
    /* renamed from: d */
    public void mo40547d() {
        super.mo40547d();
        synchronized (this.f45135q) {
            this.f45136r = null;
        }
    }

    @Override // p395x2.AbstractC9635n
    /* renamed from: x */
    public AbstractC9635n.c mo40564x() {
        return AbstractC9635n.c.LOW;
    }
}
