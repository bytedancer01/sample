package androidx.work;

import androidx.work.C0757b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p071e2.AbstractC4579h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/OverwritingInputMerger.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/OverwritingInputMerger.class */
public final class OverwritingInputMerger extends AbstractC4579h {
    @Override // p071e2.AbstractC4579h
    /* renamed from: b */
    public C0757b mo4802b(List<C0757b> list) {
        C0757b.a aVar = new C0757b.a();
        HashMap hashMap = new HashMap();
        Iterator<C0757b> it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().m4874j());
        }
        aVar.m4881d(hashMap);
        return aVar.m4878a();
    }
}
