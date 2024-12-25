package p327t1;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p327t1.AbstractC8597e;
import p375w1.InterfaceC9398c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/a.class
 */
/* renamed from: t1.a */
/* loaded from: combined.jar:classes1.jar:t1/a.class */
public class C8593a {

    /* renamed from: a */
    public final InterfaceC9398c.c f40060a;

    /* renamed from: b */
    public final Context f40061b;

    /* renamed from: c */
    public final String f40062c;

    /* renamed from: d */
    public final AbstractC8597e.d f40063d;

    /* renamed from: e */
    public final List<AbstractC8597e.b> f40064e;

    /* renamed from: f */
    public final boolean f40065f;

    /* renamed from: g */
    public final AbstractC8597e.c f40066g;

    /* renamed from: h */
    public final Executor f40067h;

    /* renamed from: i */
    public final Executor f40068i;

    /* renamed from: j */
    public final boolean f40069j;

    /* renamed from: k */
    public final boolean f40070k;

    /* renamed from: l */
    public final boolean f40071l;

    /* renamed from: m */
    public final Set<Integer> f40072m;

    /* renamed from: n */
    public final String f40073n;

    /* renamed from: o */
    public final File f40074o;

    public C8593a(Context context, String str, InterfaceC9398c.c cVar, AbstractC8597e.d dVar, List<AbstractC8597e.b> list, boolean z10, AbstractC8597e.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f40060a = cVar;
        this.f40061b = context;
        this.f40062c = str;
        this.f40063d = dVar;
        this.f40064e = list;
        this.f40065f = z10;
        this.f40066g = cVar2;
        this.f40067h = executor;
        this.f40068i = executor2;
        this.f40069j = z11;
        this.f40070k = z12;
        this.f40071l = z13;
        this.f40072m = set;
        this.f40073n = str2;
        this.f40074o = file;
    }

    /* renamed from: a */
    public boolean m36890a(int i10, int i11) {
        boolean z10;
        if ((i10 > i11) && this.f40071l) {
            return false;
        }
        if (this.f40070k) {
            Set<Integer> set = this.f40072m;
            z10 = true;
            if (set != null) {
                if (!set.contains(Integer.valueOf(i10))) {
                    z10 = true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }
}
