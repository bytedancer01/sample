package p152ig;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ig/e.class
 */
/* renamed from: ig.e */
/* loaded from: combined.jar:classes2.jar:ig/e.class */
public final class C5260e {

    /* renamed from: a */
    @Nullable
    public JSONArray f30180a;

    /* renamed from: b */
    @Nullable
    public JSONArray f30181b;

    public C5260e() {
        this(null, null, 3, null);
    }

    public C5260e(@Nullable JSONArray jSONArray, @Nullable JSONArray jSONArray2) {
        this.f30180a = jSONArray;
        this.f30181b = jSONArray2;
    }

    public /* synthetic */ C5260e(JSONArray jSONArray, JSONArray jSONArray2, int i10, C9365d c9365d) {
        this((i10 & 1) != 0 ? new JSONArray() : jSONArray, (i10 & 2) != 0 ? new JSONArray() : jSONArray2);
    }

    @Nullable
    /* renamed from: a */
    public final JSONArray m26323a() {
        return this.f30181b;
    }

    @Nullable
    /* renamed from: b */
    public final JSONArray m26324b() {
        return this.f30180a;
    }

    /* renamed from: c */
    public final void m26325c(@Nullable JSONArray jSONArray) {
        this.f30181b = jSONArray;
    }

    /* renamed from: d */
    public final void m26326d(@Nullable JSONArray jSONArray) {
        this.f30180a = jSONArray;
    }

    @NotNull
    /* renamed from: e */
    public final JSONObject m26327e() {
        JSONObject put = new JSONObject().put("notification_ids", this.f30180a).put("in_app_message_ids", this.f30181b);
        C9367f.m39525d(put, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return put;
    }

    @NotNull
    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.f30180a + ", inAppMessagesIds=" + this.f30181b + '}';
    }
}
