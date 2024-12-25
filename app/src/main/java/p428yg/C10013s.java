package p428yg;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p428yg.InterfaceC10004j;
import tg.AbstractC8746v;
import tg.C8727c;
import tg.C8728d;
import tg.C8741q;
import tg.C8743s;
import tg.C8745u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/s.class
 */
/* renamed from: yg.s */
/* loaded from: combined.jar:classes2.jar:yg/s.class */
public class C10013s implements InterfaceC10004j {

    /* renamed from: a */
    public final C8741q f45882a;

    public C10013s(Context context) {
        this(C10001g0.m42042f(context));
    }

    public C10013s(File file) {
        this(file, C10001g0.m42037a(file));
    }

    public C10013s(File file, long j10) {
        this(m42103b());
        try {
            this.f45882a.m37416F(new C8727c(file, j10));
        } catch (IOException e10) {
        }
    }

    public C10013s(C8741q c8741q) {
        this.f45882a = c8741q;
    }

    /* renamed from: b */
    public static C8741q m42103b() {
        C8741q c8741q = new C8741q();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c8741q.m37417G(15000L, timeUnit);
        c8741q.m37418H(20000L, timeUnit);
        c8741q.m37419I(20000L, timeUnit);
        return c8741q;
    }

    @Override // p428yg.InterfaceC10004j
    /* renamed from: a */
    public InterfaceC10004j.a mo42032a(Uri uri, int i10) {
        C8728d c8728d;
        if (i10 == 0) {
            c8728d = null;
        } else if (EnumC10011q.isOfflineOnly(i10)) {
            c8728d = C8728d.f40577l;
        } else {
            C8728d.b bVar = new C8728d.b();
            if (!EnumC10011q.shouldReadFromDiskCache(i10)) {
                bVar.m37328c();
            }
            if (!EnumC10011q.shouldWriteToDiskCache(i10)) {
                bVar.m37329d();
            }
            c8728d = bVar.m37326a();
        }
        C8743s.b m37481n = new C8743s.b().m37481n(uri.toString());
        if (c8728d != null) {
            m37481n.m37476i(c8728d);
        }
        C8745u m37331a = this.f45882a.m37414D(m37481n.m37475h()).m37331a();
        int m37501o = m37331a.m37501o();
        if (m37501o < 300) {
            boolean z10 = m37331a.m37499m() != null;
            AbstractC8746v m37497k = m37331a.m37497k();
            return new InterfaceC10004j.a(m37497k.m37538f(), z10, m37497k.mo37310l());
        }
        m37331a.m37497k().close();
        throw new InterfaceC10004j.b(m37501o + " " + m37331a.m37507u(), i10, m37501o);
    }
}
