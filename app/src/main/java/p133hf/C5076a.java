package p133hf;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.volley.toolbox.C1507a;
import p294r.C7934g;
import p395x2.C9636o;
import p415y2.C9805b;
import p415y2.C9807d;
import p415y2.C9811h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hf/a.class
 */
/* renamed from: hf.a */
/* loaded from: combined.jar:classes2.jar:hf/a.class */
public class C5076a {

    /* renamed from: c */
    public static C5076a f29191c;

    /* renamed from: d */
    public static Context f29192d;

    /* renamed from: a */
    public C9636o f29193a;

    /* renamed from: b */
    public C1507a f29194b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hf/a$a.class
     */
    /* renamed from: hf.a$a */
    /* loaded from: combined.jar:classes2.jar:hf/a$a.class */
    public class a implements C1507a.f {

        /* renamed from: a */
        public final C7934g<String, Bitmap> f29195a = new C7934g<>(20);

        /* renamed from: b */
        public final C5076a f29196b;

        public a(C5076a c5076a) {
            this.f29196b = c5076a;
        }

        @Override // com.android.volley.toolbox.C1507a.f
        /* renamed from: a */
        public void mo6918a(String str, Bitmap bitmap) {
            this.f29195a.m34413f(str, bitmap);
        }

        @Override // com.android.volley.toolbox.C1507a.f
        /* renamed from: b */
        public Bitmap mo6919b(String str) {
            return this.f29195a.m34411d(str);
        }
    }

    public C5076a(Context context) {
        f29192d = context;
        C9636o m25356c = m25356c();
        this.f29193a = m25356c;
        this.f29194b = new C1507a(m25356c, new a(this));
    }

    /* renamed from: b */
    public static C5076a m25354b(Context context) {
        C5076a c5076a;
        synchronized (C5076a.class) {
            try {
                if (f29191c == null) {
                    f29191c = new C5076a(context);
                }
                c5076a = f29191c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5076a;
    }

    /* renamed from: a */
    public C1507a m25355a() {
        return this.f29194b;
    }

    /* renamed from: c */
    public final C9636o m25356c() {
        if (this.f29193a == null) {
            C9636o c9636o = new C9636o(new C9807d(f29192d.getCacheDir(), 10485760), new C9805b(new C9811h()));
            this.f29193a = c9636o;
            c9636o.m40570d();
        }
        return this.f29193a;
    }
}
