package p085ej;

import dj.InterfaceC4539f;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p173ji.AbstractC5408e0;
import p173ji.C5435z;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p411xi.C9761e;
import sd.C8557c;

/* renamed from: ej.b */
/* loaded from: combined.jar:classes3.jar:ej/b.class */
public final class C4731b<T> implements InterfaceC4539f<T, AbstractC5408e0> {

    /* renamed from: c */
    public static final C5435z f27878c = C5435z.m27174g("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f27879d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C5552e f27880a;

    /* renamed from: b */
    public final AbstractC5569v<T> f27881b;

    public C4731b(C5552e c5552e, AbstractC5569v<T> abstractC5569v) {
        this.f27880a = c5552e;
        this.f27881b = abstractC5569v;
    }

    @Override // dj.InterfaceC4539f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5408e0 mo22855a(T t10) {
        C9761e c9761e = new C9761e();
        C8557c m27553q = this.f27880a.m27553q(new OutputStreamWriter(c9761e.m41122E0(), f27879d));
        this.f27881b.mo27562d(m27553q, t10);
        m27553q.close();
        return AbstractC5408e0.m26897e(f27878c, c9761e.m41129K0());
    }
}
