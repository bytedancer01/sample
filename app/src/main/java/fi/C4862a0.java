package fi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.InterfaceC4514s1;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/a0.class
 */
/* renamed from: fi.a0 */
/* loaded from: combined.jar:classes2.jar:fi/a0.class */
public final class C4862a0 {

    /* renamed from: a */
    @NotNull
    public final InterfaceC6792g f28543a;

    /* renamed from: b */
    @NotNull
    public final Object[] f28544b;

    /* renamed from: c */
    @NotNull
    public final InterfaceC4514s1<Object>[] f28545c;

    /* renamed from: d */
    public int f28546d;

    public C4862a0(@NotNull InterfaceC6792g interfaceC6792g, int i10) {
        this.f28543a = interfaceC6792g;
        this.f28544b = new Object[i10];
        this.f28545c = new InterfaceC4514s1[i10];
    }

    /* renamed from: a */
    public final void m24736a(@NotNull InterfaceC4514s1<?> interfaceC4514s1, @Nullable Object obj) {
        Object[] objArr = this.f28544b;
        int i10 = this.f28546d;
        objArr[i10] = obj;
        InterfaceC4514s1<Object>[] interfaceC4514s1Arr = this.f28545c;
        this.f28546d = i10 + 1;
        interfaceC4514s1Arr[i10] = interfaceC4514s1;
    }

    /* renamed from: b */
    public final void m24737b(@NotNull InterfaceC6792g interfaceC6792g) {
        int length = this.f28545c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            InterfaceC4514s1<Object> interfaceC4514s1 = this.f28545c[length];
            C9367f.m39524c(interfaceC4514s1);
            interfaceC4514s1.m22832q(interfaceC6792g, this.f28544b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
