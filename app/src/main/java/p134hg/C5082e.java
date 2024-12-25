package p134hg;

import com.onesignal.C4161k2;
import com.onesignal.InterfaceC4180n3;
import com.onesignal.InterfaceC4239x1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p103fg.EnumC4859c;
import p152ig.C5257b;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hg/e.class
 */
/* renamed from: hg.e */
/* loaded from: combined.jar:classes2.jar:hg/e.class */
public final class C5082e extends AbstractC5081d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hg/e$a.class
     */
    /* renamed from: hg.e$a */
    /* loaded from: combined.jar:classes2.jar:hg/e$a.class */
    public final /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f29209a;

        static {
            int[] iArr = new int[EnumC4859c.values().length];
            iArr[EnumC4859c.DIRECT.ordinal()] = 1;
            iArr[EnumC4859c.INDIRECT.ordinal()] = 2;
            iArr[EnumC4859c.UNATTRIBUTED.ordinal()] = 3;
            f29209a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5082e(@NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull C5078a c5078a, @NotNull InterfaceC5087j interfaceC5087j) {
        super(interfaceC4239x1, c5078a, interfaceC5087j);
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(c5078a, "outcomeEventsCache");
        C9367f.m39526e(interfaceC5087j, "outcomeEventsService");
    }

    @Override // p152ig.InterfaceC5258c
    /* renamed from: h */
    public void mo25386h(@NotNull String str, int i10, @NotNull C5257b c5257b, @NotNull InterfaceC4180n3 interfaceC4180n3) {
        C9367f.m39526e(str, "appId");
        C9367f.m39526e(c5257b, "eventParams");
        C9367f.m39526e(interfaceC4180n3, "responseHandler");
        C4161k2 m20405a = C4161k2.m20405a(c5257b);
        EnumC4859c m20406b = m20405a.m20406b();
        int i11 = m20406b == null ? -1 : a.f29209a[m20406b.ordinal()];
        if (i11 == 1) {
            C9367f.m39525d(m20405a, "event");
            m25387l(str, i10, m20405a, interfaceC4180n3);
        } else if (i11 == 2) {
            C9367f.m39525d(m20405a, "event");
            m25388m(str, i10, m20405a, interfaceC4180n3);
        } else {
            if (i11 != 3) {
                return;
            }
            C9367f.m39525d(m20405a, "event");
            m25389n(str, i10, m20405a, interfaceC4180n3);
        }
    }

    /* renamed from: l */
    public final void m25387l(String str, int i10, C4161k2 c4161k2, InterfaceC4180n3 interfaceC4180n3) {
        try {
            JSONObject put = c4161k2.m20407c().put("app_id", str).put("device_type", i10).put("direct", true);
            InterfaceC5087j m25385k = m25385k();
            C9367f.m39525d(put, "jsonObject");
            m25385k.mo25390a(put, interfaceC4180n3);
        } catch (JSONException e10) {
            m25384j().error("Generating direct outcome:JSON Failed.", e10);
        }
    }

    /* renamed from: m */
    public final void m25388m(String str, int i10, C4161k2 c4161k2, InterfaceC4180n3 interfaceC4180n3) {
        try {
            JSONObject put = c4161k2.m20407c().put("app_id", str).put("device_type", i10).put("direct", false);
            InterfaceC5087j m25385k = m25385k();
            C9367f.m39525d(put, "jsonObject");
            m25385k.mo25390a(put, interfaceC4180n3);
        } catch (JSONException e10) {
            m25384j().error("Generating indirect outcome:JSON Failed.", e10);
        }
    }

    /* renamed from: n */
    public final void m25389n(String str, int i10, C4161k2 c4161k2, InterfaceC4180n3 interfaceC4180n3) {
        try {
            JSONObject put = c4161k2.m20407c().put("app_id", str).put("device_type", i10);
            InterfaceC5087j m25385k = m25385k();
            C9367f.m39525d(put, "jsonObject");
            m25385k.mo25390a(put, interfaceC4180n3);
        } catch (JSONException e10) {
            m25384j().error("Generating unattributed outcome:JSON Failed.", e10);
        }
    }
}
