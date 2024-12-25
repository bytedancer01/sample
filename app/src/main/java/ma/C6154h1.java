package ma;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import p216m9.C5947e;
import p216m9.C5980p;
import p230n9.C6721i;
import p270p9.AbstractC7670a;
import p270p9.C7672c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/h1.class
 */
/* renamed from: ma.h1 */
/* loaded from: combined.jar:classes2.jar:ma/h1.class */
public final class C6154h1 extends AbstractC7670a implements C6721i.e {

    /* renamed from: b */
    public final TextView f33793b;

    /* renamed from: c */
    public final C7672c f33794c;

    public C6154h1(TextView textView, C7672c c7672c) {
        this.f33793b = textView;
        this.f33794c = c7672c;
        textView.setText(textView.getContext().getString(C5980p.f33560l));
    }

    @Override // p230n9.C6721i.e
    /* renamed from: a */
    public final void mo29582a(long j10, long j11) {
        m29656g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29656g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30999c(this, 1000L);
        }
        m29656g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30988O(this);
        }
        super.mo29378f();
        m29656g();
    }

    /* renamed from: g */
    public final void m29656g() {
        TextView textView;
        String string;
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p()) {
            textView = this.f33793b;
            string = textView.getContext().getString(C5980p.f33560l);
        } else {
            long m31006g = mo29823b.m31006g();
            long j10 = m31006g;
            if (m31006g == MediaInfo.f14651w) {
                j10 = mo29823b.m31018o();
            }
            textView = this.f33793b;
            string = this.f33794c.m33618l(j10);
        }
        textView.setText(string);
    }
}
