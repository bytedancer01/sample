package p090f3;

import com.amazonaws.mobileconnectors.appsync.cache.normalized.sql.AppSyncSqlHelper;
import p033c3.C0986f;
import p072e3.AbstractC4601g;
import p072e3.C4604j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f3/b.class
 */
/* renamed from: f3.b */
/* loaded from: combined.jar:classes1.jar:f3/b.class */
public final class C4762b extends AbstractC4601g<C4761a> {

    /* renamed from: b */
    public final AppSyncSqlHelper f28114b;

    public C4762b(AppSyncSqlHelper appSyncSqlHelper) {
        this.f28114b = (AppSyncSqlHelper) C0986f.m5892c(appSyncSqlHelper, "helper == null");
    }

    @Override // p072e3.AbstractC4601g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4761a mo23198a(C4604j c4604j) {
        return new C4761a(c4604j, this.f28114b);
    }
}
