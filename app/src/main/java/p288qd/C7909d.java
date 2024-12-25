package p288qd;

import java.sql.Timestamp;
import java.util.Date;
import p188kd.InterfaceC5570w;
import p232nd.AbstractC6768d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qd/d.class
 */
/* renamed from: qd.d */
/* loaded from: combined.jar:classes2.jar:qd/d.class */
public final class C7909d {

    /* renamed from: a */
    public static final boolean f38036a;

    /* renamed from: b */
    public static final AbstractC6768d<? extends Date> f38037b;

    /* renamed from: c */
    public static final AbstractC6768d<? extends Date> f38038c;

    /* renamed from: d */
    public static final InterfaceC5570w f38039d;

    /* renamed from: e */
    public static final InterfaceC5570w f38040e;

    /* renamed from: f */
    public static final InterfaceC5570w f38041f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qd/d$a.class
     */
    /* renamed from: qd.d$a */
    /* loaded from: combined.jar:classes2.jar:qd/d$a.class */
    public class a extends AbstractC6768d<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qd/d$b.class
     */
    /* renamed from: qd.d$b */
    /* loaded from: combined.jar:classes2.jar:qd/d$b.class */
    public class b extends AbstractC6768d<Timestamp> {
        public b(Class cls) {
            super(cls);
        }
    }

    static {
        boolean z10;
        InterfaceC5570w interfaceC5570w;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException e10) {
            z10 = false;
        }
        f38036a = z10;
        if (z10) {
            f38037b = new a(java.sql.Date.class);
            f38038c = new b(Timestamp.class);
            f38039d = C7906a.f38030b;
            f38040e = C7907b.f38032b;
            interfaceC5570w = C7908c.f38034b;
        } else {
            interfaceC5570w = null;
            f38037b = null;
            f38038c = null;
            f38039d = null;
            f38040e = null;
        }
        f38041f = interfaceC5570w;
    }
}
