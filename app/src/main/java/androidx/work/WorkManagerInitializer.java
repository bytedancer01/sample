package androidx.work;

import android.content.Context;
import androidx.work.C0756a;
import java.util.Collections;
import java.util.List;
import p071e2.AbstractC4582k;
import p071e2.AbstractC4592u;
import p414y1.InterfaceC9801b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/WorkManagerInitializer.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/WorkManagerInitializer.class */
public final class WorkManagerInitializer implements InterfaceC9801b<AbstractC4592u> {

    /* renamed from: a */
    public static final String f5143a = AbstractC4582k.m23128f("WrkMgrInitializer");

    @Override // p414y1.InterfaceC9801b
    /* renamed from: a */
    public List<Class<? extends InterfaceC9801b<?>>> mo4839a() {
        return Collections.emptyList();
    }

    @Override // p414y1.InterfaceC9801b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC4592u mo4840b(Context context) {
        AbstractC4582k.m23126c().mo23129a(f5143a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        AbstractC4592u.m23143g(context, new C0756a.b().m4862a());
        return AbstractC4592u.m23142f(context);
    }
}
