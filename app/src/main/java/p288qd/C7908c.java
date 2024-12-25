package p288qd;

import java.sql.Timestamp;
import java.util.Date;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qd/c.class
 */
/* renamed from: qd.c */
/* loaded from: combined.jar:classes2.jar:qd/c.class */
public class C7908c extends AbstractC5569v<Timestamp> {

    /* renamed from: b */
    public static final InterfaceC5570w f38034b = new a();

    /* renamed from: a */
    public final AbstractC5569v<Date> f38035a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qd/c$a.class
     */
    /* renamed from: qd.c$a */
    /* loaded from: combined.jar:classes2.jar:qd/c$a.class */
    public class a implements InterfaceC5570w {
        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            if (c8462a.m36351c() == Timestamp.class) {
                return new C7908c(c5552e.m27549l(Date.class), null);
            }
            return null;
        }
    }

    public C7908c(AbstractC5569v<Date> abstractC5569v) {
        this.f38035a = abstractC5569v;
    }

    public /* synthetic */ C7908c(AbstractC5569v abstractC5569v, a aVar) {
        this(abstractC5569v);
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp mo27561b(C8555a c8555a) {
        Date mo27561b = this.f38035a.mo27561b(c8555a);
        return mo27561b != null ? new Timestamp(mo27561b.getTime()) : null;
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo27562d(C8557c c8557c, Timestamp timestamp) {
        this.f38035a.mo27562d(c8557c, timestamp);
    }
}
