package p354ue;

import android.graphics.Rect;
import java.util.List;
import p338te.C8721s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/m.class
 */
/* renamed from: ue.m */
/* loaded from: combined.jar:classes2.jar:ue/m.class */
public class C9168m {

    /* renamed from: a */
    public C8721s f41935a;

    /* renamed from: b */
    public int f41936b;

    /* renamed from: c */
    public boolean f41937c = false;

    /* renamed from: d */
    public AbstractC9172q f41938d = new C9169n();

    public C9168m(int i10, C8721s c8721s) {
        this.f41936b = i10;
        this.f41935a = c8721s;
    }

    /* renamed from: a */
    public C8721s m38598a(List<C8721s> list, boolean z10) {
        return this.f41938d.m38605b(list, m38599b(z10));
    }

    /* renamed from: b */
    public C8721s m38599b(boolean z10) {
        C8721s c8721s = this.f41935a;
        if (c8721s == null) {
            return null;
        }
        return z10 ? c8721s.m37265d() : c8721s;
    }

    /* renamed from: c */
    public int m38600c() {
        return this.f41936b;
    }

    /* renamed from: d */
    public Rect m38601d(C8721s c8721s) {
        return this.f41938d.mo38597d(c8721s, this.f41935a);
    }

    /* renamed from: e */
    public void m38602e(AbstractC9172q abstractC9172q) {
        this.f41938d = abstractC9172q;
    }
}
