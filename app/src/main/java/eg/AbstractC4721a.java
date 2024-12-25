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
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:eg/a.class
 */
/* renamed from: eg.a */
/* loaded from: combined.jar:classes2.jar:eg/a.class */
public abstract class AbstractC4721a {

    /* renamed from: a */
    @NotNull
    public C4723c f27785a;

    /* renamed from: b */
    @NotNull
    public InterfaceC4239x1 f27786b;

    /* renamed from: c */
    @NotNull
    public InterfaceC4108b3 f27787c;

    /* renamed from: d */
    @Nullable
    public EnumC4859c f27788d;

    /* renamed from: e */
    @Nullable
    public JSONArray f27789e;

    /* renamed from: f */
    @Nullable
    public String f27790f;

    public AbstractC4721a(@NotNull C4723c c4723c, @NotNull InterfaceC4239x1 interfaceC4239x1, @NotNull InterfaceC4108b3 interfaceC4108b3) {
        C9367f.m39526e(c4723c, "dataRepository");
        C9367f.m39526e(interfaceC4239x1, "logger");
        C9367f.m39526e(interfaceC4108b3, "timeProvider");
        this.f27785a = c4723c;
        this.f27786b = interfaceC4239x1;
        this.f27787c = interfaceC4108b3;
    }

    /* renamed from: a */
    public abstract void mo23792a(@NotNull JSONObject jSONObject, @NotNull C4857a c4857a);

    /* renamed from: b */
    public abstract void mo23793b();

    /* renamed from: c */
    public abstract int mo23794c();

    @NotNull
    /* renamed from: d */
    public abstract EnumC4858b mo23795d();

