package p134hg;

import com.onesignal.InterfaceC4168l3;
import com.onesignal.InterfaceC4180n3;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/f.class
 */
/* renamed from: hg.f */
/* loaded from: combined.jar:classes2.jar:hg/f.class */
public final class C5083f extends AbstractC5079b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5083f(@NotNull InterfaceC4168l3 interfaceC4168l3) {
        super(interfaceC4168l3);
        C9367f.m39526e(interfaceC4168l3, "client");
    }

    @Override // p134hg.InterfaceC5087j
    /* renamed from: a */
    public void mo25390a(@NotNull JSONObject jSONObject, @NotNull InterfaceC4180n3 interfaceC4180n3) {
        C9367f.m39526e(jSONObject, "jsonObject");
        C9367f.m39526e(interfaceC4180n3, "responseHandler");
        m25372b().mo20617a("outcomes/measure", jSONObject, interfaceC4180n3);
    }
}
