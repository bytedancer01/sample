package eg;

import com.onesignal.InterfaceC4108b3;
import com.onesignal.InterfaceC4239x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p103fg.C4857a;
import p103fg.EnumC4858b;
import p103fg.EnumC4859c;
import p172jh.C5398q;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:eg/b.class
 */
/* renamed from: eg.b */
/* loaded from: combined.jar:classes2.jar:eg/b.class */
public final class C4722b extends AbstractC4721a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4722b(@NotNull C4723c c4723c, @NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull InterfaceC4108b3 interfaceC4108b3) {
        super(c4723c, interfaceC4239x1, interfaceC4108b3);
        C9367f.m39526e(c4723c, "dataRepository");
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(interfaceC4108b3, "timeProvider");
    }

    @Override // eg.AbstractC4721a
    /* renamed from: a */
    public void mo23792a(@NotNull JSONObject jSONObject, @NotNull C4857a c4857a) {
        C9367f.m39526e(jSONObject, "jsonObject");
        C9367f.m39526e(c4857a, "influence");
    }

    @Override // eg.AbstractC4721a
    /* renamed from: b */
    public void mo23793b() {
        EnumC4859c m23802k = m23802k();
        EnumC4859c enumC4859c = m23802k;
        if (m23802k == null) {
            enumC4859c = EnumC4859c.UNATTRIBUTED;
        }
        C4723c m23797f = m23797f();
        EnumC4859c enumC4859c2 = enumC4859c;
        if (enumC4859c == EnumC4859c.DIRECT) {
            enumC4859c2 = EnumC4859c.INDIRECT;
        }
        m23797f.m23817a(enumC4859c2);
    }

    @Override // eg.AbstractC4721a
    /* renamed from: c */
    public int mo23794c() {
        return m23797f().m23823g();
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: d */
    public EnumC4858b mo23795d() {
        return EnumC4858b.IAM;
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: h */
    public String mo23799h() {
        return "iam_id";
    }

    @Override // eg.AbstractC4721a
    /* renamed from: i */
    public int mo23800i() {
        return m23797f().m23822f();
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: l */
    public JSONArray mo23803l() {
        return m23797f().m23824h();
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: m */
    public JSONArray mo23804m(@Nullable String str) {
        JSONArray jSONArray;
        try {
            JSONArray mo23803l = mo23803l();
            try {
                JSONArray jSONArray2 = new JSONArray();
                int i10 = 0;
                int length = mo23803l.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        if (!C9367f.m39522a(str, mo23803l.getJSONObject(i10).getString(mo23799h()))) {
                            jSONArray2.put(mo23803l.getJSONObject(i10));
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONArray = jSONArray2;
            } catch (JSONException e10) {
                m23806o().error("Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                jSONArray = mo23803l;
            }
            return jSONArray;
        } catch (JSONException e11) {
            m23806o().error("Generating IAM tracker getLastChannelObjects JSONObject ", e11);
            return new JSONArray();
        }
    }

    @Override // eg.AbstractC4721a
    /* renamed from: p */
    public void mo23807p() {
        EnumC4859c m23821e = m23797f().m23821e();
        if (m23821e.isIndirect()) {
            m23815x(m23805n());
        }
        C5398q c5398q = C5398q.f30770a;
        m23816y(m23821e);
        m23806o().debug(C9367f.m39532k("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // eg.AbstractC4721a
    /* renamed from: u */
    public void mo23812u(@NotNull JSONArray jSONArray) {
        C9367f.m39526e(jSONArray, "channelObjects");
        m23797f().m23832p(jSONArray);
    }
}
