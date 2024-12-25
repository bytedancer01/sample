package ma;

import org.apache.commons.net.nntp.NNTPReply;
import p200l9.C5800r;
import p216m9.AbstractC5997w;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/m6.class
 */
/* renamed from: ma.m6 */
/* loaded from: combined.jar:classes2.jar:ma/m6.class */
public final class C6264m6 extends AbstractC5997w {

    /* renamed from: a */
    public final C6286n7 f33887a;

    public C6264m6(C6286n7 c6286n7) {
        this.f33887a = c6286n7;
    }

    @Override // p216m9.AbstractC5997w
    /* renamed from: a */
    public final void mo29367a(int i10, int i11) {
        C8015b c8015b;
        C6330p9 c6330p9;
        C6308o8 c6308o8;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i10), Integer.valueOf(i11));
        this.f33887a.m29891u();
        C6286n7 c6286n7 = this.f33887a;
        c6330p9 = c6286n7.f33906b;
        c6308o8 = c6286n7.f33911g;
        C6142ga m29958f = c6330p9.m29958f(c6308o8, i10, i11);
        c6176i2 = this.f33887a.f33905a;
        c6176i2.m29670d(m29958f, 232);
        this.f33887a.f33914j = false;
    }

    @Override // p216m9.AbstractC5997w
    /* renamed from: b */
    public final void mo29368b(int i10, C5800r c5800r) {
        C8015b c8015b;
        C6330p9 c6330p9;
        C6308o8 c6308o8;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onTransferred with type = %d", Integer.valueOf(i10));
        this.f33887a.m29891u();
        C6286n7 c6286n7 = this.f33887a;
        c6330p9 = c6286n7.f33906b;
        c6308o8 = c6286n7.f33911g;
        C6142ga m29959g = c6330p9.m29959g(c6308o8, i10);
        c6176i2 = this.f33887a.f33905a;
        c6176i2.m29670d(m29959g, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS);
        this.f33887a.f33914j = false;
        this.f33887a.f33911g = null;
    }

    @Override // p216m9.AbstractC5997w
    /* renamed from: c */
    public final void mo29369c(int i10) {
        C8015b c8015b;
        C6330p9 c6330p9;
        C6308o8 c6308o8;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onTransferring with type = %d", Integer.valueOf(i10));
        this.f33887a.f33914j = true;
        this.f33887a.m29891u();
        C6286n7 c6286n7 = this.f33887a;
        c6330p9 = c6286n7.f33906b;
        c6308o8 = c6286n7.f33911g;
        C6142ga m29959g = c6330p9.m29959g(c6308o8, i10);
        c6176i2 = this.f33887a.f33905a;
        c6176i2.m29670d(m29959g, 230);
    }
}
