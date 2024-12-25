package p351ub;

import android.graphics.Typeface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ub/a.class
 */
/* renamed from: ub.a */
/* loaded from: combined.jar:classes2.jar:ub/a.class */
public final class C9146a extends AbstractC9151f {

    /* renamed from: a */
    public final Typeface f41834a;

    /* renamed from: b */
    public final a f41835b;

    /* renamed from: c */
    public boolean f41836c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ub/a$a.class
     */
    /* renamed from: ub.a$a */
    /* loaded from: combined.jar:classes2.jar:ub/a$a.class */
    public interface a {
        /* renamed from: a */
        void mo36304a(Typeface typeface);
    }

    public C9146a(a aVar, Typeface typeface) {
        this.f41834a = typeface;
        this.f41835b = aVar;
    }

    @Override // p351ub.AbstractC9151f
    /* renamed from: a */
    public void mo13465a(int i10) {
        m38471d(this.f41834a);
    }

    @Override // p351ub.AbstractC9151f
    /* renamed from: b */
    public void mo13466b(Typeface typeface, boolean z10) {
        m38471d(typeface);
    }

    /* renamed from: c */
    public void m38470c() {
        this.f41836c = true;
    }

    /* renamed from: d */
    public final void m38471d(Typeface typeface) {
        if (this.f41836c) {
            return;
        }
        this.f41835b.mo36304a(typeface);
    }
}
