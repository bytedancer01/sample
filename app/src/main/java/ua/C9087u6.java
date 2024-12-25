package ua;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u6.class
 */
/* renamed from: ua.u6 */
/* loaded from: combined.jar:classes2.jar:ua/u6.class */
public final class C9087u6 implements InterfaceC8887da {

    /* renamed from: a */
    public final C8908f7 f41665a;

    public C9087u6(C8908f7 c8908f7) {
        this.f41665a = c8908f7;
    }

    @Override // ua.InterfaceC8887da
    /* renamed from: a */
    public final void mo37810a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f41665a.m37933X("auto", "_err", bundle);
            return;
        }
        C8908f7 c8908f7 = this.f41665a;
        C8870c5.m37755u();
        c8908f7.m37937b0("auto", "_err", c8908f7.f41723a.mo37778a().mo22432a(), bundle, false, true, false, str);
    }
}
