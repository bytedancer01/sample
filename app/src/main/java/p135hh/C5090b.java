package p135hh;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/b.class
 */
/* renamed from: hh.b */
/* loaded from: combined.jar:classes2.jar:hh/b.class */
public final /* synthetic */ class C5090b {
    /* renamed from: a */
    public static /* synthetic */ String m25400a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
