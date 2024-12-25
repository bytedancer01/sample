package p071e2;

import android.os.Build;
import androidx.work.C0757b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/v.class
 */
/* renamed from: e2.v */
/* loaded from: combined.jar:classes1.jar:e2/v.class */
public abstract class AbstractC4593v {

    /* renamed from: a */
    public UUID f27235a;

    /* renamed from: b */
    public C6636p f27236b;

    /* renamed from: c */
    public Set<String> f27237c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/v$a.class
     */
    /* renamed from: e2.v$a */
    /* loaded from: combined.jar:classes1.jar:e2/v$a.class */
    public static abstract class a<B extends a<?, ?>, W extends AbstractC4593v> {

        /* renamed from: c */
        public C6636p f27240c;

        /* renamed from: e */
        public Class<? extends ListenableWorker> f27242e;

        /* renamed from: a */
        public boolean f27238a = false;

        /* renamed from: d */
        public Set<String> f27241d = new HashSet();

        /* renamed from: b */
        public UUID f27239b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f27242e = cls;
            this.f27240c = new C6636p(this.f27239b.toString(), cls.getName());
            m23152a(cls.getName());
        }

        /* renamed from: a */
        public final B m23152a(String str) {
            this.f27241d.add(str);
            return mo23136d();
        }

        /* renamed from: b */
        public final W m23153b() {
            W mo23135c = mo23135c();
            C4573b c4573b = this.f27240c.f34582j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && c4573b.m23093e()) || c4573b.m23094f() || c4573b.m23095g() || (i10 >= 23 && c4573b.m23096h());
            if (this.f27240c.f34589q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f27239b = UUID.randomUUID();
            C6636p c6636p = new C6636p(this.f27240c);
            this.f27240c = c6636p;
            c6636p.f34573a = this.f27239b.toString();
            return mo23135c;
        }

        /* renamed from: c */
        public abstract W mo23135c();

        /* renamed from: d */
        public abstract B mo23136d();

        /* renamed from: e */
        public final B m23154e(C4573b c4573b) {
            this.f27240c.f34582j = c4573b;
            return mo23136d();
        }

        /* renamed from: f */
        public B m23155f(long j10, TimeUnit timeUnit) {
            this.f27240c.f34579g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f27240c.f34579g) {
                return mo23136d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        /* renamed from: g */
        public final B m23156g(C0757b c0757b) {
            this.f27240c.f34577e = c0757b;
            return mo23136d();
        }
    }

    public AbstractC4593v(UUID uuid, C6636p c6636p, Set<String> set) {
        this.f27235a = uuid;
        this.f27236b = c6636p;
        this.f27237c = set;
    }

    /* renamed from: a */
    public String m23149a() {
        return this.f27235a.toString();
    }

    /* renamed from: b */
    public Set<String> m23150b() {
        return this.f27237c;
    }

    /* renamed from: c */
    public C6636p m23151c() {
        return this.f27236b;
    }
}
