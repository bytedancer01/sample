package p312ri;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/n.class
 */
/* renamed from: ri.n */
/* loaded from: combined.jar:classes2.jar:ri/n.class */
public final class C8488n extends IOException {

    /* renamed from: b */
    @NotNull
    public final EnumC8476b f39792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8488n(@NotNull EnumC8476b enumC8476b) {
        super("stream was reset: " + enumC8476b);
        C9367f.m39526e(enumC8476b, "errorCode");
        this.f39792b = enumC8476b;
    }
}
