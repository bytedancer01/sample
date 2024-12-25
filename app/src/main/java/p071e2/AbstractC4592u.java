package p071e2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0756a;
import java.util.Collections;
import java.util.List;
import p089f2.C4759i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/u.class
 */
@SuppressLint({"AddedAbstractMethod"})
/* renamed from: e2.u */
/* loaded from: combined.jar:classes1.jar:e2/u.class */
public abstract class AbstractC4592u {
    /* renamed from: f */
    public static AbstractC4592u m23142f(Context context) {
        return C4759i.m24111m(context);
    }

    /* renamed from: g */
    public static void m23143g(Context context, C0756a c0756a) {
        C4759i.m24109g(context, c0756a);
    }

    /* renamed from: a */
    public abstract InterfaceC4585n mo23144a(String str);

    /* renamed from: b */
    public final InterfaceC4585n m23145b(AbstractC4593v abstractC4593v) {
        return mo23146c(Collections.singletonList(abstractC4593v));
    }

    /* renamed from: c */
    public abstract InterfaceC4585n mo23146c(List<? extends AbstractC4593v> list);

    /* renamed from: d */
    public InterfaceC4585n m23147d(String str, EnumC4575d enumC4575d, C4584m c4584m) {
        return mo23148e(str, enumC4575d, Collections.singletonList(c4584m));
    }

    /* renamed from: e */
    public abstract InterfaceC4585n mo23148e(String str, EnumC4575d enumC4575d, List<C4584m> list);
}
