package p238o3;

import java.io.Closeable;
import java.io.Flushable;
import p317s3.C8523a;
import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o3/g.class
 */
/* renamed from: o3.g */
/* loaded from: combined.jar:classes1.jar:o3/g.class */
public abstract class AbstractC6890g implements Closeable, Flushable {

    /* renamed from: b */
    public int f35703b = 0;

    /* renamed from: c */
    public final int[] f35704c = new int[32];

    /* renamed from: d */
    public final String[] f35705d = new String[32];

    /* renamed from: e */
    public final int[] f35706e = new int[32];

    /* renamed from: f */
    public String f35707f;

    /* renamed from: g */
    public boolean f35708g;

    /* renamed from: h */
    public boolean f35709h;

    /* renamed from: i */
    public boolean f35710i;

    /* renamed from: v */
    public static AbstractC6890g m31770v(InterfaceC9762f interfaceC9762f) {
        return new C6889f(interfaceC9762f);
    }

    /* renamed from: A0 */
    public abstract AbstractC6890g mo31755A0(boolean z10);

    /* renamed from: B */
    public final void m31771B(int i10) {
        this.f35704c[this.f35703b - 1] = i10;
    }

    /* renamed from: f */
    public abstract AbstractC6890g mo31762f();

    public final String getPath() {
        return C6888e.m31753a(this.f35703b, this.f35704c, this.f35705d, this.f35706e);
    }

    /* renamed from: l */
    public abstract AbstractC6890g mo31763l();

    /* renamed from: o */
    public abstract AbstractC6890g mo31764o();

    /* renamed from: o0 */
    public final void m31772o0(boolean z10) {
        this.f35709h = z10;
    }

    /* renamed from: p */
    public abstract AbstractC6890g mo31765p();

    /* renamed from: q */
    public abstract AbstractC6890g mo31766q(String str);

    /* renamed from: q0 */
    public abstract AbstractC6890g mo31767q0(Number number);

    /* renamed from: t */
    public abstract AbstractC6890g mo31768t();

    /* renamed from: v0 */
    public abstract AbstractC6890g mo31769v0(String str);

    /* renamed from: w */
    public final int m31773w() {
        int i10 = this.f35703b;
        if (i10 != 0) {
            return this.f35704c[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: y */
    public final void m31774y(int i10) {
        int i11 = this.f35703b;
        int[] iArr = this.f35704c;
        if (i11 != iArr.length) {
            this.f35703b = i11 + 1;
            iArr[i11] = i10;
        } else {
            throw new C8523a("Nesting too deep at " + getPath() + ": circular reference?");
        }
    }
}
