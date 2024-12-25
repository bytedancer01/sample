package p191l0;

import android.graphics.Typeface;
import android.os.Handler;
import p191l0.C5642e;
import p191l0.C5643f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/a.class
 */
/* renamed from: l0.a */
/* loaded from: combined.jar:classes1.jar:l0/a.class */
public class C5638a {

    /* renamed from: a */
    public final C5643f.c f31732a;

    /* renamed from: b */
    public final Handler f31733b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/a$a.class
     */
    /* renamed from: l0.a$a */
    /* loaded from: combined.jar:classes1.jar:l0/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C5643f.c f31734b;

        /* renamed from: c */
        public final Typeface f31735c;

        /* renamed from: d */
        public final C5638a f31736d;

        public a(C5638a c5638a, C5643f.c cVar, Typeface typeface) {
            this.f31736d = c5638a;
            this.f31734b = cVar;
            this.f31735c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31734b.mo24003b(this.f31735c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/a$b.class
     */
    /* renamed from: l0.a$b */
    /* loaded from: combined.jar:classes1.jar:l0/a$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C5643f.c f31737b;

        /* renamed from: c */
        public final int f31738c;

        /* renamed from: d */
        public final C5638a f31739d;

        public b(C5638a c5638a, C5643f.c cVar, int i10) {
            this.f31739d = c5638a;
            this.f31737b = cVar;
            this.f31738c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31737b.mo24002a(this.f31738c);
        }
    }

    public C5638a(C5643f.c cVar, Handler handler) {
        this.f31732a = cVar;
        this.f31733b = handler;
    }

    /* renamed from: a */
    public final void m27821a(int i10) {
        this.f31733b.post(new b(this, this.f31732a, i10));
    }

    /* renamed from: b */
    public void m27822b(C5642e.e eVar) {
        if (eVar.m27848a()) {
            m27823c(eVar.f31761a);
        } else {
            m27821a(eVar.f31762b);
        }
    }

    /* renamed from: c */
    public final void m27823c(Typeface typeface) {
        this.f31733b.post(new a(this, this.f31732a, typeface));
    }
}
