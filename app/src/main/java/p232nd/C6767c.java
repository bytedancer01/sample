package p232nd;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import md.C6564e;
import md.C6569j;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5565r;
import p188kd.InterfaceC5570w;
import p248od.C6968a;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/c.class
 */
/* renamed from: nd.c */
/* loaded from: combined.jar:classes2.jar:nd/c.class */
public final class C6767c extends AbstractC5569v<Date> {

    /* renamed from: b */
    public static final InterfaceC5570w f35251b = new a();

    /* renamed from: a */
    public final List<DateFormat> f35252a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/c$a.class
     */
    /* renamed from: nd.c$a */
    /* loaded from: combined.jar:classes2.jar:nd/c$a.class */
    public class a implements InterfaceC5570w {
        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            return c8462a.m36351c() == Date.class ? new C6767c() : null;
        }
    }

    public C6767c() {
        ArrayList arrayList = new ArrayList();
        this.f35252a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C6564e.m30311e()) {
            arrayList.add(C6569j.m30331c(2, 2));
        }
    }

    /* renamed from: e */
    public final Date m31094e(String str) {
        synchronized (this) {
            Iterator<DateFormat> it = this.f35252a.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException e10) {
                }
            }
            try {
                return C6968a.m31968c(str, new ParsePosition(0));
            } catch (ParseException e11) {
                throw new C5565r(str, e11);
            }
        }
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date mo27561b(C8555a c8555a) {
        if (c8555a.mo31105J0() != EnumC8556b.NULL) {
            return m31094e(c8555a.mo31104H0());
        }
        c8555a.mo31103F0();
        return null;
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo27562d(C8557c c8557c, Date date) {
        synchronized (this) {
            if (date == null) {
                c8557c.mo31133v0();
            } else {
                c8557c.mo31123N0(this.f35252a.get(0).format(date));
            }
        }
    }
}
