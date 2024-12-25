package p285q9;

import android.widget.TextView;
import p216m9.C5980p;
import p230n9.C6721i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/q.class
 */
/* renamed from: q9.q */
/* loaded from: combined.jar:classes2.jar:q9/q.class */
public final class C7866q implements C6721i.b {

    /* renamed from: a */
    public final AbstractActivityC7850a f37937a;

    public /* synthetic */ C7866q(AbstractActivityC7850a abstractActivityC7850a, C7865p c7865p) {
        this.f37937a = abstractActivityC7850a;
    }

    @Override // p230n9.C6721i.b
    /* renamed from: c */
    public final void mo23745c() {
        this.f37937a.m34137G0();
    }

    @Override // p230n9.C6721i.b
    /* renamed from: g */
    public final void mo23746g() {
        this.f37937a.m34136F0();
    }

    @Override // p230n9.C6721i.b
    /* renamed from: h */
    public final void mo23747h() {
    }

    @Override // p230n9.C6721i.b
    /* renamed from: i */
    public final void mo23748i() {
        TextView textView;
        AbstractActivityC7850a abstractActivityC7850a = this.f37937a;
        textView = abstractActivityC7850a.f37914x;
        textView.setText(abstractActivityC7850a.getResources().getString(C5980p.f33555g));
    }

    @Override // p230n9.C6721i.b
    /* renamed from: k */
    public final void mo23749k() {
    }

    @Override // p230n9.C6721i.b
    /* renamed from: m */
    public final void mo23750m() {
        C6721i m34131A0;
        m34131A0 = this.f37937a.m34131A0();
        if (m34131A0 == null || !m34131A0.m31020p()) {
            AbstractActivityC7850a abstractActivityC7850a = this.f37937a;
            if (abstractActivityC7850a.f37890P) {
                return;
            }
            abstractActivityC7850a.finish();
            return;
        }
        AbstractActivityC7850a abstractActivityC7850a2 = this.f37937a;
        abstractActivityC7850a2.f37890P = false;
        abstractActivityC7850a2.m34135E0();
        this.f37937a.m34137G0();
    }
}