    @NotNull
    /* renamed from: e */
    public final C4857a m23796e() {
        EnumC4859c enumC4859c;
        EnumC4858b mo23795d = mo23795d();
        EnumC4859c enumC4859c2 = EnumC4859c.DISABLED;
        C4857a c4857a = new C4857a(mo23795d, enumC4859c2, null);
        if (this.f27788d == null) {
            mo23807p();
        }
        EnumC4859c enumC4859c3 = this.f27788d;
        if (enumC4859c3 != null) {
            enumC4859c2 = enumC4859c3;
        }
        if (enumC4859c2.isDirect()) {
            if (m23808q()) {
                c4857a.m24725e(new JSONArray().put(m23798g()));
                enumC4859c = EnumC4859c.DIRECT;
                c4857a.m24726f(enumC4859c);
            }
        } else if (enumC4859c2.isIndirect()) {
            if (m23809r()) {
                c4857a.m24725e(m23801j());
                enumC4859c = EnumC4859c.INDIRECT;
                c4857a.m24726f(enumC4859c);
            }
        } else if (m23810s()) {
            enumC4859c = EnumC4859c.UNATTRIBUTED;
            c4857a.m24726f(enumC4859c);
        }
        return c4857a;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !C9367f.m39522a(getClass(), obj.getClass())) {
            return false;
        }
        AbstractC4721a abstractC4721a = (AbstractC4721a) obj;
        if (this.f27788d != abstractC4721a.f27788d || !C9367f.m39522a(abstractC4721a.mo23799h(), mo23799h())) {
            z10 = false;
        }
        return z10;
    }

    @NotNull
    /* renamed from: f */
    public final C4723c m23797f() {
        return this.f27785a;
    }

    @Nullable
    /* renamed from: g */
    public final String m23798g() {
        return this.f27790f;
    }

    @NotNull
    /* renamed from: h */
    public abstract String mo23799h();

    public int hashCode() {
        EnumC4859c enumC4859c = this.f27788d;
        return ((enumC4859c != null ? enumC4859c.hashCode() : 0) * 31) + mo23799h().hashCode();
    }

    /* renamed from: i */
    public abstract int mo23800i();

    @Nullable
    /* renamed from: j */
    public final JSONArray m23801j() {
        return this.f27789e;
    }

    @Nullable
    /* renamed from: k */
    public final EnumC4859c m23802k() {
        return this.f27788d;
    }

    @NotNull
    /* renamed from: l */
    public abstract JSONArray mo23803l();

    @NotNull
    /* renamed from: m */
    public abstract JSONArray mo23804m(@Nullable String str);

    @NotNull
    /* renamed from: n */
    public final JSONArray m23805n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray mo23803l = mo23803l();
            this.f27786b.debug(C9367f.m39532k("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ", mo23803l));
            long mo23800i = mo23800i() * 60;
            long mo20077b = this.f27787c.mo20077b();
            int i10 = 0;
            int length = mo23803l.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject = mo23803l.getJSONObject(i10);
                    if (mo20077b - jSONObject.getLong("time") <= mo23800i * 1000) {
                        jSONArray.put(jSONObject.getString(mo23799h()));
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        } catch (JSONException e10) {
            this.f27786b.error("Generating tracker getLastReceivedIds JSONObject ", e10);
        }
        return jSONArray;
    }

    @NotNull
    /* renamed from: o */
    public final InterfaceC4239x1 m23806o() {
        return this.f27786b;
    }

    /* renamed from: p */
    public abstract void mo23807p();

    /* renamed from: q */
    public final boolean m23808q() {
        return this.f27785a.m23829m();
    }

    /* renamed from: r */
    public final boolean m23809r() {
        return this.f27785a.m23830n();
    }

    /* renamed from: s */
    public final boolean m23810s() {
        return this.f27785a.m23831o();
    }

    /* renamed from: t */
    public final void m23811t() {
        this.f27790f = null;
        JSONArray m23805n = m23805n();
        this.f27789e = m23805n;
        this.f27788d = (m23805n == null ? 0 : m23805n.length()) > 0 ? EnumC4859c.INDIRECT : EnumC4859c.UNATTRIBUTED;
        mo23793b();
        this.f27786b.debug("OneSignal OSChannelTracker resetAndInitInfluence: " + mo23799h() + " finish with influenceType: " + this.f27788d);
    }

    @NotNull
    public String toString() {
        return "OSChannelTracker{tag=" + mo23799h() + ", influenceType=" + this.f27788d + ", indirectIds=" + this.f27789e + ", directId=" + ((Object) this.f27790f) + '}';
    }

    /* renamed from: u */
    public abstract void mo23812u(@NotNull JSONArray jSONArray);

    /* renamed from: v */
    public final void m23813v(@Nullable String str) {
        this.f27786b.debug("OneSignal OSChannelTracker for: " + mo23799h() + " saveLastId: " + ((Object) str));
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            JSONArray mo23804m = mo23804m(str);
            this.f27786b.debug("OneSignal OSChannelTracker for: " + mo23799h() + " saveLastId with lastChannelObjectsReceived: " + mo23804m);
            try {
                mo23804m.put(new JSONObject().put(mo23799h(), str).put("time", this.f27787c.mo20077b()));
                JSONArray jSONArray = mo23804m;
                if (mo23804m.length() > mo23794c()) {
                    int length = mo23804m.length() - mo23794c();
                    jSONArray = new JSONArray();
                    int length2 = mo23804m.length();
                    if (length < length2) {
                        while (true) {
                            int i10 = length + 1;
                            try {
                                jSONArray.put(mo23804m.get(length));
                            } catch (JSONException e10) {
                                this.f27786b.error("Generating tracker lastChannelObjectsReceived get JSONObject ", e10);
                            }
                            if (i10 >= length2) {
                                break;
                            } else {
                                length = i10;
                            }
                        }
                    }
                }
                this.f27786b.debug("OneSignal OSChannelTracker for: " + mo23799h() + " with channelObjectToSave: " + jSONArray);
                mo23812u(jSONArray);
            } catch (JSONException e11) {
                this.f27786b.error("Generating tracker newInfluenceId JSONObject ", e11);
            }
        }
    }

    /* renamed from: w */
    public final void m23814w(@Nullable String str) {
        this.f27790f = str;
    }

    /* renamed from: x */
    public final void m23815x(@Nullable JSONArray jSONArray) {
        this.f27789e = jSONArray;
    }

    /* renamed from: y */
    public final void m23816y(@Nullable EnumC4859c enumC4859c) {
        this.f27788d = enumC4859c;
    }
}
