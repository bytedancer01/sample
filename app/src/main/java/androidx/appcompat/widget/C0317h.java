package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import p106g0.C4917c;
import p314s0.C8496d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/h.class
 */
/* renamed from: androidx.appcompat.widget.h */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h.class */
public class C0317h {

    /* renamed from: a */
    public final CompoundButton f2086a;

    /* renamed from: b */
    public ColorStateList f2087b = null;

    /* renamed from: c */
    public PorterDuff.Mode f2088c = null;

    /* renamed from: d */
    public boolean f2089d = false;

    /* renamed from: e */
    public boolean f2090e = false;

    /* renamed from: f */
    public boolean f2091f;

    public C0317h(CompoundButton compoundButton) {
        this.f2086a = compoundButton;
    }

    /* renamed from: a */
    public void m1376a() {
        Drawable m36685a = C8496d.m36685a(this.f2086a);
        if (m36685a != null) {
            if (this.f2089d || this.f2090e) {
                Drawable mutate = C4917c.m24854r(m36685a).mutate();
                if (this.f2089d) {
                    C4917c.m24851o(mutate, this.f2087b);
                }
                if (this.f2090e) {
                    C4917c.m24852p(mutate, this.f2088c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f2086a.getDrawableState());
                }
                this.f2086a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m1377b(int i10) {
        return i10;
    }

    /* renamed from: c */
    public ColorStateList m1378c() {
        return this.f2087b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m1379d() {
        return this.f2088c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[Catch: all -> 0x00c6, TRY_ENTER, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0030, B:5:0x003c, B:8:0x0047, B:12:0x0064, B:14:0x0070, B:16:0x007b, B:17:0x008c, B:17:0x008c, B:18:0x008f, B:20:0x0098, B:21:0x00a4, B:21:0x00a4, B:22:0x00a7, B:24:0x00b0), top: B:2:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0030, B:5:0x003c, B:8:0x0047, B:12:0x0064, B:14:0x0070, B:16:0x007b, B:17:0x008c, B:17:0x008c, B:18:0x008f, B:20:0x0098, B:21:0x00a4, B:21:0x00a4, B:22:0x00a7, B:24:0x00b0), top: B:2:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:3:0x0030, B:5:0x003c, B:8:0x0047, B:12:0x0064, B:14:0x0070, B:16:0x007b, B:17:0x008c, B:17:0x008c, B:18:0x008f, B:20:0x0098, B:21:0x00a4, B:21:0x00a4, B:22:0x00a7, B:24:0x00b0), top: B:2:0x0030 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1380e(android.util.AttributeSet r9, int r10) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0317h.m1380e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void m1381f() {
        if (this.f2091f) {
            this.f2091f = false;
        } else {
            this.f2091f = true;
            m1376a();
        }
    }

    /* renamed from: g */
    public void m1382g(ColorStateList colorStateList) {
        this.f2087b = colorStateList;
        this.f2089d = true;
        m1376a();
    }

    /* renamed from: h */
    public void m1383h(PorterDuff.Mode mode) {
        this.f2088c = mode;
        this.f2090e = true;
        m1376a();
    }
}
