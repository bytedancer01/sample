package p152ig;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ig/b.class
 */
/* renamed from: ig.b */
/* loaded from: combined.jar:classes2.jar:ig/b.class */
public final class C5257b {

    /* renamed from: a */
    @NotNull
    public final String f30174a;

    /* renamed from: b */
    @Nullable
    public final C5259d f30175b;

    /* renamed from: c */
    public float f30176c;

    /* renamed from: d */
    public long f30177d;

    public C5257b(@NotNull String str, @Nullable C5259d c5259d, float f10, long j10) {
        C9367f.m39526e(str, "outcomeId");
        this.f30174a = str;
        this.f30175b = c5259d;
        this.f30176c = f10;
        this.f30177d = j10;
    }

    @NotNull
    /* renamed from: a */
    public final String m26309a() {
        return this.f30174a;
    }

    @Nullable
    /* renamed from: b */
    public final C5259d m26310b() {
        return this.f30175b;
    }

    /* renamed from: c */
    public final long m26311c() {
        return this.f30177d;
    }

    /* renamed from: d */
    public final float m26312d() {
        return this.f30176c;
    }

    /* renamed from: e */
    public final boolean m26313e() {
        C5259d c5259d = this.f30175b;
        return c5259d == null || (c5259d.m26316a() == null && this.f30175b.m26317b() == null);
    }

    /* renamed from: f */
    public final void m26314f(long j10) {
        this.f30177d = j10;
    }

    @NotNull
    /* renamed from: g */
    public final JSONObject m26315g() {
        JSONObject put = new JSONObject().put(Name.MARK, this.f30174a);
        C5259d c5259d = this.f30175b;
        if (c5259d != null) {
            put.put("sources", c5259d.m26322g());
        }
        float f10 = this.f30176c;
        if (f10 > 0.0f) {
            put.put("weight", Float.valueOf(f10));
        }
        long j10 = this.f30177d;
        if (j10 > 0) {
            put.put("timestamp", j10);
        }
        C9367f.m39525d(put, "json");
        return put;
    }

    @NotNull
    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f30174a + "', outcomeSource=" + this.f30175b + ", weight=" + this.f30176c + ", timestamp=" + this.f30177d + '}';
    }
}
