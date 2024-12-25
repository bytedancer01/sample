package p067di;

import gi.C5013a;
import gi.C5014b;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p172jh.C5390i;
import p233nh.C6791f;
import p233nh.InterfaceC6789d;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/g0.class
 */
/* renamed from: di.g0 */
/* loaded from: combined.jar:classes2.jar:di/g0.class */
public enum EnumC4477g0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/g0$a.class
     */
    /* renamed from: di.g0$a */
    /* loaded from: combined.jar:classes2.jar:di/g0$a.class */
    public final /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f26885a;

        static {
            int[] iArr = new int[EnumC4477g0.valuesCustom().length];
            iArr[EnumC4477g0.DEFAULT.ordinal()] = 1;
            iArr[EnumC4477g0.ATOMIC.ordinal()] = 2;
            iArr[EnumC4477g0.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC4477g0.LAZY.ordinal()] = 4;
            f26885a = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4477g0[] valuesCustom() {
        EnumC4477g0[] valuesCustom = values();
        return (EnumC4477g0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final <T> void invoke(@NotNull InterfaceC9196l<? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9196l, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        int i10 = a.f26885a[ordinal()];
        if (i10 == 1) {
            C5013a.m25215b(interfaceC9196l, interfaceC6789d);
            return;
        }
        if (i10 == 2) {
            C6791f.m31302a(interfaceC9196l, interfaceC6789d);
        } else if (i10 == 3) {
            C5014b.m25218a(interfaceC9196l, interfaceC6789d);
        } else if (i10 != 4) {
            throw new C5390i();
        }
    }

    public final <R, T> void invoke(@NotNull InterfaceC9200p<? super R, ? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9200p, R r10, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        int i10 = a.f26885a[ordinal()];
        if (i10 == 1) {
            C5013a.m25217d(interfaceC9200p, r10, interfaceC6789d, null, 4, null);
            return;
        }
        if (i10 == 2) {
            C6791f.m31303b(interfaceC9200p, r10, interfaceC6789d);
        } else if (i10 == 3) {
            C5014b.m25219b(interfaceC9200p, r10, interfaceC6789d);
        } else if (i10 != 4) {
            throw new C5390i();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
