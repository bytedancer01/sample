package p396x3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x3/d.class
 */
/* renamed from: x3.d */
/* loaded from: combined.jar:classes1.jar:x3/d.class */
public class C9647d<T> implements InterfaceC9650g<T> {

    /* renamed from: a */
    public final Collection<? extends InterfaceC9650g<T>> f44029a;

    /* renamed from: b */
    public String f44030b;

    @SafeVarargs
    public C9647d(InterfaceC9650g<T>... interfaceC9650gArr) {
        if (interfaceC9650gArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f44029a = Arrays.asList(interfaceC9650gArr);
    }

    @Override // p396x3.InterfaceC9650g
    /* renamed from: a */
    public InterfaceC10048l<T> mo25234a(InterfaceC10048l<T> interfaceC10048l, int i10, int i11) {
        Iterator<? extends InterfaceC9650g<T>> it = this.f44029a.iterator();
        InterfaceC10048l<T> interfaceC10048l2 = interfaceC10048l;
        while (true) {
            InterfaceC10048l<T> interfaceC10048l3 = interfaceC10048l2;
            if (!it.hasNext()) {
                return interfaceC10048l3;
            }
            InterfaceC10048l<T> mo25234a = it.next().mo25234a(interfaceC10048l3, i10, i11);
            if (interfaceC10048l3 != null && !interfaceC10048l3.equals(interfaceC10048l) && !interfaceC10048l3.equals(mo25234a)) {
                interfaceC10048l3.mo25232b();
            }
            interfaceC10048l2 = mo25234a;
        }
    }

    @Override // p396x3.InterfaceC9650g
    public String getId() {
        if (this.f44030b == null) {
            StringBuilder sb2 = new StringBuilder();
            Iterator<? extends InterfaceC9650g<T>> it = this.f44029a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getId());
            }
            this.f44030b = sb2.toString();
        }
        return this.f44030b;
    }
}
