package p288qd;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5565r;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qd/b.class
 */
/* renamed from: qd.b */
/* loaded from: combined.jar:classes2.jar:qd/b.class */
public final class C7907b extends AbstractC5569v<Time> {

    /* renamed from: b */
    public static final InterfaceC5570w f38032b = new a();

    /* renamed from: a */
    public final DateFormat f38033a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qd/b$a.class
     */
    /* renamed from: qd.b$a */
    /* loaded from: combined.jar:classes2.jar:qd/b$a.class */
    public class a implements InterfaceC5570w {
        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            C7907b c7907b = null;
            if (c8462a.m36351c() == Time.class) {
                c7907b = new C7907b(null);
            }
            return c7907b;
        }
    }

    public C7907b() {
        this.f38033a = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ C7907b(a aVar) {
        this();
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time mo27561b(C8555a c8555a) {
        synchronized (this) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            try {
                return new Time(this.f38033a.parse(c8555a.mo31104H0()).getTime());
            } catch (ParseException e10) {
                throw new C5565r(e10);
            }
        }
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo27562d(C8557c c8557c, Time time) {
        synchronized (this) {
            c8557c.mo31123N0(time == null ? null : this.f38033a.format((Date) time));
        }
    }
}
