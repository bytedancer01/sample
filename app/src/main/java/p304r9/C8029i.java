package p304r9;

import android.os.IBinder;
import android.os.Parcel;
import ma.C6005a;
import ma.C6363r0;
import p200l9.C5770h;
import p200l9.C5819x0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/i.class
 */
/* renamed from: r9.i */
/* loaded from: combined.jar:classes2.jar:r9/i.class */
public final class C8029i extends C6005a {
    public C8029i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    /* renamed from: C1 */
    public final void m34892C1() {
        m29371B1(17, m29373Z());
    }

    /* renamed from: D1 */
    public final void m34893D1(String str, String str2, C5819x0 c5819x0) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29373Z.writeString(str2);
        C6363r0.m29990c(m29373Z, c5819x0);
        m29371B1(14, m29373Z);
    }

    /* renamed from: E1 */
    public final void m34894E1(String str, C5770h c5770h) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        C6363r0.m29990c(m29373Z, c5770h);
        m29371B1(13, m29373Z);
    }

    /* renamed from: F1 */
    public final void m34895F1(InterfaceC8033k interfaceC8033k) {
        Parcel m29373Z = m29373Z();
        C6363r0.m29992e(m29373Z, interfaceC8033k);
        m29371B1(18, m29373Z);
    }

    /* renamed from: G1 */
    public final void m34896G1(String str) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29371B1(11, m29373Z);
    }

    /* renamed from: H1 */
    public final void m34897H1(String str, String str2, long j10) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29373Z.writeString(str2);
        m29373Z.writeLong(j10);
        m29371B1(9, m29373Z);
    }

    /* renamed from: I1 */
    public final void m34898I1(boolean z10, double d10, boolean z11) {
        Parcel m29373Z = m29373Z();
        ClassLoader classLoader = C6363r0.f33991a;
        m29373Z.writeInt(z10 ? 1 : 0);
        m29373Z.writeDouble(d10);
        m29373Z.writeInt(z11 ? 1 : 0);
        m29371B1(8, m29373Z);
    }

    /* renamed from: J1 */
    public final void m34899J1(String str) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29371B1(5, m29373Z);
    }

    /* renamed from: K1 */
    public final void m34900K1() {
        m29371B1(19, m29373Z());
    }

    /* renamed from: L1 */
    public final void m34901L1(String str) {
        Parcel m29373Z = m29373Z();
        m29373Z.writeString(str);
        m29371B1(12, m29373Z);
    }

    /* renamed from: d */
    public final void m34902d() {
        m29371B1(1, m29373Z());
    }
}
