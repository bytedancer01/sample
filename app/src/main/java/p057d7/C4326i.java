package p057d7;

import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/i.class
 */
/* renamed from: d7.i */
/* loaded from: combined.jar:classes2.jar:d7/i.class */
public final class C4326i {
    @Pure
    /* renamed from: a */
    public static void m21819a(boolean z10, String str) {
        if (!z10) {
            throw C7594k1.m32822a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m21820b(InterfaceC4324g interfaceC4324g, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return interfaceC4324g.mo21800d(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    /* renamed from: c */
    public static int m21821c(InterfaceC4324g interfaceC4324g, byte[] bArr, int i10, int i11) {
        int i12;
        int mo21808n;
        int i13 = 0;
        while (true) {
            i12 = i13;
            if (i12 >= i11 || (mo21808n = interfaceC4324g.mo21808n(bArr, i10 + i12, i11 - i12)) == -1) {
                break;
            }
            i13 = i12 + mo21808n;
        }
        return i12;
    }

    /* renamed from: d */
    public static boolean m21822d(InterfaceC4324g interfaceC4324g, byte[] bArr, int i10, int i11) {
        try {
            interfaceC4324g.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException e10) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m21823e(InterfaceC4324g interfaceC4324g, int i10) {
        try {
            interfaceC4324g.mo21809o(i10);
            return true;
        } catch (EOFException e10) {
            return false;
        }
    }
}
