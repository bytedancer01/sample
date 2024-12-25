package p410xh;

import java.util.Random;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xh/b.class
 */
/* renamed from: xh.b */
/* loaded from: combined.jar:classes2.jar:xh/b.class */
public final class C9751b extends AbstractC9750a {

    /* renamed from: d */
    @NotNull
    public final a f44497d = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xh/b$a.class
     */
    /* renamed from: xh.b$a */
    /* loaded from: combined.jar:classes2.jar:xh/b$a.class */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p410xh.AbstractC9750a
    @NotNull
    /* renamed from: c */
    public Random mo41072c() {
        Random random = this.f44497d.get();
        C9367f.m39525d(random, "implStorage.get()");
        return random;
    }
}
