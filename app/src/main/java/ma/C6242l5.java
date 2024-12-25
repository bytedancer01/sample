package ma;

import android.content.SharedPreferences;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import p216m9.AbstractC5989s;
import p216m9.C5947e;
import p216m9.InterfaceC5993u;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/l5.class
 */
/* renamed from: ma.l5 */
/* loaded from: combined.jar:classes2.jar:ma/l5.class */
public final class C6242l5 implements InterfaceC5993u {

    /* renamed from: a */
    public final C6286n7 f33873a;

    public C6242l5(C6286n7 c6286n7) {
        this.f33873a = c6286n7;
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14735a(AbstractC5989s abstractC5989s, int i10) {
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        C6286n7.m29883n(this.f33873a, i10);
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: b */
    public final /* synthetic */ void mo14736b(AbstractC5989s abstractC5989s) {
        this.f33873a.f33912h = (C5947e) abstractC5989s;
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14738d(AbstractC5989s abstractC5989s, String str) {
        C8015b c8015b;
        C6308o8 c6308o8;
        C6330p9 c6330p9;
        C6308o8 c6308o82;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onSessionStarted with sessionId = %s", str);
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        this.f33873a.m29891u();
        C6286n7 c6286n7 = this.f33873a;
        c6308o8 = c6286n7.f33911g;
        c6308o8.f33931e = str;
        c6330p9 = c6286n7.f33906b;
        c6308o82 = c6286n7.f33911g;
        C6142ga m29953a = c6330p9.m29953a(c6308o82);
        c6176i2 = this.f33873a.f33905a;
        c6176i2.m29670d(m29953a, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS);
        r0.f33911g.m29926c(this.f33873a.f33910f);
        this.f33873a.m29893w();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14739e(AbstractC5989s abstractC5989s, int i10) {
        C8015b c8015b;
        C6308o8 c6308o8;
        C6330p9 c6330p9;
        C6308o8 c6308o82;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        this.f33873a.m29891u();
        c6308o8 = this.f33873a.f33911g;
        C9935o.m41850j(c6308o8);
        C6286n7 c6286n7 = this.f33873a;
        c6330p9 = c6286n7.f33906b;
        c6308o82 = c6286n7.f33911g;
        C6142ga m29957e = c6330p9.m29957e(c6308o82, i10);
        c6176i2 = this.f33873a.f33905a;
        c6176i2.m29670d(m29957e, FTPReply.DATA_CONNECTION_OPEN);
        r0.f33911g.m29926c(this.f33873a.f33910f);
        this.f33873a.m29890t();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo14740f(AbstractC5989s abstractC5989s, int i10) {
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        C6286n7.m29883n(this.f33873a, i10);
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo14744j(AbstractC5989s abstractC5989s, boolean z10) {
        C8015b c8015b;
        C6308o8 c6308o8;
        C6330p9 c6330p9;
        C6308o8 c6308o82;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        this.f33873a.m29891u();
        c6308o8 = this.f33873a.f33911g;
        C9935o.m41850j(c6308o8);
        C6286n7 c6286n7 = this.f33873a;
        c6330p9 = c6286n7.f33906b;
        c6308o82 = c6286n7.f33911g;
        C6142ga m29954b = c6330p9.m29954b(c6308o82, z10);
        c6176i2 = this.f33873a.f33905a;
        c6176i2.m29670d(m29954b, FTPReply.ENTERING_PASSIVE_MODE);
        r0.f33911g.m29926c(this.f33873a.f33910f);
        this.f33873a.m29893w();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo14746l(AbstractC5989s abstractC5989s, String str) {
        C8015b c8015b;
        SharedPreferences sharedPreferences;
        C6308o8 c6308o8;
        C6330p9 c6330p9;
        C6308o8 c6308o82;
        C6176i2 c6176i2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onSessionResuming with sessionId = %s", str);
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        C6286n7 c6286n7 = this.f33873a;
        sharedPreferences = c6286n7.f33910f;
        C6286n7.m29884o(c6286n7, sharedPreferences, str);
        c6308o8 = this.f33873a.f33911g;
        C9935o.m41850j(c6308o8);
        C6286n7 c6286n72 = this.f33873a;
        c6330p9 = c6286n72.f33906b;
        c6308o82 = c6286n72.f33911g;
        C6142ga m29955c = c6330p9.m29955c(c6308o82);
        c6176i2 = this.f33873a.f33905a;
        c6176i2.m29670d(m29955c, FTPReply.CLOSING_DATA_CONNECTION);
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo14748n(AbstractC5989s abstractC5989s, int i10) {
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        C6286n7.m29883n(this.f33873a, i10);
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo14749o(AbstractC5989s abstractC5989s) {
        C8015b c8015b;
        C6308o8 c6308o8;
        C6330p9 c6330p9;
        C6308o8 c6308o82;
        C6176i2 c6176i2;
        C8015b c8015b2;
        c8015b = C6286n7.f33904k;
        c8015b.m34873a("onSessionStarting", new Object[0]);
        this.f33873a.f33912h = (C5947e) abstractC5989s;
        c6308o8 = this.f33873a.f33911g;
        if (c6308o8 != null) {
            c8015b2 = C6286n7.f33904k;
            c8015b2.m34878f("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.f33873a.m29892v();
        C6286n7 c6286n7 = this.f33873a;
        c6330p9 = c6286n7.f33906b;
        c6308o82 = c6286n7.f33911g;
        C6142ga m29956d = c6330p9.m29956d(c6308o82);
        c6176i2 = this.f33873a.f33905a;
        c6176i2.m29670d(m29956d, 221);
    }
}
