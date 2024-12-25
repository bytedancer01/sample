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
  classes2.jar:eg/d.class
 */
/* renamed from: eg.d */
/* loaded from: combined.jar:classes2.jar:eg/d.class */
public final class C4724d extends AbstractC4721a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4724d(@NotNull C4723c c4723c, @NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull InterfaceC4108b3 interfaceC4108b3) {
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
        if (c4857a.m24724d().isAttributed()) {
            try {
                jSONObject.put("direct", c4857a.m24724d().isDirect());
                jSONObject.put("notification_ids", c4857a.m24722b());
            } catch (JSONException e10) {
                m23806o().error("Generating notification tracker addSessionData JSONObject ", e10);
            }
        }
    }

    @Override // eg.AbstractC4721a
    /* renamed from: b */
    public void mo23793b() {
        C4723c m23797f = m23797f();
        EnumC4859c m23802k = m23802k();
        EnumC4859c enumC4859c = m23802k;
        if (m23802k == null) {
            enumC4859c = EnumC4859c.UNATTRIBUTED;
        }
        m23797f.m23818b(enumC4859c);
        m23797f().m23819c(m23798g());
    }

    @Override // eg.AbstractC4721a
    /* renamed from: c */
    public int mo23794c() {
        return m23797f().m23828l();
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: d */
    public EnumC4858b mo23795d() {
        return EnumC4858b.NOTIFICATION;
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: h */
    public String mo23799h() {
        return "notification_id";
    }

    @Override // eg.AbstractC4721a
    /* renamed from: i */
    public int mo23800i() {
        return m23797f().m23827k();
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: l */
    public JSONArray mo23803l() {
        return m23797f().m23825i();
    }

    @Override // eg.AbstractC4721a
    @NotNull
    /* renamed from: m */
    public JSONArray mo23804m(@Nullable String str) {
        JSONArray jSONArray;
        try {
            jSONArray = mo23803l();
        } catch (JSONException e10) {
            m23806o().error("Generating Notification tracker getLastChannelObjects JSONObject ", e10);
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    @Override // eg.AbstractC4721a
    /* renamed from: p */
    public void mo23807p() {
        EnumC4859c m23826j = m23797f().m23826j();
        if (m23826j.isIndirect()) {
            m23815x(m23805n());
        } else if (m23826j.isDirect()) {
            m23814w(m23797f().m23820d());
        }
        C5398q c5398q = C5398q.f30770a;
        m23816y(m23826j);
        m23806o().debug(C9367f.m39532k("OneSignal NotificationTracker initInfluencedTypeFromCache: ", this));
    }

    @Override // eg.AbstractC4721a
    /* renamed from: u */
    public void mo23812u(@NotNull JSONArray jSONArray) {
        C9367f.m39526e(jSONArray, "channelObjects");
        m23797f().m23834r(jSONArray);
    }
}
