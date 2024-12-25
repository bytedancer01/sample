package p261p0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p0/a.class
 */
/* renamed from: p0.a */
/* loaded from: combined.jar:classes1.jar:p0/a.class */
public final class C7525a extends ClickableSpan {

    /* renamed from: b */
    public final int f36316b;

    /* renamed from: c */
    public final C7535k f36317c;

    /* renamed from: d */
    public final int f36318d;

    public C7525a(int i10, C7535k c7535k, int i11) {
        this.f36316b = i10;
        this.f36317c = c7535k;
        this.f36318d = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f36316b);
        this.f36317c.m32189N(this.f36318d, bundle);
    }
}
