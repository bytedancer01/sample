package p103fg;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fg/a.class
 */
/* renamed from: fg.a */
/* loaded from: combined.jar:classes2.jar:fg/a.class */
public final class C4857a {

    /* renamed from: a */
    @NotNull
    public EnumC4859c f28534a;

    /* renamed from: b */
    @NotNull
    public EnumC4858b f28535b;

    /* renamed from: c */
    @Nullable
    public JSONArray f28536c;

    public C4857a(@NotNull EnumC4858b enumC4858b, @NotNull EnumC4859c enumC4859c, @Nullable JSONArray jSONArray) {
        C9367f.m39526e(enumC4858b, "influenceChannel");
        C9367f.m39526e(enumC4859c, "influenceType");
        this.f28535b = enumC4858b;
        this.f28534a = enumC4859c;
        this.f28536c = jSONArray;
    }

    public C4857a(@NotNull String str) {
        C9367f.m39526e(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        this.f28535b = EnumC4858b.Companion.m24728a(string);
        this.f28534a = EnumC4859c.Companion.m24729a(string2);
        C9367f.m39525d(string3, "ids");
        this.f28536c = string3.length() == 0 ? null : new JSONArray(string3);
    }

    @NotNull
    /* renamed from: a */
    public final C4857a m24721a() {
        return new C4857a(this.f28535b, this.f28534a, this.f28536c);
    }

    @Nullable
    /* renamed from: b */
    public final JSONArray m24722b() {
        return this.f28536c;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC4858b m24723c() {
        return this.f28535b;
    }

    @NotNull
    /* renamed from: d */
    public final EnumC4859c m24724d() {
        return this.f28534a;
    }

    /* renamed from: e */
    public final void m24725e(@Nullable JSONArray jSONArray) {
        this.f28536c = jSONArray;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !C9367f.m39522a(C4857a.class, obj.getClass())) {
            return false;
        }
        C4857a c4857a = (C4857a) obj;
        if (this.f28535b != c4857a.f28535b || this.f28534a != c4857a.f28534a) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public final void m24726f(@NotNull EnumC4859c enumC4859c) {
        C9367f.m39526e(enumC4859c, "<set-?>");
        this.f28534a = enumC4859c;
    }

    @NotNull
    /* renamed from: g */
    public final String m24727g() {
        JSONObject put = new JSONObject().put("influence_channel", this.f28535b.toString()).put("influence_type", this.f28534a.toString());
        JSONArray jSONArray = this.f28536c;
        String jSONObject = put.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        C9367f.m39525d(jSONObject, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return jSONObject;
    }

    public int hashCode() {
        return (this.f28535b.hashCode() * 31) + this.f28534a.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.f28535b + ", influenceType=" + this.f28534a + ", ids=" + this.f28536c + '}';
    }
}
