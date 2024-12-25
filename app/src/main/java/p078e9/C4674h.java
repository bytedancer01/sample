package p078e9;

import android.view.Surface;
import p268p7.C7652m;
import p268p7.C7653n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/h.class
 */
/* renamed from: e9.h */
/* loaded from: combined.jar:classes2.jar:e9/h.class */
public class C4674h extends C7652m {

    /* renamed from: d */
    public final int f27590d;

    /* renamed from: e */
    public final boolean f27591e;

    public C4674h(Throwable th2, C7653n c7653n, Surface surface) {
        super(th2, c7653n);
        this.f27590d = System.identityHashCode(surface);
        this.f27591e = surface == null || surface.isValid();
    }
}
