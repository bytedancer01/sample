package p428yg;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/a.class
 */
/* renamed from: yg.a */
/* loaded from: combined.jar:classes2.jar:yg/a.class */
public abstract class AbstractC9988a<T> {

    /* renamed from: a */
    public final C10014t f45755a;

    /* renamed from: b */
    public final C10017w f45756b;

    /* renamed from: c */
    public final WeakReference<T> f45757c;

    /* renamed from: d */
    public final boolean f45758d;

    /* renamed from: e */
    public final int f45759e;

    /* renamed from: f */
    public final int f45760f;

    /* renamed from: g */
    public final int f45761g;

    /* renamed from: h */
    public final Drawable f45762h;

    /* renamed from: i */
    public final String f45763i;

    /* renamed from: j */
    public final Object f45764j;

    /* renamed from: k */
    public boolean f45765k;

    /* renamed from: l */
    public boolean f45766l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/a$a.class
     */
    /* renamed from: yg.a$a */
    /* loaded from: combined.jar:classes2.jar:yg/a$a.class */
    public static class a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final AbstractC9988a f45767a;

        public a(AbstractC9988a abstractC9988a, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.f45767a = abstractC9988a;
        }
    }

    public AbstractC9988a(C10014t c10014t, T t10, C10017w c10017w, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        this.f45755a = c10014t;
        this.f45756b = c10017w;
        this.f45757c = t10 == null ? null : new a(this, t10, c10014t.f45895k);
        this.f45759e = i10;
        this.f45760f = i11;
        this.f45758d = z10;
        this.f45761g = i12;
        this.f45762h = drawable;
        this.f45763i = str;
        this.f45764j = obj == null ? this : obj;
    }

    /* renamed from: a */
    public void mo41971a() {
        this.f45766l = true;
    }

    /* renamed from: b */
    public abstract void mo41972b(Bitmap bitmap, C10014t.e eVar);

    /* renamed from: c */
    public abstract void mo41973c();

    /* renamed from: d */
    public String m41974d() {
        return this.f45763i;
    }

    /* renamed from: e */
    public int m41975e() {
        return this.f45759e;
    }

    /* renamed from: f */
    public int m41976f() {
        return this.f45760f;
    }

    /* renamed from: g */
    public C10014t m41977g() {
        return this.f45755a;
    }

    /* renamed from: h */
    public C10014t.f m41978h() {
        return this.f45756b.f45942r;
    }

    /* renamed from: i */
    public C10017w m41979i() {
        return this.f45756b;
    }

    /* renamed from: j */
    public Object m41980j() {
        return this.f45764j;
    }

    /* renamed from: k */
    public T m41981k() {
        WeakReference<T> weakReference = this.f45757c;
        return weakReference == null ? null : weakReference.get();
    }

    /* renamed from: l */
    public boolean m41982l() {
        return this.f45766l;
    }

    /* renamed from: m */
    public boolean m41983m() {
        return this.f45765k;
    }
}
