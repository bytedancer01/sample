package p134hg;

import com.onesignal.InterfaceC4180n3;
import com.onesignal.InterfaceC4239x1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p152ig.C5257b;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/g.class
 */
/* renamed from: hg.g */
/* loaded from: combined.jar:classes2.jar:hg/g.class */
public final class C5084g extends AbstractC5081d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5084g(@NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull C5078a c5078a, @NotNull InterfaceC5087j interfaceC5087j) {
        super(interfaceC4239x1, c5078a, interfaceC5087j);
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(c5078a, "outcomeEventsCache");
        C9367f.m39526e(interfaceC5087j, "outcomeEventsService");
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: h */
    public void mo25386h(@NotNull String str, int i10, @NotNull C5257b c5257b, @NotNull InterfaceC4180n3 interfaceC4180n3) {
        C9367f.m39526e(str, "appId");
        C9367f.m39526e(c5257b, "event");
        C9367f.m39526e(interfaceC4180n3, "responseHandler");
        try {
            JSONObject put = c5257b.m26315g().put("app_id", str).put("device_type", i10);
            InterfaceC5087j m25385k = m25385k();
            C9367f.m39525d(put, "jsonObject");
            m25385k.mo25390a(put, interfaceC4180n3);
        } catch (JSONException e10) {
            m25384j().error("Generating indirect outcome:JSON Failed.", e10);
        }
    }
}
