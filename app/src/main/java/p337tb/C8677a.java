package p337tb;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import lb.C5837a;
import p012ab.C0142b;
import p012ab.C0151k;
import p314s0.C8496d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tb/a.class
 */
/* renamed from: tb.a */
/* loaded from: combined.jar:classes2.jar:tb/a.class */
public class C8677a extends AppCompatRadioButton {

    /* renamed from: g */
    public static final int f40451g = C0151k.f836r;

    /* renamed from: h */
    public static final int[][] f40452h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f40453e;

    /* renamed from: f */
    public boolean f40454f;

    public C8677a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0142b.f665y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8677a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r0 = p337tb.C8677a.f40451g
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Context r1 = cc.C1060a.m6267c(r1, r2, r3, r4)
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)
            r0 = r7
            android.content.Context r0 = r0.getContext()
            r8 = r0
            r0 = r8
            r1 = r9
            int[] r2 = p012ab.C0152l.f1153n3
            r3 = r10
            r4 = r11
            r5 = 0
            int[] r5 = new int[r5]
            android.content.res.TypedArray r0 = p306rb.C8458j.m36338h(r0, r1, r2, r3, r4, r5)
            r9 = r0
            int r0 = p012ab.C0152l.f1161o3
            r10 = r0
            r0 = r9
            r1 = r10
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L3d
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            android.content.res.ColorStateList r1 = p351ub.C9148c.m38476a(r1, r2, r3)
            p314s0.C8496d.m36687c(r0, r1)
        L3d:
            r0 = r7
            r1 = r9
            int r2 = p012ab.C0152l.f1169p3
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.f40454f = r1
            r0 = r9
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p337tb.C8677a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f40453e == null) {
            int m28424c = C5837a.m28424c(this, C0142b.f648h);
            int m28424c2 = C5837a.m28424c(this, C0142b.f650j);
            int m28424c3 = C5837a.m28424c(this, C0142b.f653m);
            int[][] iArr = f40452h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C5837a.m28427f(m28424c3, m28424c, 1.0f);
            iArr2[1] = C5837a.m28427f(m28424c3, m28424c2, 0.54f);
            iArr2[2] = C5837a.m28427f(m28424c3, m28424c2, 0.38f);
            iArr2[3] = C5837a.m28427f(m28424c3, m28424c2, 0.38f);
            this.f40453e = new ColorStateList(iArr, iArr2);
        }
        return this.f40453e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40454f && C8496d.m36686b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f40454f = z10;
        C8496d.m36687c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
