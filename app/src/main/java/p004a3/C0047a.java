package p004a3;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a3/a.class
 */
/* renamed from: a3.a */
/* loaded from: combined.jar:classes1.jar:a3/a.class */
public final class C0047a {

    /* renamed from: a */
    public final String f179a;

    /* renamed from: b */
    public final List<a> f180b;

    /* renamed from: c */
    public final Map<String, Object> f181c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a3/a$a.class
     */
    /* renamed from: a3.a$a */
    /* loaded from: combined.jar:classes1.jar:a3/a$a.class */
    public static class a {

        /* renamed from: a */
        public final long f182a;

        /* renamed from: b */
        public final long f183b;

        public a(long j10, long j11) {
            this.f182a = j10;
            this.f183b = j11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f182a != aVar.f182a) {
                return false;
            }
            if (this.f183b != aVar.f183b) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            long j10 = this.f182a;
            int i10 = (int) (j10 ^ (j10 >>> 32));
            long j11 = this.f183b;
            return (i10 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }

        public String toString() {
            return "Location{line=" + this.f182a + ", column=" + this.f183b + '}';
        }
    }

    public C0047a(String str, List<a> list, Map<String, Object> map) {
        this.f179a = str;
        this.f180b = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.f181c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }

    /* renamed from: a */
    public Map<String, Object> m202a() {
        return this.f181c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0047a)) {
            return false;
        }
        C0047a c0047a = (C0047a) obj;
        String str = this.f179a;
        if (str != null) {
            if (!str.equals(c0047a.f179a)) {
                return false;
            }
        } else if (c0047a.f179a != null) {
            return false;
        }
        if (this.f180b.equals(c0047a.f180b)) {
            return this.f181c.equals(c0047a.f181c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f179a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f180b.hashCode()) * 31) + this.f181c.hashCode();
    }

    public String toString() {
        return "Error{message='" + this.f179a + "', locations=" + this.f180b + ", customAttributes=" + this.f181c + '}';
    }
}
