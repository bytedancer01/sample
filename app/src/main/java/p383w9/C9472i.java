package p383w9;

import android.os.Looper;
import java.util.concurrent.Executor;
import p079ea.ExecutorC4693a;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/i.class
 */
/* renamed from: w9.i */
/* loaded from: combined.jar:classes2.jar:w9/i.class */
public final class C9472i<L> {

    /* renamed from: a */
    public final Executor f43289a;

    /* renamed from: b */
    public volatile L f43290b;

    /* renamed from: c */
    public volatile a<L> f43291c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:w9/i$a.class
     */
    /* renamed from: w9.i$a */
    /* loaded from: combined.jar:classes2.jar:w9/i$a.class */
    public static final class a<L> {

        /* renamed from: a */
        public final L f43292a;

        /* renamed from: b */
        public final String f43293b;

        public a(L l10, String str) {
            this.f43292a = l10;
            this.f43293b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f43292a == aVar.f43292a && this.f43293b.equals(aVar.f43293b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f43292a) * 31) + this.f43293b.hashCode();
        }
    }

    public C9472i(Looper looper, L l10, String str) {
        this.f43289a = new ExecutorC4693a(looper);
        this.f43290b = (L) C9935o.m41851k(l10, "Listener must not be null");
        this.f43291c = new a<>(l10, C9935o.m41846f(str));
    }

    /* renamed from: a */
    public void m39922a() {
        this.f43290b = null;
        this.f43291c = null;
    }

    /* renamed from: b */
    public a<L> m39923b() {
        return this.f43291c;
    }
}
