package eg;

import com.onesignal.C4235w3;
import com.onesignal.InterfaceC4216t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import p103fg.EnumC4859c;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:eg/c.class
 */
/* renamed from: eg.c */
/* loaded from: combined.jar:classes2.jar:eg/c.class */
public final class C4723c {

    /* renamed from: a */
    @NotNull
    public final InterfaceC4216t2 f27791a;

    public C4723c(@NotNull InterfaceC4216t2 interfaceC4216t2) {
        C9367f.m39526e(interfaceC4216t2, "preferences");
        this.f27791a = interfaceC4216t2;
    }

    /* renamed from: a */
    public final void m23817a(@NotNull EnumC4859c enumC4859c) {
        C9367f.m39526e(enumC4859c, "influenceType");
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        interfaceC4216t2.mo20887f(interfaceC4216t2.mo20890i(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", enumC4859c.toString());
    }

    /* renamed from: b */
    public final void m23818b(@NotNull EnumC4859c enumC4859c) {
        C9367f.m39526e(enumC4859c, "influenceType");
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        interfaceC4216t2.mo20887f(interfaceC4216t2.mo20890i(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", enumC4859c.toString());
    }

    /* renamed from: c */
    public final void m23819c(@Nullable String str) {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        interfaceC4216t2.mo20887f(interfaceC4216t2.mo20890i(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    @Nullable
    /* renamed from: d */
    public final String m23820d() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    @NotNull
    /* renamed from: e */
    public final EnumC4859c m23821e() {
        String obj = EnumC4859c.UNATTRIBUTED.toString();
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return EnumC4859c.Companion.m24729a(interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", obj));
    }

    /* renamed from: f */
    public final int m23822f() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20889h(interfaceC4216t2.mo20890i(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", DateTimeConstants.MINUTES_PER_DAY);
    }

    /* renamed from: g */
    public final int m23823g() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20889h(interfaceC4216t2.mo20890i(), "PREFS_OS_IAM_LIMIT", 10);
    }

    @NotNull
    /* renamed from: h */
    public final JSONArray m23824h() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        String mo20885d = interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        JSONArray jSONArray = mo20885d == null ? null : new JSONArray(mo20885d);
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray == null) {
            jSONArray2 = new JSONArray();
        }
        return jSONArray2;
    }

    @NotNull
    /* renamed from: i */
    public final JSONArray m23825i() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        String mo20885d = interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        JSONArray jSONArray = mo20885d == null ? null : new JSONArray(mo20885d);
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray == null) {
            jSONArray2 = new JSONArray();
        }
        return jSONArray2;
    }

    @NotNull
    /* renamed from: j */
    public final EnumC4859c m23826j() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return EnumC4859c.Companion.m24729a(interfaceC4216t2.mo20885d(interfaceC4216t2.mo20890i(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", EnumC4859c.UNATTRIBUTED.toString()));
    }

    /* renamed from: k */
    public final int m23827k() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20889h(interfaceC4216t2.mo20890i(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", DateTimeConstants.MINUTES_PER_DAY);
    }

    /* renamed from: l */
    public final int m23828l() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20889h(interfaceC4216t2.mo20890i(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    /* renamed from: m */
    public final boolean m23829m() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20888g(interfaceC4216t2.mo20890i(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    /* renamed from: n */
    public final boolean m23830n() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20888g(interfaceC4216t2.mo20890i(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    /* renamed from: o */
    public final boolean m23831o() {
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        return interfaceC4216t2.mo20888g(interfaceC4216t2.mo20890i(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    /* renamed from: p */
    public final void m23832p(@NotNull JSONArray jSONArray) {
        C9367f.m39526e(jSONArray, "iams");
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        interfaceC4216t2.mo20887f(interfaceC4216t2.mo20890i(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    /* renamed from: q */
    public final void m23833q(@NotNull C4235w3.e eVar) {
        C9367f.m39526e(eVar, "influenceParams");
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        interfaceC4216t2.mo20883b(interfaceC4216t2.mo20890i(), "PREFS_OS_DIRECT_ENABLED", eVar.m21049e());
        InterfaceC4216t2 interfaceC4216t22 = this.f27791a;
        interfaceC4216t22.mo20883b(interfaceC4216t22.mo20890i(), "PREFS_OS_INDIRECT_ENABLED", eVar.m21050f());
        InterfaceC4216t2 interfaceC4216t23 = this.f27791a;
        interfaceC4216t23.mo20883b(interfaceC4216t23.mo20890i(), "PREFS_OS_UNATTRIBUTED_ENABLED", eVar.m21051g());
        InterfaceC4216t2 interfaceC4216t24 = this.f27791a;
        interfaceC4216t24.mo20882a(interfaceC4216t24.mo20890i(), "PREFS_OS_NOTIFICATION_LIMIT", eVar.m21048d());
        InterfaceC4216t2 interfaceC4216t25 = this.f27791a;
        interfaceC4216t25.mo20882a(interfaceC4216t25.mo20890i(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", eVar.m21047c());
        InterfaceC4216t2 interfaceC4216t26 = this.f27791a;
        interfaceC4216t26.mo20882a(interfaceC4216t26.mo20890i(), "PREFS_OS_IAM_LIMIT", eVar.m21045a());
        InterfaceC4216t2 interfaceC4216t27 = this.f27791a;
        interfaceC4216t27.mo20882a(interfaceC4216t27.mo20890i(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", eVar.m21046b());
    }

    /* renamed from: r */
    public final void m23834r(@NotNull JSONArray jSONArray) {
        C9367f.m39526e(jSONArray, "notifications");
        InterfaceC4216t2 interfaceC4216t2 = this.f27791a;
        interfaceC4216t2.mo20887f(interfaceC4216t2.mo20890i(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
