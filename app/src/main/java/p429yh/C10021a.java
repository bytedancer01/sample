package p429yh;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p410xh.AbstractC9750a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yh/a.class
 */
/* renamed from: yh.a */
/* loaded from: combined.jar:classes2.jar:yh/a.class */
public final class C10021a extends AbstractC9750a {
    @Override // p410xh.AbstractC9750a
    @NotNull
    /* renamed from: c */
    public Random mo41072c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C9367f.m39525d(current, "ThreadLocalRandom.current()");
        return current;
    }
}
