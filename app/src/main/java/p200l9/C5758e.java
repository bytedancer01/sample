package p200l9;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.C2414a;
import java.util.UUID;
import p304r9.C8037m;
import p368v9.InterfaceC9320f;
import p422y9.C9932n;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/e.class
 */
/* renamed from: l9.e */
/* loaded from: combined.jar:classes2.jar:l9/e.class */
public final class C5758e {

    /* renamed from: a */
    public static final C2414a<c> f32216a;

    /* renamed from: b */
    public static final b f32217b;

    /* renamed from: c */
    public static final C2414a.a f32218c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/e$a.class
     */
    /* renamed from: l9.e$a */
    /* loaded from: combined.jar:classes2.jar:l9/e$a.class */
    public interface a extends InterfaceC9320f {
        /* renamed from: A */
        boolean mo28176A();

        /* renamed from: B */
        String mo28177B();

        /* renamed from: H */
        C5754d mo28178H();

        String getSessionId();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/e$b.class
     */
    @Deprecated
    /* renamed from: l9.e$b */
    /* loaded from: combined.jar:classes2.jar:l9/e$b.class */
    public interface b {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/e$c.class
     */
    /* renamed from: l9.e$c */
    /* loaded from: combined.jar:classes2.jar:l9/e$c.class */
    public static final class c implements C2414a.d {

        /* renamed from: b */
        public final CastDevice f32219b;

        /* renamed from: c */
        public final d f32220c;

        /* renamed from: d */
        public final Bundle f32221d;

        /* renamed from: e */
        public final int f32222e;

        /* renamed from: f */
        public final String f32223f = UUID.randomUUID().toString();

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:l9/e$c$a.class
         */
        /* renamed from: l9.e$c$a */
        /* loaded from: combined.jar:classes2.jar:l9/e$c$a.class */
        public static final class a {

            /* renamed from: a */
            public final CastDevice f32224a;

            /* renamed from: b */
            public final d f32225b;

            /* renamed from: c */
            public int f32226c;

            /* renamed from: d */
            public Bundle f32227d;

            public a(CastDevice castDevice, d dVar) {
                C9935o.m41851k(castDevice, "CastDevice parameter cannot be null");
                C9935o.m41851k(dVar, "CastListener parameter cannot be null");
                this.f32224a = castDevice;
                this.f32225b = dVar;
                this.f32226c = 0;
            }

            /* renamed from: a */
            public c m28181a() {
                return new c(this, null);
            }

            /* renamed from: d */
            public final a m28182d(Bundle bundle) {
                this.f32227d = bundle;
                return this;
            }
        }

        public /* synthetic */ c(a aVar, C5826z1 c5826z1) {
            this.f32219b = aVar.f32224a;
            this.f32220c = aVar.f32225b;
            this.f32222e = aVar.f32226c;
            this.f32221d = aVar.f32227d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C9932n.m41832b(this.f32219b, cVar.f32219b) && C9932n.m41831a(this.f32221d, cVar.f32221d) && this.f32222e == cVar.f32222e && C9932n.m41832b(this.f32223f, cVar.f32223f);
        }

        public int hashCode() {
            return C9932n.m41833c(this.f32219b, this.f32221d, Integer.valueOf(this.f32222e), this.f32223f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/e$d.class
     */
    /* renamed from: l9.e$d */
    /* loaded from: combined.jar:classes2.jar:l9/e$d.class */
    public static class d {
        /* renamed from: a */
        public void mo28183a(int i10) {
        }

        /* renamed from: b */
        public void mo28184b(int i10) {
        }

        /* renamed from: c */
        public void mo28185c(C5754d c5754d) {
        }

        /* renamed from: d */
        public void mo28186d() {
        }

        /* renamed from: e */
        public void mo28187e() {
        }

        /* renamed from: f */
        public void mo28188f(int i10) {
        }

        /* renamed from: g */
        public void mo28189g() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/e$e.class
     */
    /* renamed from: l9.e$e */
    /* loaded from: combined.jar:classes2.jar:l9/e$e.class */
    public interface e {
        /* renamed from: a */
        void mo28190a(CastDevice castDevice, String str, String str2);
    }

    static {
        C5820x1 c5820x1 = new C5820x1();
        f32218c = c5820x1;
        f32216a = new C2414a<>("Cast.API", c5820x1, C8037m.f38830a);
        f32217b = new C5823y1();
    }

    /* renamed from: a */
    public static InterfaceC5749b2 m28175a(Context context, c cVar) {
        return new C5816w0(context, cVar);
    }
}
