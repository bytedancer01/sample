package p200l9;

import org.json.JSONObject;
import p422y9.C9932n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/p.class
 */
/* renamed from: l9.p */
/* loaded from: combined.jar:classes2.jar:l9/p.class */
public class C5794p {

    /* renamed from: a */
    public final long f32344a;

    /* renamed from: b */
    public final int f32345b;

    /* renamed from: c */
    public final boolean f32346c;

    /* renamed from: d */
    public final JSONObject f32347d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/p$a.class
     */
    /* renamed from: l9.p$a */
    /* loaded from: combined.jar:classes2.jar:l9/p$a.class */
    public static class a {

        /* renamed from: a */
        public long f32348a;

        /* renamed from: b */
        public int f32349b = 0;

        /* renamed from: c */
        public boolean f32350c;

        /* renamed from: d */
        public JSONObject f32351d;

        /* renamed from: a */
        public C5794p m28298a() {
            return new C5794p(this.f32348a, this.f32349b, this.f32350c, this.f32351d, null);
        }

        /* renamed from: b */
        public a m28299b(JSONObject jSONObject) {
            this.f32351d = jSONObject;
            return this;
        }

        /* renamed from: c */
        public a m28300c(boolean z10) {
            this.f32350c = z10;
            return this;
        }

        /* renamed from: d */
        public a m28301d(long j10) {
            this.f32348a = j10;
            return this;
        }

        /* renamed from: e */
        public a m28302e(int i10) {
            this.f32349b = i10;
            return this;
        }
    }

    public /* synthetic */ C5794p(long j10, int i10, boolean z10, JSONObject jSONObject, C5796p1 c5796p1) {
        this.f32344a = j10;
        this.f32345b = i10;
        this.f32346c = z10;
        this.f32347d = jSONObject;
    }

    /* renamed from: a */
    public JSONObject m28294a() {
        return this.f32347d;
    }

    /* renamed from: b */
    public long m28295b() {
        return this.f32344a;
    }

    /* renamed from: c */
    public int m28296c() {
        return this.f32345b;
    }

    /* renamed from: d */
    public boolean m28297d() {
        return this.f32346c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5794p)) {
            return false;
        }
        C5794p c5794p = (C5794p) obj;
        return this.f32344a == c5794p.f32344a && this.f32345b == c5794p.f32345b && this.f32346c == c5794p.f32346c && C9932n.m41832b(this.f32347d, c5794p.f32347d);
    }

    public int hashCode() {
        return C9932n.m41833c(Long.valueOf(this.f32344a), Integer.valueOf(this.f32345b), Boolean.valueOf(this.f32346c), this.f32347d);
    }
}
