package p305ra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p305ra.AbstractC8334s4;
import p305ra.AbstractC8349t4;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t4.class
 */
/* renamed from: ra.t4 */
/* loaded from: combined.jar:classes2.jar:ra/t4.class */
public abstract class AbstractC8349t4<MessageType extends AbstractC8349t4<MessageType, BuilderType>, BuilderType extends AbstractC8334s4<MessageType, BuilderType>> implements InterfaceC8307q7 {
    public int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static <T> void m35810j(Iterable<T> iterable, List<? super T> list) {
        C8366u6.m35902a(iterable);
        if (iterable instanceof InterfaceC8067a7) {
            List<?> mo35001p = ((InterfaceC8067a7) iterable).mo35001p();
            InterfaceC8067a7 interfaceC8067a7 = (InterfaceC8067a7) list;
            int size = list.size();
            for (Object obj : mo35001p) {
                if (obj == null) {
                    int size2 = interfaceC8067a7.size();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2 - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size3 = interfaceC8067a7.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(sb3);
                        }
                        interfaceC8067a7.remove(size3);
                    }
                } else if (obj instanceof AbstractC8230l5) {
                    interfaceC8067a7.mo35002r((AbstractC8230l5) obj);
                } else {
                    interfaceC8067a7.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC8427y7) {
            list.addAll(iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size4 = list.size();
        for (T t10 : iterable) {
            if (t10 == null) {
                int size5 = list.size();
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("Element at index ");
                sb4.append(size5 - size4);
                sb4.append(" is null.");
                String sb5 = sb4.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(sb5);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(t10);
            }
        }
    }

    @Override // p305ra.InterfaceC8307q7
    /* renamed from: c */
    public final AbstractC8230l5 mo35732c() {
        try {
            C8170h5 m35571x = AbstractC8230l5.m35571x(mo35586g());
            mo35585e(m35571x.m35415b());
            return m35571x.m35414a();
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("ByteString");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* renamed from: f */
    public final byte[] m35811f() {
        try {
            byte[] bArr = new byte[mo35586g()];
            AbstractC8350t5 m35824z = AbstractC8350t5.m35824z(bArr);
            mo35585e(m35824z);
            m35824z.m35825e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("byte array");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* renamed from: h */
    public int mo35587h() {
        throw null;
    }

    /* renamed from: i */
    public void mo35588i(int i10) {
        throw null;
    }
}
