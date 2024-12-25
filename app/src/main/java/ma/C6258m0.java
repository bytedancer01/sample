package ma;

import android.content.Context;
import android.view.View;
import p216m9.C5947e;
import p216m9.C5980p;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/m0.class
 */
/* renamed from: ma.m0 */
/* loaded from: combined.jar:classes2.jar:ma/m0.class */
public final class C6258m0 extends AbstractC7670a {

    /* renamed from: b */
    public final View f33879b;

    /* renamed from: c */
    public final String f33880c;

    /* renamed from: d */
    public final String f33881d;

    public C6258m0(View view, Context context) {
        this.f33879b = view;
        this.f33880c = context.getString(C5980p.f33551c);
        this.f33881d = context.getString(C5980p.f33552d);
        view.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29842g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        this.f33879b.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        this.f33879b.setEnabled(true);
        m29842g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f33879b.setEnabled(false);
        super.mo29378f();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29842g() {
        /*
            r3 = this;
            r0 = r3
            n9.i r0 = r0.mo29823b()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L96
            r0 = r6
            boolean r0 = r0.m31020p()
            if (r0 == 0) goto L96
            r0 = r6
            com.google.android.gms.cast.MediaInfo r0 = r0.m31009j()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1e
            goto L96
        L1e:
            r0 = r7
            java.util.List r0 = r0.m13064X()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L96
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L96
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
            r0 = 0
            r4 = r0
        L3f:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L96
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.google.android.gms.cast.MediaTrack r0 = (com.google.android.gms.cast.MediaTrack) r0
            r7 = r0
            r0 = r7
            int r0 = r0.m13087W()
            r1 = 2
            if (r0 != r1) goto L6c
            r0 = r4
            r1 = 1
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = 1
            if (r0 <= r1) goto L3f
            goto L75
        L6c:
            r0 = r7
            int r0 = r0.m13087W()
            r1 = 1
            if (r0 != r1) goto L3f
        L75:
            r0 = r6
            boolean r0 = r0.m31030v()
            if (r0 != 0) goto L96
            r0 = r3
            android.view.View r0 = r0.f33879b
            r1 = 1
            r0.setEnabled(r1)
            r0 = r3
            android.view.View r0 = r0.f33879b
            r6 = r0
            r0 = r3
            java.lang.String r0 = r0.f33880c
            r7 = r0
        L8f:
            r0 = r6
            r1 = r7
            r0.setContentDescription(r1)
            return
        L96:
            r0 = r3
            android.view.View r0 = r0.f33879b
            r1 = 0
            r0.setEnabled(r1)
            r0 = r3
            android.view.View r0 = r0.f33879b
            r6 = r0
            r0 = r3
            java.lang.String r0 = r0.f33881d
            r7 = r0
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6258m0.m29842g():void");
    }
}
