package p205lh;

import com.journeyapps.barcodescanner.C2582b;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lh/b.class
 */
/* renamed from: lh.b */
/* loaded from: combined.jar:classes2.jar:lh/b.class */
public final class C5880b implements Comparator<Comparable<? super Object>> {

    /* renamed from: b */
    @NotNull
    public static final C5880b f32958b = new C5880b();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        C9367f.m39526e(comparable, "a");
        C9367f.m39526e(comparable2, C2582b.f15902o);
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C5881c.f32959b;
    }
}
