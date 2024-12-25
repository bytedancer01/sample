package p178k3;

import java.util.Comparator;
import p004a3.C0054h;
import p004a3.InterfaceC0050d;
import p033c3.C0986f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k3/f.class
 */
/* renamed from: k3.f */
/* loaded from: combined.jar:classes1.jar:k3/f.class */
public class C5467f implements InterfaceC5462a {

    /* renamed from: a */
    public final Comparator<String> f31272a = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k3/f$a.class
     */
    /* renamed from: k3.f$a */
    /* loaded from: combined.jar:classes1.jar:k3/f$a.class */
    public class a implements Comparator<String> {

        /* renamed from: b */
        public final C5467f f31273b;

        public a(C5467f c5467f) {
            this.f31273b = c5467f;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    @Override // p178k3.InterfaceC5462a
    /* renamed from: a */
    public String mo27224a(C0054h c0054h, InterfaceC0050d.b bVar) {
        C0986f.m5892c(c0054h, "field == null");
        C0986f.m5892c(bVar, "variables == null");
        throw null;
    }
}
