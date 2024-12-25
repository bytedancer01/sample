package ma;

import java.util.List;
import org.apache.commons.net.smtp.SMTPReply;
import p208m1.C5901j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/qa.class
 */
/* renamed from: ma.qa */
/* loaded from: combined.jar:classes2.jar:ma/qa.class */
public final class C6352qa extends C6151gj {

    /* renamed from: a */
    public final C6396sc f33985a;

    public C6352qa(C6396sc c6396sc) {
        this.f33985a = c6396sc;
    }

    @Override // ma.C6151gj
    /* renamed from: a */
    public final void mo29650a(List list) {
        this.f33985a.m30018n(list);
    }

    @Override // ma.C6151gj
    /* renamed from: b */
    public final void mo29651b(C5901j.h hVar) {
        this.f33985a.m30017m(hVar);
    }

    @Override // ma.C6151gj
    /* renamed from: c */
    public final void mo29652c(int i10) {
        this.f33985a.m30016l(1);
    }

    @Override // ma.C6151gj
    /* renamed from: d */
    public final void mo29653d() {
        this.f33985a.m30019o();
    }

    @Override // ma.C6151gj
    /* renamed from: e */
    public final void mo29654e() {
        r0.f34016a.m29670d(this.f33985a.m30014j(null), SMTPReply.START_MAIL_INPUT);
    }
}
