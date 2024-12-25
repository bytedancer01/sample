package p152ig;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ig/d.class
 */
/* renamed from: ig.d */
/* loaded from: combined.jar:classes2.jar:ig/d.class */
public final class C5259d {

    /* renamed from: a */
    @Nullable
    public C5260e f30178a;

    /* renamed from: b */
    @Nullable
    public C5260e f30179b;

    public C5259d(@Nullable C5260e c5260e, @Nullable C5260e c5260e2) {
        this.f30178a = c5260e;
        this.f30179b = c5260e2;
    }

    @Nullable
    /* renamed from: a */
    public final C5260e m26316a() {
        return this.f30178a;
    }

    @Nullable
    /* renamed from: b */
    public final C5260e m26317b() {
        return this.f30179b;
    }

    @NotNull
    /* renamed from: c */
    public final C5259d m26318c(@Nullable C5260e c5260e) {
        m26319d(c5260e);
        return this;
    }

    /* renamed from: d */
    public final void m26319d(@Nullable C5260e c5260e) {
        this.f30178a = c5260e;
    }

    @NotNull
    /* renamed from: e */
    public final C5259d m26320e(@Nullable C5260e c5260e) {
        m26321f(c5260e);
        return this;
    }

    /* renamed from: f */
    public final void m26321f(@Nullable C5260e c5260e) {
        this.f30179b = c5260e;
    }

    @NotNull
    /* renamed from: g */
    public final JSONObject m26322g() {
        JSONObject jSONObject = new JSONObject();
        C5260e c5260e = this.f30178a;
        if (c5260e != null) {
            jSONObject.put("direct", c5260e.m26327e());
        }
        C5260e c5260e2 = this.f30179b;
        if (c5260e2 != null) {
            jSONObject.put("indirect", c5260e2.m26327e());
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "OSOutcomeSource{directBody=" + this.f30178a + ", indirectBody=" + this.f30179b + '}';
    }
}
