package p071e2;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p071e2.AbstractC4593v;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/m.class
 */
/* renamed from: e2.m */
/* loaded from: combined.jar:classes1.jar:e2/m.class */
public final class C4584m extends AbstractC4593v {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/m$a.class
     */
    /* renamed from: e2.m$a */
    /* loaded from: combined.jar:classes1.jar:e2/m$a.class */
    public static final class a extends AbstractC4593v.a<a, C4584m> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f27240c.f34576d = OverwritingInputMerger.class.getName();
        }

        @Override // p071e2.AbstractC4593v.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C4584m mo23135c() {
            if (this.f27238a && Build.VERSION.SDK_INT >= 23 && this.f27240c.f34582j.m23096h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C4584m(this);
        }

        @Override // p071e2.AbstractC4593v.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo23136d() {
            return this;
        }
    }

    public C4584m(a aVar) {
        super(aVar.f27239b, aVar.f27240c, aVar.f27241d);
    }

    /* renamed from: d */
    public static C4584m m23134d(Class<? extends ListenableWorker> cls) {
        return new a(cls).m23153b();
    }
}
