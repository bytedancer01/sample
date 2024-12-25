package p188kd;

import java.io.IOException;
import p232nd.C6771g;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/v.class
 */
/* renamed from: kd.v */
/* loaded from: combined.jar:classes2.jar:kd/v.class */
public abstract class AbstractC5569v<T> {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/v$a.class
     */
    /* renamed from: kd.v$a */
    /* loaded from: combined.jar:classes2.jar:kd/v$a.class */
    public class a extends AbstractC5569v<T> {

        /* renamed from: a */
        public final AbstractC5569v f31651a;

        public a(AbstractC5569v abstractC5569v) {
            this.f31651a = abstractC5569v;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: b */
        public T mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return (T) this.f31651a.mo27561b(c8555a);
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: d */
        public void mo27562d(C8557c c8557c, T t10) {
            if (t10 == null) {
                c8557c.mo31133v0();
            } else {
                this.f31651a.mo27562d(c8557c, t10);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC5569v<T> m27596a() {
        return new a(this);
    }

    /* renamed from: b */
    public abstract T mo27561b(C8555a c8555a);

    /* renamed from: c */
    public final AbstractC5557j m27597c(T t10) {
        try {
            C6771g c6771g = new C6771g();
            mo27562d(c6771g, t10);
            return c6771g.m31125Q0();
        } catch (IOException e10) {
            throw new C5558k(e10);
        }
    }

    /* renamed from: d */
    public abstract void mo27562d(C8557c c8557c, T t10);
}
