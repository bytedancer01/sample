package p287qc;

import java.util.Arrays;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/r.class
 */
/* renamed from: qc.r */
/* loaded from: combined.jar:classes2.jar:qc/r.class */
public class C7897r extends C7898s {

    /* renamed from: b */
    public final List<C7882d<?>> f38018b;

    public C7897r(List<C7882d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f38018b = list;
    }
}
