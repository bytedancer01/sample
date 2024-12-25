package p288qd;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5565r;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qd/a.class
 */
/* renamed from: qd.a */
/* loaded from: combined.jar:classes2.jar:qd/a.class */
public final class C7906a extends AbstractC5569v<Date> {

    /* renamed from: b */
    public static final InterfaceC5570w f38030b = new a();

    /* renamed from: a */
    public final DateFormat f38031a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qd/a$a.class
     */
    /* renamed from: qd.a$a */
    /* loaded from: combined.jar:classes2.jar:qd/a$a.class */
    public class a implements InterfaceC5570w {
        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            C7906a c7906a = null;
            if (c8462a.m36351c() == Date.class) {
                c7906a = new C7906a(null);
            }
            return c7906a;
        }
    }

    public C7906a() {
        this.f38031a = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ C7906a(a aVar) {
        this();
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date mo27561b(C8555a c8555a) {
        synchronized (this) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return new Date(this.f38031a.parse(c8555a.mo31104H0()).getTime());
            } catch (ParseException e10) {
                throw new C5565r(e10);
            }
        }
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo27562d(C8557c c8557c, Date date) {
        synchronized (this) {
            c8557c.mo31123N0(date == null ? null : this.f38031a.format((java.util.Date) date));
        }
    }
}
